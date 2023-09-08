package week5Session2;

/*
 * Java program that implements a messaging system with a shared 
 * message queue using wait() and notifyAll() for synchronization. 
 * It includes a sender thread that adds messages to the queue and a receiver 
 * thread that removes messages from the queue
 */
import java.util.LinkedList;
import java.util.Queue;

class MessageQueue
{
    private Queue<String> messages = new LinkedList<>();
    private int capacity =30;

    public synchronized void addMessage(String message) throws InterruptedException {
        while (messages.size() >= capacity) {
            System.out.println("Queue is full. Sender waiting...");
            wait();
        }
        messages.add(message);
        System.out.println("Sent: " + message);
        notifyAll();  // Notify receiver that a new message is available
    }

    public synchronized String receiveMessage() throws InterruptedException {
        while (messages.isEmpty()) {
            System.out.println("Queue is empty. Receiver waiting...");
            wait();
        }
        String message = messages.poll();
        System.out.println("Received: " + message);
        notifyAll();  // Notify sender that space is available in the queue
        return message;
    }
}

public class MessagingSystem {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();

        Thread senderThread = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    messageQueue.addMessage("Message " + i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread receiverThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    messageQueue.receiveMessage();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        senderThread.start();
        receiverThread.start();
    }
}