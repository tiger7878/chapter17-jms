package spittr.alerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import spittr.domain.Spittle;

/**
 * User: monkey
 * Date: 2018-06-07 10:37
 */
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsOperations jmsOperations;

    @Override
    public void sendSpittleAlert(Spittle spittle) {
        jmsOperations.convertAndSend(spittle);
    }

    @Override
    public Spittle recevieSpittleAlert() {
        return (Spittle) jmsOperations.receiveAndConvert();
    }
}
