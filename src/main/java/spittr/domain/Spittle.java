package spittr.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * User: monkey
 * Date: 2018-06-07 10:29
 */
public class Spittle implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;
//    private final Spitter spitter;
    private final String message;

    private final Date postedTime;

    public Spittle(Long id, String message, Date postedTime) {
        this.id = id;
//        this.spitter = spitter;
        this.message = message;
        this.postedTime = postedTime;
    }


    public Long getId() {
        return id;
    }

//    public Spitter getSpitter() {
//        return spitter;
//    }

    public String getMessage() {
        return message;
    }

    public Date getPostedTime() {
        return postedTime;
    }
}
