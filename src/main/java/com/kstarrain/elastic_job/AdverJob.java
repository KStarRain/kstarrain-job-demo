package com.kstarrain.elastic_job;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.wanda.annotation.ElasticJobScheduled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: DongYu
 * @create: 2019-10-11 10:48
 * @description:
 */
@Slf4j
@Component
@ElasticJobScheduled(name = "AdverJob", cron = "0/5 * * * * ?", eventDataSourceBeanName = "jobEventDataSource")
public class AdverJob implements SimpleJob {

    @Value("${server.port}")
    private String port;


    @Override
    public void execute(ShardingContext shardingContext) {

        log.info(port + ": 00000000000000   上架广告   start   00000000000000000");

        this.enabledAdvertisement();

        log.info(port + ": 00000000000000   上架广告   end     00000000000000000");


        System.out.println(" ");

    }


    private void enabledAdvertisement() {

        log.info(port + ": 00000000000000   执行 上架广告   逻辑 0000000000000000");

    }


}
