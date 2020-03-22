package com.fonsview.subtable.constants;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * @Author: hujian
 * @Date: 2020/3/22 23:54
 * @Description: AbstractRoutingDataSource, 该类充当了DataSource的路由中介,能有在运行时, 根据某种key值来动态切换到真正的DataSource上。
 */
public class HenryMultiDataSource extends  AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
