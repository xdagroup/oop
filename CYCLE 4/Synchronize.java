class Multipleof2 extends Thread{

  public synchronized void run(){
  
    System.out.println("The multiple of 2 upto 100 are : ");
    for(int i = 0;i <= 100; i++){
    
      if(i % 2 == 0){
      
        System.out.println(i);
      }
    }
  }
}

class Multipleof3 extends Thread{

   public synchronized void run(){
  
    System.out.println("The multiple of 3 upto 100 are : ");
    for(int i = 0;i <= 100; i++){
    
      if(i % 3 == 0){
      
        System.out.println(i);
      }
    }
  }
}



class Synchronize{

  public static void main(String args[]){
  
    Multipleof2 m2 = new Multipleof2();
    Multipleof3 m3 = new Multipleof3();
    
    m2.start();
    m3.start();
    
      
  }
}