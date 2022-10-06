/**
 * @项目名：crm-project
 * @创建人： Administrator
 * @创建时间： 2020-05-18
 * @公司： www.bjpowernode.com
 * @描述：TODO
 */
package com.bjpowernode.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>NAME: SettingsIndexController</p>
 * @author Administrator
 * @date 2020-05-18 14:39:23
 * @version 1.0
 */
@Controller
public class SettingsIndexController {
    @RequestMapping("/settings/index.do")
    public String index(){
        return "settings/index";
    }
}
