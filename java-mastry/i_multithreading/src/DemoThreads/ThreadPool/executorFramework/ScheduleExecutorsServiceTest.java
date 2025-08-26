package DemoThreads.ThreadPool.executorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorsServiceTest {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


        // `method 1 of Scheduler`
        //scheduler.schedule(
                //()-> System.out.println("Task Execute after ever 5 secs "), 5 , TimeUnit.SECONDS);
        //scheduler.shutdown();

        //------------------------ end method 1 ----------------------

        // `method 2 of Scheduler`
        scheduler.scheduleAtFixedRate(
            ()-> System.out.println("Task Execute after ever 1 SECONDS "), 1 ,
                1, TimeUnit.SECONDS);

        scheduler.schedule(()-> {
            System.out.println("Initiating shutdwon....");
            scheduler.shutdown();
        } ,4, TimeUnit.SECONDS);





    }
}
