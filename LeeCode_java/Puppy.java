package LeeCode_java;
public class Puppy{
    private int age;
    private String name;
    public Puppy(String name){
        this.name = name;
        System.out.println("name is" + this.name);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
     public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(2);
        System.out.println("myPuppy's name" + myPuppy.getName());
        System.out.println("age " + myPuppy.getAge());
    }
}
