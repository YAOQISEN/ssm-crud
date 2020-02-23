package com.guison.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guison.crud.bean.Department;
import com.guison.crud.dao.DepartmentMapper;

/*
 * ����dao��Ĺ���
 * Spring��Ŀʹ��Spring�ĵ�Ԫ���ԣ������Զ�ע����Ҫ�����
 * 1.����SpringTestģ��
 * 2.@ContextConfigurationָ��Spring�����ļ���λ��
 * 3.ֱ��autowiredʹ�����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	DepartmentMapper departmentMapper;

	Department department = new Department(1,"������");

	@Test
	public void testCrud() {
		departmentMapper.insertSelective(department);
		//System.out.println(departmentMapper);

	}
}
