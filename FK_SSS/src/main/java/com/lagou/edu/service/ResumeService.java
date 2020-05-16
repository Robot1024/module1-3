package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;
import java.util.Optional;

/**
 * @author ascetic
 * @version 1.0
 * @InterfaceName ResumeService
 * @Description TODO
 * @date 2020-05-14 22:11
 */
public interface ResumeService {

    public Resume add(Resume resume);

    public void deleteById(Long id);

    public Resume update(Resume resume);

    public List<Resume> queryAll();

    public Optional<Resume> queryById (Long id);

}
