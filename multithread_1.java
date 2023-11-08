class multithread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        multithread thread = new multithread();
        thread.start();
    }
}
