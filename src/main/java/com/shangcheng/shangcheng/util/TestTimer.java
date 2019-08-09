package com.shangcheng.shangcheng.util;

import com.shangcheng.shangcheng.service.DetailsService;
import com.shangcheng.shangcheng.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTimer {
    @Autowired
    private OrderService orderService;
    @Autowired
    private DetailsService detailsService;

    @Scheduled(cron = "0/10 * * * * ?")
    private void test() {
       /*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Order> order = orderService.getOrderAll();
        for(Order ord:order){
            if(ord.getCode()!=null&&ord.getCode()==1&&ord.getDate()!=null) {
                try {
                    Date d1 = ord.getDate();
                    Date d2 = new Date();
                    long diff = d2.getTime() - d1.getTime();//这样得到的差值是微秒级别
                    System.out.println(diff);
                    if (diff > (1000 * 60 * 15)) {
                       Details details = detailsService.getDetailsByIid(ord.getIid());
                       details.setKucun(details.getKucun()+ord.getNum());
                       detailsService.updateDetails(details);
                       orderService.delOrder(ord.getId());
                    }
                } catch (Exception e) {
                }
            }
        }*/

    }

}
