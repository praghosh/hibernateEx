package week5Session2;

/*
 * Java program that creates three threads with different priorities: 
 * Low, Medium, and High. Each thread prints its name and sleeps for a 
 * certain duration based on its priority. 
 */
 class PriorityThread extends Thread 
{
    public PriorityThread(String name, int priority) 
    {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " with priority " + getPriority() + " is starting.");
        try {
            int sleepDuration = 1000;
            if (getPriority() == Thread.MAX_PRIORITY) {
                sleepDuration = 200;  // High priority sleeps less
            } else if (getPriority() == Thread.NORM_PRIORITY) {
                sleepDuration = 500;  // Medium priority
            }

            Thread.sleep(sleepDuration);

            System.out.println("Thread " + getName() + " finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

 public class PriorityExample {
    public static void main(String[] args) {
        PriorityThread lowPriorityThread = new PriorityThread("Low", Thread.MIN_PRIORITY);
        PriorityThread mediumPriorityThread = new PriorityThread("Medium", Thread.NORM_PRIORITY);
        PriorityThread highPriorityThread = new PriorityThread("High", Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();
    }
}

