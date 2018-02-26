package com.baomidou.mybatisplus.extension.incrementer;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;

/**
 * <p>
 * DB2 Sequence
 * </p>
 *
 * @author Caratacus
 * @Date 2017-06-12
 */
public class DB2KeyGenerator implements IKeyGenerator {

    @Override
    public String executeSql(String incrementerName) {
        StringBuilder sql = new StringBuilder();
        sql.append("values nextval for " );
        sql.append(incrementerName);
        return sql.toString();
    }
}
