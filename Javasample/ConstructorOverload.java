class ConstructorOverload{  
    int id;  
    String name;  
    int age;  
    ConstructorOverload(int i,String n){  
    id = i;  
    name = n;  
    }  
    ConstructorOverload(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    ConstructorOverload s1 = new ConstructorOverload(111,"Karan");  
    ConstructorOverload s2 = new ConstructorOverload(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  