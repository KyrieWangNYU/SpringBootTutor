package com.example.demo.modal;

/**
 * Created by kyrie on 12/16/19.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TwoSum {
    private String num1;
    private String num2;
}
