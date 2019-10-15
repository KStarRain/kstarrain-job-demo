package com.kstarrain.elastic_job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: DongYu
 * @create: 2019-10-12 10:01
 * @description:
 */
@Slf4j
@Component
//@ElasticJobScheduled(name = "CouponJob", cron = "0/5 * * * * ?")
public class CouponJob implements SimpleJob {

    @Value("${server.port}")
    private String port;

    @Override
    public void execute(ShardingContext shardingContext) {

        log.info(port + ": --------------   发放优惠券 start   -----------------");

        this.issueCoupon();

        log.info(port + ": --------------   发放优惠券 end     -----------------");


        System.out.println(" ");
    }


    private void issueCoupon() {

        log.info(port + ": --------------   执行 发放优惠券 逻辑 ----------------");
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//        throw new RuntimeException("调用优惠券系统异常");

    }


}
