package com.aisino.controller;

import com.aisino.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author ：alfredzhang
 * @Description：
 * @Modified By：
 * @Version: :
 * @Date ：2019/6/22 11:41
 */
@RestController
@Slf4j
@RequestMapping("user")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    /*3.*/
//    @Autowired
//    private LoadBalancerClient ribbonLoadBalancerClient;

    /*2.*/
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id) {
        /*1.高内聚*/
//        String url = "http://localhost:8010/user/" + id;
//        log.debug("port:8010 is running selectByPrimaryKey");
//        return restTemplate.getForObject(url, User.class);

        /*2.*/
        // 根据服务器id获取实例
//        log.debug("this test!!!");
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-server");
////        从实例中去除ip和端口
//        ServiceInstance serviceInstance = instances.get(0);
//        log.debug("ip:"+serviceInstance.getHost()+ "   port:"+serviceInstance.getPort());
//        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id;
//        User user = restTemplate.getForObject(url, User.class);

        /*3.*/
//        ServiceInstance serviceInstance = ribbonLoadBalancerClient.choose("user-server");
//        log.debug("ip:"+serviceInstance.getHost()+ "   port:"+serviceInstance.getPort());
//        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id;
//        User user = restTemplate.getForObject(url, User.class);

        /*4.*/
        String url = "http://user-server/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
