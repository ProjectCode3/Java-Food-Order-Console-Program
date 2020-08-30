import javax.swing.*;

public class Main {

    public static MainClass mc = new MainClass();

    public static String full_Name;
    public static String contactNumber;
    public static int $food_choice, $drink_choice, $side_choice;
    public static double $price;
    public static double $total;

    //Menu Items Cost

    //Food
    public static double $burger = 18.45;
    public static double $pasta = 20.00;
    public static double $taco = 25.00;

    //Drinks
    public static double $coke_Can = 13.36;
    public static double $coke_bottle = 15.00;
    public static double $water = 10.00;
    public static double $pepsi = 7.10;
    public static double $monster_energy = 16.25;

    //Sides
    public static double $chips = 9.00;
    public static double $salad = 10.05;
    public static double $onionRings = 15.55;
    public static double $breadStix = 5.30;


    public static void main(String[] args) {
        full_Name = JOptionPane.showInputDialog(null, "Please Enter Your Full Name");
        mc.setFull_Name(full_Name);

        contactNumber = JOptionPane.showInputDialog(null, "Please Enter Your Contact Number");
        mc.set$contact_Number(contactNumber);

        $food_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Choose An Item Below: " +
                "\n1. Burger" +
                "\n2. Pasta" +
                "\n3. Taco"));

        $drink_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Choose An Item Below: " +
                "\n1. Coke Can" +
                "\n2. Coke Bottle" +
                "\n3. Water" +
                "\n4.Pepsi" +
                "\n5. Monster Energy"));

        $side_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Choose An Item Below: " +
                "\n1. Chips" +
                "\n2. Salad" +
                "\n3. Onion Rings" +
                "\n4.Bread Stix"));

        switch ($food_choice) {
            case 0:
                $total = $total + $burger;
                break;
            case 1:
                $total = $total + $pasta;
                break;
            case 2:
                $total = $total + $taco;
                break;
        }

        switch ($drink_choice) {
            case 0:
                $total = $total + $coke_Can;
                break;
            case 1:
                $total = $total + $coke_bottle;
                break;
            case 2:
                $total = $total + $water;
                break;
            case 3:
                $total = $total + $pepsi;
                break;
            case 4:
                $total = $total + $monster_energy;
                break;
        }

        switch ($side_choice) {
            case 0:
                $total = $total + $chips;
                break;
            case 1:
                $total = $total + $salad;
                break;
            case 2:
                $total = $total + $onionRings;
                break;
            case 3:
                $total = $total + $breadStix;
                break;
        }

        mc.setFullPrice($total);

        JOptionPane.showMessageDialog(null, "Customer Receipt" +
                "\nCustomer Name: " + mc.getFull_Name() +
                "\nCustomer Contact Details: " + mc.get$contact_Number() +
                "\nTotal Amount Of Purchase: $" + mc.getFullPrice());
    }
}
