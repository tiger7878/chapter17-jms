package spittr.alerts;

import spittr.domain.Spittle;

/**
 * User: monkey
 * Date: 2018-06-07 10:35
 */
public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
    Spittle recevieSpittleAlert();
}
