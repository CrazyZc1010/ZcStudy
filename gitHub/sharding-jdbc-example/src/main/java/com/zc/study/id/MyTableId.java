package com.zc.study.id;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

public class MyTableId implements ShardingKeyGenerator {

    private SnowflakeShardingKeyGenerator snow = new SnowflakeShardingKeyGenerator();

    @Override
    public Comparable<?> generateKey() {
        System.out.println("----执行了自定义主键生成器MyTableId----");
        return snow.generateKey();
    }

    @Override
    public String getType() {
        return "TABLEKEY";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
