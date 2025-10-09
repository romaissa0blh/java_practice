public class Pizza{
    private string price;
    private boolean veg;
    private int extracheeseprice = 100;
    private int extratoppingprice = 150;
    private int takeawayprice = 20;
    public Pizza(boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }
    public void addextracheese(){
        system.out.println('extra cheese added');
        this.price += extracheeseprice;
    }
    public void addextratopping(){
        system.out.println('extra toppings added');
        this.price += extratoppingprice;
    }
    public void takeaway(){
        system.out.println('take away opted');
        this.price += takeawayprice;
    }
    public void getbill(){
        system.out.println(this.price)
    }
}
public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg){
        super(veg);
        super.addextracheese();
        super.addextratopping()
    }
    @Override
    public void addextracheese(){}
    @Override
    public void addextratopping(){}
}
public class Main{
    public static void main(string[]args){
        Pizza basepizza = new Pizza(veg:true);
        basepizza.addextracheese();
        basepizza.getbill();
    }
}
