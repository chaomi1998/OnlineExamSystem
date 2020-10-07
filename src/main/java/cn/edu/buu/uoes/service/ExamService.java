package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Exam;
import com.github.pagehelper.PageInfo;

public interface ExamService {
    public PageInfo<Exam> getExamsList(int pageNum, int pageSize);
    public Exam findExamById(int eno);
    public PageInfo<Exam> findExamByCourseId(int cno, int pageNum, int pageSize);
    public boolean updateExam(Exam exam);
    public boolean addExam(Exam exam);
    public boolean deleteExam(int eno);
}
