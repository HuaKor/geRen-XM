package dao;

import entity.RenYuanEntity;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class RenYuanDao {
    //private static EntityManagerFactory emf;
    private static EntityManagerFactory emf;

    public RenYuanDao() {
        emf = JpaUtil.getFactory();
    }

    //查询
    public List<RenYuanEntity> getAll() {
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
    }

    //添加
    public void insert(RenYuanEntity renYuanEntity) {
        EntityManager em = emf.createEntityManager();
        //打开事务
        em.getTransaction().begin();
        em.persist(renYuanEntity);
        em.getTransaction().commit();//事务提交

        em.close();
    }

    //删除
    public void delete(int id) {
        //创建EntityManager
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        RenYuanEntity r1 = em.find(RenYuanEntity.class, id);
        em.remove(r1);
        em.getTransaction().commit();
        em.close();

    }

    //修改
    public void update(int id, String name, String sex, String height, int sjhm) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        RenYuanEntity e1 = em.find(RenYuanEntity.class, id);

        //拿到表单中的值，重新设置
        e1.setId(id);
        e1.setName(name);
        e1.setSex(sex);
        e1.setHeight(height);
        e1.setSjhm(sjhm);

        em.getTransaction().commit();
        em.close();

    }

   /* public void  login(){

    }*/
}