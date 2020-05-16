package com.lagou.edu.controller;

import com.lagou.edu.pojo.Resume;
import com.lagou.edu.resultModel.GetSingleObjVO;
import com.lagou.edu.resultModel.LTBase;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ResumeController
 * @Description TODO
 * @date 2020-05-14 22:13
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {


    @Autowired
    ResumeService resumeService;


    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String login(HttpServletRequest request, HttpServletResponse response, String username, String password){
        HttpSession session = request.getSession();
        if("admin".equals(username) & "admin".equals(password)){
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            return "redirect:/resume/query";
        }else {
            return "redirect:/index.jsp";
        }

    }


    @RequestMapping(value = "/add",method = {RequestMethod.PUT})
    public String add(Resume resume) {
        Resume addResume = resumeService.add(resume);
        GetSingleObjVO<Resume> itemVo = new GetSingleObjVO<>();
        if(null != addResume){
            itemVo.setResult("error");
            itemVo.setMessage("添加数据异常");

        }else {
            itemVo.setResult("success");
            itemVo.setData(addResume);

        }

        return "redirect:/resume/query";
    }

    @RequestMapping(value = "/query/{id}",method = {RequestMethod.GET})
    public ModelAndView queryById(@PathVariable("id") Long id){


        Optional<Resume> resume = resumeService.queryById(id);

        ModelAndView modelAndView = new ModelAndView();
        // addObject 其实是向请求域中request.setAttribute("date",date);
        modelAndView.addObject("resume",resume.get());
        modelAndView.setViewName("/edit.jsp");
        return modelAndView;

    }

    @RequestMapping(value = "/update",method = {RequestMethod.POST})
    public String update(Resume resume) {
        Resume addResume = resumeService.add(resume);
        GetSingleObjVO<Resume> itemVo = new GetSingleObjVO<>();

        return "redirect:/resume/query";
    }

    @RequestMapping(value = "/delete/{id}",method = {RequestMethod.GET})
    public String delete(@PathVariable("id") Long id) {
        resumeService.deleteById(id);

        return "redirect:/resume/query";
    }

    @RequestMapping(value = "/query",method = {RequestMethod.GET})
    public ModelAndView queryAll() {

        List<Resume> resumes = resumeService.queryAll();

        ModelAndView modelAndView = new ModelAndView();
        // addObject 其实是向请求域中request.setAttribute("date",date);
        modelAndView.addObject("resumes",resumes);
        modelAndView.setViewName("/list.jsp");
        return modelAndView;
    }
}