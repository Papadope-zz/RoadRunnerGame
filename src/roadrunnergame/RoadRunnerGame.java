package roadrunnergame;

import java.util.Scanner;

public class RoadRunnerGame {

    public static void main(String[] args) {
        didHeCatchRoadrunner();
    }

    public static void didHeCatchRoadrunner() {
        int safeDistance;
        int roadRunnersSpeed;
        int coyotesSpeed;

        Scanner sc = new Scanner(System.in);
        safeDistance = sc.nextInt();
        roadRunnersSpeed = sc.nextInt();
        coyotesSpeed = sc.nextInt();
        int roadRunnerTime = safeDistance / roadRunnersSpeed;
        int coyoteTime = (safeDistance + 50) / coyotesSpeed;
        if (roadRunnerTime < coyoteTime) {
            System.out.println("Meep Meep");
        } else if (roadRunnerTime == coyoteTime) {
            System.out.println("Yum");
        } else {
            System.out.println("Yum");
        }

    }

}
