package com.example.jdbcxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertUser() {
        String sql = "INSERT INTO `test`.`user` (`name`, `departmentid`, `money`) VALUES ( 'gf', '7', '444');";
        jdbcTemplate.execute(sql);
    }

    @Override
    public void updateUser() {
        String sql = "UPDATE `user` SET money=money+1 WHERE iad=1";
        jdbcTemplate.execute(sql);

    }

    @Override
    public User finAllUser() {
     /*   RowMapper<User> rm = ParameterizedBeanPropertyRowMapper.newInstance(User.class);

        String sql = "SELECT * from `user`";
        return jdbcTemplate.queryForList(sql, User.class,rm);*/

        RowMapper<User> rm = ParameterizedBeanPropertyRowMapper.newInstance(User.class);

        String sql = "SELECT * from `user` WHERE id=1";
        User user = (User) this.jdbcTemplate.queryForObject(
                "SELECT * FROM USER WHERE ID = 1", rm);
        System.out.println("");
        return null;
    }
}
