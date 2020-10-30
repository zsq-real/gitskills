import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDaoProxy implements InvocationHandler {
//代理谁，把谁传进来
    //
    private Object object;
    //有参数的构造
    public UserDaoProxy(Object object){
        this.object=object;
    }

    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前.." + method.getName() +":传递的参数" + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(object , args);
        System.out.println("方法执行之后..." + object);
        return res;
    }
}
