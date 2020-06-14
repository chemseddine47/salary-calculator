

public class CVente extends Employe {

    @Override
    public double CalculeSalaire(double chiffreDaffaire) {
        double resulte = (chiffreDaffaire * 20)/100 ;
        return resulte + 4000;
    }   
}
