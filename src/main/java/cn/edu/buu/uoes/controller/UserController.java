package cn.edu.buu.uoes.controller;

import cn.edu.buu.uoes.pojo.User;
import cn.edu.buu.uoes.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) {
        if(userService.login(user)){
            return "/user/success";
        } else {
            return "/user/failed";
        }
    }

    @RequestMapping(value = "/getTeachersList", method = RequestMethod.GET)
    public String getTeachersList(@RequestParam(name = "pageNum", required = true, defaultValue = "1") int pageNum,
                                  @RequestParam(name = "pageNum", required = true, defaultValue = "1") int pageSize,
                                  HttpServletRequest request) {
        PageInfo pageInfo = userService.getTeacherList(pageNum, pageSize);
        request.setAttribute("teacherList", pageInfo);
        return "/user/success";
    }
}
