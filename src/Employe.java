
   public abstract class Employe {
   public String Nom;
   public String Prenom;
   public String Genre;
   public int Age ;
   public String Superviseur;
   public String DateDentree;
   public int Salaredebase ;
  
    public boolean Employe() {
       return (this.Superviseur == null );
    }
    public abstract double CalculeSalaire (double a );
   
   public String GetNom () {
       if (this.Employe()) {
           if (this.Genre.equals("Femme")) {
               return "Mrs "+this.Nom+" "+this.Prenom ;
           }
           else {return "Mr "+this.Nom+" "+this.Prenom;}
       }
       else {return "L'employe "+this.Nom+" "+this.Prenom;}
   }
   @Override
   public String toString () {
       return this.GetNom();
   };

   boolean Equals (Employe e) {
       return (this.toString().equals(e.toString()) && this.Genre.equals(e.Genre)) ;
   }
}
