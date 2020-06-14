
class CProduction extends Employe {
   
    @Override
    public double CalculeSalaire(double NmbUnites) {
       double Salaire = NmbUnites *5 ;
        return Salaire + 2000 ;
    }
}
    

