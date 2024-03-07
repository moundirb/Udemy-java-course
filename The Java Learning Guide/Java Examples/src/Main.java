import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


/* 
    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i <= 5; i++) {
                out.println("Running " + name + ", count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}*/







        /* ************************************last poo objects**********************
var x= new X();
x.i=10;
        out.println(x.i);
var y= new Y();
y.casting();
out.println(y.casting().i);

    }}
class X {
    int i;
}
class Y{
    public X casting(){
        return new X();
    }
}
*/
        /* ***************************ENum CLass*****************************

        var y=Direction.valueOf(new Scanner(in).nextLine());
        switch (y){
            case East :
                break;
            case South :
                break;
            case West :
                break;
            case North :
                out.println("Nice,You guessed the right direction ! "+Direction.North.i);
                break;
        }
        var x=Direction.values();

        for(var i:x){
           out.println(i.i);
           out.println(i.s);
        }

        out.println(Direction.East);
        Direction.West.getDir();
        out.println(Direction.North.i);
        out.println(Direction.North.s);


    }
}
enum Direction{
    North (1,"North"){
        @Override
        void getDir() {
            out.println("North");

        }
    },
    South (2,"South"){
        @Override
        void getDir() {
            out.println("South");

        }
    },
    West(3,"West") {
        @Override
        void getDir() {
            out.println("West");

        }
    },
    East (4,"East"){
        @Override
        void getDir() {
            out.println("East");

        }
 };
    int i;
    String s;
    Direction(int pi,String ps){
        i=pi;
        s=ps;

    }
     abstract void getDir();

     

}
*/
/*

        //*********************Generic Class***********************
        var b1= new B<Integer,Double>();
        b1.x=10;
        b1.y=10.2;
        b1.info1(b1.x, b1.y);
        b1.info2(9.5);
        var b2= new B<Integer,Boolean>();
        b2.x=10;
        b2.y=false;
        b2.info1(b2.x, b2.y);
        b2.info2(true);


    }}
class B<T,E>{
    T x;
    E y;
    public void info1(T a,E b){
        out.println("showtime "+a+','+b);
    }
    public E info2(E z){
        out.println(z);
        return z;
    }
}*/

        /* **********************************multi threading***************
        var t1= new Thread(new Task("Thread 1"));

        var t2= new Thread(new Task("Thread 2"));

        t1.start();

        t2.start();
    }
    static class Task implements Runnable{
        private String name;
        public Task(String name){
            this.name =name;
        }
        @Override
        public void run(){
            for( int i=0;i<=5;i++){
                out.println("Running"+name+", count: "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
} */
        /*

var t1= new Thread(() -> {
    for( int i=0; i<5; i++){
    out.println("Hello");
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

});
var t2= new Thread(() -> {
    for(int i = 0; i<5; i++){
    out.println("world");
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

});
t1.start();
t2.start();
    }


    }*/
        /* **************************************** lambda methode+ methoide methode****************
        var s=new ArrayList<String>();
        s.add("Apple");
        s.add("Banana");
        s.add("Cherry");

        s.forEach( i-> out.println("Lambda method: "+i));
        s.forEach(Main::Item);
    }
public static void Item(String i){
        out.println("Methode method: "+i);
}
}
*/

        /*
        var x = new ArrayList<Integer>();
        x.add(4);
        x.add(5);
        x.add(6);
      x.forEach(
              i-> {
                  out.println("wow "+i);
              });

    }
}
*/

        /*
        Deme d= new Deme(){
            @Override
            public void sum( int a, int b){
                out.println("lambda where are you! "+(a+b));
            }
        };
        d.sum(4,7);

        Deme d1=(a,b)-> out.println("im here biash "+(a+b));
        d1.sum(4,7);

        Deme d2=Main::info;
        d2.sum(4,7);
    }
    public static void info(int a, int b){
        out.println("no im the methode "+(a+b));
    }

    }
    interface Deme{
    void sum(int a,int b);
    } */

        /* *******************anonymous+poly*******************
var s1= new Shape(){
    @Override
    public void draw() {
        System.out.println("haha");
    }
};
var s2= new Shape(){
    @Override
    public void draw(){
        System.out.println("hoho");
    }
};
drawShape(s1);
drawShape(s2);
    }
    public static void drawShape(Shape s){
        s.draw();
    }
    }
    interface Shape{
    void draw();
    }
    */
        /* **************************** multi inheritance*****************************
         child c= new child();
         c.display1();
         c.display2();
    }
    }
    interface parent1{
    void display1();
    }
    interface parent2{
    void display2();
    }
    class child implements parent1,parent2{
    @Override
        public void display1()
    {
        System.out.println("from parent 1");
    }

        @Override
        public void display2() {
            System.out.println("From parent 2");
        }
    }


*/
        /* abstracts*****************************************
var c=new Circle();
var r=new Rectangle();
c.draw();
r.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("O");

    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.print("#");
    }
}
*/
        /* * ******************************Polymorphism


        var a= new A();
      a.draw(new Palestine());
      a.draw(new Country());
      a.draw(new Algeria());
    }}
class A{
    public void draw(Country C){
        C.info();
    }
}


/*  Country[] a= new Country[3];
a[0]= new Algeria();
a[1]= new Palestine();
a[2]= new Country();

for ( Country c :a)
    c.info();
    }} */
