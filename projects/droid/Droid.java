public class Droid {
   // create a constructor
   String name;
   int batteryLevel;
 
   // create a constructor
   public Droid(String droidName) {
     name = droidName;
     batteryLevel = 100;
   }
 
   // define toString method
   public String toString() {
     return "Hello, I'm the droid: " + name;
   }
 
   // define perform task method
   public void performTask(String task) {
     batteryLevel -= 10;
     System.out.println(name + " is performing task: " + task + "and my batterry level is: " + batteryLevel);
   }
 
   // define energy report method
   
 
   // create main method
   public static void main(String[] args){
     Droid myDroid = new Droid("Codey");
 
     System.out.println(myDroid);
     myDroid.performTask("coding");
     myDroid.performTask("doing Ismael's HW");
   }
 }