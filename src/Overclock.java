public class Overclock {

    void increaseCpuClock(Computer computer, int changeClock){
        computer.procesor.clock += changeClock;

    }
    void decreaseCpuClock(Computer computer, int changeClock){
        computer.procesor.clock -= changeClock;

    }
}
