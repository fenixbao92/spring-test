package fenixbao92.com.spring.test;

/**
 * Create by fenixbao92 on 2019/3/23.
 */

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

}