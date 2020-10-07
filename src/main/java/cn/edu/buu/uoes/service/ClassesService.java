package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Classes;
import com.github.pagehelper.PageInfo;

public interface ClassesService {
    public PageInfo<Classes> getClassesList(int pageNum, int pageSize);
    public Classes findClassById(int clno);
    public PageInfo<Classes> findClassByName(String className, int pageNum, int pageSize);
    public boolean updateClass(Classes classes);
    public boolean addClass(Classes classes);
    public boolean deleteClass(int clno);
    public PageInfo<Classes> findClassByTeacherId(int tno, int pageNum, int pageSize);
}
