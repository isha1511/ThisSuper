//this() can be used to invoke current class constructor

class A{

    A(){
        this(10);
        System.out.println("A constructor");
    }
    A(int x){
       // this();
        System.out.println(x);
    }
}

class Test3{
    public static void main(String[]args){

        A a=new A();
        
    }
}