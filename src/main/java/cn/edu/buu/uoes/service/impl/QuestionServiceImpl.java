package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.dao.QuestionDao;
import cn.edu.buu.uoes.pojo.Question;
import cn.edu.buu.uoes.service.QuestionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService {
    @Resource
    QuestionDao questionDao;

    @Override
    public PageInfo<Question> getQuestionList(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                questionDao.selectAll()
        );
    }

    @Override
    public Question findQuestionById(int qno) {
        return questionDao.selectByPrimaryKey(qno);
    }

    @Override
    public PageInfo<Question> findQuestionByInfo(String questionInfo, int pageNum, int pageSize) {
        // TODO 需要写
        return null;
    }

    @Override
    public boolean updateQuestion(Question question) {
        return questionDao.updateByPrimaryKey(question) != 0;
    }

    @Override
    public boolean addQuestion(Question question) {
        return questionDao.insert(question) != 0;
    }

    @Override
    public boolean deleteQuestion(int qno) {
        return questionDao.deleteByPrimaryKey(qno) != 0;
    }
}
