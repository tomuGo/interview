package proxy.jdk;

public class JdkMain {
    public static void main(String[] args) {
        JdkProxy jdkProxy=new JdkProxy();
        UserManage user=(UserManage) jdkProxy.getJdkProxy(new UserImpl());
        System.out.println(user.getAge());
    }
}
