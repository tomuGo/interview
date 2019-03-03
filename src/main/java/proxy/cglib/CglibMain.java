package proxy.cglib;

import proxy.jdk.UserImpl;

public class CglibMain {

    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        UserImpl user=(UserImpl)cglibProxy.getCglibProxy(new UserImpl());
        user.getAge();
        user.setName("qwe");
    }
}
