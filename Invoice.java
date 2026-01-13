
class Calculate{
    private String partNumber;
    private String desc;
    private int quantity=0;
    private double price=0; //default value 

    
    Calculate(String partNumber,String desc,int quantity,double price){

    this.partNumber = partNumber;
    this.desc = desc;
    this.quantity = quantity;
    this.price = price;

    }
    Calculate(){
        super();
    }
     
    void setpartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    void setdesc(String desc){
        this.desc = desc;
    }
    void setquantity(int quantity){
        this.quantity = quantity;
    }
    void setprice(double price){
        this.price = price;
    }
    String getpartNumber(){
        return partNumber;
    }
    String getdesc(){
        return desc;
    }
    int getquantity(){
        return quantity;
    }
    double getprice(){
        return price;
    }

    double GetInvoiceAmount(){
        return quantity*price;
    }



}
public class Invoice {
    public static void main(String []args){
        Calculate c1 = new Calculate();
        c1.setpartNumber("dettol");
        c1.setdesc("best handwash in the worls even kills remaining 0.01% of germs");
        c1.setquantity(100);
        c1.setprice(99);

        System.out.println(c1.getdesc());
        System.out.printf("the total amount is %.2f",c1.GetInvoiceAmount());
    }
}
