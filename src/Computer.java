public class Computer {
    String computerName;
    Procesor procesor;
    Memory memory;

    public Computer(String computerName, Procesor procesor, Memory memory) {
        this.computerName = computerName;
        this.procesor = procesor;
        this.memory = memory;
    }

    void showComputerParameters(){
        System.out.println("Komputer: " + computerName);
        System.out.println("Procesor: " + procesor.producer + " " + procesor.model + " " + procesor.clock + "MHz");
        System.out.println("Pamięć: " + memory.memoryProducer + " " + memory.memoryModel + " " + memory.memoryClock + "MHz, " + memory.memorySize + "GB");
    }



}
