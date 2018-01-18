public class ComputerAssembly {
    //Computer computer;


    // public ComputerAssembly(Computer computer){
   //}

    Computer assembly(String computerName, String procesorName, String porcesorModel, int procesorClock, String memoryName, String memoryModel, int memoryClocko, int memorySize){
        return new Computer(computerName,new Procesor(procesorName,porcesorModel,procesorClock),new Memory(memoryName,memoryModel,memoryClocko,memorySize));
    }
    Computer assemblyShort(String computerName, Procesor procesor, Memory memory){
        return new Computer(computerName, procesor, memory);
    }

   // Computer assembly(Computer computer){

        //return
                //this.computer = computer;
   // }
}
