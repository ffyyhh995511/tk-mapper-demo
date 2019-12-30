package org.fyh.tk.mapper.demo.server;

import org.fyh.tk.mapper.demo.enter.Resume;
import org.fyh.tk.mapper.demo.mapper.ResumeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2019/12/30 14:14
 */
@Service
public class ResumeService {

    @Resource
    private ResumeMapper resumeMapper;

    /**
     * @description
     * @param id
     * @return org.fyh.tk.mapper.demo.enter.Resume
     * @author fangyunhe
     * @time 2019/12/30 14:15
     **/
    public Resume get(int id){
        Resume resume = resumeMapper.selectByPrimaryKey(id);
        return resume;
    }
}