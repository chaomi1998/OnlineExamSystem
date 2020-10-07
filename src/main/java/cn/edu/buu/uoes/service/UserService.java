package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Student;
import cn.edu.buu.uoes.pojo.Teacher;
import cn.edu.buu.uoes.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

public interface UserService {
    public boolean login(User user);
    public PageInfo<Teacher> getTeacherList(int pageNum, int pageSize);
    public Teacher findTeacherById(int tno);
    public PageInfo<Teacher> getTeacherByName(String teacherName, int pageNum, int pageSize);
    public boolean updateTeacher(Teacher teacher);
    public boolean addTeacher(Teacher teacher, User user);
    public boolean deleteTeacher(int tno);
    public PageInfo<Student> getStudentsList(int pageNum, int pageSize);
    public Student findStudentById(int sno);
    public PageInfo<Student> findStudentByName(String studentName, int pageNum, int pageSize);
    public boolean updateStudent(Student student);
    public boolean addStudent(Student student, User user);
    public boolean deleteStudent(int sno);
    public boolean updatePassword(User user);

}
