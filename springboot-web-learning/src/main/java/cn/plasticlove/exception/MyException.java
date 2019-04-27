package cn.plasticlove.exception;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 26-17:40
 **/

public class MyException extends RuntimeException {

    public MyException() {
        super("自定义异常");
    }
}
