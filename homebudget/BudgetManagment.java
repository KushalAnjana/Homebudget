import java.util.Scanner;

class budget
{
    static Double Income=0.0;
    static  Double budget=0.0;
    Double budget_calc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your monthly income: ");
        Income=sc.nextDouble();
        System.out.println("Budget is 25% of total income");
        budget=Income*0.25;
        return budget;
    }

}
class groceries extends budget {
    static Double gro_budget = 0.0;
    static Double Grain_budget = 0.0;
    static int Vegii_budget = 0;
    static Double other_budget = 0.0;
    static int kitchen_budget = 0;
    int G_total=0;
    String[][] arr = {{"flour", "50"}, {"Rice", "60"}, {"Pulses", "40"}, {"Vegii", "55"}, {"oil", "60"}, {"milk", "45"}, {"sugar", "70"},{"extra","200"}};

    void gro() {
        System.out.println("groceries budget is 40% of total budget");
        gro_budget = budget * 0.40;
        System.out.println("groceries budget is: " + gro_budget);
    }

    void gro_calc() {
        System.out.println("Budget for each groceries product--------------------------->");
        Grain_budget = gro_budget * 0.25;
        Vegii_budget = (int) (gro_budget * 0.20);
        other_budget = gro_budget * 0.30;
        kitchen_budget = (int) (gro_budget * 0.25);
        System.out.println("Budget for each element:------>>>> ");
        System.out.println("Budget for grains " + Grain_budget);
        System.out.println("Budget for vegii " + Vegii_budget);
        System.out.println("Budget for other items  " + other_budget);
        System.out.println("Budget for Kitchen items " + kitchen_budget);

    }

    int gro_calc(Double Grains_budget) {
        char ch = ' ';
        int Grains_price = 0;
        System.out.println(arr[0][0] + "---" + arr[0][1]);
        System.out.println(arr[1][0] + "---" + arr[1][1]);
        System.out.println(arr[2][0] + "---" + arr[2][1]);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press for selection------------>");
            System.out.println("press 1 for flour");
            System.out.println("press 2 for rice");
            System.out.println("press 3 for pulse");
            System.out.println("press for selection------------>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("quantity for packets of flour");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[0][1]);
                    System.out.println("price for flour-->" + price * quan);
                    Grains_price += price * quan;
                    break;
                }
                case 2: {
                    int quan = 0;
                    System.out.println("quantity for packets of rice");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[1][1]);
                    System.out.println("price for rice-->" + price * quan);
                    Grains_price += price * quan;
                    break;
                }
                case 3: {
                    int quan = 0;
                    System.out.println("quantity for packets of pulse");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[2][1]);
                    System.out.println("price for pulse-->" + price * quan);
                    Grains_price += price * quan;
                    break;
                }
            }
            System.out.println("Enter the 'Y' for menu or press any key ");
            ch = sc.next().charAt(0);
        } while ((ch == 'Y') || (ch == 'y'));
        if (Grains_price > Grains_budget) System.out.println("--------------------OVER BUDGET----------------------");
        G_total+=Grains_price;
        return Grains_price;

    }

    int gro_calc(int Vegii_budget) {
        char ch = ' ';
        int Vegii_price = 0;
        System.out.println(arr[3][0] + "---" + arr[3][1]);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press for selection------------>");
            System.out.println("press 1 for vegii");
            System.out.println("press for selection------------>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("quantity for packets of vegii");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[3][1]);
                    System.out.println("price for vegii-->" + price * quan);
                    Vegii_price += price * quan;
                    break;
                }
            }
            System.out.println("Enter the 'Y' for menu or press any key");
            ch = sc.next().charAt(0);
        } while ((ch == 'Y') || (ch == 'y'));
        if (Vegii_price > Vegii_budget)
            System.out.println("--------------------OVER BUDGET----------------------");
        G_total+=Vegii_price;
        return Vegii_price;
    }

    int Gro_calc(Double other_budget) {
        char ch = ' ';
        int other_price = 0;
        System.out.println(arr[4][0] + "---" + arr[4][1]);
        System.out.println(arr[5][0] + "---" + arr[5][1]);
        System.out.println(arr[6][0] + "---" + arr[6][1]);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press for selection------------>");
            System.out.println("press 1 for oil");
            System.out.println("press 2 for milk");
            System.out.println("press 3 for sugar");
            System.out.println("press for selection------------>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("quantity for packets of oil");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[4][1]);
                    System.out.println("price for oil-->" + price * quan);
                    other_price += price * quan;
                    break;
                }
                case 2: {
                    int quan = 0;
                    System.out.println("quantity for packets of milk");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[5][1]);
                    System.out.println("price for milk-->" + price * quan);
                    other_price += price * quan;
                    break;
                }
                case 3: {
                    int quan = 0;
                    System.out.println("quantity for packets of sugar");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[6][1]);
                    System.out.println("price for sugar-->" + price * quan);
                    other_price += price * quan;
                    break;
                }
            }
            System.out.println("Enter the 'Y' for menu or press any key ");
            ch = sc.next().charAt(0);
        } while ((ch == 'Y') || (ch == 'y'));
        if (other_price > other_budget) System.out.println("--------------------OVER BUDGET----------------------");
        G_total+=other_price;
        return other_price;

    }

    int Gro_calc(int kitchen_budget) {
        char ch = ' ';
        int kitchen_price = 0;
        System.out.println(arr[7][0] + "---" + arr[7][1]);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press for selection ------------>");
            System.out.println("press 1  utensils");
            System.out.println("press for selection ------------>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("kitchen items--->");
                    quan = sc.nextInt();
                    price = Integer.parseInt(arr[7][1]);
                    System.out.println("price for utensils-->" + price * quan);
                    kitchen_price += price * quan;
                    break;
                }
            }
            System.out.println("Enter the 'Y' for menu  or press any key");
            ch = sc.next().charAt(0);
        } while ((ch == 'Y') || (ch == 'y'));
        if (kitchen_price > kitchen_budget)
            System.out.println("--------------------OVER BUDGET----------------------");
        G_total+=kitchen_price;
        return kitchen_price;
    }
}
class bills extends budget
    //list of appliances with mounthly consuption of electricity per unit is 9 so total cost for each appliance ia as follow

