package com.global.hr.data.config;

import org.explicit.bean.model.repository.EmployeeRepo;
import org.explicit.bean.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    @Qualifier("myEmployeeServiceV1")
    @ConditionalOnMissingBean(name = "employeeService")
    public EmployeeService employeeServiceV1(EmployeeRepo myEmployeeRepo) {
        return new EmployeeService(myEmployeeRepo, "V1");
    }
    @Bean
    @Qualifier("myEmployeeServiceV2")
    @ConditionalOnMissingBean(name = "employeeService")
    public EmployeeService employeeServiceV2(EmployeeRepo myEmployeeRepo) {
        return new EmployeeService(myEmployeeRepo, "V2");
    }

}
