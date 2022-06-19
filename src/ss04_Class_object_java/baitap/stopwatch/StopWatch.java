package ss04_Class_object_java.baitap.stopwatch;

public class StopWatch {
    private long startTime, endTime,Time;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public long start(){
        return this.startTime= System.currentTimeMillis();
    }
    public long end(){
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
