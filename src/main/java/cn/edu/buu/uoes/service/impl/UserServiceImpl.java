package cn.edu.buu.uoes.service.impl;


import cn.edu.buu.uoes.dao.StudentDao;
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

    @Resource
    StudentDao studentDao;

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
    public boolean addTeacher(Teacher teacher, User user) {
        userDao.insert(user);
        teacher.setTno(user.getUno());
        return teacherDao.insert(teacher) != 0;
    }

    @Override
    public boolean deleteTeacher(int tno) {
        int result = teacherDao.deleteByPrimaryKey(tno);
        userDao.deleteByPrimaryKey(tno);
        return result != 0;
    }

    @Override
    public PageInfo<Student> getStudentsList(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                studentDao.selectAll()
        );
    }

    @Override
    public Student findStudentById(int sno) {
        return studentDao.selectByPrimaryKey(sno);
    }

    @Override
    public PageInfo<Student> findStudentByName(String studentName, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                studentDao.selectByName(studentName)
        );
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateByPrimaryKey(student) != 0;
    }

    @Override
    public boolean addStudent(Student student, User user) {
        userDao.insert(user);
        student.setSno(user.getUno());
        return studentDao.insert(student) != 0;
    }

    @Override
    public boolean deleteStudent(int sno) {
        int result = studentDao.deleteByPrimaryKey(sno);
        userDao.deleteByPrimaryKey(sno);
        return result != 0;
    }

    @Override
    public boolean updatePassword(User user) {
        return userDao.updateByPrimaryKey(user) != 0;
    }
}
