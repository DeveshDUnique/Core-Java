package Design_Patterns.CreationalPatterns.AbstractFactoryPattern;

public class IvyLeagueUniversityFactory extends UnversityFactory {

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course) {
            case "Math":
                return new MITAdmitCard();
            case "Physics":
                return new CalTechAdmitCard();
            case "CS":
                return new GeorgiaTechAdmitCard();
            default:
                break;
        }
        return null;
        
    }

    @Override
    public FreeCalculator getFreeCalculator(String course) {
        switch (course) {
            case "Math":
                return new MITFreeCalculator();
            case "Physics":
                return new CalcTechFreeCalculator();
            case "CS":
                return new GeorgiaTechFreeCalculator();
            default:
                break;
        }
        return null;
       
    }

}
