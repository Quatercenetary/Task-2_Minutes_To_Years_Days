//package MyC;
import java.util.*;

public class MTYD {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter time in minutes: ");
	    long minutes = sc.nextLong();
	    System.out.printf("%d minutes is approximately %d years and %d days.", minutes, minutes/525600, (minutes%525600)/1440);
		sc.close();

    }
}
