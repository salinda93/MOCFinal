package threads.q1;

class PrintThread extends Thread {
   public void run() {
      for (int r = 1; r <= 100; r++) {
         System.out.println(r);
      }
   }
}

class SLIITThread implements Runnable {
   public void run() {
      for (int r = 1; r <= 100; r++) {
         System.out.println(" SLIIT ");
      } 
   }
}

class Ques1a {
   public static void main(String args[]) {
      PrintThread thread1 = new PrintThread();
      Thread thread2 = new Thread(new SLIITThread());
      thread1.start();
      thread2.start();
   } 
}


