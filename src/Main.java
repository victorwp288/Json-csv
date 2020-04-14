package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MovieManipulation mp = new MovieManipulation();
        JsonHandler jh = new JsonHandler();

        Scanner scan = new Scanner(System.in);
        System.out.println("Tryk 1 for at søge på instruktør");
        System.out.println("Tryk 2 for at søge på land");
        System.out.println("Tryk 3 for at skrive til Json fil");


        switch (scan.nextInt()){
            case 1:
                System.out.println("Skriv navnet på instruktør");
                mp.findMovieInfosDic(scan.next());
                break;

            case 2:
                System.out.println("Skriv navnet på land");
                mp.findMovieInfosCountry(scan.next());
                break;

            case 3:
                System.out.println("Skal data også printes til konsollen? (Y/N)");
                System.out.println("Hvis ja vær opmærksom på at der kan komme meget data");
                Scanner sc = new Scanner(System.in);
                String svar = sc.next();
                if (svar.equalsIgnoreCase("y")){
                    jh.readWriteJson(true);
                    break;
                }  if (svar.equalsIgnoreCase("n")){
                    jh.readWriteJson(false);
                    break;
                } else {
                    System.out.println("forkert input prøv igen");
                }

        }
    }
}
