package com.websocket.test.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MsgVo implements Serializable {
    private Long  id;
    private Integer type;
    private Integer count;

    public MsgVo(Long id, Integer type, Integer count) {
        this.id = id;
        this.type = type;
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type=" + type +
                ", count=" + count +
                '}';
    }
}
