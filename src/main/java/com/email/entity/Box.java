package com.email.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("box")
public class Box {
    private Integer id;
    private Integer uid;
    private String smtpHost;
    private String smtpPort;
    private String imapHost;
    private String imapPort;
    private String address;
    private String password;
}
