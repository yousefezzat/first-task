package org.explicit.bean.config;

import org.explicit.bean.model.repository.EmployeeRepo;
import org.explicit.bean.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    @Qualifier("employeeService")
    public EmployeeService employeeService(EmployeeRepo employeeRepo) {
        return new EmployeeService(employeeRepo, "Default");
    }

//    @Bean
//    @Qualifier("employeeServiceV2")
//    @ConditionalOnMissingBean(name = "employeeServiceV2")
//    public EmployeeService employeeServiceV2(EmployeeRepo employeeRepo) {
//        return new EmployeeService(employeeRepo,  "v2");
//    }


}
