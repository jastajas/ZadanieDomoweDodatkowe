public class Memory {

    String memoryProducer;
    String memoryModel;
    int memoryClock;
    int memorySize;

    public Memory(String memoryProducer, String memoryModel, int memoryClock, int memorySize) {
        this.memoryProducer = memoryProducer;
        this.memoryModel = memoryModel;
        this.memoryClock = memoryClock;
        this.memorySize = memorySize;
    }
}
