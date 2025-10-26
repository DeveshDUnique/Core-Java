package Design_Patterns.CreationalPatterns.AbstractFactoryPattern;

public abstract class UnversityFactory {
    private static int cutOff =109;
    public abstract AdmitCard getAdmitCard(String course);
    public abstract FreeCalculator getFreeCalculator(String course);

    public static UnversityFactory getUniversityFactory(int score){
        if (score > cutOff){
            return new IvyLeagueUniversityFactory();
        }else{
            return new PublicUniversityFactory();
        }
    }

}
