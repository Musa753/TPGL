package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.model.Fruit;

/**
 *
 * @author roudet
 */
 class  melon implements  Fruit {
    private double prix;
    private String origine;
    
    public melon() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public   melon(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            melon or = (melon) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        melon O=new melon();
        melon Or=new melon(14,"Mali");
	System.out.println("PRIX DE le melon EST"+O.getPrix());
    System.out.println("Les deux objets sont egaux"+O.equals(Or));

   }
}
