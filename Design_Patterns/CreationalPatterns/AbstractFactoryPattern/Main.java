package Design_Patterns.CreationalPatterns.AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        int entraceExamScore = 125;

        UnversityFactory abstractUniversityFactory = UnversityFactory.getUniversityFactory(entraceExamScore);
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        FreeCalculator freeCalculator = abstractUniversityFactory.getFreeCalculator("Math");
       // System.out.println(admitCard.getClass());


    }
    
}
