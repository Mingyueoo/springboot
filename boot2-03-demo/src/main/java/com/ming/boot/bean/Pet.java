package com.ming.boot.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Pet {
    private String name;
    private Double weight;
}
