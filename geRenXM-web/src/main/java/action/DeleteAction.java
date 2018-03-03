package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.RenYuanService;

import javax.servlet.http.HttpServletRequest;

public class DeleteAction extends ActionSupport {

    public String  delete(){
        RenYuanService service = new RenYuanService();

        HttpServletRequest request = ServletActionContext.getRequest();

        //根据ID删除
        Integer id = Integer.parseInt(request.getParameter("id"));

        service.delete(id);
        System.out.println("删除成功!");
        return "success";
    }
}
