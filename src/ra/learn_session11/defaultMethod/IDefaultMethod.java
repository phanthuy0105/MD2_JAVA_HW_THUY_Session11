package ra.learn_session11.defaultMethod;

public interface IDefaultMethod {
    default void hello() {
        System.out.println("Xin chào các bạn");
    }
}