package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.pojo.Exam;
import cn.edu.buu.uoes.service.ExamService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

// TODO 还没写
@Service("ExamService")
public class ExamServiceImpl implements ExamService {
    @Override
    public PageInfo<Exam> getExamsList(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Exam findExamById(int eno) {
        return null;
    }

    @Override
    public PageInfo<Exam> findExamByCourseId(int cno, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean updateExam(Exam exam) {
        return false;
    }

    @Override
    public boolean addExam(Exam exam) {
        return false;
    }

    @Override
    public boolean deleteExam(int eno) {
        return false;
    }
}
