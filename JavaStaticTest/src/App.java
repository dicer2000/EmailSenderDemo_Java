class VariableDemo
{
   private static int count=0;
   public void increment() {
       count++;
   }
   public int getCount() {
       return count;
   }

   public static void main(String args[])
   {
       VariableDemo obj1=new VariableDemo();
       VariableDemo obj2=new VariableDemo();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.getCount());
       System.out.println("Obj2: count is="+obj2.getCount());
   }
}