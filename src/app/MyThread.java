package app;

class MyThread extends Thread {

    private final DataHandler dataHandler;


    public MyThread(String name, DataHandler dataHandler) {
        super();
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.getOutput();
    }
}

