
package entity;

import java.util.List;

public class PageBean  {

    private List<TeacherEntity> list;

    //总记录数
    private int allRows;
    //总页数
    private int totalPage;
    //当前页
    private  int  currentPage;

    public List<TeacherEntity> getList() {
        return list;
    }

    public void setList(List<TeacherEntity> list) {
        this.list = list;
    }

    public int getAllRows() {
        return allRows;
    }

    public void setAllRows(int allRows) {
        this.allRows = allRows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


/*
     * 得到总页数
     * pageSize 每页记录数
     *  allRows  总记录数
     *  总页数*/



  //获取总页数
    public  int getTotalPages(int pageSize, int allRows){

        int totalPage = (allRows%pageSize==0)?(allRows/pageSize):(allRows/pageSize)+1;

        return totalPage;
    }


/*
*
     * 得到当前开始记录号
     * pageSize 每页记录数
     * currentPage 当前页
     * @return*/


    public  int getCurrentPageOffset(int currentPage,int pageSize ){

        int offset =pageSize*(currentPage-1);
        return offset;
    }



/*
     * 得到当前页， 如果为0 则开始第一页，否则为当前页
     * @param page
     * @return*/


    public int getCurPage(int page){
        int currentPage = (page == 0)?1:page ;//这里用到了三目运算
        return currentPage ;
    }


}

