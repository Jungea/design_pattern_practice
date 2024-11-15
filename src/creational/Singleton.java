package creational;

class SingletonTest {

    public static void main(String[] args) {

        ConfigSingleton c1 = ConfigSingleton.getInstance();
        ConfigSingleton c2 = ConfigSingleton.getInstance();
    }
}

public class Singleton {

}

class HelloSingleton {

    public String greeting() {
        return "안녕하세요.";
    }
}

class ConfigSingleton {

    private static ConfigSingleton instance = null;

    private ConfigSingleton() {
        System.out.println(Singleton.class + "가 생성이 되었습니다.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(Singleton.class + "는 복제할 수 없습니다.");
    }

    public static ConfigSingleton getInstance() {

        if (instance == null) {
            System.out.println(Singleton.class + "객체를 생성합니다.");
            instance = new ConfigSingleton();
        }

        System.out.println(Singleton.class + "객체를 반환합니다.");
        return instance;
    }

}