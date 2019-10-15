package com.kstarrain.elastic_job.config;//package com.wanda.elastic_job.config;
//
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.wanda.elastic_job.config.properties.ZookeeperProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author: Dong Yu
// * @create: 2019-09-27 14:53
// * @description:
// */
//@Configuration
//@EnableConfigurationProperties(ZookeeperProperties.class)
//public class ZookeeperRegistryCenterConfig {
//
//    @Autowired
//    private ZookeeperProperties zookeeperProperties;
//
//
//    /**
//     * 初始化Zookeeper注册中心
//     * @return
//     */
//    @Bean(initMethod = "init")
//    public ZookeeperRegistryCenter zookeeperRegistryCenter() {
//        ZookeeperConfiguration zkConfig = new ZookeeperConfiguration(zookeeperProperties.getAddresses(), zookeeperProperties.getNamespace());
//        return new ZookeeperRegistryCenter(zkConfig);
//    }
//
//
//
//}
