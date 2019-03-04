package proxy.jdk;

public class UserImpl implements UserManage {
    public int getAge() {
        System.out.println("调用了getAge方法");
        return 28;
    }

    public void setName(String name) {
        System.out.println("调用了setName方法" + name);
    }
}
