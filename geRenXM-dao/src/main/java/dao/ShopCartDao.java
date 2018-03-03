package dao;

import entity.ShopCartEntity;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ShopCartDao {
    private EntityManagerFactory emf;

    public ShopCartDao(){
        emf = JpaUtil.getFactory();
    }

    //查询
  /*  public List<RenYuanEntity> getAll() {
        List<RenYuanEntity> list = new ArrayList<RenYuanEntity>();
        //创建EntityFactory
        EntityManager e = emf.createEntityManager();
        String hql = "from RenYuanEntity order by  id desc";

        //创建Query 把hql 放进去
        Query q = e.createQuery(hql);
        //吧查到的结果放到list
        list = q.getResultList();
        e.close();

        return list;
    }*/

    //查询所有商品
    public List<ShopCartEntity> getAll(){
        List<ShopCartEntity>  list = new ArrayList<ShopCartEntity>();

        //创建EntityManager
        EntityManager manager = emf.createEntityManager();
        //选择要操作的语句
        String hql = "from ShopCartEntity order by id desc ";
        //创建Query 把hql 放进去
        Query query = manager.createQuery(hql);
       //把结果放到list钟
       list = query.getResultList();

        return list;
    }

}
