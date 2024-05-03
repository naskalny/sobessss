public class SomeClass {

    public void someMethod() {
        some(SomeUtilityClass::doSomething);
    }

    public void someAnotherMethod() {
        some(SomeUtilityClass::doAnythingElse);
    }

    private void some(Runnable task) {
        System.out.println("do something 1");
        System.out.println("do something 2");
        task.run();
        System.out.println("do something 3");
        System.out.println("do something 4");
    }
    static class SomeUtilityClass {

        static void doSomething() {
            System.out.println("do something");
        }

        static void doAnythingElse() {
            System.out.println("do anything else");
        }
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod();
        someClass.someAnotherMethod();
    }


}