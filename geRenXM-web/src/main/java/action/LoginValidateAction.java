package action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class LoginValidateAction extends ActionSupport {
    private String checkCode;
    private String username;
    private String password;

    public String getCheckCode()
    {
        return checkCode;
    }

    public void setCheckCode(String checkCode)
    {
        this.checkCode = checkCode;
    }

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

    @Override
    public void validate() {
        HttpSession session = ServletActionContext.getRequest().getSession();

        String checkCode2 = (String)session.getAttribute("checkCode");

        if(!checkCode.equals(checkCode2))
        {
            this.addActionError("输入的验证码不正确，请重新输入！");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
