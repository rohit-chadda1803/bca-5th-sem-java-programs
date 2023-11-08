// multithreading-> code 1 ->(Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.)
class multithread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        multithread thread = new multithread();
        thread.start();
    }
}
