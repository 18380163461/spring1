package com.example.jdbc;

import com.example.jdbcxml.User;
import com.example.jdbcxml.UserDao;
import com.example.jdbcxml.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * JdbcTest Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 24, 2017</pre>
 */
public class JdbcTestTest {
    ApplicationContext applicationContext;
    JdbcTemplate jdbcTemplate = null;

    @Before
    public void before() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicatinContext-tx.xml");
        jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String args[])
     */
    @Test
    public void testMain() throws Exception {
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        try {
            System.out.println(dataSource.getConnection().toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String sql = "INSERT INTO `test`.`user` ( `name`, `departmentid`, `money`) VALUES ( 'gf', '7', '444');";
        jdbcTemplate.execute(sql);
    }

    @Test
    public void springTransationFind() throws Exception {
        UserDao user = applicationContext.getBean(UserDao.class);
        User users = user.finAllUser();
        System.out.println(users);
    }

    @Test
    public void springTransationInsert() throws Exception {
        UserDao user = applicationContext.getBean(UserDao.class);
        user.insertUser();
    }

    @Test
    public void userServiceInsert() throws Exception {
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.dealUser();
    }
}