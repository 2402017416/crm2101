/**
 * @项目名：crm-project
 * @创建人： Administrator
 * @创建时间： 2020-05-15
 * @公司： www.bjpowernode.com
 * @描述：TODO
 */
package com.bjpowernode.crm.commons.domain;

/**
 * <p>NAME: ReturnObject</p>
 * @author Administrator
 * @date 2020-05-15 17:24:27
 * @version 1.0
 */
public class ReturnObject {
    private String code;//1----成功,0---失败
    private String message;//描述信息
    private Object retData;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }
}
