import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.alerts.AlertService;
import spittr.domain.Spittle;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * User: monkey
 * Date: 2018-06-07 10:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:messaging.xml")
public class AlertTest {

    @Autowired
    private AlertService alertService;

    //发送消息
    @Test
    public void sendSpittleAlert(){
        Spittle spittle = new Spittle(2L, "bbb", new Date());
        alertService.sendSpittleAlert(spittle);
    }

    //接收消息
    @Test
    public void recevieSpittleAlert(){
        Spittle spittle = alertService.recevieSpittleAlert();
        assertEquals("aaa",spittle.getMessage());
    }
}
