package creational;

class FactoryTest {

    public static void main(String[] args) {
        Hello h = new Hello();
        System.out.println(h.greeting("en"));
        System.out.println(h.greeting("ko"));
    }
}

public class Factory {
    private static final String KOREAN = "ko";
    private static final String ENGLISH = "en";

    public static Language getInstance(String style) {
        System.out.println("팩토리: 객체를 생성하여 반환합니다.");
        if (ENGLISH.equals(style)) {
            return new English();
        } else { //ko
            return new Korean();
        }
    }
}

class Hello {

    public Hello() {
    }

    public String greeting(String style) {
        Language k = factory();
        return Factory.getInstance(style).text();
    }

    public static Language factory() {
        return new Korean();
    }
}

interface Language {

    String text();
}

class Korean implements Language {

    public String text() {
        return "안녕하세요.";
    }
}

class English implements Language {

    public String text() {
        return "hello world.";
    }
}