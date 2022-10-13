package edgar.study.kotlin.starter.lec09;

public class JavaPerson {

    private final String name;
    private Integer age;

    public JavaPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
