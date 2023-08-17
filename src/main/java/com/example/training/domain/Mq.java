package com.example.training.domain;


import lombok.Data;

import java.io.Serializable;

@Data
public class Mq implements Serializable {

    public Mq(Object body) {
        this.setBody(body);
    }

    private Object body;

}
