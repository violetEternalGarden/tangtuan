package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Admin;
import com.cj.tangtuan.utils.common.QueryBase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    //添加管理员
    int insertSelective(Admin record);

     //删除、取消删除管理员、修改用户角色
    public int updateAdmin(Admin admin);

    //查询总条数
    public Long findAdminSize();

    //查询所有管理员
    public List<Map> findAllAdmin(QueryBase qb);

    Admin selectByPrimaryKey(Integer id);

//    修改管理员信息，更新加密后的密码和密码保护码
    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //检查用户名是否已存在
    public Integer findAdminByName(String adminName);

    //管理员登陆
    public Admin findAdmin(Admin admin);


}