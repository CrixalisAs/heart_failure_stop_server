package cn.edu.zju.bmi.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TwoElementTuple <A, B> {
    private A a;
    private B b;
}
