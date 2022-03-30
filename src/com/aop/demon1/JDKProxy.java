package com.aop.demon1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 韩帅比
 * @create 2022-03-28 0:56
 */
public class JDKProxy {
    public static void main(String[] args) {
        /**
         *         Class[] interfaces = {UserDao.class};
         *         Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
         *             @Override
         *             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         *                 return null;
         *             }
         *         });
         *
         *         可以用匿名内部实现
         *
         */


        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        String result = dao.update("qwe");
        System.out.println("result:" + result);
    }
}
//创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    //1.需要创建的是谁的代理对象，就把谁传递过来
    //有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }
    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法即将增强。。。。" + method.getName() + " :传递的参数。。。" + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法已增强" + obj);
        return res;
    }
}