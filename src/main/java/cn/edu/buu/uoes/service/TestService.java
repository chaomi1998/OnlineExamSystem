package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Test;
import com.github.pagehelper.PageInfo;

public interface TestService {
    public PageInfo<Test> getTestsList(int pageNum, int pageSize);
    public Test findTestById(int tno);
    public PageInfo<Test> findTestByCourseId(int cno, int pageNum, int pageSize);
    public boolean updateTest(Test test);
    public boolean addTest(Test test);
    public boolean deleteTest(int tno);

}
