package com.kstarrain.elastic_job;//package com.wanda.elastic_job.config;
//
//import com.dangdang.ddframe.job.config.JobCoreConfiguration;
//import com.dangdang.ddframe.job.config.JobTypeConfiguration;
//import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
//import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
//import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.wanda.elastic_job.CouponJob;
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
//public class CouponJobConfig {
//
//    @Autowired
//    private ZookeeperRegistryCenter zookeeperRegistryCenter;
//
//    @Autowired
//    private CouponJob couponJob;
//
//    @Bean
//    public SpringJobScheduler couponJobScheduler() {
//
//        //调度核心配置
//        JobCoreConfiguration coreConfig =
//                JobCoreConfiguration
//                        .newBuilder("CouponJob", "0/5 * * * * ?", 1)
//                        .shardingItemParameters("")
//                        .description("发放优惠券")
//                        .jobParameter("")
//                        .build();
//
//        //调度类型配置
//        JobTypeConfiguration typeConfig = new SimpleJobConfiguration(coreConfig, couponJob.getClass().getName());
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
//        SpringJobScheduler springJobScheduler = new SpringJobScheduler(couponJob, zookeeperRegistryCenter, jobConfig);
//        springJobScheduler.init();
//        return springJobScheduler;
//    }
//
//
//
//
//
//
//}
