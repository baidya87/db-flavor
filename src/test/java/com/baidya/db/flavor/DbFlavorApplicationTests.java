package com.baidya.db.flavor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
class DbFlavorApplicationTests {

	@Autowired private DataSource dataSource;
	@Test
	void contextLoads() {
	}

	@Test
	public void testMySqlDataSource() throws SQLException {
		Connection connection = dataSource.getConnection();
		Assertions.assertNotNull(connection);
		Statement statement  = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from member_policy.plan_details");
		Assertions.assertNotNull(resultSet);
		while(resultSet.next()){
			System.out.printf("Plan ID: %s, Name: %s, Value: %s, Tenure: %s \n", resultSet.getString(1), resultSet.getString(2),
					resultSet.getInt(3), resultSet.getInt(4));
		}
	}


}
