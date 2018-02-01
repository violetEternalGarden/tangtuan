package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Room;

public interface RoomMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long roomId);

    /**
     *
     * @mbggenerated
     */
    int insert(Room record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Room record);

    /**
     *
     * @mbggenerated
     */
    Room selectByPrimaryKey(Long roomId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Room record);
}