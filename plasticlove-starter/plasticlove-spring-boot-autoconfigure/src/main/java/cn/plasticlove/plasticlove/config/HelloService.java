package cn.plasticlove.plasticlove.config;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 27-22:37
 **/

public class HelloService {

    HelloProperties helloProperties;
    public String say(String name){
        return helloProperties.getPrefix()+name+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
