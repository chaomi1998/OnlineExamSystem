package cn.edu.buu.uoes.service.impl;


import cn.edu.buu.uoes.dao.TeacherDao;
import cn.edu.buu.uoes.dao.UserDao;
import cn.edu.buu.uoes.pojo.Student;
import cn.edu.buu.uoes.pojo.Teacher;
import cn.edu.buu.uoes.pojo.User;
import cn.edu.buu.uoes.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Resource
    TeacherDao teacherDao;
    @Override
    public boolean login(User user) {
        User mUser = userDao.selectByPrimaryKey(user.getUno());
        return Objects.equals(user.getUno(), mUser.getUno()) &&
                user.getPassword().equals(mUser.getPassword()) &&
                Objects.equals(user.getAuthority(), mUser.getAuthority());
    }

    @Override
    public PageInfo<Teacher> getTeacherList(int pageNum, int pageSize) {

        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                teacherDao.selectAll()
        );
    }

    @Override
    public Teacher findTeacherById(int tno) {
        return teacherDao.selectByPrimaryKey(tno);
    }

    @Override
    public PageInfo<Teacher> getTeacherByName(String teacherName, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                teacherDao.selectByName(teacherName)
                );
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        return teacherDao.updateByPrimaryKey(teacher) != 0;
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        return teacherDao.insert(teacher) != 0;
    }

    @Override
    public boolean deleteTeacher(int tno) {
        return teacherDao.deleteByPrimaryKey(tno) != 0;
    }

    @Override
    public PageInfo<Student> getStudentsList(int pageNum, int pageSize) {
        return null;
    }
}
