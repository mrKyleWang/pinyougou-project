package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装对象
 * @author Kyle.Wang
 * 2018-03-08 20:58
 */
public class PageResult implements Serializable{

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 当前页结果
     */
    private List rows;

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
