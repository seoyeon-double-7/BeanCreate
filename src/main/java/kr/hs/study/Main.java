package kr.hs.study;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

//  config.xml에서 객체 만들고 보관
//  설정파일(config.xml)을 로딩하고 실행하는 것
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1: " + obj1);

        
//        t2가지고 와서 obj2에 넣고 주소 출력

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2 : "+obj2);


        TestBean obj3 = ctx.getBean("t3", TestBean.class);
        System.out.println("obj3 : "+obj3);

        ctx.close();
        System.out.println("Hello world!");
    }
}