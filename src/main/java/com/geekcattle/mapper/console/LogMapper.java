package com.geekcattle.mapper.console;

import com.geekcattle.model.console.Log;
import com.geekcattle.util.CustomerMapper;

import java.util.List;

/**
 * author geekcattle
 * date 2017/1/6 0006 上午 11:25
 */
public interface LogMapper extends CustomerMapper<Log> {

    List<Log> selectAllDesc();
}
