package cn.edu.buu.uoes.service;

import cn.edu.buu.uoes.pojo.Course;
import com.github.pagehelper.PageInfo;

public interface CourseService {
    public PageInfo<Course> getCoursesList(int pageNum, int pageSize);
    public Course findCourseById(int cno);
    public PageInfo<Course> findCourseByName(String courseName, int pageNum, int pageSize);
    public boolean updateCourse(Course course);
    public boolean addCourse(Course course);
    public boolean deleteCourse(int cno);
    public PageInfo<Course> findCourseByClassId(int clno, int pageNum, int pageSize);
    public PageInfo<Course> findCourseByTeacherId(int tno, int pageNum, int pageSize);
}