/*
class Country{
     public void info(){
        System.out.println("Country");
    }
}
class Algeria extends Country{
    @Override
    public void info(){
        System.out.println("ALgeria");
    }
}
class Palestine extends Country{
    @Override
     public void info(){
        System.out.println("Palestine");
    }
}
 */
/*************** !!!!!!!!!!!!!!!!!!!!!!! Nested Class & expection*******************/

      /*  *******************************access modifier***************************
        var b = new B();
        b.info();


    }
}
class A {
    public int x1=10;
    private int x2=10;
    protected int x3;


public int getX2(){
        return x2;
    }


}
class B extends A {
    public void info() {
        super.x3 = 10;

        System.out.println("X3="+x3);
        System.out.println("x1="+x1);
        System.out.println("x2="+getX2());
    }
}

*/
        /* **********************************************Override
        var os =new Sum();
        var op =new Operation();
        op.sum(3,4);
        os.sum(3,4);
    }}
class Sum {
    public void sum(int x, int y) {
        System.out.println(x + "+" + y + "=" + (x + y));
    }
}
class Operation extends Sum {


    @Override
    public void sum(int x, int y) {
        if ( y== 0){
            System.out.println("error");
        }
        else {
            System.out.println(x+"/"+y+"="+(x/y));
        }
    }
}*****************************************************************************

         */
        //****************** super constructeor********************
/*
              System.out.println("HI windows 10");
        var c=new C(6);


    }

static  class A{
    A( int p)
    {
        System.out.println("n="+p);
    }

}
static class B extends A {

    B(int y){
        super(y);

        System.out.println("2");
    }
}

static class C extends B {
    C(int x){
        super(x);
        System.out.println(3);
    }
    }
}


*/
/******************************inheritance**************/
        /* -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*main class*--------*-*-*-*-*-*-*-*-*-*
         var b=new B();

        b.myAge();
        var c= new C();
        c.info();

    }
}*************************--inheritance------------------
    class A{
        int age;
        public void myAge(){
            this.age=20;
            System.out.println("Age="+this.age);
        }
    }
    class B extends A{ // direct super class
        int length;
        public void info(){
            this.length=170;
            super.age+=10;
            System.out.println("Age="+super.age);
        }
    }
    class C extends B{
    //subClass
    }
*/
/****************constructor******************************/
/* main-*-*-*-*-*-*-*-*-*-*-*-*-*
  var h1= new Human(5,5,6);
 *-*-*-*-*-*-*-*-*-*-*-*-*
class Human {
    Human(int a , int b){
    System.out.println("sum:"+(a+b));
    }
    Human(int a, int b , int c){
    System.out.println("sum:"+(a+b+c));
    }
}*/
/** ********************************* class and objects********************/
    /*    var h1= new Human();
        System.out.println("Enter the person's details:");
        h1.name= new Scanner(System.in).nextLine();
        h1.gender=new Scanner(System.in).nextLine();
        h1.length=new Scanner(System.in).nextInt();
        h1.info();

    }
}
class Human{
    String name;
    String gender;
    int length;
    public void info(){
        this.length+=10;
        System.out.println("My Name is :"+this.name);
        System.out.println("My Gender is :"+this.gender);
        System.out.println("My Length is :"+this.length);

    }

} */

