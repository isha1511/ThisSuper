//this can be used to pass as an argument in the method
class B{

    void m1(B obj){

        System.out.println(obj);
    }

    void m2(){

        m1(this);
    }

    }
    class Test4{

        public static void main(String[] args){

            B b=new B();
            b.m2();
        }
    }