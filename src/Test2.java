
public class Test2 implements Runnable{
   public void run(){
        System.out.println("thread");
    }
    public static void main(String args[]){
       // Thread t1=new Tread();
    	
    	Test2 e = new Test2();
        Thread  p = new Thread(e);
        
        p.start();
    }
}