//oop
//object: attribute-variables and actions-functions




/********************** max value*/
    /*    *********main************
    max();
    ***************************
 printMax(34,45,2,4,3,65.5);
System.out.println("Type the the third number !"+'\t');
    printMax(1,2,new Scanner(System.in).nextDouble()); }
    public static void max(){
        System.out.println("how many nums:");

        double[] numbers= new double[new Scanner(System.in).nextInt()];
        for (int i =0; i<numbers.length;i++){
            System.out.print("Number"+(i+1)+':');
            numbers[i]=new Scanner(System.in).nextDouble();}

            if (numbers.length==0){
                System.out.println("no argument passed");
                return;
            }
            double result = numbers[0];
            for (int i=1; i<numbers.length;i++){
                if (numbers[i]> result)
                    result=numbers[i];
            }
            System.out.println("The max value is: " + result);}

    }

*/



/* **********************************math functions"
System.out.println("floor of 5.6 is "+Math.floor(5.3)+ " but the ciel is "+Math.ceil(5.3));/*
 */
  /*
        //************main************

System.out.println(add(5));
    //************main*************
    public static int add(int a){
if (a!=0) return a+add(a-1);
else return 0;
    }

// recursion

   */
/*
//:::::::::::::::::::::::::::::::::::::::: static main::::::::::::::::::::::::::::::::::::
        var x= new ArrayList<>();
        input1(x,4);
        output2(x);
        var y= new ArrayList<>();
        input1(y,4);
        output2(y);

//******************************************

        int[] a= new int[4];
        input(a);
        output(a);
        int[] b= new int[4];
        input(b);
        output(b);


//********************************************
        sum(9,8);

        System.out.println(sum2(9,2)
        );
//::::::::::::::::static main::::::::::::::::::::::


    public static void input1( ArrayList a,int size){
        System.out.println("enter the elements of arraylist");
        for(int i=0; i<size;i++){
            a.add(new Scanner(System.in).nextInt());
        }
    }
    public static void output2( ArrayList a){
        System.out.println("the elements of arraylist:");
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

    //**********************************************
    public static void input( int[] a){
        System.out.println("enter the elements of array");
        for(int i=0; i<a.length;i++){
            a[i]= new Scanner(System.in).nextInt();
        }
    }

    public static void output( int[] a){
        System.out.println("the elements of array:");
        for(int i=0; i<a.length;i++){
            System.out.println(+a[i]);
        }
    }
    //****************************************************
    public static void sum(int y, int x){

        System.out.println(x+y);
    }
    public static int sum2(int y , int x){
        return x+y;
    }

//functions + Passing array through functions

 */


