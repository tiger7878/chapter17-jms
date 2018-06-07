package spittr.alerts;

import spittr.domain.Spittle;

/**
 * 消息监听器
 * Spring的消息驱动POJO（Spring MDP），用于异步接收和处理消息
 * User: monkey
 * Date: 2018-06-07 16:11
 */
public class SpittleAlertHandler {

    //处理方法
    public void handleSpittleAlert(Spittle spittle) {
        System.out.println(spittle.getMessage());
    }

}
