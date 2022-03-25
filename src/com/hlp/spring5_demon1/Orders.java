package com.hlp.spring5_demon1;

/**
 * 使用有参构造注入
 *
 * @author 韩帅比
 * @create 2022-03-24 1:21
 */
public class Orders {
    private String oName;
    private String address;

    public Orders(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oName + "::" + address);
    }
}
