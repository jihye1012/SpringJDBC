package kr.hs.study;

import kr.hs.study.config.BeanConfig;
import kr.hs.study.dao.TestDAO;
import kr.hs.study.dto.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfig.class);
        TestDAO dao=ctx.getBean(TestDAO.class);

//데이터를 저장할 빈 생성(TestBean1)
//new로그냥생성
    //    TestBean1 t=new TestBean1();
        //  t.setData1(1);
   //     t.setData2("spring1");
    //    dao.insert(t);
    //    System.out.println("Inserted!!!!");

   //     TestBean1 t=new TestBean1();
   //     t.setData1(2);
   //     t.setData2("spring2");
  //      dao.insert(t);

      //  TestBean1 t=new TestBean1();
     //   t.setData1(3);
    //    t.setData2("spring3");
    //    dao.insert(t);

      //  TestBean1 t= new TestBean1();
    //    t.setData1(3);
    //    t.setData2("spring222");
    //    dao.update(t);
        List<TestBean1> list = dao.list();
        for(TestBean1 bean: list){
            //list에서 한 줄씩 꺼내와서 bean에 넣는다.
            System.out.println("data1 : "+bean.getData1());
            System.out.println("data2 : "+bean.getData2());
        }

        System.out.println("Inserted!!!!");

        ctx.close();


    }
}