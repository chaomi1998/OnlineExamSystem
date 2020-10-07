package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.dao.ExamDao;
import cn.edu.buu.uoes.pojo.Exam;
import cn.edu.buu.uoes.service.ExamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ExamService")
public class ExamServiceImpl implements ExamService {
    @Resource
    ExamDao examDao;

    @Override
    public PageInfo<Exam> getExamsList(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                examDao.selectAll()
        );
    }

    @Override
    public Exam findExamById(int eno) {
        return examDao.selectByPrimaryKey(eno);
    }

    @Override
    public PageInfo<Exam> findExamByCourseId(int cno, int pageNum, int pageSize) {
        // TODO 需要写
        return null;
    }

    @Override
    public boolean updateExam(Exam exam) {
        return examDao.updateByPrimaryKey(exam) != 0;
    }

    @Override
    public boolean addExam(Exam exam) {
        return examDao.insert(exam) != 0;
    }

    @Override
    public boolean deleteExam(int eno) {
        return examDao.deleteByPrimaryKey(eno) != 0;
    }
}
