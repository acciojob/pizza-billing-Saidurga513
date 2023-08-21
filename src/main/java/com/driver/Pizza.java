package com.driver;

public class Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegprice=300;
    private int nonvegprice=400;
    private int extaracheese=80;
    private int extratoppingveg=70;
    private  int extratoppingnonveg=120;
    private int   paperback=20;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
            System.out.println("Base Price Of The Pizza: "+vegprice);
            this.price=vegprice;
        }
        else
        {
            System.out.println("Base Price Of The Pizza: "+nonvegprice);
            this.price=nonvegprice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        System.out.println("Extra Cheese  Added: "+extaracheese);
//        if(this.isVeg)
        this.price+=extaracheese;
//        else
//            this.price+=extaracheese;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg)
        {
            System.out.println("Extra Toppings Added: "+extratoppingveg);
            this.price+=extratoppingveg;
        }
        else
        {
            System.out.println("Extra Toppings Added: "+extratoppingnonveg);

            this.price+=extratoppingnonveg;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isVeg)
        {
            System.out.println("Paperbag Added: "+paperback);
            this.price+=paperback;
        }
    }

    public String getBill(){
        // your code goes here
        bill="Total Price: "+this.price;
        return this.bill;
    }
}
