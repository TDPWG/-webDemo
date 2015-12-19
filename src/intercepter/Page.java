package intercepter;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;
import org.apache.struts2.json.annotations.JSONFieldBridge;
import org.apache.struts2.json.annotations.JSONParameter;

/** 
 * Description: ��ҳ 
 * Author: liuzh 
 * Update: liuzh(2014-04-16 10:56) 
 */  
public   class Page {  
    private long pageNum;  //ҳ��
    private long pageSize;  //ÿһҳ������
    private long startRow;  //��ѯ���ݿ�ʱ����ʼ���к�
    private long endRow;  //��ѯ���ݿ�ʱ���������к�
    private long total;  //���ݿ������ݵ�������
    private long pages;  //һ���ж���ҳ
    private List result;  //��ѯ�����
    
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
