package com.jckjkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.DepartmentMapper;
import com.jckjkj.mybatis.dao.EquipmentMapper;
import com.jckjkj.mybatis.dao.MobileMapper;
import com.jckjkj.mybatis.dao.PersonMapper;
import com.jckjkj.mybatis.dao.RoleMapper;
import com.jckjkj.mybatis.dao.UserMapper;
import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.DepartmentExample;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentExample;
import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.MobileExample;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.PersonExample;
import com.jckjkj.mybatis.model.Role;
import com.jckjkj.mybatis.model.RoleExample;
import com.jckjkj.mybatis.model.User;
import com.jckjkj.mybatis.model.UserExample;
import com.jckjkj.service.SystemService;

@Service("systemService")
public class SystemServiceImpl implements SystemService{

	private DepartmentMapper departmentMapper;
	private MobileMapper mobileMapper;
	private PersonMapper personMapper;
	private EquipmentMapper equipmentMapper;
	private UserMapper userMapper;
	private RoleMapper roleMapper;
	
	@Override
	public List<Department> getDepartmentList() {
		// TODO Auto-generated method stub
		DepartmentExample example = new DepartmentExample();
		example.createCriteria().andIdIsNotNull();
		return departmentMapper.selectByExample(example);
	}

	@Override
	public int deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteByPrimaryKey((id));
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.updateByPrimaryKey(department);
	}

	@Override
	public List<Mobile> getMobileList() {
		// TODO Auto-generated method stub
		MobileExample example = new MobileExample();
		example.createCriteria().andIdIsNotNull();
		return mobileMapper.selectByExample(example);
	}

	@Override
	public int deleteMobile(int id) {
		// TODO Auto-generated method stub
		return mobileMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return mobileMapper.updateByPrimaryKey(mobile);
	}

	@Override
	public List<Person> getPersonList() {
		// TODO Auto-generated method stub
		PersonExample example = new PersonExample();
		example.createCriteria().andIdIsNotNull();
		return personMapper.selectByExample(example);
	}

	@Override
	public int deletePerson(int id) {
		// TODO Auto-generated method stub
		return personMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updatePerson(Person person) {
		// TODO Auto-generated method stub
		return personMapper.updateByPrimaryKey(person);
	}

	@Override
	public List<Equipment> getEquipmentList() {
		// TODO Auto-generated method stub
		EquipmentExample example = new EquipmentExample();
		example.createCriteria().andIdIsNotNull();
		return equipmentMapper.selectByExample(example);
	}

	@Override
	public int deleteEquipment(int id) {
		// TODO Auto-generated method stub
		return equipmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipmentMapper.updateByPrimaryKey(equipment);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andIdIsNotNull();
		return userMapper.selectByExample(example);
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		RoleExample example = new RoleExample();
		example.createCriteria().andIdIsNotNull();
		return roleMapper.selectByExample(example);
	}

	@Override
	public int deleteRole(int id) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateRole(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKey(role);
	}

	/*-=---------------------------------------------*/
	
	public DepartmentMapper getDepartmentMapper() {
		return departmentMapper;
	}

	@Autowired
	public void setDepartmentMapper(DepartmentMapper departmentMapper) {
		this.departmentMapper = departmentMapper;
	}

	public MobileMapper getMobileMapper() {
		return mobileMapper;
	}

	@Autowired
	public void setMobileMapper(MobileMapper mobileMapper) {
		this.mobileMapper = mobileMapper;
	}

	public PersonMapper getPersonMapper() {
		return personMapper;
	}

	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	public EquipmentMapper getEquipmentMapper() {
		return equipmentMapper;
	}

	@Autowired
	public void setEquipmentMapper(EquipmentMapper equipmentMapper) {
		this.equipmentMapper = equipmentMapper;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}
	
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	@Autowired
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

}
