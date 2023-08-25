public class Lesson10Program {
    public static void main(String[] args) {



//        Person tom = new Person("Tom");
//        tom.setAccount("qwerty");

        Bicycle bike = new Bicycle("Java", 150);
        bike.start();
        Bicycle.HandleBar actionBike = bike.new HandleBar();
        actionBike.left();
        actionBike.right();
        actionBike.stop();

//        CalculateFactorial.Factorial fact = CalculateFactorial.getFactorial(6);
//        System.out.printf("Factorial number %d = %d \n", fact.key, fact.result);

//        OuterClass outer = new OuterClass();
//        System.out.println(outer.x);
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//        System.out.println(myInner.y);

//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.myInnerMethod());
//
//        OuterClass.InnerClass myInner1 = new OuterClass().new InnerClass();
//        System.out.println(myInner1.myInnerMethod());


//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        //OuterClass.InnerClass myInner2 = new OuterClass().new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//        myOuter.sum();
    }
}
