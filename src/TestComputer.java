public class TestComputer {
    public static void main(String[] args) {
        /*Procesor procesor1 = new Procesor("Intel", "Core", 4200);
        Memory memory1 = new Memory("Kingston", "HyperX",1866, 4);
        Computer computer1 = new Computer("Lenovo",procesor1, memory1);

        Procesor procesor2 = new Procesor("AMD", "Ryzen", 3400);
        Memory memory2 = new Memory("GoodRAM", "Iridium",2400, 8);
        Computer computer2 = new Computer("Dell",procesor2, memory2);

        Overclock overclock = new Overclock();

        computer1.showComputerParameters();
        overclock.decreaseCpuClock(computer1, 300);
        computer1.showComputerParameters();

        computer2.showComputerParameters();
        overclock.increaseCpuClock(computer2,700);
        computer2.showComputerParameters();*/


        ComputerAssembly computerAssembly = new ComputerAssembly();

        /*Computer computer1 = computerAssembly.assembly(new Computer("Lenovo", new Procesor("Intel", "Core", 4200), new Memory("Kingston", "HyperX",1866, 4)));
        computer1.showComputerParameters();

        Computer computer2 = computerAssembly.assembly(new Computer("Dell", new Procesor("AMD", "Ryzen", 3400), new Memory("GoodRAM", "Iridium",2400, 8)));
        computer2.showComputerParameters();*/

        Computer computer1 = computerAssembly.assembly("Lenovo","Intel", "Core", 4200,"Kingston", "HyperX",1866, 4);
        computer1.showComputerParameters();

        Computer computer2 = computerAssembly.assemblyShort("Dell", new Procesor("AMD", "Ryzen", 3400), new Memory("GoodRAM", "Iridium",2400, 8));
        computer2.showComputerParameters();
    }
}
