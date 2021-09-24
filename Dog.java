class Dog {

     //There are three components to every OOP class
     //#1: Instance Variables: this represents the data that each instance keeps track of
     
     String name;
     String noise;
     int age;
     
     //#2: Constructor(s): this is a special method that initialzies the instance variables
     //                    Naming rules: must match the name of the class, must be public, and there is no specified return type
     
     public Dog() { //default constructer - no parameter (nothing between the 2 paratheses)
        name = "Dawg";
        noise = "Woof!";
        age = 0;
        }
     
     //overloading = making more than 1 constructor
     public Dog(String title, String sound, int years) {
        name = title;
        noise = sound;
        age = years;        
        }
        
     
     //#3: Behaviour Method(s): methods that define what an instance of this class can do. Usually the name is a verb
     public void bark() {
        System.out.println(noise);
        
        }

    

}