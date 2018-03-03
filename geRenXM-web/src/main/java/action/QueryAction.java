
package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.RenYuanEntity;
import org.apache.struts2.ServletActionContext;
import service.RenYuanService;

import java.util.ArrayList;
import java.util.List;

public class QueryAction extends ActionSupport{

public String list(){
    RenYuanService service = new RenYuanService();

    List<RenYuanEntity>  renYuanEntities = new ArrayList<RenYuanEntity>();


    renYuanEntities = service.getAll();

    ServletActionContext.getRequest().setAttribute("list",renYuanEntities);
    System.out.println("你真的查询了");
    return "list";
}

}

