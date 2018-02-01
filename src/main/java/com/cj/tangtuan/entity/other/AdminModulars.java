package com.cj.tangtuan.entity.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Created by XD on 2017/12/13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminModulars {

    private Integer id;

    private String pageName;

    private String pageUrl;

    private String pageType;

    private Integer pageSort;

    private Integer parentId;

    private String spare1;

    private String state;

    private Date createTime;

    private List<Object> children;
}
