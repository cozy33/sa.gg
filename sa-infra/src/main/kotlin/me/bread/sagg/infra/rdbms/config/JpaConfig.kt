package me.bread.sagg.infra.rdbms.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["me.bread.sagg.infra.rdbms.entity"])
@EnableJpaRepositories(basePackages = ["me.bread.sagg.infra.rdbms.repository"])
internal class JpaConfig
