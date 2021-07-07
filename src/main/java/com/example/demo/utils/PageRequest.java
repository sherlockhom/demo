package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Value;

public class PageRequest {
    /**
     * 当前页码
     */
    public int pageNum;

    /**
     * 每页数量
     */
    public int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        if (pageSize<=0){
            return 10;
        }
        return pageSize;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
