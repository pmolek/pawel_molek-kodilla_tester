public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight,int price, int year){
       this.weight = weight;
       this.price = price;
       this.year = year;
    }
public void checkPrice(){
        if (this.price < 600){System.out.println("This notebook is cheap.");}
        else if ((this.price >= 600) && (this.price < 1000)){System.out.println("The price is good.");}
        else {System.out.println("This notebook is quite expensive");}

}
public void checkWeight(){
    if (this.weight < 1000){System.out.println("This notebook is light.");}
    else if ((this.weight >= 1000) && (this.weight < 2000)){System.out.println("The weight is good.");}
    else {System.out.println("This notebook is quite heavy");}
}
public void checkYearAndPrice(){
    if ((this.year < 2005) && (this.price < 900)){System.out.println("This notebook is old but cheap.");}
    else if ((this.year >= 2005) && (this.year <2016) && (this.price > 1000) && (this.price < 1500)){System.out.println("The age and price of this notebook is quite good.");}
    else if ((this.year >= 2005) && (this.year <2016) && (this.price > 1900)){System.out.println("This notebook is too expensive for this age.");}
    else {System.out.println("This notebook is quite new and expensive");}
}
   }

