package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.pojo.Classes;
import cn.edu.buu.uoes.service.ClassesService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service("ClassesService")
public class ClassesServiceImpl implements ClassesService {
    @Override
    public PageInfo<Classes> getClassesList(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Classes findClassById(int clno) {
        return null;
    }

    @Override
    public PageInfo<Classes> findClassByName(String className, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean updateClass(Classes classes) {
        return false;
    }

    @Override
    public boolean addClass(Classes classes) {
        return false;
    }

    @Override
    public boolean deleteClass(int clno) {
        return false;
    }

    @Override
    public PageInfo<Classes> findClassByTeacherId(int tno, int pageNum, int pageSize) {
        return null;
    }
}
