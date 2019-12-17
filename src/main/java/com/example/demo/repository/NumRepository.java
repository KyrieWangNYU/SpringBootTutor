package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modal.TwoSum;
import org.springframework.stereotype.Repository;


/**
 * Created by kyrie on 12/16/19.
 */
@Repository
public class NumRepository {

    List<TwoSum> result = new ArrayList<>();

    public NumRepository() {
        TwoSum twoSum = TwoSum.builder()
                .num1("0")
                .num2("1")
                .build();

        result.add(twoSum);
    }

    public List<TwoSum> findNumbers(){
        return result;
    }

}
