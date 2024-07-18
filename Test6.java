//this can be used to return current class instance
class A{

    A getA(){
        return this;
    }
    void msg(){

        System.out.println("Hello");
    }
}
class Test6{

    public static void main(String[] args){
        new A().getA().msg();
    }
}