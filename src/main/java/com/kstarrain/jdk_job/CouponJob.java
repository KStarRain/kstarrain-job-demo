package com.kstarrain.jdk_job;//package com.wanda.jdk_job;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * @author: DongYu
// * @create: 2019-10-12 10:01
// * @description:
// */
//@Slf4j
//@Component
//public class CouponJob implements Runnable{
//
//    @Value("${server.port}")
//    private String port;
//
//    @Override
//    public void run() {
//
//        try {
//            log.info(port + ": --------------   发放优惠券 start   -----------------");
//
//            this.issueCoupon();
//
//            log.info(port + ": --------------   发放优惠券 end     -----------------");
//
//
//            System.out.println(" ");
//        } catch (Exception e) {
//            log.error(e.getMessage(), e);
//        }
//    }
//
//    private void issueCoupon() {
//
//        log.info(port + ": --------------   执行 发放优惠券 逻辑 ----------------");
//        /*try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }*/
//
////        throw new RuntimeException("调用优惠券系统异常");
//
//    }
//}
