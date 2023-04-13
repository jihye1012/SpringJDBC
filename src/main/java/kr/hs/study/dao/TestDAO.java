package kr.hs.study.dao;

import kr.hs.study.dto.TestBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestDAO {
    @Autowired
    private JdbcTemplate jdbc;
    public void insert(TestBean1 bean){
        String sql="insert into test values(?,?)";
        jdbc.update(sql, bean.getData1(), bean.getData2());   //binding : 동적으로 값을 할당하는 것
    }
    public void update(TestBean1 bean){
        String sql="update test set data2=? where data1=?";
        jdbc.update(sql,bean.getData2(),bean.getData1());
    }
    public void delete(TestBean1 bean){
        String sql=" ";
       // jdbc.delete(sql,bean.getData1(),bean.getData2());
    }
    //리스트
    @Autowired
    private Mapper mapper;
    public List<TestBean1> list(){
        String sql= "select * from test";
        List<TestBean1> list=jdbc.query(sql,mapper);
        return list;
    }
}
