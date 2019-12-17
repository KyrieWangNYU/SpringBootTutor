package com.example.demo.service;

import com.example.demo.modal.TwoSum;
import com.example.demo.repository.NumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyrie on 12/16/19.
 */
@Service
@Component
public class NumService {

    @Autowired
    NumRepository numRepository;

    public List<TwoSum> findNumbers(){
        return numRepository.findNumbers();
    }
}
