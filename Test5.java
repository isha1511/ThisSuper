//this can be used as an argument in the constructor call

class B{  
    Test5 obj;  
    B(Test5 obj){  
      this.obj=obj;  
    }  
    void display(){  
      System.out.println(obj.data);
    }  
  }  
    
  class Test5{  
    int data=10;  
    Test5(){  
     B b=new B(this);  
     b.display();  
    }  
    public static void main(String args[]){  
     Test5 a=new Test5();  
    }  
  }  