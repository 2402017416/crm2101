/**
 * @项目名：crm-project
 * @创建人： Administrator
 * @创建时间： 2020-05-15
 * @公司： www.bjpowernode.com
 * @描述：TODO
 */
package com.bjpowernode.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>NAME: WorkbenchIndexController</p>
 * @author Administrator
 * @date 2020-05-15 17:56:49
 * @version 1.0
 */
@Controller
public class WorkbenchIndexController {
    @RequestMapping("/workbench/index.do")
    public String index(){
        return "workbench/index";
    }
}
