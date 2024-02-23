package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //класс считывает applicationСontext и помещает все бины в сам applicationСontext
        TestBean testBean = context.getBean("testBean",TestBean.class);//в качестве параметра передаем айди бина/объект который хотим получить.
        // таким образом получаем сам бин,созданный спрингом
        System.out.println(testBean.getName());
        context.close();//обязательно закрываем контекст
    }
}
