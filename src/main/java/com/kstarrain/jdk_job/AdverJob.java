package com.kstarrain.jdk_job;//package com.wanda.jdk_job;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * @author: DongYu
// * @create: 2019-10-11 10:48
// * @description:
// */
//@Slf4j
//@Component
//public class AdverJob implements Runnable {
//
//    @Value("${server.port}")
//    private String port;
//
//    @Override
//    public void run() {
//
//        log.info(port + ": 00000000000000   上架广告   start   00000000000000000");
//
//        this.enabledAdvertisement();
//
//        log.info(port + ": 00000000000000   上架广告   end     00000000000000000");
//
//
//        System.out.println(" ");
//    }
//
//    private void enabledAdvertisement() {
//
//        log.info(port + ": 00000000000000   执行 上架广告   逻辑 0000000000000000");
//        throw new RuntimeException("调用广告系统异常");
//    }
//}
