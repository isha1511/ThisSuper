//this can be used to invoke current class method
class A{
    void method1(){

        System.out.println("In method1");
    }
    void method2(){

        System.out.println("In method2");
        this.method1();
    }
    }

    class Test2{
        public static void main(String[] args){

            A a=new A();
            a.method2();
        }
    }