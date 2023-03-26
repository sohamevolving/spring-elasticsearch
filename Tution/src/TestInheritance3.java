class tiger{  
void eat(){System.out.println("eating...");}  
}  
class cat extends tiger{  
void meow(){System.out.println("meowing...");}  
}  
class lion extends tiger{  
void roar(){System.out.println("roaring...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
lion c=new lion();  
c.roar();  
c.eat();  
//c.bark();//C.T.Error  
}}  