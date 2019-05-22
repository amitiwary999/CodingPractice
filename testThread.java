class Line { 
  synchronized public void getLine() { 
    for (int i = 0; i < 3; i++) { 
       tt tT = new tt();
       tT.start();
       System.out.println(i);
       try{ 
          //    tT.sleep(400);
         //Thread.sleep(400); 
	} catch (Exception e) { 
	    System.out.println(e); 
	} 
         
       } 
    } 
} 

class tt extends Thread{
  @Override
  public void run() { 
    try{ 
      Thread.sleep(1); 
    } catch (Exception e) { 
       System.out.println(e); 
    } 
    System.out.println("yy"); 
   } 
}

class Train extends Thread { 
 Line line; 
 Train(Line line) { 
    this.line = line; 
  } 
   
   @Override
   public void run() { 
      line.getLine(); 
   } 
} 

class TestThread { 
  public static void main(String[] args) { 
    Line obj = new Line(); 
    Train train1 = new Train(obj); 
    Train train2 = new Train(obj); 
    train1.start(); 
    train2.start(); 
 } 
} 

