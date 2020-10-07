package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Question;
import com.github.pagehelper.PageInfo;

public interface QuestionService {
    public PageInfo<Question> getQuestionList(int pageNum, int pageSize);
    public Question findQuestionById(int qno);
    public PageInfo<Question> findQuestionByInfo(String questionInfo, int pageNum, int pageSize);
    public boolean updateQuestion(Question question);
    public boolean addQuestion(Question question);
    public boolean deleteQuestion(int qno);
}
