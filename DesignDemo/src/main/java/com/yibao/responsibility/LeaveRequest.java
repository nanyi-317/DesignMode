package com.yibao.responsibility;

import lombok.*;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:18
 * 请假条类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LeaveRequest {
    // 请假人
    private String name;
    // 请假天数
    private Integer days;
    // 请假原因
    private String reason;
}
