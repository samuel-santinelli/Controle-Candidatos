package samuel_santinelli.candidature;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for(String candidate: candidates ){
            gettingInTouch(candidate);
        }
        
    }
    
    static void gettingInTouch(String candidate){
        int realizedAttempts = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered = tooMeet();
            keepTrying = !answered;
            if(keepTrying)
                realizedAttempts++;
            else
                System.out.println("Contact realized with sucess"); 

        } while(keepTrying && realizedAttempts < 3);

        if(answered){
            System.out.println("We can contact with " + candidate + " NA " + realizedAttempts);
        }
        
    }

    static boolean tooMeet(){
        return new Random().nextInt(3)==1;
    }

    static void selectedList() {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Listing the candidates list, informing the element index");

        for (int index = 0; index < candidates.length; index++) {
         System.out.println("The candidate of numberº " + (index + 1) + "º is " + candidates[index]);   
        }

        System.out.println("Abrevied form of interaction for each");

        for(String candidate: candidates){
            System.out.println("The selected candidate has been " + candidate);
        }
    }

    static void candidatesSelection() {        
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };
        int selectedesCandidates = 0;
        int actualCandidates = 0;
        double baseSalary = 2000.0;

        while(selectedesCandidates < 5 && actualCandidates < candidates.length){
            String candidate = candidates[actualCandidates];
            double intendedSalary = intendedValue();

            System.out.println("The candidate " + candidate + " solicited this salary intended");
            if(baseSalary >= intendedSalary){
                System.out.println("The candidate " + candidate + " has been selected for the vacancy");
                selectedesCandidates++;
            }
            actualCandidates++;
        }

    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void candidateAnalyses(double intendedSalary) {
        double baseSalary = 2000.0;
        if (baseSalary > intendedSalary) {
            System.out.println("Call the candidate");
        } else if (baseSalary == intendedSalary) {
            System.out.println("Call for the candidate with other proposal");
        } else {
            System.out.println("Waiting the result for the other candidates");
        }
    }
}
