package dao;

import entity.RenYuanEntity;
import entity.TeacherEntity;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class TeacherDao {
    private EntityManagerFactory emf ;

    public TeacherDao(){
        emf = JpaUtil.getFactory() ;
    }

    //通过分页进行数据库的查询
    public List<TeacherEntity> queryByPage(String hql,int offest,int pageSize){
        List<TeacherEntity> list = null ;
        EntityManager manager = emf.createEntityManager() ;
        manager.getTransaction().begin();
        //下面这行代码的理解：创建hql语句并且把offest跟pageSize分别
        // 设置到FirstResult和MaxResults上，并且用query接收
        Query q = manager.createQuery(hql).setFirstResult(offest).setMaxResults(pageSize) ;
        list = q.getResultList() ;
        manager.getTransaction().commit();
        manager.close();


        return list;

    }
    //查询数据的数量
    public int getAllRowCount(String hql) {
        EntityManager manager = emf.createEntityManager() ;
        manager.getTransaction().begin();

        int allRows = 0 ;
        Query q = manager.createQuery(hql) ;
        allRows =  q.getResultList().size() ;
        manager.getTransaction().commit();

        manager.close();
        return allRows;

    }


}
