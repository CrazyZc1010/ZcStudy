package springBoot.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


@Configuration
@MapperScan(basePackages = "springboot.zc.mapper.mapper2", sqlSessionFactoryRef = "test2SqlSessionFactory")
public class DataSourceConfig2 {
	
	 @Bean(name = "test2DataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.test2")
	    public DataSource getDateSource2()
	    {
	        return DataSourceBuilder.create().build();
	    }
	 
	    @Bean(name = "test2SqlSessionFactory")
	    public SqlSessionFactory test2SqlSessionFactory(@Qualifier("test2DataSource") DataSource datasource)
	            throws Exception
	    {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(datasource);
	        bean.setMapperLocations(
	                new PathMatchingResourcePatternResolver().getResources("classpath*:springboot/zc/mapper/mapper2/*/*.xml"));
	        return bean.getObject();
	    }
	 
	    @Bean("test2SqlSessionTemplate")
	    public SqlSessionTemplate test2SqlSessionTemplate(
	            @Qualifier("test2SqlSessionFactory") SqlSessionFactory sessionFactory)
	    {
	        return new SqlSessionTemplate(sessionFactory);
	    }


}
