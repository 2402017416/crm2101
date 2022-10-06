/**
 * @项目名：crm-project
 * @创建人： Administrator
 * @创建时间： 2020-05-13
 * @公司： www.bjpowernode.com
 * @描述：TODO
 */
package com.bjpowernode.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>NAME: IndexController</p>
 * @author Administrator
 * @date 2020-05-13 17:51:03
 * @version 1.0
 */
@Controller
public class IndexController {
    /*
        ModelAndView:既要返回数据，又要跳转到页面
        String：只需要跳转页面，不需要返回数据
        obj：返回json
        void：不需要跳转页面，也不需要返回json字符串
     */
    @RequestMapping("/")
    public String index(){
        //......
        return "index";
}
}
