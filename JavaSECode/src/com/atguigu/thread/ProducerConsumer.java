package com.atguigu.thread;

/**
 * @Author magician
 * @Date 2024/5/9
 * @Version 1.0
 */

class Clerk {
    private int product = 0;
    public synchronized void get() {
        while (product >= 1) {
            System.out.println("产品已满");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println(Thread.currentThread().getName() + "生产了" + product);
        this.notify();
    }

    public synchronized void sale() {
        while (product <= 0) {
            System.out.println("产品已空");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.get();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.sale();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Producer p2 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);
        p1.setName("生产者1");
        p2.setName("生产者2");
        c1.setName("消费者1");
        c2.setName("消费者2");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
        System.out.println("main");
    }
}
