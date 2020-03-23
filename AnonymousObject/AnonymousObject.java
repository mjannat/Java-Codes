package AnonymousObject;

import org.w3c.dom.ls.LSOutput;

public class AnonymousObject {
    public static void main(String[] args) {
        C obj = new C();
        obj.x = 10;
        obj.valuePrint();
        new C().x = 10;
        new C().valuePrint();
    }
}

class C {
    int x;

    public void valuePrint() {
        System.out.println(x);
    }
}