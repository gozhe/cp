package com.jckjkj.service;

import java.util.List;

import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.Role;
import com.jckjkj.mybatis.model.User;

public interface SystemService {

	List<Department> getDepartmentList();
	
	List<Department> getDepartmentList(int start,int rows);
	
	int deleteDepartment(int id);
	
	int updateDepartment(Department department);
	
	List<Mobile> getMobileList();
	
	List<Mobile> getMobileList(int start,int rows);

	int deleteMobile(int id);

	int updateMobile(Mobile mobile);
	
	List<Person> getPersonList();
	
	List<Person> getPersonList(int start,int rows);
	
	int deletePerson(int id);
	
	int updatePerson(Person person);
	
	List<Equipment> getEquipmentList();
	
	List<Equipment> getEquipmentList(int start,int rows);
	
	int deleteEquipment(int id);
	
	int updateEquipment(Equipment equipment);
	
	List<User> getUserList();
	
	List<User> getUserList(int start,int rows);
	
	int deleteUser(int id);
	
	int updateUser(User user);
	
	List<Role> getRoleList();
	
	List<Role> getRoleList(int start,int rows);
	
	int deleteRole(int id);
	
	int updateRole(Role role);
}