/**************************************************/
        /*
        var x= new ArrayList<String>();
        System.out.println(x);
        x.add("A");
        x.add("B");
        x.add("D");
        x.add(0,"C");
        System.out.println(x);

        x.remove("B");
        x.remove(0);
         System.out.println(x);
         System.out.println("size="+x.size());
         x.set(1,"B");
        System.out.println(x);
         System.out.println("*******************");
         System.out.println(x.isEmpty());
         System.out.println(x.contains("B"));
         System.out.println(x.indexOf("A"));
         System.out.println(x.lastIndexOf("A"));
         System.out.println(x.get(0));
         x.clear();
         System.out.println(x);
*/
//arraylist
/***************************************************************/

    /*    int[] x = new int[3];

        x[0] = 55;

        x[1] = 32;

        x[2] = 44;

        int[] y = {55, 32, 77};

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
            System.out.println(x[i]);

        }

        String[] z = {"alice", "eats", "apple"};

        for (String c : z) {
            System.out.println(c);
            //array intro
        }

        System.out.println("\n");
        System.out.println("now let's try 2D");
        System.out.println("*****************");

        int[][] w = {
                {5, 3, 4},
                {3, 3, 2}
};
        for (int[] i : w) {
            for (int j : i) {
                System.out.println(j);

            }
//************************
        }
        int [][] k = {
                {4,4,3,3},
                {3,3,4,2},
                {5,0,0,4}
        };
        for (int i=0;i< k.length;i++){
            for (int j=0; j< k[i].length;j++){
                System.out.println(k[i][j]);
            }
        }
        //------------------- part two -----------
var a=new int[3];
        System.out.println("Enter the elements of the arrays !");
        for(int i=0,q=a.length;i<q;i++) a[i] = new Scanner(System.in).nextInt();
        System.out.println("you typed this elements");
        for(int j:a) System.out.println(j);

        // we can do this
        int[] n,b,v;
        int m[];
*/

//arrays
/***************************************************************/

        /* while (true) {
            try {
                System.out.print("enter your age:");
                int x = new Scanner(System.in).nextInt();
                System.out.println("Your age is " + x + " years old");
                break;
            } catch (InputMismatchException e) {
                System.out.println("type a integer number");
            }




*/
/***************************************************************/
   /*
        for(int x=1; x<=10;x++) {
            System.out.println("x=" + x);
                                 }
        moh:
        for (int i=1;i<=10;i++){

                for (int j=1;j<=10;j++){
                    if(j==7)break moh ;
                    System.out.println(i+"*"+j+"="+i*j);
                                       }
                                }
      */
/*********************************************************************/
/*
        while (true){
            System.out.print("Enter your degree:\t");
            int degree= new Scanner(System.in).nextInt();
            if(degree<0 || degree>100)break;

            if(degree>=90 ){

                if (degree>=95)System.out.println("+A");

                else System.out.println("-A");}

            else if(degree>=80 )System.out.println("B");

            else if(degree>=70 )System.out.println("C");

            else if(degree>=60 )System.out.println("D");

            else if(degree>=50 )System.out.println("E");

            else System.out.println("F");
        }
        */

/*****************************************************************************§*/
        /*int x=1;
        while (x<=10){
            int y=1;
            while (y<=10){
                System.out.println(x+"*"+y+"="+x*y);

                y++;
            }

            x++;
        }
*/
/*
        for(int x=0;x<5;x++){
            System.out.println("hello");
        }
*/

/*
        int x=18;
     do {
            System.out.println("x="+x);
            x=x-2;
        }while(x>=2);

*/
/************************************************************/
        /*      System.out.println("Enter first number:");
        int x=new Scanner(System.in).nextInt();
        System.out.println("Enter second number:");
        int y=new Scanner(System.in).nextInt();
        System.out.println("Enter the operation:");
        String op= new Scanner(System.in).nextLine();
int result;

        switch (op){
            case "+":result=x+y;break;
            case "-":result=x-y;break;
            case "*":result=y*x;break;
            case "/":result=x/y;break;
            default:result=x%y;break;
            }
            System.out.println("Result="+result);
*/
/********************************************************/
        /*    System.out.print("enter any nummber");
        int x=new Scanner(System.in).nextInt();

        int y=(x>0)? 2:((x==0)?  1:0);
        System.out.println(y);
            }
               IF STATEMENT */
/********************************************************/
        /*    System.out.println(2<=2 || 5>2);
        System.out.println(2<2 && 5>3);
        System.out.println(5%3);
        System.out.println(5/3);
        System.out.println(5*3);
        System.out.println(5-3);
        System.out.println(5+3);
     OPERATIONS AND LOGIC */
/********************************************************/
      /*  System.out.println("Enter your birth year:");
        int birthYear=new Scanner(System.in).nextInt();
        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear-birthYear;
        System.out.println("Your age is "+age+" years old.");
       AGE CALCUL EXAMPLE              */


