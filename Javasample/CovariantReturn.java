class SuperClass{
   public Number demo(float a, float b) {
      Number result = a+b;
      return result;
   }
}
public class CovariantReturn extends Super{
   public Integer demo(float a, float b) {
      return (int) (a+b);
   }
   public static void main(String args[]){
      Sub sub = new Sub();
      System.out.println(sub.demo(25.5f, 89.225f));
   }
}