package kr.hs.study;
import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
//  설정파일(config.xml)을 로딩하고 실행하는 것

        ctx.close();
        System.out.println("Hello world!");
    }
}