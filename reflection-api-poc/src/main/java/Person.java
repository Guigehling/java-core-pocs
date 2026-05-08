public class Person {

    private String name;
    private String email;
    private Integer age;

    public Person() {
    }

    public Person(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    private String greet(String greeting) {
        return name + " say " + greeting;
    }

}
