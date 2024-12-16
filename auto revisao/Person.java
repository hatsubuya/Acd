public class Person {
    
    private String name;
    
    private int age;
    
    private String code;
    
    private int credits;


    public Person(String myName, int myAge) {
        
        this.name = myName;
        
        this.age = myAge;
        
        
    }
    
    public int getAge() {
        
        return age;
    
    }
    
    public String getName() {
        
        return name;
    }
    
    public void setAge(int myAge){
        
        this.age = myAge;
        
    }
    
    public void printDetails(String name)
    {
        System.out.println("The name of this person is " + name);
    }
    
}