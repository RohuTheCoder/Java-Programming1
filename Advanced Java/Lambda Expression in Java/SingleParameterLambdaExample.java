interface Sayable
{
    public String say(String name);
}
public class SingleParameterLambdaExample
{
    public static void main(String[] args) {
        Sayable s1 = (name) -> {
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));
    }
}
