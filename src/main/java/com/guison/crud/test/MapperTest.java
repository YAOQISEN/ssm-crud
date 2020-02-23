package com.guison.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guison.crud.bean.Department;
import com.guison.crud.dao.DepartmentMapper;

/*
 * 测试dao层的工作
 * Spring项目使用Spring的单元测试，可以自动注入需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired使用组件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	DepartmentMapper departmentMapper;

	Department department = new Department(1,"工作部");

	@Test
	public void testCrud() {
		departmentMapper.insertSelective(department);
		//System.out.println(departmentMapper);

	}
}
