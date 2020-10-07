package cn.edu.buu.uoes.dao;

import cn.edu.buu.uoes.pojo.Teacher;
import cn.edu.buu.uoes.pojo.User;
import com.github.pagehelper.PageInfo;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TeacherDaoTest extends TestCase {
    @Resource
    TeacherDao teacherDao;
    @Resource
    UserDao userDao;

    @Test
    public void testSelectByName() {
//        List<Teacher> teachers = teacherDao.selectByName("小王");
//        Assert.assertEquals(1, teachers.size());
//        Assert.assertEquals("小王", teachers.get(0).getTeacherName());
    }

    @Test
    public void testDeleteTeacher() {
        //int result = teacherDao.deleteByPrimaryKey(105);
        //Assert.assertEquals(1, result);
    }
}