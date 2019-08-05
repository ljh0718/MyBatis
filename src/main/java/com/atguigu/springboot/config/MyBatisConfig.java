package com.atguigu.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Z
 * @create 2019/8/5 15:02
 * 此类是注解版mybatis的配置类
 */
@Configuration
public class MyBatisConfig {

    /**
     * 方法为实体类封装，不然其值将为null department_name-->departmentName
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
