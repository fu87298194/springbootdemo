package com.huhu.springbootdemo.vo;

import javax.validation.constraints.Positive;

public class PageInfoVo {

    private Integer id;

    @Positive(message = "page 只能为正整数")
    private Integer page = 1;

    @Positive(message = "rows 只能为正整数")
    private Integer rows = 10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
