
package p2;

public class MyStackArray {

    public static void main(String[] args) {
       MyStack s1 = new MyStack();
       MyStack s2 = new MyStack(5);
       MyStack s3 = new MyStack(-10);
       generate(10,s1);
       print(s1);
       print(s1);
       rPrint(s1);
       
       
       StackList s4 = new StackList();
       generate1(10,s4);

    }
    
    public static void generate(int v, MyStack s){
        for (int i = 0; i < v; i++) {
            s.push( (int)(Math.random()*100));
        }
    }
    
    public static void generate1(int v, StackList s){
        for (int i = 0; i < v; i++) {
            s.push( (int)(Math.random()*100));
        }
    }
    
    public static void print(MyStack s){
        MyStack temp = new MyStack();
        maincopy(s,temp);
        while(!temp.isEmpty()){
            System.out.print(temp.pop()+" ");
        }
        System.out.println("");
    }
    
    public static void maincopy (MyStack s1 , MyStack s2){
       MyStack s3 = new MyStack();
       while (!s1.isEmpty()){
           s3.push(s1.pop());
       }
       while (!s3.isEmpty()){
           int m = s3.pop();
           s1.push(m);
           s2.push(m);
       }
       }
    
    public static void rPrint(MyStack s){
        MyStack t = new MyStack();
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        // return t if I want to return the reverse of a stack
        while(!t.isEmpty()){
            s.push(t.top());
            System.out.print(t.pop()+" ");
        }
        System.out.println("");
    }
    
}
