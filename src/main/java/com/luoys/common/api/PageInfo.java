package com.luoys.common.api;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageInfo<T> {

    private List<T> list;

    private Integer total;

    public PageInfo(List<T> list, Integer total) {
        this.list = list;
        this.total = total;
    }

    public PageInfo() {
        this.list = new ArrayList<>();
        this.total = 0;
    }

}
