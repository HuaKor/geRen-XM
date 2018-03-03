package controller;

import com.opensymphony.xwork2.ActionSupport;
import entity.PageBean;
import org.apache.struts2.ServletActionContext;
import service.TeacherService;

import javax.servlet.http.HttpServletRequest;

public class TeacherAction extends ActionSupport {

    private TeacherService teacherService = new TeacherService() ;

    private int page ;

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    @Override

    public String execute() throws Exception{
        HttpServletRequest request = ServletActionContext.getRequest();//获取请求对象
        PageBean pageBean = teacherService.getPageBean(5,page) ;//设置每页显示几条记录数
        request.setAttribute("pageBean", pageBean);
      //  request.getRequestDispatcher("index.jsp").forward(request, response) ;
        return SUCCESS ;
    }

}
