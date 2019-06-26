package com.aisino.dao;

import lombok.Data;

/**
 * @Author ：alfredzhang
 * @Description：
 * @Modified By：
 * @Version: :
 * @Date ：2019/6/21 9:01
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
