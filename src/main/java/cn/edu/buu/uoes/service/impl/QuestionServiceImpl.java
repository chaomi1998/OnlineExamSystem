package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.pojo.Question;
import cn.edu.buu.uoes.service.QuestionService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

// TODO 还没写
@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService {
    @Override
    public PageInfo<Question> getQuestionList(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Question findQuestionById(int qno) {
        return null;
    }

    @Override
    public PageInfo<Question> findQuestionByInfo(String questionInfo, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean updateQuestion(Question question) {
        return false;
    }

    @Override
    public boolean addQuestion(Question question) {
        return false;
    }

    @Override
    public boolean deleteQuestion(int qno) {
        return false;
    }
}
