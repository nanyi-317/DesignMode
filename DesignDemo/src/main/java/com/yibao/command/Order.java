package com.yibao.command;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yibao
 * @create 2022 -05 -06 -11:36
 * 订单类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    // 餐桌号
    private int tableNum;

    // 下单餐品 & 份数
    private Map<String, Integer> menu = new HashMap<String, Integer>();

    // 方法：下单
    public void setFood(String foodName, Integer foodNum) {
        menu.put(foodName, foodNum);
    }
}
