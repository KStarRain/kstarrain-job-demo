package com.kstarrain.elastic_job;//package com.wanda.elastic_job.config;
//
//import com.dangdang.ddframe.job.config.JobCoreConfiguration;
//import com.dangdang.ddframe.job.config.JobTypeConfiguration;
//import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
//import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
//import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.wanda.elastic_job.AdverJob;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author: Dong Yu
// * @create: 2019-09-27 14:53
// * @description:
// */
//@Configuration
//public class AdverJobConfig {
//
//    @Autowired
//    private ZookeeperRegistryCenter zookeeperRegistryCenter;
//
//
//    @Autowired
//    private AdverJob adverJob;
//
//    @Bean
//    public SpringJobScheduler adverJobScheduler() {
//
//        //调度核心配置
//        JobCoreConfiguration coreConfig =
//                JobCoreConfiguration
//                        .newBuilder("AdverJob", "0/5 * * * * ?", 1)
//                        .shardingItemParameters("")
//                        .description("上架广告")
//                        .jobParameter("")
//                        .build();
//
//        //调度类型配置
//        JobTypeConfiguration typeConfig = new SimpleJobConfiguration(coreConfig, adverJob.getClass().getName());
//
//
//        //最终调度配置
//        LiteJobConfiguration jobConfig = LiteJobConfiguration
//                .newBuilder(typeConfig)
//                .disabled(false)
//                .overwrite(true)
//                .build();
//
//
//        SpringJobScheduler springJobScheduler = new SpringJobScheduler(adverJob, zookeeperRegistryCenter, jobConfig);
//        springJobScheduler.init();
//        return springJobScheduler;
//    }
//
//
//
//}
