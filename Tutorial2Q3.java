public class Tutorial2Q3
{
    public static void main (String[] args)
    {
        long totalMilliseconds, totalSeconds, currentSeconds, totalMinutes, currentMinute, totalHour, currentHour;
        
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / 1000;
        currentSeconds = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHour = totalMinutes / 60;
        currentHour = totalHour % 24;

        System.out.printf("Current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds + " GMT");
    }
}