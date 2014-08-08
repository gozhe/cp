package com.jckjkj.junit;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import com.jckjkj.mybatis.dao.CameraMapper;
import com.jckjkj.mybatis.model.Camera;

public class ProgresSqlDBTest {

	Connection con = null;

	@Before
	public void setUp() throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/camera_cp", "postgres",
					"postgres");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}

	@Test
	public void InserData_T_Camera() {
		Camera entity = new Camera();
		entity.setCameraid("001");
		entity.setCameraname("摄像头001");
		
	}
	@Test
	public void DeleteData_T_Camera(){
		
	}
}
