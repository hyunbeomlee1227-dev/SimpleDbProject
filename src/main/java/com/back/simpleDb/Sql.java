package com.back.simpleDb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Sql {
    private final SimpleDb simpleDb;
    private String sql = "";
    private final List<Object> params = new ArrayList<>();

    public Sql(SimpleDb simpleDb) {
        this.simpleDb = simpleDb;
    }
    public Sql append(String sql, Object... params) {
        this.sql += sql + " ";
        if (params.length != 0)
            this.params.addAll(Arrays.asList(params));

        return this;
    }

    public Sql appendIn(String sql, Object... params) {
        return this;
    }

    public long insert() {
        long insert =  simpleDb.insert(sql, params.toArray());
        sql = "";
        return insert;
    }

    public int update() {
        int update = simpleDb.runForRowsCount(sql, params.toArray());
        sql = "";
        return update;
    }

    public int delete() {
        int delete = simpleDb.runForRowsCount(sql, params.toArray());
        sql = "";
        return delete;
    }

    public List<Map<String, Object>> selectRows() {

        sql = "";
        return null;
    }

    public Map<String, Object> selectRow() {

        sql = "";
        return null;
    }

    public <T> List<T> selectRows(Class<T> cls) {

        sql = "";
        return null;
    }

    public <T> T selectRow(Class<T> cls)
    {
        sql = "";
        return null;
    }

    public LocalDateTime selectDatetime() {

        sql = "";
        return null;
    }

    public Long selectLong() {
        sql = "";
        return null;
    }

    public List<Long> selectLongs() {
        sql = "";

        return null;
    }

    public String selectString() {

        sql = "";
        return null;
    }

    public Boolean selectBoolean() {

        sql = "";
        return null;
    }

}
