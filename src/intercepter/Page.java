package intercepter;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;
import org.apache.struts2.json.annotations.JSONFieldBridge;
import org.apache.struts2.json.annotations.JSONParameter;

/** 
 * Description: 分页 
 * Author: liuzh 
 * Update: liuzh(2014-04-16 10:56) 
 */  
public   class Page {  
    private long pageNum;  //页码
    private long pageSize;  //每一页的行数
    private long startRow;  //查询数据库时，开始的行号
    private long endRow;  //查询数据库时，结束的行号
    private long total;  //数据库中数据的总行数
    private long pages;  //一共有多少页
    private List result;  //查询结果集
    
    public Page(){
    }

    public Page(Long pageNum, long pageSize) {  
        this.pageNum = pageNum;  
        this.pageSize = pageSize;  
        this.startRow = pageNum ==0?0: (pageNum - 1) * pageSize ;  
        this.endRow = pageNum * pageSize;  
    }  

    public List getResult() {  
        return result;  
    }  

    public void setResult(List result) {  
        this.result = result;  
    }  

    public long getPages() {  
        return pages;  
    }  

    public void setPages(long pages) {  
        this.pages = pages;  
    }  

    @JSON(serialize=false)
    public long getEndRow() {  
        return endRow;  
    }  

    public void setEndRow(long endRow) {  
        this.endRow = endRow;  
    }  

    public Long getPageNum() {  
        return pageNum;  
    }  

    public void setPageNum(long pageNum) {  
        this.pageNum = pageNum;  
    }  

    public Long getPageSize() {  
        return pageSize;  
    }  

    public void setPageSize(long pageSize) {  
        this.pageSize = pageSize;  
    }  

    @JSON(serialize=false)
    public long getStartRow() {  
        return startRow;  
    }  

    
    public void setStartRow(long startRow) {  
        this.startRow = startRow;  
    }  

    public long getTotal() {  
        return total;  
    }  

    public void setTotal(long total) {  
        this.total = total;  
    }  
    
   

    @Override  
    public String toString() {  
        return "Page{" +  
                "pageNum=" + pageNum +  
                ", pageSize=" + pageSize +  
                ", startRow=" + startRow +  
                ", endRow=" + endRow +  
                ", total=" + total +  
                ", pages=" + pages +  
                '}';  
    }  
}  
