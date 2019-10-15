package com.kstarrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

//        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(20);

        //优惠券定时任务 每隔5秒一次
//        CouponJob couponJob = context.getBean(CouponJob.class);
//        scheduled.scheduleAtFixedRate(couponJob, 0, 5 ,TimeUnit.SECONDS);

        //广告定时任务  每隔5秒一次
//        AdverJob adverJob = context.getBean(AdverJob.class);
//        scheduled.scheduleAtFixedRate(adverJob, 0, 5 ,TimeUnit.SECONDS);

    }

}
