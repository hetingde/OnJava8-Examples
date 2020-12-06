public class Foo {
    private final Info info = new Info();

    public String getInfo() {
        return info.getInfo();
    }

}
class Bar {
    Foo foo;
    String t2 = foo.getInfo();

}