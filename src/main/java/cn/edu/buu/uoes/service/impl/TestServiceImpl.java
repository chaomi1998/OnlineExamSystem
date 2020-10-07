package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.dao.TestDao;
import cn.edu.buu.uoes.pojo.Test;
import cn.edu.buu.uoes.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// TODO 还没写
@Service("TestService")
public class TestServiceImpl implements TestService {
    @Resource
    TestDao testDao;
    @Override
    public PageInfo<Test> getTestsList(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                testDao.selectAll()
        );
    }

    @Override
    public Test findTestById(int tsno) {
        return testDao.selectByPrimaryKey(tsno);
    }

    @Override
    public PageInfo<Test> findTestByCourseId(int cno, int pageNum, int pageSize) {
        // TODO 需要写
        return null;
    }

    @Override
    public boolean updateTest(Test test) {
        return testDao.updateByPrimaryKey(test) != 0;
    }

    @Override
    public boolean addTest(Test test) {
        return testDao.insert(test) != 0;
    }

    @Override
    public boolean deleteTest(int tsno) {
        return testDao.deleteByPrimaryKey(tsno) != 0;
    }
}
