package cn.edu.buu.uoes.service.impl;

import cn.edu.buu.uoes.dao.CourseDao;
import cn.edu.buu.uoes.pojo.Course;
import cn.edu.buu.uoes.service.CourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("CourseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    CourseDao courseDao;

    @Override
    public PageInfo<Course> getCoursesList(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                courseDao.selectAll()
        );
    }

    @Override
    public Course findCourseById(int cno) {
        return courseDao.selectByPrimaryKey(cno);
    }

    @Override
    public PageInfo<Course> findCourseByName(String courseName, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() ->
                courseDao.selectByName(courseName)
        );
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseDao.updateByPrimaryKey(course) != 0;
    }

    @Override
    public boolean addCourse(Course course) {
        return courseDao.insert(course) != 0;
    }

    @Override
    public boolean deleteCourse(int cno) {
        return courseDao.deleteByPrimaryKey(cno) != 0;
    }
}
