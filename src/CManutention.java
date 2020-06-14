
public class CManutention extends Employe{

    @Override
    public double CalculeSalaire(double nbrHeur) {
        double resulte= nbrHeur *650 ;
        return resulte + 2000;
    }
   
}
