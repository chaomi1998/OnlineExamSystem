package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.dao.NoteDao;
import cn.edu.buu.uoes.pojo.Note;
import cn.edu.buu.uoes.service.NoteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("NoteService")
public class NoteServiceImpl implements NoteService {
    @Resource
    NoteDao noteDao;

    @Override
    public PageInfo<Note> getSendMessageList(int uno, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                noteDao.selectBySendId(uno)
        );
    }

    @Override
    public PageInfo<Note> getGetMessageList(int uno, int pageNum, int pageSize) {
        // TODO 还没写
        return null;
    }

    @Override
    public boolean sendMessageById(int sendUser, int getUser) {
        // TODO 还没写
        return false;
    }

    @Override
    public boolean sendMessageByClassId(int sendUser, int getClass) {
        // TODO 还没写
        return false;
    }
}
