package com.cj.tangtuan.entity.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by XD on 2017/12/4.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    private String text;
    private String value;
    private List<Object> children;
}
