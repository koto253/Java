# Build A Droid
## Defining a Droid
+ Start by defining the class Droid.
+ Declare an instance field called batteryLevel. We want to store whole number values in this field.
+ Declare another instance field called name which will store our droid’s name. What type should this be?
+ Create a constructor method for the Droid class. The method should have one parameter of String droidName.
+ Inside the constructor, assign the parameter value of droidName to the appropriate instance field. Set the value of batteryLevel to 100. Every new instance of Droid will have a batteryLevel of 100.

## Declaring Instances of Drone
+ Inside main(), create a new instance of Droid named "droid13".
+ Print out the variable using System.out.println().
+ That output isn’t very informative!
  + Define a toString() method within Droid.
  + The return type is String.
  + Inside toString(), return a string that introduces the Droid using their name.
    + Something like “Hello, I’m the droid: droidNameHere”
## Doing Droid Things
+ Define a new method: performTask(). This method should have a single parameter: String task.
  + This method does not return any value.
+ Inside performTask(), print a statement like “name is performing task: task“.
  + For example, codey.performTask("coding");
+ Performing tasks is hard work. After the print statement, set batteryLevel to be 10 less than it was before.
  + We’ll need to reassign the instance field to be the current value minus 10.
+ Have your Droid instance perform some tasks inside of main(). 
