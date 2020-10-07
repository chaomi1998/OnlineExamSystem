package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.pojo.Note;
import cn.edu.buu.uoes.service.NoteService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

// TODO 还没写
@Service("NoteService")
public class NoteServiceImpl implements NoteService {
    @Override
    public PageInfo<Note> getSendMessageList(int uno, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PageInfo<Note> getGetMessageList(int uno, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean sendMessageById(int sendUser, int getUser) {
        return false;
    }

    @Override
    public boolean sendMessageByClassId(int sendUser, int getClass) {
        return false;
    }
}
