package com.github.apengda.springwebplus.starter.db.dialect.sqlite;

import com.github.apengda.springwebplus.starter.db.dialect.DataTypeConverter;
import com.github.apengda.springwebplus.starter.db.dialect.DbDDLGen;
import com.github.apengda.springwebplus.starter.db.dialect.base.BaseDbDialect;

public class SqliteDialect extends BaseDbDialect {
    @Override
    public DataTypeConverter dataTypeConverter() {
        return new SqliteDataTypeConverter();
    }

    @Override
    public DbDDLGen ddlGen() {
        return new SqliteDDLGen(this);
    }
}
