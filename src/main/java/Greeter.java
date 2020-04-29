public class Greeter {

    public String greet(Greeting greeting) {
        return greeting.Perform();
    }
    public Greeting getGreeting() {
        return () -> "Return Lambda Greeting";
    }
    public static void main(String[] args) {
       Greeter greeter = new Greeter();
       Greeting helloWorldGreeting = new HelloWorldGreeting();
       Greeting helloLamba = () ->  "Hello Lamba";

       System.out.println(greeter.greet(helloWorldGreeting));
        System.out.println(greeter.greet(new Greeting() {

            @Override
            public String Perform() {
                return "Hello annonymus greeting";
            }
        }));
        System.out.println(greeter.greet(helloLamba));
        System.out.println(greeter.greet(greeter.getGreeting()));
    }
}