{
    String[][] E = {{"Fan", "90"}, {"T_lights", "100"}, {"CFL", "54"}, {"washing_machine", "70"}, {"TV", "120"}, {"other_appliances", "100"}};
    String[][] O = {{"clothing", "500"}, {"House_mantainance", "250"}};
    static Double e_budget = 0.0;
    static Double o_budget = 0.0;
    int E_bill_tot = 0;
    int O_bill_tot = 0;

    void bills() {
        System.out.println("bills contain 30% of budget");
        e_budget = budget * 0.30;
        System.out.println("budget for bills is : " + e_budget);
        System.out.println("Considering per unit charge as 9 RS.");
    }

    int e_calc() {
        int e_price = 0;
        System.out.println(E[0][0] + "---" + E[0][1]);
        System.out.println(E[1][0] + "---" + E[1][1]);
        System.out.println(E[2][0] + "---" + E[2][1]);
        System.out.println(E[3][0] + "---" + E[3][1]);
        System.out.println(E[4][0] + "---" + E[4][1]);
        System.out.println(E[5][0] + "---" + E[5][1]);
        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        do {
            System.out.println("------------------------------>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("press 1 for fan");
            System.out.println("press 2 for T_light");
            System.out.println("press 3 for CFL");
            System.out.println("press 4 for Washing_machine");
            System.out.println("press 5 for TV");
            System.out.println("press 6 for other_app");
            System.out.println("----------------------------->>>>>>>>>>>>>>>>>>>>>>>>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("no of fans: ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[0][1]);
                    System.out.println("Fan electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;
                }
                case 2: {
                    int quan = 0;
                    System.out.println("no of T_light : ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[1][1]);
                    System.out.println("T_light electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;

                }
                case 3: {
                    int quan = 0;
                    System.out.println("no of CFL : ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[2][1]);
                    System.out.println("CFL electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;

                }
                case 4: {
                    int quan = 0;
                    System.out.println("no of Washing_machine : ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[3][1]);
                    System.out.println("Wash_machine electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;
                }
                case 5: {
                    int quan = 0;
                    System.out.println("no of TV : ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[4][1]);
                    System.out.println("TV electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;
                }
                case 6: {
                    int quan = 0;
                    System.out.println("other electic consuption: ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(E[5][1]);
                    System.out.println("other electric consuption: " + price * quan);
                    e_price += price * quan;
                    break;
                }

            }
            System.out.println("Enter the 'Y' for menu or press any key ");
            ch = sc.next().charAt(0);

        } while ((ch == 'Y') || (ch == 'y'));
        if (e_price > e_budget)
            System.out.println("--------------------OVER BUDGET----------------------");
        E_bill_tot = e_price;
        return e_price;

    }
    void O_exp()
    {
        System.out.println("other expenses contain 30% of budget");
        o_budget = budget * 0.30;
        System.out.println("for other expenses of house management ");
        System.out.println("other expenses : " + o_budget);
    }

    int o_calc() {
        int o_price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(O[0][0] + "---" + O[0][1]);
        System.out.println(O[1][0] + "---" + O[1][1]);
        char ch = ' ';

        do {
            System.out.println("----------------------------->>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("press 1 for clothings");
            System.out.println("press 2 for House_management");
            System.out.println("----------------------------->>>>>>>>>>>>>>>>>>>>>>>>");
            int c = sc.nextInt();
            int price = 0;
            switch (c) {
                case 1: {
                    int quan = 0;
                    System.out.println("expensions for clothings : ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(O[0][1]);
                    System.out.println("expensions for clothings : " + price * quan);
                    o_price += price * quan;
                    break;
                }
                case 2: {
                    int quan = 0;
                    System.out.println("House_maintanance: ");
                    quan = sc.nextInt();
                    price = Integer.parseInt(O[1][1]);
                    System.out.println("House maintainence: " + price * quan);
                    o_price += price * quan;
                    break;
                }
            }
                System.out.println("Enter the 'Y' for menu  or press any key ");
                ch = sc.next().charAt(0);
            }while ((ch == 'Y') || (ch == 'y')) ;
        if (o_price > o_budget)
            System.out.println("--------------------OVER BUDGET----------------------");
           O_bill_tot = o_price;
           return o_price;

    }
}

class Home {
    public static void main(String args[]) {
        budget b = new budget();
        groceries g = new groceries();
        bills B = new bills();
        System.out.println("the calculated Budget is : " + b.budget_calc());
        System.out.println("calculating expenses for groceries-------------------------------------->>>>>>>>>>");
        g.gro();
        System.out.println("                                                                    ");
        g.gro_calc();
        System.out.println("                                                                        " +
                "                                                                                      ");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Price for grains: " + g.gro_calc(groceries.Grain_budget));
        System.out.println("Price for vegii: " + g.gro_calc(groceries.Vegii_budget));
        System.out.println("Price for other: " + g.Gro_calc(groceries.other_budget));
        System.out.println("Price for kitchen: " + g.Gro_calc(groceries.kitchen_budget));

        System.out.println("total expenses on groceries: " + g.G_total);
        {
            double a = (g.gro_budget - g.G_total);
            System.out.println("Savings from groceries budget: " + (a));
            if (a < 0.0)
                System.out.println("over expense  by: " + (-a));
        }
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("calculating expenses for electricity------------------------------>>>>>>>>>>>>>>>>>");
        B.bills();
        System.out.println("                                                                        " +
                "                                                                                      ");
        System.out.println("electric bill is: " + B.e_calc());
        System.out.println("total expenses in electric bill: " + B.E_bill_tot);
        {
            double a = (B.e_budget - B.E_bill_tot);
            System.out.println("Savings from electic_bill budget" + (a));
            if (a < 0.0)
                System.out.println("over expense  by: " + (-a));
        }
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("calculating other extra bills------------------------------>>>>>>>>>>>>>>>>>");
            B.O_exp();
        System.out.println("                                                                        " +
                "                                                                                      ");
        System.out.println("bill for other expenses: " + B.o_calc());
        System.out.println("total expenses in house maintainance and clothing: " + B.O_bill_tot);
        {

            double a = (B.o_budget - B.O_bill_tot);
            System.out.println("Savings from groceries budget: " + (a));
            if (a < 0.0)
                System.out.println("over expense  by: " + (-a));
        }
        System.out.println("                                                                        " +
                "                                                                                      ");
        System.out.println("total expenses and budget comparision");
        System.out.println("total expenses from groceries and bills: "+(g.G_total+B.E_bill_tot+B.O_bill_tot));
        System.out.println("total budget for expenses: "+budget.budget);
        System.out.println("                                                                    ");
        System.out.println("                                                                    ");
        {
            double a = (budget.budget - (g.G_total+B.E_bill_tot+B.O_bill_tot));
            System.out.println("Savings from the total budget of house management: " + (a));
            if (a < 0.0)
                System.out.println("over expense in total budget  by: " + (-a));
        }

    }
}