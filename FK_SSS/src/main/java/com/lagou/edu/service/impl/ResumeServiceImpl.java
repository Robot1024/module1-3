package com.lagou.edu.service.impl;

import com.lagou.edu.dao.ResumeDao;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ResumeServiceImpl
 * @Description TODO
 * @date 2020-05-14 22:11
 */
@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {
    public ResumeServiceImpl() {
    }

    @Autowired
    ResumeDao resumeDao;

    @Override
    public Resume add(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }

    @Override
    public Resume update(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public List<Resume> queryAll() {
        return resumeDao.findAll();
    }

    @Override
    public Optional<Resume> queryById(Long id) {
        return resumeDao.findById(id);
    }
}