package com.example.ssmp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Duty {
    private Integer id;
    private String name;
    private Date date;
    private Integer duration;
}
