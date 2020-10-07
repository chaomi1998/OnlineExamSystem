package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Note;
import com.github.pagehelper.PageInfo;

public interface NoteService {
    public PageInfo<Note> getSendMessageList(int uno, int pageNum, int pageSize);
    public PageInfo<Note> getGetMessageList(int uno, int pageNum, int pageSize);
    public boolean sendMessageById(int sendUser, int getUser);
    public boolean sendMessageByClassId(int sendUser, int getClass);
}
