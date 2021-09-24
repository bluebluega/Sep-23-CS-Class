class dogDriver {

    public static void main(String[] args) {
        //Making the Dog variables (non-primitives)
        Dog d1;
        Dog d2;
        
        //Birth of the doge (instantiation)
        //new + "Constructer name" - in this case, Dog
        d1 = new Dog(); //using the constructor
        d2 = new Dog("LuckyRufus", "Rawr", 10);
        
        d1.bark();
        d2.bark();
        
        
        
    }


}