package com.yibao.strategy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yibao
 * @create 2022 -05 -06 -10:42
 * 销售员（环境类）
 */
@Data
@Getter
@Setter
public class SalesMan {
    // 属性：策略
    private Strategy strategy;

    // 有参构造
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    // 方法：销售员展示销售策略
    public void salesManShow() {
        strategy.show();
    }
}
