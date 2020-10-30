import com.Dao.UserDao;
import com.Dao.impl.UserDaoImpl;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        //实现接口代理对象
        //实现接口，数组类型
        Class [] interfeces = {UserDao.class};


        UserDaoImpl userDao = new UserDaoImpl();
        //classloader类加载器，增强方法实现类所在的接口，，实现接口，invocationhandler
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfeces,new UserDaoProxy(userDao));
        //代理调用
        int result = dao.add(1,2);
        System.out.println("result:"+ result);
    }
}

