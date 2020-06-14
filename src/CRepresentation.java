
public class CRepresentation extends Employe{

    @Override
    public double CalculeSalaire(double ChiffreDaffaire) {
        double resulte = (ChiffreDaffaire*20)/100;
        return resulte+8000;
    }   
}
