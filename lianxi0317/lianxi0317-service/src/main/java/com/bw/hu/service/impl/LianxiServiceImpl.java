/**
 * 
 */
package com.bw.hu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.hu.entity.User;
import com.bw.hu.mapper.UserMapper;
import com.bw.hu.service.LianxiService;

/**
 * @author 胡建明
 *
 * 2018年3月17日上午9:32:11
 */
@Service
public class LianxiServiceImpl implements LianxiService {

	@Autowired
	private UserMapper userxiMapper;

	/* (non-Javadoc)
	 * @see com.bw.hu.service.LianxiService#selectAll()
	 */
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userxiMapper.selectAll();
	}
	
	
}
