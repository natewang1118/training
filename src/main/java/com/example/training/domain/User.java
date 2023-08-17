package com.example.training.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "user_info_")
@Data
@EqualsAndHashCode(callSuper = false, doNotUseGetters = true, exclude = {})
@ToString(callSuper = true, doNotUseGetters = true, exclude = {})
public class User implements Serializable {

    private static final long serialVersionUID = 2698812789010477485L;

    /**
     * 主鍵
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
