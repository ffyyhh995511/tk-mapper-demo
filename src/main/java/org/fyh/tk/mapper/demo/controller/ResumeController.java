package org.fyh.tk.mapper.demo.controller;

import org.fyh.tk.mapper.demo.enter.Resume;
import org.fyh.tk.mapper.demo.service.ResumeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2019/12/30 14:14
 */
@RestController
@RequestMapping("resume")
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @RequestMapping("get")
    public Resume get(int id){
        return resumeService.get(id);
    }

}