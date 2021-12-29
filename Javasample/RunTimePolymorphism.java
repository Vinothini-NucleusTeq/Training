class Bank{  
float getRateOfInterest(){return 0;}  
}  
class Sbi extends Bank{  
float getRateOfInterest(){return 5.5f;}  
}  
class Icici extends Bank{  
float getRateOfInterest(){return 6.6f;}  
}  
class Axis extends Bank{  
float getRateOfInterest(){return 7.7f;}  
}  
class RunTimePolymorphism{  
public static void main(String args[]){  
Bank b;  
b=new Sbi();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new Icici();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new Axis();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}  