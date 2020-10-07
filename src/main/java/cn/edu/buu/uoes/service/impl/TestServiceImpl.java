package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.pojo.Test;
import cn.edu.buu.uoes.service.TestService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

// TODO 还没写
@Service("TestService")
public class TestServiceImpl implements TestService {
    @Override
    public PageInfo<Test> getTestsList(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Test findTestById(int tno) {
        return null;
    }

    @Override
    public PageInfo<Test> findTestByCourseId(int cno, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean updateTest(Test test) {
        return false;
    }

    @Override
    public boolean addTest(Test test) {
        return false;
    }

    @Override
    public boolean deleteTest(int tno) {
        return false;
    }
}
