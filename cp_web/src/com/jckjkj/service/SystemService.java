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
	
	int deleteDepartment(int id);
	
	int updateDepartment(Department department);
	
	List<Mobile> getMobileList();

	int deleteMobile(int id);

	int updateMobile(Mobile mobile);
	
	List<Person> getPersonList();
	
	int deletePerson(int id);
	
	int updatePerson(Person person);
	
	List<Equipment> getEquipmentList();
	
	int deleteEquipment(int id);
	
	int updateEquipment(Equipment equipment);
	
	List<User> getUserList();
	
	int deleteUser(int id);
	
	int updateUser(User user);
	
	List<Role> getRoleList();
	
	int deleteRole(int id);
	
	int updateRole(Role role);
}
