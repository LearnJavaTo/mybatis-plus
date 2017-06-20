/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.plugins.parser;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

/**
 * <p>
 * 抽象 SQL 解析类
 * </p>
 *
 * @author hubin
 * @Date 2017-06-20
 */
public abstract class AbstractSqlParser {

    // 日志
    protected static final Log logger = LogFactory.getLog(AbstractSqlParser.class);
    private String sql;// SQL 语句
    private String dbType; // 数据库类型

    public AbstractSqlParser(String sql, String dbType) {
        this.sql = sql;
        this.dbType = dbType;
    }

    /**
     * <p>
     * 获取优化 SQL 方法
     * </p>
     *
     * @return SQL 信息
     */
    public abstract SqlInfo optimizeSql();

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
}
