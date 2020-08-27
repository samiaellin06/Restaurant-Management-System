

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Menu extends javax.swing.JFrame {
    //Quantity
    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
    int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
    int pt1 = 0, pt2 = 0, pt3 = 0, pt4 = 0, pt5 = 0;
    int sd1 = 0, sd2 = 0, sd3 = 0, sd4 = 0, sd5 = 0,sd6 = 0;
    int sh1 = 0, sh2 = 0, sh3 = 0, sh4 = 0;
    int bv1 = 0, bv2 = 0, bv3 = 0, bv4 = 0, bv5 = 0;
    
    //Confirmation
    int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0;
    int flagP1 = 0, flagP2 = 0, flagP3 = 0, flagP4 = 0;
    int flagPt1 = 0, flagPt2 = 0, flagPt3 = 0, flagPt4 = 0, flagPt5=0;
    int flagSd1 = 0, flagSd2 = 0, flagSd3 = 0, flagSd4 = 0, flagSd5 = 0,flagSd6 = 0;
    int flagSh1 = 0, flagSh2 = 0, flagSh3 = 0, flagSh4 = 0;
    int flagBv1 = 0, flagBv2 = 0, flagBv3 = 0, flagBv4 = 0, flagBv5 = 0;
    
    //Selection Variable
    int BCBurger = 0, CCBurger = 0, BCDelight = 0, CCDelight = 0, FBurger = 0;
    int PizzaA = 0, PizzaB = 0, PizzaC = 0, PizzaD = 0;
    int WSPasta = 0, RSPasta = 0, PBasta = 0, NPasta = 0, BPasta = 0;
    int CNSalad = 0, ChFries = 0, ChLoli = 0, FFries = 0, ORings = 0, TSoup = 0;
    int DMS = 0, KKS = 0, OS = 0, BL = 0;
    int MW = 0,CC = 0, Spr = 0, Miri = 0, MD = 0;
    
    //Price
    int cOrder = 0;
    double sum [] = new double [30];
    double totalPrice = 0.0;
    double x1, x2, x3, x4, x5;
    double y1, y2, y3, y4;
    double z1, z2, z3, z4, z5;
    double s1, s2, s3, s4, s5, s6;
    double h1, h2, h3, h4;
    double b1, b2, b3, b4, b5;
    
    File f = new File ("Info.txt");
    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        ItemMenu.setEditable(false);
        TotalPriceField.setEditable(false);
        HistoryList.setEditable(false);
        GTotalField.setEditable (false);
        Count1.setEditable(false);
        Count2.setEditable(false);
        Count3.setEditable(false);
        Count4.setEditable(false);
        Count5.setEditable(false);
        CountPizza1.setEditable(false);
        CountPizza2.setEditable(false);
        CountPizza3.setEditable(false);
        CountPizza4.setEditable(false);
        CountPasta1.setEditable(false);
        CountPasta2.setEditable(false);
        CountPasta3.setEditable(false);
        CountPasta4.setEditable(false);
        CountPasta5.setEditable(false);
        SidesCount1.setEditable(false);
        SidesCount2.setEditable(false);
        SidesCount3.setEditable(false);
        SidesCount4.setEditable(false);
        SidesCount5.setEditable(false);
        SidesCount6.setEditable(false);
        ShakeCount1.setEditable(false);
        ShakeCount2.setEditable(false);
        ShakeCount3.setEditable(false);
        ShakeCount4.setEditable(false);
        BvCount1.setEditable(false);
        BvCount2.setEditable(false);
        BvCount3.setEditable(false);
        BvCount4.setEditable(false);
        BvCount5.setEditable(false);
        
    }
    
    public void GetPrice() 
    {
        for (int i = 0; i < sum.length; i++) {
            totalPrice = totalPrice + sum[i];
        }
        TotalPriceField.setText(Double.toString(totalPrice));
    }
    
    public void ReadFile() {

        String name = NameField.getText();
        String TPrice = TotalPriceField.getText();
 
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(f, true);

            try (BufferedWriter bufferedwriter = new BufferedWriter(fileWriter)) {

                bufferedwriter.write(name);
                bufferedwriter.newLine();
                bufferedwriter.write(TPrice);
                bufferedwriter.newLine();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   
    public void NotZero () {
     
     Count1.setText(Integer.toString(a1));
     Count2.setText(Integer.toString(a2));
     Count3.setText(Integer.toString(a3));
     Count4.setText(Integer.toString(a4));
     Count5.setText(Integer.toString(a5));
     
     CheckBox1.setEnabled(false); 
     CheckBox2.setEnabled(false);
     CheckBox3.setEnabled(false);
     CheckBox4.setEnabled(false);
     CheckBox5.setEnabled(false);
     
     CountPizza1.setText(Integer.toString(p1));
     CountPizza2.setText(Integer.toString(p2));
     CountPizza3.setText(Integer.toString(p3));
     CountPizza4.setText(Integer.toString(p4));
     
     CheckBoxPizza1.setEnabled(false);
     CheckBoxPizza2.setEnabled(false);
     CheckBoxPizza3.setEnabled(false);
     CheckBoxPizza4.setEnabled(false);
     
     
     CountPasta1.setText(Integer.toString(pt1));
     CountPasta2.setText(Integer.toString(pt2));
     CountPasta3.setText(Integer.toString(pt3));
     CountPasta4.setText(Integer.toString(pt4));
     CountPasta5.setText(Integer.toString(pt5));
     
     CheckBoxPasta1.setEnabled(false);
     CheckBoxPasta2.setEnabled(false);
     CheckBoxPasta3.setEnabled(false);
     CheckBoxPasta4.setEnabled(false);
     CheckBoxPasta5.setEnabled(false);
     
     
     SidesCount1.setText(Integer.toString(sd1));
     SidesCount2.setText(Integer.toString(sd2));
     SidesCount3.setText(Integer.toString(sd3));
     SidesCount4.setText(Integer.toString(sd4));
     SidesCount5.setText(Integer.toString(sd5));
     SidesCount6.setText(Integer.toString(sd6));
     
     SidesCheckBox1.setEnabled(false);
     SidesCheckBox2.setEnabled(false);
     SidesCheckBox3.setEnabled(false);
     SidesCheckBox4.setEnabled(false);
     SidesCheckBox5.setEnabled(false);
     SidesCheckBox6.setEnabled(false);
     
     
     ShakeCount1.setText(Integer.toString(sh1));
     ShakeCount2.setText(Integer.toString(sh2));
     ShakeCount3.setText(Integer.toString(sh3));
     ShakeCount4.setText(Integer.toString(sh4));
     
     ShakeCheckBox1.setEnabled(false);
     ShakeCheckBox2.setEnabled(false);
     ShakeCheckBox3.setEnabled(false);
     ShakeCheckBox4.setEnabled(false);
     
     
     BvCount1.setText(Integer.toString(bv1));
     BvCount2.setText(Integer.toString(bv2));
     BvCount3.setText(Integer.toString(bv3));
     BvCount4.setText(Integer.toString(bv4));
     BvCount5.setText(Integer.toString(bv5));
     
     BvCheckBox1.setEnabled(false);
     BvCheckBox2.setEnabled(false);
     BvCheckBox3.setEnabled(false);   
     BvCheckBox4.setEnabled(false);
     BvCheckBox5.setEnabled(false);
   
  
    }
    
    
    
    public void Zero () {
         //Quantity
     a1 = 0; a2 = 0; a3 = 0; a4 = 0; a5 = 0;
     p1 = 0; p2 = 0; p3 = 0; p4 = 0;
     pt1 = 0; pt2 = 0; pt3 = 0; pt4 = 0; pt5 = 0;
     sd1 = 0; sd2 = 0; sd3 = 0; sd4 = 0; sd5 = 0; sd6 = 0;
     sh1 = 0; sh2 = 0; sh3 = 0; sh4 = 0;
     bv1 = 0; bv2 = 0; bv3 = 0; bv4 = 0; bv5 = 0;
    
     //Confirmation
     flag1 = 0; flag2 = 0; flag3 = 0; flag4 = 0; flag5 = 0;
     flagP1 = 0; flagP2 = 0; flagP3 = 0; flagP4 = 0;
     flagPt1 = 0; flagPt2 = 0; flagPt3 = 0; flagPt4 = 0; flagPt5=0;
     flagSd1 = 0; flagSd2 = 0; flagSd3 = 0; flagSd4 = 0; flagSd5 = 0; flagSd6 = 0;
     flagSh1 = 0; flagSh2 = 0; flagSh3 = 0; flagSh4 = 0;
     flagBv1 = 0; flagBv2 = 0; flagBv3 = 0; flagBv4 = 0; flagBv5 = 0;
    
     //Selection Variable
     BCBurger = 0; CCBurger = 0; BCDelight = 0; CCDelight = 0; FBurger = 0;
     PizzaA = 0; PizzaB = 0; PizzaC = 0; PizzaD = 0;
     WSPasta = 0; RSPasta = 0; PBasta = 0; NPasta = 0; BPasta = 0;
     CNSalad = 0; ChFries = 0; ChLoli = 0; FFries = 0; ORings = 0; TSoup = 0;
     DMS = 0; KKS = 0; OS = 0; BL = 0;
     MW = 0; CC = 0; Spr = 0; Miri = 0; MD = 0;
    
     //Price
     x1 = 0; x2 = 0; x3 = 0; x4 = 0; x5 = 0;
     y1 = 0; y2 = 0; y3 = 0; y4 = 0;
     z1 = 0; z2 = 0; z3 = 0; z4 = 0; z5 = 0;
     s1 = 0; s2 = 0; s3 = 0; s4 = 0; s5 = 0; s6 = 0;
     h1 = 0; h2 = 0; h3 = 0; h4 = 0;
     b1 = 0; b2 = 0; b3 = 0; b4 = 0; b5 = 0;
    
     Count1.setText(Integer.toString(a1));
     Count2.setText(Integer.toString(a2));
     Count3.setText(Integer.toString(a3));
     Count4.setText(Integer.toString(a4));
     Count5.setText(Integer.toString(a5));
     
     CheckBox1.setEnabled(true);
     CheckBox1.setSelected (false);
     CheckBox2.setEnabled(true);
     CheckBox2.setSelected (false);
     CheckBox3.setEnabled(true);
     CheckBox3.setSelected (false);
     CheckBox4.setEnabled(true);
     CheckBox4.setSelected (false);
     CheckBox5.setEnabled(true);
     CheckBox5.setSelected (false);
     
     CountPizza1.setText(Integer.toString(p1));
     CountPizza2.setText(Integer.toString(p2));
     CountPizza3.setText(Integer.toString(p3));
     CountPizza4.setText(Integer.toString(p4));
     
     CheckBoxPizza1.setEnabled(true);
     CheckBoxPizza1.setSelected (false);
     CheckBoxPizza2.setEnabled(true);
     CheckBoxPizza2.setSelected (false);
     CheckBoxPizza3.setEnabled(true);
     CheckBoxPizza3.setSelected (false);
     CheckBoxPizza4.setEnabled(true);
     CheckBoxPizza4.setSelected (false);
     
     CountPasta1.setText(Integer.toString(pt1));
     CountPasta2.setText(Integer.toString(pt2));
     CountPasta3.setText(Integer.toString(pt3));
     CountPasta4.setText(Integer.toString(pt4));
     CountPasta5.setText(Integer.toString(pt5));
     
     CheckBoxPasta1.setEnabled(true);
     CheckBoxPasta1.setSelected (false);
     CheckBoxPasta2.setEnabled(true);
     CheckBoxPasta2.setSelected (false);
     CheckBoxPasta3.setEnabled(true);
     CheckBoxPasta3.setSelected (false);
     CheckBoxPasta4.setEnabled(true);
     CheckBoxPasta4.setSelected (false);
     CheckBoxPasta5.setEnabled(true);
     CheckBoxPasta5.setSelected (false);
     
     SidesCount1.setText(Integer.toString(sd1));
     SidesCount2.setText(Integer.toString(sd2));
     SidesCount3.setText(Integer.toString(sd3));
     SidesCount4.setText(Integer.toString(sd4));
     SidesCount5.setText(Integer.toString(sd5));
     SidesCount6.setText(Integer.toString(sd6));
     
     SidesCheckBox1.setEnabled(true);
     SidesCheckBox1.setSelected (false);
     SidesCheckBox2.setEnabled(true);
     SidesCheckBox2.setSelected (false);
     SidesCheckBox3.setEnabled(true);
     SidesCheckBox3.setSelected (false);
     SidesCheckBox4.setEnabled(true);
     SidesCheckBox4.setSelected (false);
     SidesCheckBox5.setEnabled(true);
     SidesCheckBox5.setSelected (false);
     SidesCheckBox6.setEnabled(true);
     SidesCheckBox6.setSelected (false);
     
     ShakeCount1.setText(Integer.toString(sh1));
     ShakeCount2.setText(Integer.toString(sh2));
     ShakeCount3.setText(Integer.toString(sh3));
     ShakeCount4.setText(Integer.toString(sh4));
     
     ShakeCheckBox1.setEnabled(true);
     ShakeCheckBox1.setSelected (false);
     ShakeCheckBox2.setEnabled(true);
     ShakeCheckBox2.setSelected (false);
     ShakeCheckBox3.setEnabled(true);
     ShakeCheckBox3.setSelected (false);
     ShakeCheckBox4.setEnabled(true);
     ShakeCheckBox4.setSelected (false);
     
     BvCount1.setText(Integer.toString(bv1));
     BvCount2.setText(Integer.toString(bv2));
     BvCount3.setText(Integer.toString(bv3));
     BvCount4.setText(Integer.toString(bv4));
     BvCount5.setText(Integer.toString(bv5));
     
     BvCheckBox1.setEnabled(true);
     BvCheckBox1.setSelected (false);
     BvCheckBox2.setEnabled(true);
     BvCheckBox2.setSelected (false);
     BvCheckBox3.setEnabled(true);
     BvCheckBox3.setSelected (false);
     BvCheckBox4.setEnabled(true);
     BvCheckBox4.setSelected (false);
     BvCheckBox5.setEnabled(true);
     BvCheckBox5.setSelected (false);

     cOrder = 0;
     NameField.setText (null);
     ItemMenu.setText(null);
     totalPrice = 0.0;
     TotalPriceField.setText(Double.toString(totalPrice));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonPanel1 = new javax.swing.JPanel();
        BurgerLabel2 = new javax.swing.JLabel();
        PizzaListButton2 = new javax.swing.JButton();
        PizzaLabel3 = new javax.swing.JLabel();
        PastaListButton2 = new javax.swing.JButton();
        PastaLabel2 = new javax.swing.JLabel();
        BurgerListButton4 = new javax.swing.JButton();
        ButtonPanel2 = new javax.swing.JPanel();
        SidesListButton2 = new javax.swing.JButton();
        SidesLabel2 = new javax.swing.JLabel();
        ShakesListButton2 = new javax.swing.JButton();
        ShakesLabel2 = new javax.swing.JLabel();
        BeveragesButton2 = new javax.swing.JButton();
        BeveragesListLabel2 = new javax.swing.JLabel();
        PanelMenuName = new javax.swing.JPanel();
        MenuLabel2 = new javax.swing.JLabel();
        LogoPanel = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        BurgerPanel = new javax.swing.JPanel();
        CheckBox1 = new javax.swing.JCheckBox();
        CountNeg1 = new javax.swing.JButton();
        Count1 = new javax.swing.JTextField();
        CountPos1 = new javax.swing.JButton();
        BurgerQuantityLabel = new javax.swing.JLabel();
        CheckBox2 = new javax.swing.JCheckBox();
        Count2 = new javax.swing.JTextField();
        CountNeg2 = new javax.swing.JButton();
        CountPos2 = new javax.swing.JButton();
        CheckBox3 = new javax.swing.JCheckBox();
        BurgerLabel = new javax.swing.JLabel();
        CountNeg3 = new javax.swing.JButton();
        Count3 = new javax.swing.JTextField();
        CountPos3 = new javax.swing.JButton();
        CheckBox4 = new javax.swing.JCheckBox();
        CountNeg4 = new javax.swing.JButton();
        Count4 = new javax.swing.JTextField();
        CountPos4 = new javax.swing.JButton();
        CheckBox5 = new javax.swing.JCheckBox();
        CountNeg5 = new javax.swing.JButton();
        Count5 = new javax.swing.JTextField();
        CountPos5 = new javax.swing.JButton();
        BurgerPriceLAbel = new javax.swing.JLabel();
        PriceBurgerLabel1 = new javax.swing.JLabel();
        PriceBurgerLabel2 = new javax.swing.JLabel();
        PriceBurgerLabel3 = new javax.swing.JLabel();
        PriceBurgerLabel4 = new javax.swing.JLabel();
        PriceBurgerLabel5 = new javax.swing.JLabel();
        ConfirmButton1 = new javax.swing.JButton();
        ConfirmButton2 = new javax.swing.JButton();
        ConfirmButton3 = new javax.swing.JButton();
        ConfirmButton4 = new javax.swing.JButton();
        ConfirmButton5 = new javax.swing.JButton();
        PizzaPanel = new javax.swing.JPanel();
        PizzaLabel = new javax.swing.JLabel();
        CheckBoxPizza4 = new javax.swing.JCheckBox();
        PizzaPriceLabel = new javax.swing.JLabel();
        PizzaQuantityLabel = new javax.swing.JLabel();
        CountPizza1 = new javax.swing.JTextField();
        CountPizzaNeg1 = new javax.swing.JButton();
        CountPizzaPos1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CheckBoxPizza2 = new javax.swing.JCheckBox();
        CheckBoxPizza3 = new javax.swing.JCheckBox();
        CheckBoxPizza1 = new javax.swing.JCheckBox();
        CountPizzaNeg2 = new javax.swing.JButton();
        CountPizza2 = new javax.swing.JTextField();
        CountPizzaPos2 = new javax.swing.JButton();
        CountPizzaNeg3 = new javax.swing.JButton();
        CountPizza3 = new javax.swing.JTextField();
        CountPizzaPos3 = new javax.swing.JButton();
        CountPizzaNeg4 = new javax.swing.JButton();
        CountPizza4 = new javax.swing.JTextField();
        CountPizzaPos4 = new javax.swing.JButton();
        ConfirmPizza1 = new javax.swing.JButton();
        ConfirmPizza2 = new javax.swing.JButton();
        ConfirmPizza3 = new javax.swing.JButton();
        ConfirmPizza4 = new javax.swing.JButton();
        PPrice1 = new javax.swing.JLabel();
        PPrice2 = new javax.swing.JLabel();
        PPrice3 = new javax.swing.JLabel();
        PPrice4 = new javax.swing.JLabel();
        PastaPanel = new javax.swing.JPanel();
        PastaLabel = new javax.swing.JLabel();
        PastaPriceLabel = new javax.swing.JLabel();
        PastaQuantityLabel = new javax.swing.JLabel();
        CheckBoxPasta1 = new javax.swing.JCheckBox();
        CheckBoxPasta2 = new javax.swing.JCheckBox();
        CheckBoxPasta3 = new javax.swing.JCheckBox();
        CheckBoxPasta4 = new javax.swing.JCheckBox();
        CheckBoxPasta5 = new javax.swing.JCheckBox();
        PricePastaLabel1 = new javax.swing.JLabel();
        PricePastaLabel2 = new javax.swing.JLabel();
        PricePastaLabel3 = new javax.swing.JLabel();
        PricePastaLabel4 = new javax.swing.JLabel();
        PricePastaLabel5 = new javax.swing.JLabel();
        CountPastaNeg1 = new javax.swing.JButton();
        CountPasta1 = new javax.swing.JTextField();
        CountPastaPos1 = new javax.swing.JButton();
        CountPastaNeg2 = new javax.swing.JButton();
        CountPasta2 = new javax.swing.JTextField();
        CountPastaPos2 = new javax.swing.JButton();
        CountPastaNeg3 = new javax.swing.JButton();
        CountPasta3 = new javax.swing.JTextField();
        CountPastaPos3 = new javax.swing.JButton();
        CountPastaNeg4 = new javax.swing.JButton();
        CountPasta4 = new javax.swing.JTextField();
        CountPastaPos4 = new javax.swing.JButton();
        CountPastaNeg5 = new javax.swing.JButton();
        CountPasta5 = new javax.swing.JTextField();
        CountPastaPos5 = new javax.swing.JButton();
        ConfirmPasta1 = new javax.swing.JButton();
        ConfirmPasta2 = new javax.swing.JButton();
        ConfirmPasta3 = new javax.swing.JButton();
        ConfirmPasta4 = new javax.swing.JButton();
        ConfirmPasta5 = new javax.swing.JButton();
        SidesPanel = new javax.swing.JPanel();
        SidesLabel = new javax.swing.JLabel();
        SidesCheckBox1 = new javax.swing.JCheckBox();
        SidesCheckBox2 = new javax.swing.JCheckBox();
        SidesCheckBox3 = new javax.swing.JCheckBox();
        SidesCheckBox4 = new javax.swing.JCheckBox();
        SidesCheckBox5 = new javax.swing.JCheckBox();
        SidesCheckBox6 = new javax.swing.JCheckBox();
        SidesPriceLabel = new javax.swing.JLabel();
        SidesPriceLabel1 = new javax.swing.JLabel();
        SidesPriceLabel2 = new javax.swing.JLabel();
        SidesPriceLabel3 = new javax.swing.JLabel();
        SidesPriceLabel4 = new javax.swing.JLabel();
        SidesPriceLabel5 = new javax.swing.JLabel();
        SidesPriceLabel6 = new javax.swing.JLabel();
        SidesQuantityLabel = new javax.swing.JLabel();
        SidesCountNeg1 = new javax.swing.JButton();
        SidesCount1 = new javax.swing.JTextField();
        SidesCountPos1 = new javax.swing.JButton();
        SidesCountNeg2 = new javax.swing.JButton();
        SidesCountPos2 = new javax.swing.JButton();
        SidesCount2 = new javax.swing.JTextField();
        SidesCountNeg3 = new javax.swing.JButton();
        SidesCount3 = new javax.swing.JTextField();
        SidesCountPos3 = new javax.swing.JButton();
        SidesCountNeg4 = new javax.swing.JButton();
        SidesCountPos4 = new javax.swing.JButton();
        SidesCount4 = new javax.swing.JTextField();
        SidesCountNeg5 = new javax.swing.JButton();
        SidesCount5 = new javax.swing.JTextField();
        SidesCountPos5 = new javax.swing.JButton();
        SidesCountNeg6 = new javax.swing.JButton();
        SidesCount6 = new javax.swing.JTextField();
        SidesCountPos6 = new javax.swing.JButton();
        CorfirmSides1 = new javax.swing.JButton();
        CorfirmSides2 = new javax.swing.JButton();
        CorfirmSides3 = new javax.swing.JButton();
        CorfirmSides4 = new javax.swing.JButton();
        CorfirmSides5 = new javax.swing.JButton();
        CorfirmSides6 = new javax.swing.JButton();
        ShakesPanel = new javax.swing.JPanel();
        ShakeLabel = new javax.swing.JLabel();
        ShakeCheckBox1 = new javax.swing.JCheckBox();
        ShakeCheckBox2 = new javax.swing.JCheckBox();
        ShakeCheckBox3 = new javax.swing.JCheckBox();
        ShakeCheckBox4 = new javax.swing.JCheckBox();
        ShakePriceLabel = new javax.swing.JLabel();
        ShakePriceLabel1 = new javax.swing.JLabel();
        ShakePriceLabel2 = new javax.swing.JLabel();
        ShakePriceLabel3 = new javax.swing.JLabel();
        ShakePriceLabel4 = new javax.swing.JLabel();
        ShakeQuantityLabel = new javax.swing.JLabel();
        ShakeCountNeg1 = new javax.swing.JButton();
        ShakeCount1 = new javax.swing.JTextField();
        ShakeCountPos1 = new javax.swing.JButton();
        ShakeConfirm1 = new javax.swing.JButton();
        ShakeCountNeg2 = new javax.swing.JButton();
        ShakeCount2 = new javax.swing.JTextField();
        ShakeCountPos2 = new javax.swing.JButton();
        ShakeConfirm2 = new javax.swing.JButton();
        ShakeCountNeg3 = new javax.swing.JButton();
        ShakeCount3 = new javax.swing.JTextField();
        ShakeCountPos3 = new javax.swing.JButton();
        ShakeConfirm3 = new javax.swing.JButton();
        ShakeCountNeg4 = new javax.swing.JButton();
        ShakeCount4 = new javax.swing.JTextField();
        ShakeCountPos4 = new javax.swing.JButton();
        ShakeConfirm4 = new javax.swing.JButton();
        BeveragesPanel = new javax.swing.JPanel();
        BvLabel = new javax.swing.JLabel();
        BvCheckBox1 = new javax.swing.JCheckBox();
        BvCheckBox2 = new javax.swing.JCheckBox();
        BvCheckBox3 = new javax.swing.JCheckBox();
        BvCheckBox4 = new javax.swing.JCheckBox();
        BvCheckBox5 = new javax.swing.JCheckBox();
        BvQuantityLabel = new javax.swing.JLabel();
        BvPriceLabel = new javax.swing.JLabel();
        BvPriceLabel1 = new javax.swing.JLabel();
        BvPriceLabel2 = new javax.swing.JLabel();
        BvPriceLabel3 = new javax.swing.JLabel();
        BvPriceLabel4 = new javax.swing.JLabel();
        BvPriceLabel5 = new javax.swing.JLabel();
        BvCountNeg1 = new javax.swing.JButton();
        BvCount1 = new javax.swing.JTextField();
        BvCountPos1 = new javax.swing.JButton();
        BvConfirm1 = new javax.swing.JButton();
        BvCountNeg2 = new javax.swing.JButton();
        BvCount2 = new javax.swing.JTextField();
        BvCountPos2 = new javax.swing.JButton();
        BvConfirm2 = new javax.swing.JButton();
        BvCountNeg3 = new javax.swing.JButton();
        BvCount3 = new javax.swing.JTextField();
        BvConfirm3 = new javax.swing.JButton();
        BvCountPos3 = new javax.swing.JButton();
        BvCountNeg4 = new javax.swing.JButton();
        BvCount4 = new javax.swing.JTextField();
        BvCountPos4 = new javax.swing.JButton();
        BvConfirm4 = new javax.swing.JButton();
        BvCountNeg5 = new javax.swing.JButton();
        BvCount5 = new javax.swing.JTextField();
        BvCountPos5 = new javax.swing.JButton();
        BvConfirm5 = new javax.swing.JButton();
        ListHistoryPanel = new javax.swing.JPanel();
        SelectedItemPanel = new javax.swing.JPanel();
        SelectedItemLabel2 = new javax.swing.JLabel();
        ItemNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        ConfirmOrderButton = new javax.swing.JButton();
        TotalPriceField = new javax.swing.JTextField();
        TotalPriceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemMenu = new javax.swing.JTextArea();
        NameField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        HistoryPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HistoryList = new javax.swing.JTextArea();
        Reset = new javax.swing.JButton();
        GTotalField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        ItemListButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAFE WEIRDO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPanel1.setBackground(new java.awt.Color(255, 242, 0));
        ButtonPanel1.setPreferredSize(new java.awt.Dimension(130, 650));

        BurgerLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        BurgerLabel2.setForeground(new java.awt.Color(240, 51, 51));
        BurgerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BurgerLabel2.setText("BURGERS");

        PizzaListButton2.setBackground(new java.awt.Color(240, 51, 51));
        PizzaListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizza.png"))); // NOI18N
        PizzaListButton2.setMinimumSize(new java.awt.Dimension(120, 120));
        PizzaListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaListButton2ActionPerformed(evt);
            }
        });

        PizzaLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        PizzaLabel3.setForeground(new java.awt.Color(240, 51, 51));
        PizzaLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PizzaLabel3.setText("PIZZA");

        PastaListButton2.setBackground(new java.awt.Color(240, 51, 51));
        PastaListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pasta.png"))); // NOI18N
        PastaListButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        PastaListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastaListButton2ActionPerformed(evt);
            }
        });

        PastaLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        PastaLabel2.setForeground(new java.awt.Color(240, 51, 51));
        PastaLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PastaLabel2.setText("Pasta");

        BurgerListButton4.setBackground(new java.awt.Color(240, 51, 51));
        BurgerListButton4.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        BurgerListButton4.setForeground(new java.awt.Color(255, 242, 0));
        BurgerListButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burger.png"))); // NOI18N
        BurgerListButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerListButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanel1Layout = new javax.swing.GroupLayout(ButtonPanel1);
        ButtonPanel1.setLayout(ButtonPanel1Layout);
        ButtonPanel1Layout.setHorizontalGroup(
            ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PastaListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonPanel1Layout.createSequentialGroup()
                        .addGroup(ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BurgerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PizzaListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BurgerListButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PastaLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(ButtonPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(PizzaLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonPanel1Layout.setVerticalGroup(
            ButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BurgerListButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(BurgerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(PizzaListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PizzaLabel3)
                .addGap(50, 50, 50)
                .addComponent(PastaListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PastaLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 650));

        ButtonPanel2.setBackground(new java.awt.Color(255, 242, 0));
        ButtonPanel2.setPreferredSize(new java.awt.Dimension(130, 650));

        SidesListButton2.setBackground(new java.awt.Color(240, 51, 51));
        SidesListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sides.png"))); // NOI18N
        SidesListButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        SidesListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesListButton2ActionPerformed(evt);
            }
        });

        SidesLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        SidesLabel2.setForeground(new java.awt.Color(240, 51, 51));
        SidesLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesLabel2.setText("SIDES");

        ShakesListButton2.setBackground(new java.awt.Color(240, 51, 51));
        ShakesListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shakes.png"))); // NOI18N
        ShakesListButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        ShakesListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakesListButton2ActionPerformed(evt);
            }
        });

        ShakesLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        ShakesLabel2.setForeground(new java.awt.Color(240, 51, 51));
        ShakesLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakesLabel2.setText("Shakes");

        BeveragesButton2.setBackground(new java.awt.Color(240, 51, 51));
        BeveragesButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Beverages.png"))); // NOI18N
        BeveragesButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        BeveragesButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeveragesButton2ActionPerformed(evt);
            }
        });

        BeveragesListLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        BeveragesListLabel2.setForeground(new java.awt.Color(240, 51, 51));
        BeveragesListLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BeveragesListLabel2.setText("BEVERAGES");

        javax.swing.GroupLayout ButtonPanel2Layout = new javax.swing.GroupLayout(ButtonPanel2);
        ButtonPanel2.setLayout(ButtonPanel2Layout);
        ButtonPanel2Layout.setHorizontalGroup(
            ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel2Layout.createSequentialGroup()
                .addGroup(ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShakesListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SidesListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SidesLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShakesLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeveragesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeveragesListLabel2))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        ButtonPanel2Layout.setVerticalGroup(
            ButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SidesListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SidesLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ShakesListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShakesLabel2)
                .addGap(50, 50, 50)
                .addComponent(BeveragesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BeveragesListLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 130, 650));

        PanelMenuName.setBackground(new java.awt.Color(255, 242, 0));

        MenuLabel2.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        MenuLabel2.setForeground(new java.awt.Color(240, 51, 51));
        MenuLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLabel2.setText("Menu");

        javax.swing.GroupLayout PanelMenuNameLayout = new javax.swing.GroupLayout(PanelMenuName);
        PanelMenuName.setLayout(PanelMenuNameLayout);
        PanelMenuNameLayout.setHorizontalGroup(
            PanelMenuNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuNameLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(MenuLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        PanelMenuNameLayout.setVerticalGroup(
            PanelMenuNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelMenuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 0, 720, 60));

        LogoPanel.setBackground(new java.awt.Color(255, 242, 0));
        LogoPanel.setLayout(new java.awt.CardLayout());

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        LogoPanel.add(LogoLabel, "card2");

        BurgerPanel.setBackground(new java.awt.Color(255, 242, 0));

        CheckBox1.setBackground(new java.awt.Color(255, 242, 0));
        CheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBox1.setForeground(new java.awt.Color(240, 51, 51));
        CheckBox1.setText("BEEF CHEESE BURGER");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        CountNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountNeg1ActionPerformed(evt);
            }
        });

        Count1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Count1.setText("0");
        Count1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Count1ActionPerformed(evt);
            }
        });

        CountPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPos1ActionPerformed(evt);
            }
        });

        BurgerQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BurgerQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        BurgerQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BurgerQuantityLabel.setText("QUANTITY");

        CheckBox2.setBackground(new java.awt.Color(255, 242, 0));
        CheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBox2.setForeground(new java.awt.Color(240, 51, 51));
        CheckBox2.setText("CHICKEN CHEESE BURGER");
        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });

        Count2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Count2.setText("0");
        Count2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Count2ActionPerformed(evt);
            }
        });

        CountNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountNeg2ActionPerformed(evt);
            }
        });

        CountPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPos2ActionPerformed(evt);
            }
        });

        CheckBox3.setBackground(new java.awt.Color(255, 242, 0));
        CheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBox3.setForeground(new java.awt.Color(240, 51, 51));
        CheckBox3.setText("BEEF CHEESE DELIGHT");
        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });

        BurgerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BurgerLabel.setForeground(new java.awt.Color(240, 51, 51));
        BurgerLabel.setText("BURGERS");

        CountNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountNeg3ActionPerformed(evt);
            }
        });

        Count3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Count3.setText("0");
        Count3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Count3ActionPerformed(evt);
            }
        });

        CountPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPos3ActionPerformed(evt);
            }
        });

        CheckBox4.setBackground(new java.awt.Color(255, 242, 0));
        CheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBox4.setForeground(new java.awt.Color(240, 51, 51));
        CheckBox4.setText("CHICKEN CHEESE DELIGHT");
        CheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox4ActionPerformed(evt);
            }
        });

        CountNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountNeg4ActionPerformed(evt);
            }
        });

        Count4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Count4.setText("0");
        Count4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Count4ActionPerformed(evt);
            }
        });

        CountPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPos4ActionPerformed(evt);
            }
        });

        CheckBox5.setBackground(new java.awt.Color(255, 242, 0));
        CheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBox5.setForeground(new java.awt.Color(240, 51, 51));
        CheckBox5.setText("FISH BURGER");
        CheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox5ActionPerformed(evt);
            }
        });

        CountNeg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountNeg5.setPreferredSize(new java.awt.Dimension(25, 25));
        CountNeg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountNeg5ActionPerformed(evt);
            }
        });

        Count5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Count5.setText("0");
        Count5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Count5ActionPerformed(evt);
            }
        });

        CountPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPos5.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPos5ActionPerformed(evt);
            }
        });

        BurgerPriceLAbel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BurgerPriceLAbel.setForeground(new java.awt.Color(240, 51, 51));
        BurgerPriceLAbel.setText("PRICE");

        PriceBurgerLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceBurgerLabel1.setForeground(new java.awt.Color(240, 51, 51));
        PriceBurgerLabel1.setText("TK 140.0");

        PriceBurgerLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceBurgerLabel2.setForeground(new java.awt.Color(240, 51, 51));
        PriceBurgerLabel2.setText("TK 160.0");

        PriceBurgerLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceBurgerLabel3.setForeground(new java.awt.Color(240, 51, 51));
        PriceBurgerLabel3.setText("TK 180.0");

        PriceBurgerLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceBurgerLabel4.setForeground(new java.awt.Color(240, 51, 51));
        PriceBurgerLabel4.setText("TK 200.0");

        PriceBurgerLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceBurgerLabel5.setForeground(new java.awt.Color(240, 51, 51));
        PriceBurgerLabel5.setText("TK 220.0");

        ConfirmButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmButton1.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmButton1.setText("Confirm");
        ConfirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton1ActionPerformed(evt);
            }
        });

        ConfirmButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmButton2.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmButton2.setText("Confirm");
        ConfirmButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton2ActionPerformed(evt);
            }
        });

        ConfirmButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmButton3.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmButton3.setText("Confirm");
        ConfirmButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton3ActionPerformed(evt);
            }
        });

        ConfirmButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmButton4.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmButton4.setText("Confirm");
        ConfirmButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton4ActionPerformed(evt);
            }
        });

        ConfirmButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmButton5.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmButton5.setText("Confirm");
        ConfirmButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BurgerPanelLayout = new javax.swing.GroupLayout(BurgerPanel);
        BurgerPanel.setLayout(BurgerPanelLayout);
        BurgerPanelLayout.setHorizontalGroup(
            BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BurgerPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckBox2)
                                    .addComponent(CheckBox3)
                                    .addComponent(CheckBox4)
                                    .addComponent(CheckBox5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                                        .addComponent(PriceBurgerLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PriceBurgerLabel2)
                                                .addComponent(PriceBurgerLabel3)
                                                .addComponent(PriceBurgerLabel4))
                                            .addComponent(PriceBurgerLabel5))
                                        .addGap(60, 60, 60)
                                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                                .addComponent(CheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)))
                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BurgerPanelLayout.createSequentialGroup()
                                .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                                .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                                .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BurgerPanelLayout.createSequentialGroup()
                                .addComponent(Count4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                                .addComponent(Count5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                        .addComponent(BurgerLabel)
                        .addGap(201, 201, 201)
                        .addComponent(BurgerPriceLAbel)
                        .addGap(76, 76, 76)
                        .addComponent(BurgerQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmButton5)
                    .addComponent(ConfirmButton4)
                    .addComponent(ConfirmButton3)
                    .addComponent(ConfirmButton2)
                    .addComponent(ConfirmButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        BurgerPanelLayout.setVerticalGroup(
            BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BurgerPanelLayout.createSequentialGroup()
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BurgerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BurgerPriceLAbel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BurgerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BurgerQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BurgerPanelLayout.createSequentialGroup()
                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CheckBox1)
                                .addComponent(PriceBurgerLabel1))
                            .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConfirmButton1)))
                        .addGap(40, 40, 40)
                        .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CheckBox2)
                                .addComponent(PriceBurgerLabel2))
                            .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ConfirmButton2))
                .addGap(40, 40, 40)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBox3)
                        .addComponent(PriceBurgerLabel3))
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ConfirmButton3)
                        .addComponent(CountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBox4)
                        .addComponent(PriceBurgerLabel4))
                    .addComponent(Count4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmButton4))
                .addGap(40, 40, 40)
                .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBox5)
                        .addComponent(PriceBurgerLabel5))
                    .addGroup(BurgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Count5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmButton5)))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        LogoPanel.add(BurgerPanel, "card3");

        PizzaPanel.setBackground(new java.awt.Color(255, 242, 0));

        PizzaLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PizzaLabel.setForeground(new java.awt.Color(240, 51, 51));
        PizzaLabel.setText("PIZZA");

        CheckBoxPizza4.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPizza4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPizza4.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPizza4.setText("CHEESE OVERLOADED");
        CheckBoxPizza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPizza4ActionPerformed(evt);
            }
        });

        PizzaPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PizzaPriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        PizzaPriceLabel.setText("PRICE");

        PizzaQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PizzaQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        PizzaQuantityLabel.setText("QUANTITY");

        CountPizza1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPizza1.setText("0");
        CountPizza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizza1ActionPerformed(evt);
            }
        });

        CountPizzaNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPizzaNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaNeg1ActionPerformed(evt);
            }
        });

        CountPizzaPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPizzaPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaPos1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 51, 51));
        jLabel4.setText("(Size - 10\" (M))");

        CheckBoxPizza2.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPizza2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPizza2.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPizza2.setText("FOUR SEASON ");
        CheckBoxPizza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPizza2ActionPerformed(evt);
            }
        });

        CheckBoxPizza3.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPizza3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPizza3.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPizza3.setText("CHICKEN SUPREME");
        CheckBoxPizza3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPizza3ActionPerformed(evt);
            }
        });

        CheckBoxPizza1.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPizza1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPizza1.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPizza1.setText("CHICKEN BBQ");
        CheckBoxPizza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPizza1ActionPerformed(evt);
            }
        });

        CountPizzaNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPizzaNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaNeg2ActionPerformed(evt);
            }
        });

        CountPizza2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPizza2.setText("0");
        CountPizza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizza2ActionPerformed(evt);
            }
        });

        CountPizzaPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPizzaPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaPos2ActionPerformed(evt);
            }
        });

        CountPizzaNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPizzaNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaNeg3ActionPerformed(evt);
            }
        });

        CountPizza3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPizza3.setText("0");
        CountPizza3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizza3ActionPerformed(evt);
            }
        });

        CountPizzaPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPizzaPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaPos3ActionPerformed(evt);
            }
        });

        CountPizzaNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPizzaNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaNeg4ActionPerformed(evt);
            }
        });

        CountPizza4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPizza4.setText("0");
        CountPizza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizza4ActionPerformed(evt);
            }
        });

        CountPizzaPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPizzaPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPizzaPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPizzaPos4ActionPerformed(evt);
            }
        });

        ConfirmPizza1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPizza1.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPizza1.setText("Confirm");
        ConfirmPizza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPizza1ActionPerformed(evt);
            }
        });

        ConfirmPizza2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPizza2.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPizza2.setText("Confirm");
        ConfirmPizza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPizza2ActionPerformed(evt);
            }
        });

        ConfirmPizza3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPizza3.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPizza3.setText("Confirm");
        ConfirmPizza3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPizza3ActionPerformed(evt);
            }
        });

        ConfirmPizza4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPizza4.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPizza4.setText("Confirm");
        ConfirmPizza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPizza4ActionPerformed(evt);
            }
        });

        PPrice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PPrice1.setForeground(new java.awt.Color(240, 51, 51));
        PPrice1.setText("TK 450");

        PPrice2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PPrice2.setForeground(new java.awt.Color(240, 51, 51));
        PPrice2.setText("TK 500");

        PPrice3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PPrice3.setForeground(new java.awt.Color(240, 51, 51));
        PPrice3.setText("TK 480");

        PPrice4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PPrice4.setForeground(new java.awt.Color(240, 51, 51));
        PPrice4.setText("TK 540");

        javax.swing.GroupLayout PizzaPanelLayout = new javax.swing.GroupLayout(PizzaPanel);
        PizzaPanel.setLayout(PizzaPanelLayout);
        PizzaPanelLayout.setHorizontalGroup(
            PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzaPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PizzaLabel)
                    .addComponent(CheckBoxPizza1)
                    .addComponent(CheckBoxPizza2)
                    .addComponent(CheckBoxPizza3)
                    .addComponent(CheckBoxPizza4))
                .addGap(41, 41, 41)
                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(PizzaPriceLabel)
                                .addGap(39, 39, 39))
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PPrice3)
                                    .addComponent(PPrice4)
                                    .addComponent(PPrice2)
                                    .addComponent(PPrice1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addComponent(PizzaQuantityLabel)
                                .addGap(123, 123, 123))
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CountPizzaNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CountPizzaNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CountPizzaNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CountPizzaNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                        .addComponent(CountPizza4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CountPizzaPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfirmPizza4))
                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                        .addComponent(CountPizza2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CountPizzaPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfirmPizza2))
                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                        .addComponent(CountPizza3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CountPizzaPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfirmPizza3))
                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                        .addComponent(CountPizza1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CountPizzaPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfirmPizza1)))
                                .addContainerGap(25, Short.MAX_VALUE))))
                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PizzaPanelLayout.setVerticalGroup(
            PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzaPanelLayout.createSequentialGroup()
                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmPizza4)
                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(PizzaLabel)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PizzaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PizzaPriceLabel)
                                    .addComponent(PizzaQuantityLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)))
                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PizzaPanelLayout.createSequentialGroup()
                                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PizzaPanelLayout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(CountPizzaNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(CountPizzaPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(CountPizza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ConfirmPizza1)))
                                                    .addComponent(CheckBoxPizza1))
                                                .addGap(50, 50, 50))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PizzaPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(PPrice1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(CheckBoxPizza2)
                                                .addComponent(PPrice2))
                                            .addComponent(CountPizzaNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CountPizza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CountPizzaPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ConfirmPizza2))
                                .addGap(50, 50, 50)
                                .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CheckBoxPizza3)
                                        .addComponent(PPrice3))
                                    .addComponent(CountPizzaNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CountPizza3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CountPizzaPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ConfirmPizza3))
                        .addGap(50, 50, 50)
                        .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CheckBoxPizza4)
                                .addComponent(PPrice4))
                            .addComponent(CountPizzaNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CountPizza4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CountPizzaPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        LogoPanel.add(PizzaPanel, "card4");

        PastaPanel.setBackground(new java.awt.Color(255, 242, 0));

        PastaLabel.setBackground(new java.awt.Color(255, 242, 0));
        PastaLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PastaLabel.setForeground(new java.awt.Color(240, 51, 51));
        PastaLabel.setText("PASTA");

        PastaPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PastaPriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        PastaPriceLabel.setText("PRICE");

        PastaQuantityLabel.setBackground(new java.awt.Color(255, 242, 0));
        PastaQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PastaQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        PastaQuantityLabel.setText("QUANTITY");

        CheckBoxPasta1.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPasta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPasta1.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPasta1.setText("White Sauce Pasta");
        CheckBoxPasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasta1ActionPerformed(evt);
            }
        });

        CheckBoxPasta2.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPasta2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPasta2.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPasta2.setText("Red Sauce Pasta");
        CheckBoxPasta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasta2ActionPerformed(evt);
            }
        });

        CheckBoxPasta3.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPasta3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPasta3.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPasta3.setText("Pasta Basta");
        CheckBoxPasta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasta3ActionPerformed(evt);
            }
        });

        CheckBoxPasta4.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPasta4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPasta4.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPasta4.setText("Naga Pasta");
        CheckBoxPasta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasta4ActionPerformed(evt);
            }
        });

        CheckBoxPasta5.setBackground(new java.awt.Color(255, 242, 0));
        CheckBoxPasta5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckBoxPasta5.setForeground(new java.awt.Color(240, 51, 51));
        CheckBoxPasta5.setText("Classic Baked Pasta");
        CheckBoxPasta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasta5ActionPerformed(evt);
            }
        });

        PricePastaLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PricePastaLabel1.setForeground(new java.awt.Color(240, 51, 51));
        PricePastaLabel1.setText("TK  180.0");

        PricePastaLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PricePastaLabel2.setForeground(new java.awt.Color(240, 51, 51));
        PricePastaLabel2.setText("TK  180.0");

        PricePastaLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PricePastaLabel3.setForeground(new java.awt.Color(240, 51, 51));
        PricePastaLabel3.setText("TK  285.0");

        PricePastaLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PricePastaLabel4.setForeground(new java.awt.Color(240, 51, 51));
        PricePastaLabel4.setText("TK  270.0");

        PricePastaLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PricePastaLabel5.setForeground(new java.awt.Color(240, 51, 51));
        PricePastaLabel5.setText("TK  235.0");

        CountPastaNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPastaNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaNeg1ActionPerformed(evt);
            }
        });

        CountPasta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPasta1.setText("0");
        CountPasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPasta1ActionPerformed(evt);
            }
        });

        CountPastaPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPastaPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaPos1ActionPerformed(evt);
            }
        });

        CountPastaNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPastaNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaNeg2ActionPerformed(evt);
            }
        });

        CountPasta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPasta2.setText("0");

        CountPastaPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPastaPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaPos2ActionPerformed(evt);
            }
        });

        CountPastaNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPastaNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaNeg3ActionPerformed(evt);
            }
        });

        CountPasta3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPasta3.setText("0");

        CountPastaPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPastaPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaPos3ActionPerformed(evt);
            }
        });

        CountPastaNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPastaNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaNeg4ActionPerformed(evt);
            }
        });

        CountPasta4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPasta4.setText("0");

        CountPastaPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPastaPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaPos4ActionPerformed(evt);
            }
        });

        CountPastaNeg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        CountPastaNeg5.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaNeg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaNeg5ActionPerformed(evt);
            }
        });

        CountPasta5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountPasta5.setText("0");
        CountPasta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPasta5ActionPerformed(evt);
            }
        });

        CountPastaPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        CountPastaPos5.setPreferredSize(new java.awt.Dimension(25, 25));
        CountPastaPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountPastaPos5ActionPerformed(evt);
            }
        });

        ConfirmPasta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPasta1.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPasta1.setText("Confirm");
        ConfirmPasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasta1ActionPerformed(evt);
            }
        });

        ConfirmPasta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPasta2.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPasta2.setText("Confirm");
        ConfirmPasta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasta2ActionPerformed(evt);
            }
        });

        ConfirmPasta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPasta3.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPasta3.setText("Confirm");
        ConfirmPasta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasta3ActionPerformed(evt);
            }
        });

        ConfirmPasta4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPasta4.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPasta4.setText("Confirm");
        ConfirmPasta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasta4ActionPerformed(evt);
            }
        });

        ConfirmPasta5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmPasta5.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmPasta5.setText("Confirm");
        ConfirmPasta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasta5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PastaPanelLayout = new javax.swing.GroupLayout(PastaPanel);
        PastaPanel.setLayout(PastaPanelLayout);
        PastaPanelLayout.setHorizontalGroup(
            PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PastaPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createSequentialGroup()
                        .addComponent(PastaLabel)
                        .addGap(212, 212, 212)
                        .addComponent(PastaPriceLabel))
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PastaPanelLayout.createSequentialGroup()
                            .addComponent(CheckBoxPasta5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricePastaLabel5))
                        .addGroup(PastaPanelLayout.createSequentialGroup()
                            .addComponent(CheckBoxPasta4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricePastaLabel4))
                        .addGroup(PastaPanelLayout.createSequentialGroup()
                            .addComponent(CheckBoxPasta3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricePastaLabel3))
                        .addGroup(PastaPanelLayout.createSequentialGroup()
                            .addComponent(CheckBoxPasta2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricePastaLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PastaPanelLayout.createSequentialGroup()
                            .addComponent(CheckBoxPasta1)
                            .addGap(94, 94, 94)
                            .addComponent(PricePastaLabel1))))
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(PastaQuantityLabel))
                    .addGroup(PastaPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PastaPanelLayout.createSequentialGroup()
                                .addComponent(CountPastaNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPastaPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PastaPanelLayout.createSequentialGroup()
                                .addComponent(CountPastaNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPasta2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPastaPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PastaPanelLayout.createSequentialGroup()
                                .addComponent(CountPastaNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPasta3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPastaPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PastaPanelLayout.createSequentialGroup()
                                .addComponent(CountPastaNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPasta4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPastaPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PastaPanelLayout.createSequentialGroup()
                                .addComponent(CountPastaNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPasta5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountPastaPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmPasta5)
                            .addComponent(ConfirmPasta4)
                            .addComponent(ConfirmPasta3)
                            .addComponent(ConfirmPasta2)
                            .addComponent(ConfirmPasta1))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        PastaPanelLayout.setVerticalGroup(
            PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PastaPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PastaPanelLayout.createSequentialGroup()
                        .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PastaLabel)
                            .addComponent(PastaPriceLabel)
                            .addComponent(PastaQuantityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CheckBoxPasta1)
                                    .addComponent(PricePastaLabel1))
                                .addComponent(CountPastaPos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CountPasta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CountPastaNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPasta1))
                .addGap(50, 50, 50)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxPasta2)
                        .addComponent(PricePastaLabel2))
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CountPasta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmPasta2)))
                .addGap(50, 50, 50)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxPasta3)
                        .addComponent(PricePastaLabel3))
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CountPasta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmPasta3)))
                .addGap(50, 50, 50)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxPasta4)
                        .addComponent(PricePastaLabel4))
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CountPasta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmPasta4)))
                .addGap(50, 50, 50)
                .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxPasta5)
                        .addComponent(PricePastaLabel5))
                    .addGroup(PastaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CountPasta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CountPastaPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmPasta5)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        LogoPanel.add(PastaPanel, "card5");

        SidesPanel.setBackground(new java.awt.Color(255, 242, 0));

        SidesLabel.setBackground(new java.awt.Color(255, 242, 0));
        SidesLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SidesLabel.setForeground(new java.awt.Color(240, 51, 51));
        SidesLabel.setText("SIDES");

        SidesCheckBox1.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox1.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox1.setText("Cashewnut Salad");
        SidesCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox1ActionPerformed(evt);
            }
        });

        SidesCheckBox2.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox2.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox2.setText("Cheese Fries");
        SidesCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox2ActionPerformed(evt);
            }
        });

        SidesCheckBox3.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox3.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox3.setText("Chicken Lollipop");
        SidesCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox3ActionPerformed(evt);
            }
        });

        SidesCheckBox4.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox4.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox4.setText("French Fries");
        SidesCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox4ActionPerformed(evt);
            }
        });

        SidesCheckBox5.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox5.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox5.setText("Onion Rings");
        SidesCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox5ActionPerformed(evt);
            }
        });

        SidesCheckBox6.setBackground(new java.awt.Color(255, 242, 0));
        SidesCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SidesCheckBox6.setForeground(new java.awt.Color(242, 51, 51));
        SidesCheckBox6.setText("Thai Soup");
        SidesCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCheckBox6ActionPerformed(evt);
            }
        });

        SidesPriceLabel.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel.setText("PRICE");

        SidesPriceLabel1.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel1.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel1.setText("TK  250.0");

        SidesPriceLabel2.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel2.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel2.setText("TK  150.0");

        SidesPriceLabel3.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel3.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel3.setText("TK  300.0");

        SidesPriceLabel4.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel4.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel4.setText("TK  100.0");

        SidesPriceLabel5.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel5.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel5.setText("TK  150.0");

        SidesPriceLabel6.setBackground(new java.awt.Color(255, 242, 0));
        SidesPriceLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesPriceLabel6.setForeground(new java.awt.Color(240, 51, 51));
        SidesPriceLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidesPriceLabel6.setText("TK  90.0");

        SidesQuantityLabel.setBackground(new java.awt.Color(255, 242, 0));
        SidesQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SidesQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        SidesQuantityLabel.setText("QUANTITY");

        SidesCountNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg1.setToolTipText("");
        SidesCountNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg1ActionPerformed(evt);
            }
        });

        SidesCount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount1.setText("0");

        SidesCountPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos1ActionPerformed(evt);
            }
        });

        SidesCountNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg2.setToolTipText("");
        SidesCountNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg2ActionPerformed(evt);
            }
        });

        SidesCountPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos2ActionPerformed(evt);
            }
        });

        SidesCount2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount2.setText("0");

        SidesCountNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg3.setToolTipText("");
        SidesCountNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg3ActionPerformed(evt);
            }
        });

        SidesCount3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount3.setText("0");

        SidesCountPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos3ActionPerformed(evt);
            }
        });

        SidesCountNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg4.setToolTipText("");
        SidesCountNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg4ActionPerformed(evt);
            }
        });

        SidesCountPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos4ActionPerformed(evt);
            }
        });

        SidesCount4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount4.setText("0");

        SidesCountNeg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg5.setToolTipText("");
        SidesCountNeg5.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg5ActionPerformed(evt);
            }
        });

        SidesCount5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount5.setText("0");

        SidesCountPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos5.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos5ActionPerformed(evt);
            }
        });

        SidesCountNeg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        SidesCountNeg6.setToolTipText("");
        SidesCountNeg6.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountNeg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountNeg6ActionPerformed(evt);
            }
        });

        SidesCount6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SidesCount6.setText("0");

        SidesCountPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        SidesCountPos6.setPreferredSize(new java.awt.Dimension(25, 25));
        SidesCountPos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesCountPos6ActionPerformed(evt);
            }
        });

        CorfirmSides1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides1.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides1.setText("Confirm");
        CorfirmSides1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides1ActionPerformed(evt);
            }
        });

        CorfirmSides2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides2.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides2.setText("Confirm");
        CorfirmSides2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides2ActionPerformed(evt);
            }
        });

        CorfirmSides3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides3.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides3.setText("Confirm");
        CorfirmSides3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides3ActionPerformed(evt);
            }
        });

        CorfirmSides4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides4.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides4.setText("Confirm");
        CorfirmSides4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides4ActionPerformed(evt);
            }
        });

        CorfirmSides5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides5.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides5.setText("Confirm");
        CorfirmSides5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides5ActionPerformed(evt);
            }
        });

        CorfirmSides6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CorfirmSides6.setForeground(new java.awt.Color(240, 51, 51));
        CorfirmSides6.setText("Confirm");
        CorfirmSides6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorfirmSides6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidesPanelLayout = new javax.swing.GroupLayout(SidesPanel);
        SidesPanel.setLayout(SidesPanelLayout);
        SidesPanelLayout.setHorizontalGroup(
            SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidesPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SidesLabel)
                    .addComponent(SidesCheckBox1)
                    .addComponent(SidesCheckBox2)
                    .addComponent(SidesCheckBox3)
                    .addComponent(SidesCheckBox4)
                    .addComponent(SidesCheckBox5)
                    .addComponent(SidesCheckBox6))
                .addGap(78, 78, 78)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SidesPriceLabel6)
                    .addComponent(SidesPriceLabel5)
                    .addComponent(SidesPriceLabel4)
                    .addComponent(SidesPriceLabel3)
                    .addComponent(SidesPriceLabel2)
                    .addGroup(SidesPanelLayout.createSequentialGroup()
                        .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SidesPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(SidesPriceLabel))
                            .addComponent(SidesPriceLabel1))
                        .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SidesPanelLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(SidesQuantityLabel))
                            .addGroup(SidesPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(SidesPanelLayout.createSequentialGroup()
                                            .addComponent(SidesCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(SidesPanelLayout.createSequentialGroup()
                                            .addComponent(SidesCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(SidesPanelLayout.createSequentialGroup()
                                            .addComponent(SidesCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(SidesPanelLayout.createSequentialGroup()
                                            .addComponent(SidesCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SidesCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SidesCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(SidesPanelLayout.createSequentialGroup()
                                        .addComponent(SidesCountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SidesCount5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SidesCountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(SidesPanelLayout.createSequentialGroup()
                                        .addComponent(SidesCountNeg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SidesCount6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SidesCountPos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CorfirmSides6)
                                    .addComponent(CorfirmSides5)
                                    .addComponent(CorfirmSides1)
                                    .addComponent(CorfirmSides2)
                                    .addComponent(CorfirmSides3)
                                    .addComponent(CorfirmSides4))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        SidesPanelLayout.setVerticalGroup(
            SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidesPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SidesLabel)
                    .addComponent(SidesPriceLabel)
                    .addComponent(SidesQuantityLabel))
                .addGap(18, 18, 18)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox1)
                        .addComponent(SidesPriceLabel1))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CorfirmSides1)))
                .addGap(40, 40, 40)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SidesCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox2)
                        .addComponent(SidesPriceLabel2))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorfirmSides2))
                .addGap(40, 40, 40)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox3)
                        .addComponent(SidesPriceLabel3))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorfirmSides3))
                .addGap(40, 40, 40)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox4)
                        .addComponent(SidesPriceLabel4))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorfirmSides4))
                .addGap(40, 40, 40)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox5)
                        .addComponent(SidesPriceLabel5))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorfirmSides5))
                .addGap(40, 40, 40)
                .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SidesCheckBox6)
                        .addComponent(SidesPriceLabel6))
                    .addGroup(SidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SidesCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountNeg6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SidesCountPos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorfirmSides6))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        LogoPanel.add(SidesPanel, "card6");

        ShakesPanel.setBackground(new java.awt.Color(255, 242, 0));

        ShakeLabel.setBackground(new java.awt.Color(255, 242, 0));
        ShakeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ShakeLabel.setForeground(new java.awt.Color(240, 51, 51));
        ShakeLabel.setText("SHAKES");

        ShakeCheckBox1.setBackground(new java.awt.Color(255, 242, 0));
        ShakeCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShakeCheckBox1.setForeground(new java.awt.Color(240, 51, 51));
        ShakeCheckBox1.setText("DairyMilk Shake");
        ShakeCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCheckBox1ActionPerformed(evt);
            }
        });

        ShakeCheckBox2.setBackground(new java.awt.Color(255, 242, 0));
        ShakeCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShakeCheckBox2.setForeground(new java.awt.Color(240, 51, 51));
        ShakeCheckBox2.setText("KitKat Shake");
        ShakeCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCheckBox2ActionPerformed(evt);
            }
        });

        ShakeCheckBox3.setBackground(new java.awt.Color(255, 242, 0));
        ShakeCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShakeCheckBox3.setForeground(new java.awt.Color(240, 51, 51));
        ShakeCheckBox3.setText("Oreo Shake");
        ShakeCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCheckBox3ActionPerformed(evt);
            }
        });

        ShakeCheckBox4.setBackground(new java.awt.Color(255, 242, 0));
        ShakeCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShakeCheckBox4.setForeground(new java.awt.Color(240, 51, 51));
        ShakeCheckBox4.setText("Blue Lagoon");
        ShakeCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCheckBox4ActionPerformed(evt);
            }
        });

        ShakePriceLabel.setBackground(new java.awt.Color(255, 242, 0));
        ShakePriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakePriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        ShakePriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakePriceLabel.setText("PRICE");

        ShakePriceLabel1.setBackground(new java.awt.Color(255, 242, 0));
        ShakePriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakePriceLabel1.setForeground(new java.awt.Color(240, 51, 51));
        ShakePriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakePriceLabel1.setText("TK 100.0");

        ShakePriceLabel2.setBackground(new java.awt.Color(255, 242, 0));
        ShakePriceLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakePriceLabel2.setForeground(new java.awt.Color(240, 51, 51));
        ShakePriceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakePriceLabel2.setText("TK 120.0");

        ShakePriceLabel3.setBackground(new java.awt.Color(255, 242, 0));
        ShakePriceLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakePriceLabel3.setForeground(new java.awt.Color(240, 51, 51));
        ShakePriceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakePriceLabel3.setText("TK 150.0");

        ShakePriceLabel4.setBackground(new java.awt.Color(255, 242, 0));
        ShakePriceLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakePriceLabel4.setForeground(new java.awt.Color(240, 51, 51));
        ShakePriceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakePriceLabel4.setText("TK 150.0");

        ShakeQuantityLabel.setBackground(new java.awt.Color(255, 242, 0));
        ShakeQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShakeQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        ShakeQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShakeQuantityLabel.setText("QUANTITY");

        ShakeCountNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        ShakeCountNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountNeg1ActionPerformed(evt);
            }
        });

        ShakeCount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ShakeCount1.setText("0");
        ShakeCount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCount1ActionPerformed(evt);
            }
        });

        ShakeCountPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        ShakeCountPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountPos1ActionPerformed(evt);
            }
        });

        ShakeConfirm1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShakeConfirm1.setForeground(new java.awt.Color(240, 51, 51));
        ShakeConfirm1.setText("Confirm");
        ShakeConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeConfirm1ActionPerformed(evt);
            }
        });

        ShakeCountNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        ShakeCountNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountNeg2ActionPerformed(evt);
            }
        });

        ShakeCount2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ShakeCount2.setText("0");

        ShakeCountPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        ShakeCountPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountPos2ActionPerformed(evt);
            }
        });

        ShakeConfirm2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShakeConfirm2.setForeground(new java.awt.Color(240, 51, 51));
        ShakeConfirm2.setText("Confirm");
        ShakeConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeConfirm2ActionPerformed(evt);
            }
        });

        ShakeCountNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        ShakeCountNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountNeg3ActionPerformed(evt);
            }
        });

        ShakeCount3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ShakeCount3.setText("0");

        ShakeCountPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        ShakeCountPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountPos3ActionPerformed(evt);
            }
        });

        ShakeConfirm3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShakeConfirm3.setForeground(new java.awt.Color(240, 51, 51));
        ShakeConfirm3.setText("Confirm");
        ShakeConfirm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeConfirm3ActionPerformed(evt);
            }
        });

        ShakeCountNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        ShakeCountNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountNeg4ActionPerformed(evt);
            }
        });

        ShakeCount4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ShakeCount4.setText("0");

        ShakeCountPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        ShakeCountPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        ShakeCountPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeCountPos4ActionPerformed(evt);
            }
        });

        ShakeConfirm4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShakeConfirm4.setForeground(new java.awt.Color(240, 51, 51));
        ShakeConfirm4.setText("Confirm");
        ShakeConfirm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShakeConfirm4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShakesPanelLayout = new javax.swing.GroupLayout(ShakesPanel);
        ShakesPanel.setLayout(ShakesPanelLayout);
        ShakesPanelLayout.setHorizontalGroup(
            ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShakesPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShakeLabel)
                    .addComponent(ShakeCheckBox1)
                    .addComponent(ShakeCheckBox2)
                    .addComponent(ShakeCheckBox3)
                    .addComponent(ShakeCheckBox4))
                .addGap(77, 77, 77)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShakesPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ShakePriceLabel)
                        .addGap(106, 106, 106)
                        .addComponent(ShakeQuantityLabel))
                    .addGroup(ShakesPanelLayout.createSequentialGroup()
                        .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShakePriceLabel1)
                            .addComponent(ShakePriceLabel2)
                            .addComponent(ShakePriceLabel3)
                            .addComponent(ShakePriceLabel4))
                        .addGap(86, 86, 86)
                        .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShakesPanelLayout.createSequentialGroup()
                                .addComponent(ShakeCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShakesPanelLayout.createSequentialGroup()
                                .addComponent(ShakeCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShakesPanelLayout.createSequentialGroup()
                                .addComponent(ShakeCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShakesPanelLayout.createSequentialGroup()
                                .addComponent(ShakeCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShakeCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShakeConfirm4)
                            .addComponent(ShakeConfirm3)
                            .addComponent(ShakeConfirm2)
                            .addComponent(ShakeConfirm1))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        ShakesPanelLayout.setVerticalGroup(
            ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShakesPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShakeLabel)
                    .addComponent(ShakePriceLabel)
                    .addComponent(ShakeQuantityLabel))
                .addGap(40, 40, 40)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShakeCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShakeCheckBox1)
                        .addComponent(ShakePriceLabel1))
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ShakeCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeConfirm1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShakeCheckBox2)
                        .addComponent(ShakePriceLabel2))
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ShakeCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ShakeConfirm2))
                .addGap(40, 40, 40)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShakeCheckBox3)
                        .addComponent(ShakePriceLabel3))
                    .addComponent(ShakeCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShakeCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShakeCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShakeConfirm3))
                .addGap(40, 40, 40)
                .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShakeCheckBox4)
                        .addComponent(ShakePriceLabel4))
                    .addGroup(ShakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ShakeCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShakeConfirm4)))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        LogoPanel.add(ShakesPanel, "card7");

        BeveragesPanel.setBackground(new java.awt.Color(255, 242, 0));

        BvLabel.setBackground(new java.awt.Color(255, 242, 0));
        BvLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BvLabel.setForeground(new java.awt.Color(240, 51, 51));
        BvLabel.setText("BEVERAGES");

        BvCheckBox1.setBackground(new java.awt.Color(255, 242, 0));
        BvCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BvCheckBox1.setForeground(new java.awt.Color(240, 51, 51));
        BvCheckBox1.setText("Mineral Water");
        BvCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCheckBox1ActionPerformed(evt);
            }
        });

        BvCheckBox2.setBackground(new java.awt.Color(255, 242, 0));
        BvCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BvCheckBox2.setForeground(new java.awt.Color(240, 51, 51));
        BvCheckBox2.setText("Coca-Cola");
        BvCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCheckBox2ActionPerformed(evt);
            }
        });

        BvCheckBox3.setBackground(new java.awt.Color(255, 242, 0));
        BvCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BvCheckBox3.setForeground(new java.awt.Color(240, 51, 51));
        BvCheckBox3.setText("Sprite");
        BvCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCheckBox3ActionPerformed(evt);
            }
        });

        BvCheckBox4.setBackground(new java.awt.Color(255, 242, 0));
        BvCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BvCheckBox4.setForeground(new java.awt.Color(240, 51, 51));
        BvCheckBox4.setText("Mirinda");
        BvCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCheckBox4ActionPerformed(evt);
            }
        });

        BvCheckBox5.setBackground(new java.awt.Color(255, 242, 0));
        BvCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BvCheckBox5.setForeground(new java.awt.Color(240, 51, 51));
        BvCheckBox5.setText("Mountain Dew");
        BvCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCheckBox5ActionPerformed(evt);
            }
        });

        BvQuantityLabel.setBackground(new java.awt.Color(255, 242, 0));
        BvQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvQuantityLabel.setForeground(new java.awt.Color(240, 51, 51));
        BvQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvQuantityLabel.setText("QUANTITY");

        BvPriceLabel.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel.setText("PRICE");

        BvPriceLabel1.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel1.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel1.setText("TK  15.0");

        BvPriceLabel2.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel2.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel2.setText("TK  20.0");

        BvPriceLabel3.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel3.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel3.setText("TK  20.0");

        BvPriceLabel4.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel4.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel4.setText("TK  20.0");

        BvPriceLabel5.setBackground(new java.awt.Color(255, 242, 0));
        BvPriceLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BvPriceLabel5.setForeground(new java.awt.Color(240, 51, 51));
        BvPriceLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BvPriceLabel5.setText("TK  20.0");

        BvCountNeg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        BvCountNeg1.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountNeg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountNeg1ActionPerformed(evt);
            }
        });

        BvCount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BvCount1.setText("0");

        BvCountPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BvCountPos1.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountPos1ActionPerformed(evt);
            }
        });

        BvConfirm1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BvConfirm1.setForeground(new java.awt.Color(240, 51, 51));
        BvConfirm1.setText("Confirm");
        BvConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvConfirm1ActionPerformed(evt);
            }
        });

        BvCountNeg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        BvCountNeg2.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountNeg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountNeg2ActionPerformed(evt);
            }
        });

        BvCount2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BvCount2.setText("0");

        BvCountPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BvCountPos2.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountPos2ActionPerformed(evt);
            }
        });

        BvConfirm2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BvConfirm2.setForeground(new java.awt.Color(240, 51, 51));
        BvConfirm2.setText("Confirm");
        BvConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvConfirm2ActionPerformed(evt);
            }
        });

        BvCountNeg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        BvCountNeg3.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountNeg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountNeg3ActionPerformed(evt);
            }
        });

        BvCount3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BvCount3.setText("0");

        BvConfirm3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BvConfirm3.setForeground(new java.awt.Color(240, 51, 51));
        BvConfirm3.setText("Confirm");
        BvConfirm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvConfirm3ActionPerformed(evt);
            }
        });

        BvCountPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BvCountPos3.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountPos3ActionPerformed(evt);
            }
        });

        BvCountNeg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        BvCountNeg4.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountNeg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountNeg4ActionPerformed(evt);
            }
        });

        BvCount4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BvCount4.setText("0");

        BvCountPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BvCountPos4.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountPos4ActionPerformed(evt);
            }
        });

        BvConfirm4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BvConfirm4.setForeground(new java.awt.Color(240, 51, 51));
        BvConfirm4.setText("Confirm");
        BvConfirm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvConfirm4ActionPerformed(evt);
            }
        });

        BvCountNeg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.jpg"))); // NOI18N
        BvCountNeg5.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountNeg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountNeg5ActionPerformed(evt);
            }
        });

        BvCount5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BvCount5.setText("0");

        BvCountPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BvCountPos5.setPreferredSize(new java.awt.Dimension(25, 25));
        BvCountPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvCountPos5ActionPerformed(evt);
            }
        });

        BvConfirm5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BvConfirm5.setForeground(new java.awt.Color(240, 51, 51));
        BvConfirm5.setText("Confirm");
        BvConfirm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvConfirm5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BeveragesPanelLayout = new javax.swing.GroupLayout(BeveragesPanel);
        BeveragesPanel.setLayout(BeveragesPanelLayout);
        BeveragesPanelLayout.setHorizontalGroup(
            BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeveragesPanelLayout.createSequentialGroup()
                        .addComponent(BvLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BvPriceLabel)
                        .addGap(90, 90, 90)
                        .addComponent(BvQuantityLabel)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeveragesPanelLayout.createSequentialGroup()
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BvCheckBox5)
                            .addComponent(BvCheckBox4)
                            .addComponent(BvCheckBox3)
                            .addComponent(BvCheckBox2)
                            .addComponent(BvCheckBox1))
                        .addGap(83, 83, 83)
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BvPriceLabel1)
                            .addComponent(BvPriceLabel2)
                            .addComponent(BvPriceLabel3)
                            .addComponent(BvPriceLabel4)
                            .addComponent(BvPriceLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                                .addComponent(BvCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                                .addComponent(BvCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                                .addComponent(BvCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                                .addComponent(BvCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                                .addComponent(BvCountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCount5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BvCountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BvConfirm5)
                            .addComponent(BvConfirm4)
                            .addComponent(BvConfirm3)
                            .addComponent(BvConfirm2)
                            .addComponent(BvConfirm1))
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        BeveragesPanelLayout.setVerticalGroup(
            BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeveragesPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BvLabel)
                    .addComponent(BvQuantityLabel)
                    .addComponent(BvPriceLabel))
                .addGap(26, 26, 26)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BvCountPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCountNeg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvConfirm1))
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BvCheckBox1)
                        .addComponent(BvPriceLabel1)))
                .addGap(40, 40, 40)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BvCheckBox2)
                        .addComponent(BvPriceLabel2))
                    .addGroup(BeveragesPanelLayout.createSequentialGroup()
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BvCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BvCountNeg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BvCountPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BvConfirm2))
                        .addGap(9, 9, 9)))
                .addGap(40, 40, 40)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BvCheckBox3)
                        .addComponent(BvPriceLabel3))
                    .addGroup(BeveragesPanelLayout.createSequentialGroup()
                        .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BvCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BvConfirm3))
                            .addComponent(BvCountNeg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BvCountPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(40, 40, 40)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BvCheckBox4)
                        .addComponent(BvPriceLabel4))
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BvCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCountNeg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCountPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BvConfirm4))
                .addGap(40, 40, 40)
                .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BvCheckBox5)
                        .addComponent(BvPriceLabel5))
                    .addGroup(BeveragesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BvCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCountNeg5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BvCountPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BvConfirm5))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        LogoPanel.add(BeveragesPanel, "card8");

        getContentPane().add(LogoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 710, 590));

        ListHistoryPanel.setBackground(new java.awt.Color(255, 242, 0));
        ListHistoryPanel.setLayout(new java.awt.CardLayout());

        SelectedItemPanel.setBackground(new java.awt.Color(255, 242, 0));

        SelectedItemLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        SelectedItemLabel2.setForeground(new java.awt.Color(240, 51, 51));
        SelectedItemLabel2.setText("SELECTED ITEMS");

        ItemNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ItemNameLabel.setForeground(new java.awt.Color(240, 51, 51));
        ItemNameLabel.setText("ITEM NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 51, 51));
        jLabel2.setText("QUANTITY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 51, 51));
        jLabel3.setText("PRICE");

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(240, 51, 51));
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ConfirmOrderButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmOrderButton.setForeground(new java.awt.Color(240, 51, 51));
        ConfirmOrderButton.setText("Confirm Order");
        ConfirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderButtonActionPerformed(evt);
            }
        });

        TotalPriceField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalPriceField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        TotalPriceField.setText("0.0");
        TotalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPriceFieldActionPerformed(evt);
            }
        });

        TotalPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalPriceLabel.setForeground(new java.awt.Color(240, 51, 51));
        TotalPriceLabel.setText("TOTAL PRICE");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 51, 51));
        jButton1.setText("Confirm Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ItemMenu.setColumns(20);
        ItemMenu.setRows(5);
        jScrollPane1.setViewportView(ItemMenu);

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(240, 51, 51));
        NameLabel.setText("Customer Name:");

        javax.swing.GroupLayout SelectedItemPanelLayout = new javax.swing.GroupLayout(SelectedItemPanel);
        SelectedItemPanel.setLayout(SelectedItemPanelLayout);
        SelectedItemPanelLayout.setHorizontalGroup(
            SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ItemNameLabel))
                    .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectedItemPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectedItemPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectedItemPanelLayout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectedItemPanelLayout.createSequentialGroup()
                        .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                                .addComponent(ConfirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TotalPriceLabel)
                                    .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(36, 36, 36))))
            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(SelectedItemLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SelectedItemPanelLayout.setVerticalGroup(
            SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectedItemPanelLayout.createSequentialGroup()
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addGap(18, 18, 18)
                .addComponent(SelectedItemLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemNameLabel)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectedItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(ConfirmOrderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ListHistoryPanel.add(SelectedItemPanel, "card2");

        HistoryPanel.setBackground(new java.awt.Color(255, 242, 0));

        HistoryList.setColumns(20);
        HistoryList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HistoryList.setRows(5);
        jScrollPane2.setViewportView(HistoryList);

        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(240, 51, 51));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        GTotalField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GTotalField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        GTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GTotalFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 51, 51));
        jLabel1.setText("GRAND TOTAL");

        javax.swing.GroupLayout HistoryPanelLayout = new javax.swing.GroupLayout(HistoryPanel);
        HistoryPanel.setLayout(HistoryPanelLayout);
        HistoryPanelLayout.setHorizontalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HistoryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GTotalField))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Reset)
                .addGap(133, 133, 133))
        );
        HistoryPanelLayout.setVerticalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(Reset)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        ListHistoryPanel.add(HistoryPanel, "card3");

        getContentPane().add(ListHistoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, 340, 600));

        History.setBackground(new java.awt.Color(255, 242, 0));

        ItemListButton.setForeground(new java.awt.Color(240, 51, 51));
        ItemListButton.setText("Item List");
        ItemListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListButtonActionPerformed(evt);
            }
        });

        HistoryButton.setForeground(new java.awt.Color(240, 51, 51));
        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItemListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(HistoryButton)
                .addContainerGap())
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemListButton)
                    .addComponent(HistoryButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(History, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 340, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BurgerListButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerListButton4ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(BurgerPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate();
    }//GEN-LAST:event_BurgerListButton4ActionPerformed

    private void PizzaListButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaListButton2ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(PizzaPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate();
    }//GEN-LAST:event_PizzaListButton2ActionPerformed

    private void CountPizza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizza1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPizza1ActionPerformed

    private void CountPizza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizza2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPizza2ActionPerformed

    private void CountPizza3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizza3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPizza3ActionPerformed

    private void CountPizza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizza4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPizza4ActionPerformed

    private void CountPizzaNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaNeg3ActionPerformed
        if (PizzaC % 2 == 0 && flagP3 == 1) {
            CountPizza3.setText(Integer.toString(p3));
        }

        if (p3 != 0 && flagP3 == 0) {
            CountPizza3.setText(Integer.toString(--p3));
            ChickenSupreme pizza3 = new ChickenSupreme();
            y3 = y3 - pizza3.GetPrice();
            sum [7] = y3;
        }

        if (PizzaC % 2 == 0) {
            CountPizza3.setText(Integer.toString(0));
            p3 = 0;
        }
    }//GEN-LAST:event_CountPizzaNeg3ActionPerformed

    private void PastaListButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastaListButton2ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(PastaPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate(); 
    }//GEN-LAST:event_PastaListButton2ActionPerformed

    private void CountPastaNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaNeg1ActionPerformed
        if (WSPasta % 2 == 0 && flagPt1 == 1) {
            CountPasta1.setText(Integer.toString(pt1));
        }

        if (pt1 != 0 && flagPt1 == 0) {
            CountPasta1.setText(Integer.toString(--pt1));
            WhiteSaucePasta Pasta1 = new WhiteSaucePasta ();
            z1 = z1 - Pasta1.GetPrice();
            sum[9] = z1;
        }

        if (WSPasta % 2 == 0) {
            CountPasta1.setText(Integer.toString(0));
            pt1 = 0;
        }
    }//GEN-LAST:event_CountPastaNeg1ActionPerformed

    private void CountPastaNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaNeg2ActionPerformed
        if (RSPasta % 2 == 0 && flagPt2 == 1) {
            CountPasta2.setText(Integer.toString(pt2));
        }

        if (pt2 != 0 && flagPt2 == 0) {
            CountPasta2.setText(Integer.toString(--pt2));
            RedSaucePasta Pasta2 = new RedSaucePasta ();
            z2 = z2 - Pasta2.GetPrice();
            sum[10] = z2;
        }

        if (RSPasta % 2 == 0) {
            CountPasta2.setText(Integer.toString(0));
            pt2 = 0;
        }
    }//GEN-LAST:event_CountPastaNeg2ActionPerformed

    private void CountPastaNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaNeg3ActionPerformed
        if (PBasta % 2 == 0 && flagPt3 == 1) {
            CountPasta2.setText(Integer.toString(pt2));
        }

        if (pt3 != 0 && flagPt3 == 0) {
            CountPasta3.setText(Integer.toString(--pt3));
            PastaBasta Pasta3 = new PastaBasta ();
            z3 = z3 - Pasta3.GetPrice();
            sum[11] = z3;
        }

        if (PBasta % 2 == 0) {
            CountPasta3.setText(Integer.toString(0));
            pt3 = 0;
        }
    }//GEN-LAST:event_CountPastaNeg3ActionPerformed

    private void CountPastaNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaNeg4ActionPerformed
         if (NPasta % 2 == 0 && flagPt4 == 1) {
            CountPasta4.setText(Integer.toString(pt4));
        }

        if (pt4 != 0 && flagPt4 == 0) {
            CountPasta4.setText(Integer.toString(--pt4));
            NagaPasta Pasta4 = new NagaPasta ();
            z4 = z4 - Pasta4.GetPrice();
            sum[12] = z4;
        }

        if (NPasta % 2 == 0) {
            CountPasta4.setText(Integer.toString(0));
            pt4 = 0;
        }
    }//GEN-LAST:event_CountPastaNeg4ActionPerformed

    private void CountPastaNeg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaNeg5ActionPerformed
         if (BPasta % 2 == 0 && flagPt5 == 1) {
            CountPasta5.setText(Integer.toString(pt5));
        }

        if (pt5 != 0 && flagPt5 == 0) {
            CountPasta5.setText(Integer.toString(--pt5));
            ClassicBakedPasta Pasta5 = new ClassicBakedPasta ();
            z5 = z5 - Pasta5.GetPrice();
            sum[13] = z5;
        }

        if (BPasta % 2 == 0) {
            CountPasta5.setText(Integer.toString(0));
            pt5 = 0;
        }
    }//GEN-LAST:event_CountPastaNeg5ActionPerformed

    private void SidesListButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesListButton2ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(SidesPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate();
    }//GEN-LAST:event_SidesListButton2ActionPerformed

    private void CheckBoxPizza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPizza1ActionPerformed
        PizzaA++;

        if (PizzaA % 2 == 0) {
            p1 = 0;
            CountPizza1.setText(Integer.toString(p1));
        }
    }//GEN-LAST:event_CheckBoxPizza1ActionPerformed

    private void CountPizzaPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaPos1ActionPerformed
       if (flagP1 == 1 && PizzaA % 2 == 0) {
            CountPizza1.setText(Integer.toString(p1));
            p1 = 0;
        }
        else if (PizzaA % 2 != 0 && flagP1 == 0) {
            CountPizza1.setText(Integer.toString(++p1));
            BbqChicken pizza1 = new BbqChicken();
            y1 = p1 * pizza1.GetPrice();
            sum[5] = y1;
            
        }
        else if (PizzaA % 2 == 0) {
            CountPizza1.setText(Integer.toString(0));
            p1 = 0;
        }
    }//GEN-LAST:event_CountPizzaPos1ActionPerformed

    private void CountPizzaNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaNeg1ActionPerformed
          if (PizzaA % 2 == 0 && flagP1 == 1) {
            CountPizza1.setText(Integer.toString(p1));
        }

        if (p1 != 0 && flagP1 == 0) {
            CountPizza1.setText(Integer.toString(--p1));
            BbqChicken pizza1 = new BbqChicken();
            y1 = y1 - pizza1.GetPrice();
            sum [5] = y1;
        }

        if (PizzaA % 2 == 0) {
            CountPizza1.setText(Integer.toString(0));
            p1 = 0;
        }
    }//GEN-LAST:event_CountPizzaNeg1ActionPerformed

    private void ConfirmPizza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPizza1ActionPerformed
          if (PizzaA % 2 != 0 && flagP1 == 0 && p1 != 0) {
            ItemMenu.append(" Chicken BBQ                                       " + p1 + "                      " + y1 + "\n");
            flagP1 = 1;
        }
        if (flagP1 == 1) {
            CountPizza1.setText(Integer.toString(p1));
            CheckBoxPizza1.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPizza1ActionPerformed

    private void ShakesListButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakesListButton2ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(ShakesPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate();
    }//GEN-LAST:event_ShakesListButton2ActionPerformed

    private void BeveragesButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeveragesButton2ActionPerformed
        LogoPanel.removeAll();
        LogoPanel.add(BeveragesPanel);
        LogoPanel.repaint();
        LogoPanel.revalidate();
    }//GEN-LAST:event_BeveragesButton2ActionPerformed

    private void BvCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCheckBox2ActionPerformed
        CC++;

        if (CC % 2 == 0 && flagBv2 == 0) {
            bv2 = 0;
            BvCount2.setText(Integer.toString(bv2));
        }
        if (CC % 2 == 0 && flagBv2 == 1) {
            BvCount2.setText(Integer.toString(bv2));
        }
    }//GEN-LAST:event_BvCheckBox2ActionPerformed

    private void BvCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCheckBox3ActionPerformed
        Spr++;

        if (Spr % 2 == 0 && flagBv3 == 0) {
            bv3 = 0;
            BvCount3.setText(Integer.toString(bv3));
        }
        if (Spr % 2 == 0 && flagBv3 == 1) {
            BvCount3.setText(Integer.toString(bv3));
        }
    }//GEN-LAST:event_BvCheckBox3ActionPerformed

    private void BvCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCheckBox4ActionPerformed
        Miri++;

        if (Miri % 2 == 0 && flagBv4 == 0) {
            bv4 = 0;
            BvCount4.setText(Integer.toString(bv4));
        }
        if (Miri % 2 == 0 && flagBv4 == 1) {
            BvCount4.setText(Integer.toString(bv4));
        }
    }//GEN-LAST:event_BvCheckBox4ActionPerformed

    private void BvCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCheckBox5ActionPerformed
        MD++;

        if (MD % 2 == 0 && flagBv5 == 0) {
            bv5 = 0;
            BvCount5.setText(Integer.toString(bv5));
        }
        if (MD % 2 == 0 && flagBv5 == 1) {
            BvCount5.setText(Integer.toString(bv5));
        }
    }//GEN-LAST:event_BvCheckBox5ActionPerformed

    private void ConfirmButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton5ActionPerformed
        if (FBurger % 2 != 0 && flag5 == 0 && a5 != 0) {
            ItemMenu.append(" Fish Burger                                         " + a5 + "                      " + x5 + "\n");
            flag5 = 1;
            x5 = 0;
        }
        if (flag5 == 1) {
            CheckBox5.setEnabled(false);
            Count5.setText(Integer.toString(a5));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmButton5ActionPerformed

    private void ConfirmButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton4ActionPerformed
        if (CCDelight % 2 != 0 && flag4 == 0 && a4 != 0) {
            ItemMenu.append(" Chicken Cheese Delight                  " + a4 + "                      " + x4 + "\n");
            flag4 = 1;
            x4 = 0;
        }
        if (flag4 == 1) {
            CheckBox4.setEnabled(false);
            Count4.setText(Integer.toString(a4));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmButton4ActionPerformed

    private void ConfirmButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton3ActionPerformed
        if (BCDelight % 2 != 0 && flag3 == 0 && a3 != 0) {
            ItemMenu.append(" Beef Cheese Delight                         " + a3 + "                     " + x3 + "\n");
            flag3 = 1;
            x3 = 0;
        }
        if (flag3 == 1) {
            CheckBox3.setEnabled(false);
            Count3.setText(Integer.toString(a3));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmButton3ActionPerformed

    private void ConfirmButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton2ActionPerformed
        if (CCBurger % 2 != 0 && flag2 == 0 && a2 != 0) {
            ItemMenu.append(" Chicken Cheese Burger                   " + a2 + "                     " + x2 + "\n");
            flag2 = 1;
            x2 = 0;
        }
        if (flag2 == 1) {
            CheckBox2.setEnabled(false);
            Count2.setText(Integer.toString(a2));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmButton2ActionPerformed

    private void ConfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton1ActionPerformed
        if (BCBurger % 2 != 0 && flag1 == 0 && a1 != 0) {
            ItemMenu.append(" Beef Cheese Burger                          " + a1 + "                     " + x1 + "\n");
            flag1 = 1;
        }
        if (flag1 == 1) {
            CheckBox1.setEnabled(false);
            Count1.setText(Integer.toString(a1));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmButton1ActionPerformed

    private void CountPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPos5ActionPerformed
        if (FBurger % 2 != 0) {
            Count5.setText(Integer.toString(++a5));
            FishBurger burger5 = new FishBurger();
            x5 = a5 * burger5.GetPrice();
            sum[4] = x5;
        }

        if (FBurger % 2 == 0) {
            Count1.setText(Integer.toString(0));
            a5 = 0;
        }
    }//GEN-LAST:event_CountPos5ActionPerformed

    private void Count5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Count5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Count5ActionPerformed

    private void CountNeg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountNeg5ActionPerformed
         if (FBurger % 2 == 0 && flag5 == 1) {
            Count1.setText(Integer.toString(a3));
        }

        if (a5 != 0 && flag5 == 0) {
            Count5.setText(Integer.toString(--a5));
            FishBurger burger5 = new FishBurger();
            x5 = x5 - burger5.GetPrice();
            sum [4] = x5;
        }

        if (FBurger % 2 == 0) {
            Count5.setText(Integer.toString(0));
            a5 = 0;
        }
    }//GEN-LAST:event_CountNeg5ActionPerformed

    private void CheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox5ActionPerformed
        FBurger++;

        if (FBurger % 2 == 0) {
            a5 = 0;
            Count5.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBox5ActionPerformed

    private void CountPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPos4ActionPerformed
        if (CCDelight % 2 != 0) {
            Count4.setText(Integer.toString(++a4));
            ChickenCheeseDelight burger1 = new ChickenCheeseDelight();
            x4 = a4 * burger1.GetPrice();
            sum[3] = x4;
        }

        if (CCDelight % 2 == 0) {
            Count4.setText(Integer.toString(0));
            a4 = 0;
        }
    }//GEN-LAST:event_CountPos4ActionPerformed

    private void Count4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Count4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Count4ActionPerformed

    private void CountNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountNeg4ActionPerformed
         if (CCDelight % 2 == 0 && flag4 == 1) {
            Count4.setText(Integer.toString(a4));
        }

        if (a4 != 0 && flag4 == 0) {
            Count4.setText(Integer.toString(--a4));
            ChickenCheeseDelight burger3 = new ChickenCheeseDelight();
            x4 = x4 - burger3.GetPrice();
            sum [3] = x4;
        }

        if (CCDelight % 2 == 0) {
            Count4.setText(Integer.toString(0));
            a4 = 0;
        }
    }//GEN-LAST:event_CountNeg4ActionPerformed

    private void CheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox4ActionPerformed
        CCDelight++;

        if (BCDelight % 2 == 0) {
            a4 = 0;
            Count4.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBox4ActionPerformed

    private void CountPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPos3ActionPerformed
        if (BCDelight % 2 != 0) {
            Count3.setText(Integer.toString(++a3));
            BeefCheeseDelight burger3 = new BeefCheeseDelight();
            x3 = a3 * burger3.GetPrice();
            sum[2] = x3;
            
        }

        if (BCDelight % 2 == 0) {
            Count3.setText(Integer.toString(0));
            a3 = 0;
        }
    }//GEN-LAST:event_CountPos3ActionPerformed

    private void Count3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Count3ActionPerformed

    }//GEN-LAST:event_Count3ActionPerformed

    private void CountNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountNeg3ActionPerformed
        if (BCDelight % 2 == 0 && flag3 == 1) {
            Count1.setText(Integer.toString(a3));
        }

        if (a3 != 0 && flag3 == 0) {
            Count3.setText(Integer.toString(--a3));
            BeefCheeseDelight burger3 = new BeefCheeseDelight();
            x3 = x3 - burger3.GetPrice();
            sum [2] = x3;
        }

        if (BCDelight % 2 == 0) {
            Count3.setText(Integer.toString(0));
            a3 = 0;
        }
    }//GEN-LAST:event_CountNeg3ActionPerformed

    private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
        BCDelight++;

        if (BCDelight % 2 == 0) {
            a3 = 0;
            Count3.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBox3ActionPerformed

    private void CountPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPos2ActionPerformed
        if (CCBurger % 2 != 0) {
            Count2.setText(Integer.toString(++a2));
            ChickenCheeseBurger burger2 = new ChickenCheeseBurger();
            x2 = a2 * burger2.GetPrice();
            sum [1] = x2;
        }

        if (CCBurger % 2 == 0) {
            Count2.setText(Integer.toString(0));
            a2 = 0;
        }
    }//GEN-LAST:event_CountPos2ActionPerformed

    private void CountNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountNeg2ActionPerformed
        if (CCBurger % 2 == 0 && flag2 == 1) {
            Count2.setText(Integer.toString(a2));
        }

        if (a2 != 0 && flag2 == 0) {
            Count2.setText(Integer.toString(--a2));
            ChickenCheeseBurger burger2 = new ChickenCheeseBurger();
            x2 = x2 - burger2.GetPrice();
            sum [1] = x2;
        }

        if (CCBurger % 2 == 0) {
            Count2.setText(Integer.toString(0));
            a2 = 0;
        }
    }//GEN-LAST:event_CountNeg2ActionPerformed

    private void Count2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Count2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Count2ActionPerformed

    private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        CCBurger++;

        if (CCBurger % 2 == 0) {
            a2 = 0;
            Count2.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBox2ActionPerformed

    private void CountPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPos1ActionPerformed
        if (flag1 == 1 && BCBurger % 2 == 0) {
            Count1.setText(Integer.toString(a1));
            a1 = 0;
        }
        else if (BCBurger % 2 != 0 && flag1 == 0) {
            Count1.setText(Integer.toString(++a1));
            BeefCheeseBurger burger1 = new BeefCheeseBurger();
            x1 = a1 * burger1.GetPrice();
            sum[0] = x1;
            
        }
        else if (BCBurger % 2 == 0) {
            Count1.setText(Integer.toString(0));
            a1 = 0;
        }
    }//GEN-LAST:event_CountPos1ActionPerformed

    private void Count1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Count1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Count1ActionPerformed

    private void CountNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountNeg1ActionPerformed
        if (BCBurger % 2 == 0 && flag1 == 1) {
            Count1.setText(Integer.toString(a1));
        }

        if (a1 != 0 && flag1 == 0) {
            Count1.setText(Integer.toString(--a1));
            BeefCheeseBurger burger1 = new BeefCheeseBurger();
            x1 = x1 - burger1.GetPrice();
            sum [0] = x1;
        }

        if (BCBurger % 2 == 0) {
            Count1.setText(Integer.toString(0));
            a1 = 0;
        }
    }//GEN-LAST:event_CountNeg1ActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        BCBurger++;

        if (BCBurger % 2 == 0) {
            a1 = 0;
            Count1.setText(Integer.toString(a1));
        }
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void CheckBoxPasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasta1ActionPerformed
         WSPasta++;

        if (WSPasta % 2 == 0) {
            pt1 = 0;
            CountPasta1.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBoxPasta1ActionPerformed

    private void CheckBoxPasta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasta2ActionPerformed
        RSPasta++;

        if (RSPasta % 2 == 0) {
            pt2 = 0;
            CountPasta2.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBoxPasta2ActionPerformed

    private void CheckBoxPasta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasta3ActionPerformed
       PBasta++;

        if (PBasta % 2 == 0) {
            pt3 = 0;
            CountPasta3.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBoxPasta3ActionPerformed

    private void CheckBoxPasta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasta4ActionPerformed
        NPasta++;

        if (NPasta % 2 == 0) {
            pt4 = 0;
            CountPasta4.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBoxPasta4ActionPerformed

    private void CheckBoxPasta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasta5ActionPerformed
        BPasta++;

        if (BPasta % 2 == 0) {
            pt5 = 0;
            CountPasta5.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_CheckBoxPasta5ActionPerformed

    private void CountPasta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPasta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPasta5ActionPerformed

    private void CountPasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPasta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountPasta1ActionPerformed

    private void ConfirmPasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasta1ActionPerformed
         if (WSPasta % 2 != 0 && flagPt1 == 0 && pt1 != 0) {
            ItemMenu.append(" White Sauce Pasta                            " + pt1 + "                      " + z1 + "\n");
            flagPt1 = 1;
        }
        if (flagPt1 == 1) {
            CheckBoxPasta1.setEnabled(false);
            CountPasta1.setText(Integer.toString(pt1));
        }
         else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPasta1ActionPerformed

    private void CountPastaPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaPos1ActionPerformed
         if (flagPt1 == 1 && WSPasta % 2 == 0) {
            CountPasta1.setText(Integer.toString(pt1));
            pt1 = 0;
        }
        else if (WSPasta % 2 != 0 && flagPt1 == 0) {
            CountPasta1.setText(Integer.toString(++pt1));
            WhiteSaucePasta Pasta1 = new WhiteSaucePasta();
            z1 = pt1 * Pasta1.GetPrice();
            sum[9] = z1;
            
        }
        else if (WSPasta % 2 == 0) {
            CountPasta1.setText(Integer.toString(0));
            pt1 = 0;
        }
    }//GEN-LAST:event_CountPastaPos1ActionPerformed

    private void CountPastaPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaPos2ActionPerformed
         if (flagPt2 == 1 && RSPasta % 2 == 0) {
            CountPasta2.setText(Integer.toString(pt2));
            pt2 = 0;
        }
        else if (RSPasta % 2 != 0 && flagPt2 == 0) {
            CountPasta2.setText(Integer.toString(++pt2));
            RedSaucePasta Pasta2 = new RedSaucePasta();
            z2 = pt2 * Pasta2.GetPrice();
            sum[10] = z2;
            
        }
        else if (RSPasta % 2 == 0) {
            CountPasta2.setText(Integer.toString(0));
            pt2 = 0;
        }
    }//GEN-LAST:event_CountPastaPos2ActionPerformed

    private void CountPastaPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaPos3ActionPerformed
          if (flagPt3 == 1 && PBasta % 2 == 0) {
            CountPasta3.setText(Integer.toString(pt3));
            pt3 = 0;
        }
        else if (PBasta % 2 != 0 && flagPt3 == 0) {
            CountPasta3.setText(Integer.toString(++pt3));
            PastaBasta Pasta3 = new PastaBasta();
            z3 = pt3 * Pasta3.GetPrice();
            sum[11] = z3;
            
        }
        else if (PBasta % 2 == 0) {
            CountPasta3.setText(Integer.toString(0));
            pt3 = 0;
        }
    }//GEN-LAST:event_CountPastaPos3ActionPerformed

    private void CountPastaPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaPos4ActionPerformed
         if (flagPt4 == 1 && NPasta % 2 == 0) {
            CountPasta4.setText(Integer.toString(pt4));
            pt1 = 0;
        }
        else if (NPasta % 2 != 0 && flagPt4 == 0) {
            CountPasta4.setText(Integer.toString(++pt4));
            NagaPasta Pasta4 = new NagaPasta();
            z4 = pt4 * Pasta4.GetPrice();
            sum[12] = z4;
            
        }
        else if (NPasta % 2 == 0) {
            CountPasta4.setText(Integer.toString(0));
            pt4 = 0;
        }
    }//GEN-LAST:event_CountPastaPos4ActionPerformed

    private void CountPastaPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPastaPos5ActionPerformed
         if (flagPt5 == 1 && BPasta % 2 == 0) {
            CountPasta5.setText(Integer.toString(pt5));
            pt5 = 0;
        }
        else if (BPasta % 2 != 0 && flagPt5 == 0) {
            CountPasta5.setText(Integer.toString(++pt5));
            ClassicBakedPasta Pasta5 = new ClassicBakedPasta();
            z5 = pt5 * Pasta5.GetPrice();
            sum[13] = z5;
            
        }
        else if (BPasta % 2 == 0) {
            CountPasta5.setText(Integer.toString(0));
            pt5 = 0;
        }
    }//GEN-LAST:event_CountPastaPos5ActionPerformed

    private void ConfirmPasta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasta2ActionPerformed
          if (RSPasta % 2 != 0 && flagPt2 == 0 && pt2 != 0) {
            ItemMenu.append("Red Sauce Pasta                                " + pt2 + "                     " + z2 + "\n");
            flagPt2 = 1;
        }
        if (flagPt2 == 1) {
            CheckBoxPasta2.setEnabled(false);
            CountPasta2.setText(Integer.toString(pt2));
        }
         else {
            ItemSelect.main(null);
        }
        
    }//GEN-LAST:event_ConfirmPasta2ActionPerformed

    private void ConfirmPasta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasta3ActionPerformed
         if (PBasta % 2 != 0 && flagPt3 == 0 && pt3 != 0) {
            ItemMenu.append(" Pasta Basta                                        " + pt3 + "                      " + z3 + "\n");
            flagPt3 = 1;
        }
        if (flagPt3 == 1) {
            CheckBoxPasta3.setEnabled(false);
            CountPasta3.setText(Integer.toString(pt3));
        }
         else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPasta3ActionPerformed

    private void ConfirmPasta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasta4ActionPerformed
          if (NPasta % 2 != 0 && flagPt4 == 0 && pt4 != 0) {
            ItemMenu.append(" Naga Pasta                                        " + pt4 + "                       " + z4 + "\n");
            flagPt4 = 1;
        }
        if (flagPt4 == 1) {
            CheckBoxPasta4.setEnabled(false);
            CountPasta4.setText(Integer.toString(pt4));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPasta4ActionPerformed

    private void ConfirmPasta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasta5ActionPerformed
          if (BPasta % 2 != 0 && flagPt5 == 0 && pt5 != 0) {
            ItemMenu.append("Classic Baked Pasta                         " + pt5 + "                      " + z5 + "\n");
            flagPt5 = 1;
        }
        if (flagPt5 == 1) {
            CheckBoxPasta5.setEnabled(false);
            CountPasta5.setText(Integer.toString(pt5));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPasta5ActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        if (cOrder == 0) {         
            Zero ();
            for (int i = 0; i < sum.length; i++) {
                sum[i] = 0;
            }
        }

    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ConfirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderButtonActionPerformed
        if (ItemMenu.getText().isEmpty() || NameField.getText().isEmpty()) {
            WARNING.main(null);
        } 
        else if (cOrder == 0 && (!ItemMenu.getText().isEmpty() && !NameField.getText().isEmpty())) {
            NotZero ();
            GetPrice();
            cOrder = 1;
        }
    }//GEN-LAST:event_ConfirmOrderButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        
        ListHistoryPanel.removeAll();
        ListHistoryPanel.add(HistoryPanel);
        ListHistoryPanel.repaint();
        ListHistoryPanel.revalidate();
        
        try {
            FileReader fr = new FileReader("info.txt");
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> arr = new ArrayList<String>();
            double total = 0;

            while (true) {
                
                String s1 = br.readLine();
                
                if (s1 == null) {
                    break;
                }

                String s2 = br.readLine();
                arr.add("Name:  " + s1 + "\t               Paid Amount:  " + s2 + "TK");
                total += Double.valueOf(s2);

            }
            
            String InfoList = "";
            
            for (int i = 0; i < arr.size(); i++) {
                InfoList += arr.get(i) + "\n";
            }

            HistoryList.setText(InfoList);
            GTotalField.setText(String.valueOf(total + " TK"));

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void ItemListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListButtonActionPerformed
        ListHistoryPanel.removeAll();
        ListHistoryPanel.add(SelectedItemPanel);
        ListHistoryPanel.repaint();
        ListHistoryPanel.revalidate();
    }//GEN-LAST:event_ItemListButtonActionPerformed

    private void TotalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPriceFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cOrder == 1 && (!"0.0".equals(TotalPriceField.getText()))) {
            
            ReadFile();
            
            PaymentFrame.main (null);
            
            Zero ();
            
            for (int i = 0; i < sum.length; i++) {
                sum[i] = 0;
            }
        }
        else {
           OrderConfirm.main(null);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BvConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvConfirm1ActionPerformed
        if (MW % 2 != 0 && flagBv1 == 0 && bv1 != 0) {
            ItemMenu.append(" Mineral Water                                      " + bv1 + "                       " + b1 + "\n");
            flagBv1 = 1;
        }
        if (flagBv1 == 1) {
            BvCount1.setText(Integer.toString(bv1));
            BvCheckBox1.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_BvConfirm1ActionPerformed

    private void SidesCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox1ActionPerformed
        CNSalad++;

        if (CNSalad % 2 == 0) {
            sd1 = 0;
            SidesCount1.setText(Integer.toString(sd1));
        }
    }//GEN-LAST:event_SidesCheckBox1ActionPerformed

    private void SidesCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox2ActionPerformed
            ChFries++;

        if (ChFries % 2 == 0) {
            sd2 = 0;
            SidesCount2.setText(Integer.toString(sd2));
        }
    }//GEN-LAST:event_SidesCheckBox2ActionPerformed

    private void SidesCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox3ActionPerformed
            ChLoli++;

        if (ChLoli % 2 == 0) {
            sd3 = 0;
            SidesCount3.setText(Integer.toString(sd3));
        }
    }//GEN-LAST:event_SidesCheckBox3ActionPerformed

    private void SidesCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox4ActionPerformed
             FFries++;

        if (FFries % 2 == 0) {
            sd4 = 0;
            SidesCount4.setText(Integer.toString(sd4));
        }
    }//GEN-LAST:event_SidesCheckBox4ActionPerformed

    private void SidesCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox5ActionPerformed
        ORings++;

        if (ORings % 2 == 0) {
            sd5 = 0;
            SidesCount5.setText(Integer.toString(sd5));
        }
    }//GEN-LAST:event_SidesCheckBox5ActionPerformed

    private void SidesCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCheckBox6ActionPerformed
        TSoup++;

        if (TSoup % 2 == 0) {
            sd6 = 0;
            SidesCount6.setText(Integer.toString(sd6));
        }
    }//GEN-LAST:event_SidesCheckBox6ActionPerformed

    private void SidesCountNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg1ActionPerformed
        if (CNSalad % 2 == 0 && flagSd1 == 1) {
            SidesCount1.setText(Integer.toString(sd1));
        }

        if (sd1 != 0 && flagSd1 == 0) {
            SidesCount1.setText(Integer.toString(--sd1));
            CashewnutSalad sides1 = new CashewnutSalad();
            s1 = s1 - sides1.GetPrice();
            sum [14] = s1;
        }

        if (CNSalad % 2 == 0) {
            SidesCount1.setText(Integer.toString(0));
            sd1 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg1ActionPerformed

    private void SidesCountNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg2ActionPerformed
        if (ChFries % 2 == 0 && flagSd2 == 1) {
            SidesCount2.setText(Integer.toString(sd2));
        }

        if (sd2 != 0 && flagSd2 == 0) {
            SidesCount2.setText(Integer.toString(--sd2));
            CheeseFries sides2 = new CheeseFries();
            s2 = s2 - sides2.GetPrice();
            sum [15] = s2;
        }

        if (ChFries % 2 == 0) {
            SidesCount2.setText(Integer.toString(0));
            sd2 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg2ActionPerformed

    private void SidesCountNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg3ActionPerformed
         if (ChLoli % 2 == 0 && flagSd3 == 1) {
            SidesCount3.setText(Integer.toString(sd3));
        }

        if (sd3 != 0 && flagSd3 == 0) {
            SidesCount3.setText(Integer.toString(--sd3));
            ChickenLollipop sides3 = new ChickenLollipop();
            s3 = s3 - sides3.GetPrice();
            sum [16] = s3;
        }

        if (ChLoli % 2 == 0) {
            SidesCount3.setText(Integer.toString(0));
            sd3 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg3ActionPerformed

    private void SidesCountNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg4ActionPerformed
         if (FFries % 2 == 0 && flagSd4 == 1) {
            SidesCount4.setText(Integer.toString(sd4));
        }

        if (sd4 != 0 && flagSd4 == 0) {
            SidesCount4.setText(Integer.toString(--sd4));
            FrenchFries sides4 = new FrenchFries();
            s4 = s4 - sides4.GetPrice();
            sum [17] = s4;
        }

        if (FFries % 2 == 0) {
            SidesCount4.setText(Integer.toString(0));
            sd4 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg4ActionPerformed

    private void SidesCountNeg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg5ActionPerformed
         if (ORings % 2 == 0 && flagSd5 == 1) {
            SidesCount5.setText(Integer.toString(sd5));
        }

        if (sd5 != 0 && flagSd5 == 0) {
            SidesCount5.setText(Integer.toString(--sd5));
            OnionRings sides5 = new OnionRings();
            s5 = s5 - sides5.GetPrice();
            sum [18] = s5;
        }

        if (ORings % 2 == 0) {
            SidesCount5.setText(Integer.toString(0));
            sd5 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg5ActionPerformed

    private void SidesCountNeg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountNeg6ActionPerformed
         if (TSoup % 2 == 0 && flagSd6 == 1) {
            SidesCount6.setText(Integer.toString(sd6));
        }

        if (sd6 != 0 && flagSd6 == 0) {
            SidesCount6.setText(Integer.toString(--sd6));
            ThaiSoup sides6 = new ThaiSoup();
            s6 = s6 - sides6.GetPrice();
            sum [19] = s6;
        }

        if (TSoup % 2 == 0) {
            SidesCount6.setText(Integer.toString(0));
            sd6 = 0;
        }
    }//GEN-LAST:event_SidesCountNeg6ActionPerformed

    private void SidesCountPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos1ActionPerformed
         if (flagSd1 == 1 && CNSalad % 2 == 0) {
            SidesCount1.setText(Integer.toString(sd1));
            sd1 = 0;
        }
        else if (CNSalad % 2 != 0 && flagSd1 == 0) {
            SidesCount1.setText(Integer.toString(++sd1));
            CashewnutSalad sides1 = new CashewnutSalad();
            s1 = sd1 * sides1.GetPrice();
            sum[14] = s1;
            
        }
        else if (CNSalad % 2 == 0) {
            SidesCount1.setText(Integer.toString(0));
            sd1 = 0;
        }
    }//GEN-LAST:event_SidesCountPos1ActionPerformed

    private void SidesCountPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos2ActionPerformed
         if (flagSd2 == 1 && ChFries % 2 == 0) {
            SidesCount2.setText(Integer.toString(sd2));
            sd2 = 0;
        }
        else if (ChFries % 2 != 0 && flagSd2 == 0) {
            SidesCount2.setText(Integer.toString(++sd2));
            CheeseFries sides2 = new CheeseFries();
            s2 = sd2 * sides2.GetPrice();
            sum[15] = s2;
            
        }
        else if (ChFries % 2 == 0) {
            SidesCount2.setText(Integer.toString(0));
            sd2 = 0;
        }
    }//GEN-LAST:event_SidesCountPos2ActionPerformed

    private void SidesCountPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos3ActionPerformed
       if (flagSd3 == 1 && ChLoli % 2 == 0) {
            SidesCount3.setText(Integer.toString(sd3));
            sd3 = 0;
        }
        else if (ChLoli % 2 != 0 && flagSd3 == 0) {
            SidesCount3.setText(Integer.toString(++sd3));
            ChickenLollipop sides3 = new ChickenLollipop();
            s3 = sd3 * sides3.GetPrice();
            sum[16] = s3;
            
        }
        else if (ChLoli % 2 == 0) {
            SidesCount3.setText(Integer.toString(0));
            sd3 = 0;
        }
    }//GEN-LAST:event_SidesCountPos3ActionPerformed

    private void SidesCountPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos4ActionPerformed
        if (flagSd4 == 1 && FFries % 2 == 0) {
            SidesCount4.setText(Integer.toString(sd4));
            sd4 = 0;
        }
        else if (FFries % 2 != 0 && flagSd4 == 0) {
            SidesCount4.setText(Integer.toString(++sd4));
            FrenchFries sides4 = new FrenchFries();
            s4 = sd4 * sides4.GetPrice();
            sum[17] = s4;
            
        }
        else if (FFries % 2 == 0) {
            SidesCount4.setText(Integer.toString(0));
            sd4 = 0;
        }
    }//GEN-LAST:event_SidesCountPos4ActionPerformed

    private void SidesCountPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos5ActionPerformed
        if (flagSd5 == 1 && ORings % 2 == 0) {
            SidesCount5.setText(Integer.toString(sd5));
            sd5 = 0;
        }
        else if (ORings % 2 != 0 && flagSd5 == 0) {
            SidesCount5.setText(Integer.toString(++sd5));
            OnionRings sides5 = new OnionRings();
            s5 = sd5 * sides5.GetPrice();
            sum[18] = s5;
            
        }
        else if (ORings % 2 == 0) {
            SidesCount5.setText(Integer.toString(0));
            sd5 = 0;
        }
    }//GEN-LAST:event_SidesCountPos5ActionPerformed

    private void SidesCountPos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesCountPos6ActionPerformed
        if (flagSd6 == 1 && TSoup % 2 == 0) {
            SidesCount6.setText(Integer.toString(sd6));
            sd6 = 0;
        }
        else if (TSoup % 2 != 0 && flagSd6 == 0) {
            SidesCount6.setText(Integer.toString(++sd6));
            ThaiSoup sides6 = new ThaiSoup();
            s6 = sd6 * sides6.GetPrice();
            sum[19] = s6;
            
        }
        else if (TSoup % 2 == 0) {
            SidesCount6.setText(Integer.toString(0));
            sd6 = 0;
        }
    }//GEN-LAST:event_SidesCountPos6ActionPerformed

    private void CorfirmSides1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides1ActionPerformed
        if (CNSalad % 2 != 0 && flagSd1 == 0 && sd1 != 0) {
            ItemMenu.append(" Cashewnut Salad                              " + sd1 + "                      " + s1 + "\n");
            flagSd1 = 1;
        }
        if (flagSd1 == 1) {
            SidesCheckBox1.setEnabled(false);
            SidesCount1.setText(Integer.toString(sd1));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides1ActionPerformed

    private void CorfirmSides2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides2ActionPerformed
        if (ChFries % 2 != 0 && flagSd2 == 0 && sd2 != 0) {
            ItemMenu.append("Cheese Fries                                       " + sd2 + "                     " + s2 + "\n");
            flagSd2 = 1;
        }
        if (flagSd2 == 1) {
            SidesCheckBox2.setEnabled(false);
            SidesCount2.setText(Integer.toString(sd2));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides2ActionPerformed

    private void CorfirmSides3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides3ActionPerformed
        if (ChLoli % 2 != 0 && flagSd3 == 0 && sd3 != 0) {
            ItemMenu.append(" Chicken Lollipop                                " + sd3 + "                      " + s3 + "\n");
            flagSd3 = 1;
        }
        if (flagSd3 == 1) {
            SidesCheckBox3.setEnabled(false);
            SidesCount3.setText(Integer.toString(sd3));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides3ActionPerformed

    private void CorfirmSides4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides4ActionPerformed
        if (FFries % 2 != 0 && flagSd4 == 0 && sd4 != 0) {
            ItemMenu.append(" French Fries                                        " + sd4 + "                     " + s4 + "\n");
            flagSd4 = 1;
        }
        if (flagSd4 == 1) {
            SidesCheckBox4.setEnabled(false);
            SidesCount4.setText(Integer.toString(sd4));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides4ActionPerformed

    private void CorfirmSides5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides5ActionPerformed
        if (ORings % 2 != 0 && flagSd5 == 0 && sd5 != 0) {
            ItemMenu.append(" Onion Rings                                       " + sd5 + "                      " + s5 + "\n");
            flagSd5 = 1;
        }
        if (flagSd5 == 1) {
            SidesCheckBox5.setEnabled(false);
            SidesCount5.setText(Integer.toString(sd5));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides5ActionPerformed

    private void CorfirmSides6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorfirmSides6ActionPerformed
        if (TSoup % 2 != 0 && flagSd6 == 0 && sd6 != 0) {
            ItemMenu.append(" Thai Soup                                            " + sd6 + "                       " + s6 + "\n");
            flagSd6 = 1;
        }
        if (flagSd6 == 1) {
            SidesCheckBox6.setEnabled(false);
            SidesCount6.setText(Integer.toString(sd6));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_CorfirmSides6ActionPerformed

    private void ShakeConfirm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeConfirm3ActionPerformed
        if (OS % 2 != 0 && flagSh3 == 0 && sh3 != 0) {
            ItemMenu.append(" Oreo Shake                                         " + sh3 + "                      " + h3 + "\n");
            flagSh3 = 1;
        }
        if (flagSh3 == 1) {
            ShakeCount3.setText(Integer.toString(sh3));
            ShakeCheckBox3.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ShakeConfirm3ActionPerformed

    private void ShakeCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCheckBox1ActionPerformed
         DMS++;

        if (DMS % 2 == 0 && flagSh1 == 0) {
            sh1 = 0;
            ShakeCount1.setText(Integer.toString(sh1));
        }
        if (DMS % 2 == 0 && flagSh1 == 1) {
            ShakeCount1.setText(Integer.toString(sh1));
        }
    }//GEN-LAST:event_ShakeCheckBox1ActionPerformed

    private void ShakeCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCheckBox2ActionPerformed
         KKS++;

        if (KKS % 2 == 0 && flagSh2 == 0) {
            sh2 = 0;
            ShakeCount2.setText(Integer.toString(sh2));
        }
        if (KKS % 2 == 0 && flagSh2 == 1) {
            ShakeCount2.setText(Integer.toString(sh2));
        }
    }//GEN-LAST:event_ShakeCheckBox2ActionPerformed

    private void ShakeCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCheckBox3ActionPerformed
         OS++;

        if (OS % 2 == 0  && flagSh3 == 0) {
            sh3 = 0;
            ShakeCount3.setText(Integer.toString(sh3));
        }
        if (OS % 2 == 0  && flagSh3 == 0) {
            ShakeCount3.setText(Integer.toString(sh3));
        }
    }//GEN-LAST:event_ShakeCheckBox3ActionPerformed

    private void ShakeCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCheckBox4ActionPerformed
         BL++;

        if (BL % 2 == 0 && flagSh4 == 0) {
            sh4 = 0;
            ShakeCount4.setText(Integer.toString(sh4));
        }
        if (BL % 2 == 0 && flagSh4 == 0) {
            sh4 = 0;
            ShakeCount4.setText(Integer.toString(sh4));
        }
    }//GEN-LAST:event_ShakeCheckBox4ActionPerformed

    private void ShakeCountNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountNeg1ActionPerformed
         if (DMS % 2 == 0 && flagSh1 == 1) {
            ShakeCount1.setText(Integer.toString(sh1));
        }

        if (sh1 != 0 && flagSh1 == 0) {
            ShakeCount1.setText(Integer.toString(--sh1));
            DairyMilkShake shake1 = new DairyMilkShake ();
            h1 = h1 - shake1.GetPrice();
            sum[20] = h1;
        }

        if (DMS % 2 == 0) {
            ShakeCount1.setText(Integer.toString(sh1));
        }
    }//GEN-LAST:event_ShakeCountNeg1ActionPerformed

    private void ShakeCountNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountNeg2ActionPerformed
         if (KKS % 2 == 0 && flagSh2 == 1) {
            ShakeCount2.setText(Integer.toString(sh2));
        }

        if (sh2 != 0 && flagSh2 == 0) {
            ShakeCount2.setText(Integer.toString(--sh2));
            KitkatShake shake2 = new KitkatShake ();
            h2 = h2 - shake2.GetPrice();
            sum[21] = h2;
        }

        if (KKS % 2 == 0) {
            ShakeCount2.setText(Integer.toString(0));
        }   
    }//GEN-LAST:event_ShakeCountNeg2ActionPerformed

    private void ShakeCountNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountNeg3ActionPerformed
          if (OS % 2 == 0 && flagSh3 == 1) {
            ShakeCount3.setText(Integer.toString(sh3));
        }

        if (sh3 != 0 && flagSh3 == 0) {
            ShakeCount3.setText(Integer.toString(--sh3));
            OreoShake shake3 = new OreoShake ();
            h3 = h3 - shake3.GetPrice();
            sum[22] = h3;
        }

        if (OS % 2 == 0) {
            ShakeCount3.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_ShakeCountNeg3ActionPerformed

    private void ShakeCountNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountNeg4ActionPerformed
         if (BL % 2 == 0 && flagSh4 == 1) {
            ShakeCount4.setText(Integer.toString(sh4));
        }

        if (sh4 != 0 && flagSh4 == 0) {
            ShakeCount4.setText(Integer.toString(--sh4));
            BlueLagoon shake4 = new BlueLagoon ();
            h4 = h4 - shake4.GetPrice();
            sum[23] = h4;
        }

        if (BL % 2 == 0) {
            ShakeCount4.setText(Integer.toString(0));
        }
    }//GEN-LAST:event_ShakeCountNeg4ActionPerformed

    private void ShakeCountPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountPos1ActionPerformed
         if (flagSh1 == 1 && DMS % 2 == 0) {
            ShakeCount1.setText(Integer.toString(sh1));
        }
        else if (DMS % 2 != 0 && flagSh1 == 0) {
            ShakeCount1.setText(Integer.toString(++sh1));
            DairyMilkShake shake1 = new DairyMilkShake();
            h1 = sh1 * shake1.GetPrice();
            sum[20] = h1;
            
        }
        else if (DMS % 2 == 0) {
            ShakeCount1.setText(Integer.toString(0));
            sh1 = 0;
        }
    }//GEN-LAST:event_ShakeCountPos1ActionPerformed

    private void ShakeCountPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountPos2ActionPerformed
         if (flagSh2 == 1 && KKS % 2 == 0) {
            ShakeCount2.setText(Integer.toString(sh2));
        }
        else if (KKS % 2 != 0 && flagSh2 == 0) {
            ShakeCount2.setText(Integer.toString(++sh2));
            KitkatShake shake2 = new KitkatShake();
            h2 = sh2 * shake2.GetPrice();
            sum[21] = h2;
            
        }
        else if (KKS % 2 == 0) {
            ShakeCount2.setText(Integer.toString(0));
            sh2 = 0;
        }
    }//GEN-LAST:event_ShakeCountPos2ActionPerformed

    private void ShakeCountPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountPos3ActionPerformed
         if (flagSh3 == 1 && OS % 2 == 0) {
            ShakeCount3.setText(Integer.toString(sh3));
        }
        else if (OS % 2 != 0 && flagSh3 == 0) {
            ShakeCount3.setText(Integer.toString(++sh3));
            OreoShake shake3 = new OreoShake();
            h3 = sh3 * shake3.GetPrice();
            sum[22] = h3;
            
        }
        else if (OS % 2 == 0) {
            ShakeCount3.setText(Integer.toString(0));
            sh3 = 0;
        }
    }//GEN-LAST:event_ShakeCountPos3ActionPerformed

    private void ShakeCountPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCountPos4ActionPerformed
        if (flagSh4 == 1 && BL % 2 == 0) {
            ShakeCount4.setText(Integer.toString(sh4));
        }
        else if (BL % 2 != 0 && flagSh4 == 0) {
            ShakeCount4.setText(Integer.toString(++sh4));
            BlueLagoon shake4 = new BlueLagoon();
            h4 = sh4 * shake4.GetPrice();
            sum[23] = h4;
            
        }
        else if (BL % 2 == 0) {
            ShakeCount4.setText(Integer.toString(0));
            sh4 = 0;
        }
    }//GEN-LAST:event_ShakeCountPos4ActionPerformed

    private void ShakeConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeConfirm1ActionPerformed
        if (DMS % 2 != 0 && flagSh1 == 0 && sh1 != 0) {
            ItemMenu.append(" DairyMilk Shake                                  " + sh1 + "                      " + h1 + "\n");
            flagSh1 = 1;
        }
        if (flagSh1 == 1) {
            ShakeCount1.setText(Integer.toString(sh1));
            ShakeCheckBox1.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ShakeConfirm1ActionPerformed

    private void ShakeConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeConfirm2ActionPerformed
         if (KKS % 2 != 0 && flagSh2 == 0 && sh2 != 0) {
            ItemMenu.append(" Kitkat Shake                                        " + sh2 + "                      " + h2 + "\n");
            flagSh2 = 1;
        }
        if (flagSh2 == 1) {
            ShakeCheckBox2.setEnabled(false);
            ShakeCount2.setText(Integer.toString(sh2));
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ShakeConfirm2ActionPerformed

    private void ShakeConfirm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeConfirm4ActionPerformed
         if (BL % 2 != 0 && flagSh4 == 0 && sh4 != 0) {
            ItemMenu.append(" Blue Lagoon                                       " + sh4 + "                      " + h4 + "\n");
            flagSh4 = 1;
        }
        if (flagSh4 == 1) {
            ShakeCount4.setText(Integer.toString(sh4));
            ShakeCheckBox4.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ShakeConfirm4ActionPerformed

    private void BvCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCheckBox1ActionPerformed
         MW++;

        if (MW % 2 == 0 && flagBv1 == 0) {
            bv1 = 0;
            BvCount1.setText(Integer.toString(bv1));
        }
        if (MW % 2 == 0 && flagBv1 == 1) {
            BvCount1.setText(Integer.toString(bv1));
        }
    }//GEN-LAST:event_BvCheckBox1ActionPerformed

    private void BvCountNeg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountNeg1ActionPerformed
         if (MW % 2 == 0 && flagBv1 == 1) {
            BvCount1.setText(Integer.toString(bv1));
        }

        if (bv1 != 0 && flagBv1 == 0) {
            BvCount1.setText(Integer.toString(--bv1));
            MineralWater BV1 = new MineralWater();
            b1 = b1 - BV1.GetPrice();
            sum [24] = b1;
        }

        if (MW % 2 == 0) {
            BvCount1.setText(Integer.toString(0));
            bv1 = 0;
        }
    }//GEN-LAST:event_BvCountNeg1ActionPerformed

    private void BvCountNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountNeg2ActionPerformed
         if (CC % 2 == 0 && flagBv2 == 1) {
            BvCount2.setText(Integer.toString(bv2));
        }

        if (bv2 != 0 && flagBv2 == 0) {
            BvCount2.setText(Integer.toString(--bv2));
            SoftDrinks BV2 = new SoftDrinks();
            b2 = b2 - BV2.GetPrice();
            sum [25] = b2;
        }

        if (CC % 2 == 0) {
            BvCount2.setText(Integer.toString(0));
            bv2 = 0;
        }
    }//GEN-LAST:event_BvCountNeg2ActionPerformed

    private void BvCountNeg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountNeg3ActionPerformed
        if (Spr % 2 == 0 && flagBv3 == 1) {
            BvCount3.setText(Integer.toString(bv3));
        }

        if (bv3 != 0 && flagBv3 == 0) {
            BvCount3.setText(Integer.toString(--bv3));
            SoftDrinks BV3 = new SoftDrinks();
            b3 = b3 - BV3.GetPrice();
            sum [26] = b3;
        }

        if (Spr % 2 == 0) {
            BvCount3.setText(Integer.toString(0));
            bv3 = 0;
        }
    }//GEN-LAST:event_BvCountNeg3ActionPerformed

    private void BvCountNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountNeg4ActionPerformed
        if (Miri % 2 == 0 && flagBv4 == 1) {
            BvCount4.setText(Integer.toString(bv4));
        }

        if (bv4 != 0 && flagBv4 == 0) {
            BvCount4.setText(Integer.toString(--bv4));
            SoftDrinks BV4 = new SoftDrinks();
            b4 = b4 - BV4.GetPrice();
            sum [27] = b4;
        }

        if (Miri % 2 == 0) {
            BvCount4.setText(Integer.toString(0));
            bv4 = 0;
        }
    }//GEN-LAST:event_BvCountNeg4ActionPerformed

    private void BvCountNeg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountNeg5ActionPerformed
        if (MD % 2 == 0 && flagBv5 == 1) {
            BvCount5.setText(Integer.toString(bv5));
        }

        if (bv5 != 0 && flagBv5 == 0) {
            BvCount5.setText(Integer.toString(--bv5));
            SoftDrinks BV5 = new SoftDrinks();
            b5 = b5 - BV5.GetPrice();
            sum [28] = b5;
        }

        if (MD % 2 == 0) {
            BvCount5.setText(Integer.toString(0));
            bv5 = 0;
        }
    }//GEN-LAST:event_BvCountNeg5ActionPerformed

    private void BvCountPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountPos1ActionPerformed
        if (flagBv1 == 1 && MW % 2 == 0) {
            BvCount1.setText(Integer.toString(bv1));
        }
        else if (MW % 2 != 0 && flagBv1 == 0) {
            BvCount1.setText(Integer.toString(++bv1));
            MineralWater BV1 = new MineralWater();
            b1 = bv1 * BV1.GetPrice();
            sum[24] = b1;
            
        }
        else if (MW % 2 == 0) {
            BvCount1.setText(Integer.toString(0));
            bv1 = 0;
        }
    }//GEN-LAST:event_BvCountPos1ActionPerformed

    private void BvCountPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountPos2ActionPerformed
        if (flagBv2 == 1 && CC % 2 == 0) {
            BvCount2.setText(Integer.toString(bv2));
        }
        else if (CC % 2 != 0 && flagBv2 == 0) {
            BvCount2.setText(Integer.toString(++bv2));
            SoftDrinks BV2 = new SoftDrinks();
            b2 = bv2 * BV2.GetPrice();
            sum[25] = b2;
            
        }
        else if (CC % 2 == 0) {
            BvCount2.setText(Integer.toString(0));
            bv2 = 0;
        }
    }//GEN-LAST:event_BvCountPos2ActionPerformed

    private void BvCountPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountPos3ActionPerformed
        if (flagBv3 == 1 && Spr % 2 == 0) {
            BvCount3.setText(Integer.toString(bv3));
        }
        else if (Spr % 2 != 0 && flagBv3 == 0) {
            BvCount3.setText(Integer.toString(++bv3));
            SoftDrinks BV3 = new SoftDrinks();
            b3 = bv3 * BV3.GetPrice();
            sum[26] = b3;
            
        }
        else if (Spr % 2 == 0) {
            BvCount3.setText(Integer.toString(0));
            bv3 = 0;
        }
    }//GEN-LAST:event_BvCountPos3ActionPerformed

    private void BvCountPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountPos4ActionPerformed
        if (flagBv4 == 1 && Miri % 2 == 0) {
            BvCount4.setText(Integer.toString(bv4));
        }
        else if (Miri % 2 != 0 && flagBv4 == 0) {
            BvCount4.setText(Integer.toString(++bv4));
            SoftDrinks BV4 = new SoftDrinks();
            b4 = bv4 * BV4.GetPrice();
            sum[27] = b4;
            
        }
        else if (Miri % 2 == 0) {
            BvCount4.setText(Integer.toString(0));
            bv4 = 0;
        }
    }//GEN-LAST:event_BvCountPos4ActionPerformed

    private void BvCountPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvCountPos5ActionPerformed
        if (flagBv5 == 1 && MD % 2 == 0) {
            BvCount5.setText(Integer.toString(bv5));
        }
        else if (MD % 2 != 0 && flagBv5 == 0) {
            BvCount5.setText(Integer.toString(++bv5));
            SoftDrinks BV5 = new SoftDrinks();
            b5 = bv5 * BV5.GetPrice();
            sum[28] = b5;
            
        }
        else if (MD % 2 == 0) {
            BvCount5.setText(Integer.toString(0));
            bv5 = 0;
        }
    }//GEN-LAST:event_BvCountPos5ActionPerformed

    private void BvConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvConfirm2ActionPerformed
        if (CC % 2 != 0 && flagBv2 == 0 && bv2 != 0) {
            ItemMenu.append(" Coca-Cola                                           " + bv2 + "                        " + b2 + "\n");
            flagBv2 = 1;
        }
        if (flagBv2 == 1) {
            BvCount2.setText(Integer.toString(bv2));
            BvCheckBox2.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_BvConfirm2ActionPerformed

    private void BvConfirm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvConfirm3ActionPerformed
        if (Spr % 2 != 0 && flagBv3 == 0 && bv3 != 0) {
            ItemMenu.append(" Sprite                                                    " + bv3 + "                       " + b3 + "\n");
            flagBv3 = 1;
        }
        if (flagBv3 == 1) {
            BvCount3.setText(Integer.toString(bv3));
            BvCheckBox3.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_BvConfirm3ActionPerformed

    private void BvConfirm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvConfirm4ActionPerformed
        if (Miri % 2 != 0 && flagBv4 == 0 && bv4 != 0) {
            ItemMenu.append(" Mirinda                                                  " + bv4 + "                       " + b4 + "\n");
            flagBv4 = 1;
        }
        if (flagBv4 == 1) {
            BvCount4.setText(Integer.toString(bv4));
            BvCheckBox4.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_BvConfirm4ActionPerformed

    private void BvConfirm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvConfirm5ActionPerformed
       if (MD % 2 != 0 && flagBv5 == 0 && bv5 != 0) {
            ItemMenu.append("Moutain Dew                                         " + bv5 + "                      " + b5 + "\n");
            flagBv5 = 1;
        }
        if (flagBv5 == 1) {
            BvCount5.setText(Integer.toString(bv5));
            BvCheckBox5.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_BvConfirm5ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        HistoryList.setText(null);
        GTotalField.setText(null);
        
        PrintWriter writer;
        
        try {
            writer = new PrintWriter(f);
             writer.print("");
             writer.close();
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void ConfirmPizza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPizza2ActionPerformed
        if (PizzaB % 2 != 0 && flagP2 == 0 && p2 != 0) {
            ItemMenu.append(" Four Season                                        " + p2 + "                      " + y2 + "\n");
            flagP2 = 1;
        }
        if (flagP2 == 1) {
            CountPizza2.setText(Integer.toString(p2));
            CheckBoxPizza2.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPizza2ActionPerformed

    private void ConfirmPizza3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPizza3ActionPerformed
        if (PizzaC % 2 != 0 && flagP3 == 0 && p3 != 0) {
            ItemMenu.append(" Chicken Supreme                               " + p3 + "                      " + y3 + "\n");
            flagP3 = 1;
        }
        if (flagP3 == 1) {
            CountPizza3.setText(Integer.toString(p3));
            CheckBoxPizza3.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPizza3ActionPerformed

    private void ConfirmPizza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPizza4ActionPerformed
        if (PizzaD % 2 != 0 && flagP4 == 0 && p4 != 0) {
            ItemMenu.append(" Cheese Overloaded                           " + p4 + "                      " + y4 + "\n");
            flagP4 = 1;
        }
        if (flagP4 == 1) {
            CountPizza4.setText(Integer.toString(p4));
            CheckBoxPizza4.setEnabled(false);
        }
        else {
            ItemSelect.main(null);
        }
    }//GEN-LAST:event_ConfirmPizza4ActionPerformed

    private void CheckBoxPizza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPizza2ActionPerformed
         PizzaB++;

        if (PizzaB % 2 == 0) {
            p2 = 0;
            CountPizza2.setText(Integer.toString(p2));
        }
    }//GEN-LAST:event_CheckBoxPizza2ActionPerformed

    private void CheckBoxPizza3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPizza3ActionPerformed
       PizzaC++;

        if (PizzaC % 2 == 0) {
            p3 = 0;
            CountPizza3.setText(Integer.toString(p3));
        }
    }//GEN-LAST:event_CheckBoxPizza3ActionPerformed

    private void CheckBoxPizza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPizza4ActionPerformed
        PizzaD++;

        if (PizzaD % 2 == 0) {
            p4 = 0;
            CountPizza4.setText(Integer.toString(p4));
        }
    }//GEN-LAST:event_CheckBoxPizza4ActionPerformed

    private void CountPizzaNeg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaNeg2ActionPerformed
        if (PizzaB % 2 == 0 && flagP2 == 1) {
            CountPizza2.setText(Integer.toString(p2));
        }

        if (p2 != 0 && flagP2 == 0) {
            CountPizza2.setText(Integer.toString(--p2));
            FourSeason pizza2 = new FourSeason();
            y2 = y2 - pizza2.GetPrice();
            sum [6] = y2;
        }

        if (PizzaB % 2 == 0) {
            CountPizza2.setText(Integer.toString(0));
            p2 = 0;
        }
    }//GEN-LAST:event_CountPizzaNeg2ActionPerformed

    private void CountPizzaNeg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaNeg4ActionPerformed
       if (PizzaD % 2 == 0 && flagP4 == 1) {
            CountPizza4.setText(Integer.toString(p4));
        }

        if (p4 != 0 && flagP4 == 0) {
            CountPizza4.setText(Integer.toString(--p4));
            CheeseOverloaded pizza4 = new CheeseOverloaded();
            y4 = y4 - pizza4.GetPrice();
            sum [6] = y4;
        }

        if (PizzaD % 2 == 0) {
            CountPizza4.setText(Integer.toString(0));
            p4 = 0;
        }         

    }//GEN-LAST:event_CountPizzaNeg4ActionPerformed

    private void CountPizzaPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaPos2ActionPerformed
        if (flagP2 == 1 && PizzaB % 2 == 0) {
            CountPizza2.setText(Integer.toString(p2));
            p2 = 0;
        }
        else if (PizzaB % 2 != 0 && flagP2 == 0) {
            CountPizza2.setText(Integer.toString(++p2));
            FourSeason pizza2 = new FourSeason();
            y2 = p2 * pizza2.GetPrice();
            sum[6] = y2;
            
        }
        else if (PizzaB % 2 == 0) {
            CountPizza2.setText(Integer.toString(0));
            p2 = 0;
        }
    }//GEN-LAST:event_CountPizzaPos2ActionPerformed

    private void CountPizzaPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaPos3ActionPerformed
        if (flagP3 == 1 && PizzaC % 2 == 0) {
            CountPizza3.setText(Integer.toString(p3));
            p3 = 0;
        }
        else if (PizzaC % 2 != 0 && flagP3 == 0) {
            CountPizza3.setText(Integer.toString(++p3));
            ChickenSupreme pizza3 = new ChickenSupreme();
            y3 = p3 * pizza3.GetPrice();
            sum[7] = y3;
            
        }
        else if (PizzaC % 2 == 0) {
            CountPizza3.setText(Integer.toString(0));
            p3 = 0;
        }
    }//GEN-LAST:event_CountPizzaPos3ActionPerformed

    private void CountPizzaPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountPizzaPos4ActionPerformed
        if (flagP4 == 1 && PizzaD % 2 == 0) {
            CountPizza4.setText(Integer.toString(p4));
            p4 = 0;
        }
        else if (PizzaD % 2 != 0 && flagP4 == 0) {
            CountPizza4.setText(Integer.toString(++p4));
            CheeseOverloaded pizza4 = new CheeseOverloaded();
            y4 = p4 * pizza4.GetPrice();
            sum[8] = y4;

        }
        else if (PizzaD % 2 == 0) {
            CountPizza4.setText(Integer.toString(0));
            p4 = 0;
        }
    }//GEN-LAST:event_CountPizzaPos4ActionPerformed

    private void GTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GTotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GTotalFieldActionPerformed

    private void ShakeCount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShakeCount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShakeCount1ActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeveragesButton2;
    private javax.swing.JLabel BeveragesListLabel2;
    private javax.swing.JPanel BeveragesPanel;
    private javax.swing.JLabel BurgerLabel;
    private javax.swing.JLabel BurgerLabel2;
    private javax.swing.JButton BurgerListButton4;
    private javax.swing.JPanel BurgerPanel;
    private javax.swing.JLabel BurgerPriceLAbel;
    private javax.swing.JLabel BurgerQuantityLabel;
    private javax.swing.JPanel ButtonPanel1;
    private javax.swing.JPanel ButtonPanel2;
    private javax.swing.JCheckBox BvCheckBox1;
    private javax.swing.JCheckBox BvCheckBox2;
    private javax.swing.JCheckBox BvCheckBox3;
    private javax.swing.JCheckBox BvCheckBox4;
    private javax.swing.JCheckBox BvCheckBox5;
    private javax.swing.JButton BvConfirm1;
    private javax.swing.JButton BvConfirm2;
    private javax.swing.JButton BvConfirm3;
    private javax.swing.JButton BvConfirm4;
    private javax.swing.JButton BvConfirm5;
    private javax.swing.JTextField BvCount1;
    private javax.swing.JTextField BvCount2;
    private javax.swing.JTextField BvCount3;
    private javax.swing.JTextField BvCount4;
    private javax.swing.JTextField BvCount5;
    private javax.swing.JButton BvCountNeg1;
    private javax.swing.JButton BvCountNeg2;
    private javax.swing.JButton BvCountNeg3;
    private javax.swing.JButton BvCountNeg4;
    private javax.swing.JButton BvCountNeg5;
    private javax.swing.JButton BvCountPos1;
    private javax.swing.JButton BvCountPos2;
    private javax.swing.JButton BvCountPos3;
    private javax.swing.JButton BvCountPos4;
    private javax.swing.JButton BvCountPos5;
    private javax.swing.JLabel BvLabel;
    private javax.swing.JLabel BvPriceLabel;
    private javax.swing.JLabel BvPriceLabel1;
    private javax.swing.JLabel BvPriceLabel2;
    private javax.swing.JLabel BvPriceLabel3;
    private javax.swing.JLabel BvPriceLabel4;
    private javax.swing.JLabel BvPriceLabel5;
    private javax.swing.JLabel BvQuantityLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JCheckBox CheckBox5;
    private javax.swing.JCheckBox CheckBoxPasta1;
    private javax.swing.JCheckBox CheckBoxPasta2;
    private javax.swing.JCheckBox CheckBoxPasta3;
    private javax.swing.JCheckBox CheckBoxPasta4;
    private javax.swing.JCheckBox CheckBoxPasta5;
    private javax.swing.JCheckBox CheckBoxPizza1;
    private javax.swing.JCheckBox CheckBoxPizza2;
    private javax.swing.JCheckBox CheckBoxPizza3;
    private javax.swing.JCheckBox CheckBoxPizza4;
    private javax.swing.JButton ConfirmButton1;
    private javax.swing.JButton ConfirmButton2;
    private javax.swing.JButton ConfirmButton3;
    private javax.swing.JButton ConfirmButton4;
    private javax.swing.JButton ConfirmButton5;
    private javax.swing.JButton ConfirmOrderButton;
    private javax.swing.JButton ConfirmPasta1;
    private javax.swing.JButton ConfirmPasta2;
    private javax.swing.JButton ConfirmPasta3;
    private javax.swing.JButton ConfirmPasta4;
    private javax.swing.JButton ConfirmPasta5;
    private javax.swing.JButton ConfirmPizza1;
    private javax.swing.JButton ConfirmPizza2;
    private javax.swing.JButton ConfirmPizza3;
    private javax.swing.JButton ConfirmPizza4;
    private javax.swing.JButton CorfirmSides1;
    private javax.swing.JButton CorfirmSides2;
    private javax.swing.JButton CorfirmSides3;
    private javax.swing.JButton CorfirmSides4;
    private javax.swing.JButton CorfirmSides5;
    private javax.swing.JButton CorfirmSides6;
    private javax.swing.JTextField Count1;
    private javax.swing.JTextField Count2;
    private javax.swing.JTextField Count3;
    private javax.swing.JTextField Count4;
    private javax.swing.JTextField Count5;
    private javax.swing.JButton CountNeg1;
    private javax.swing.JButton CountNeg2;
    private javax.swing.JButton CountNeg3;
    private javax.swing.JButton CountNeg4;
    private javax.swing.JButton CountNeg5;
    private javax.swing.JTextField CountPasta1;
    private javax.swing.JTextField CountPasta2;
    private javax.swing.JTextField CountPasta3;
    private javax.swing.JTextField CountPasta4;
    private javax.swing.JTextField CountPasta5;
    private javax.swing.JButton CountPastaNeg1;
    private javax.swing.JButton CountPastaNeg2;
    private javax.swing.JButton CountPastaNeg3;
    private javax.swing.JButton CountPastaNeg4;
    private javax.swing.JButton CountPastaNeg5;
    private javax.swing.JButton CountPastaPos1;
    private javax.swing.JButton CountPastaPos2;
    private javax.swing.JButton CountPastaPos3;
    private javax.swing.JButton CountPastaPos4;
    private javax.swing.JButton CountPastaPos5;
    private javax.swing.JTextField CountPizza1;
    private javax.swing.JTextField CountPizza2;
    private javax.swing.JTextField CountPizza3;
    private javax.swing.JTextField CountPizza4;
    private javax.swing.JButton CountPizzaNeg1;
    private javax.swing.JButton CountPizzaNeg2;
    private javax.swing.JButton CountPizzaNeg3;
    private javax.swing.JButton CountPizzaNeg4;
    private javax.swing.JButton CountPizzaPos1;
    private javax.swing.JButton CountPizzaPos2;
    private javax.swing.JButton CountPizzaPos3;
    private javax.swing.JButton CountPizzaPos4;
    private javax.swing.JButton CountPos1;
    private javax.swing.JButton CountPos2;
    private javax.swing.JButton CountPos3;
    private javax.swing.JButton CountPos4;
    private javax.swing.JButton CountPos5;
    private javax.swing.JTextField GTotalField;
    private javax.swing.JPanel History;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JTextArea HistoryList;
    private javax.swing.JPanel HistoryPanel;
    private javax.swing.JButton ItemListButton;
    private javax.swing.JTextArea ItemMenu;
    private javax.swing.JLabel ItemNameLabel;
    private javax.swing.JPanel ListHistoryPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel MenuLabel2;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PPrice1;
    private javax.swing.JLabel PPrice2;
    private javax.swing.JLabel PPrice3;
    private javax.swing.JLabel PPrice4;
    private javax.swing.JPanel PanelMenuName;
    private javax.swing.JLabel PastaLabel;
    private javax.swing.JLabel PastaLabel2;
    private javax.swing.JButton PastaListButton2;
    private javax.swing.JPanel PastaPanel;
    private javax.swing.JLabel PastaPriceLabel;
    private javax.swing.JLabel PastaQuantityLabel;
    private javax.swing.JLabel PizzaLabel;
    private javax.swing.JLabel PizzaLabel3;
    private javax.swing.JButton PizzaListButton2;
    private javax.swing.JPanel PizzaPanel;
    private javax.swing.JLabel PizzaPriceLabel;
    private javax.swing.JLabel PizzaQuantityLabel;
    private javax.swing.JLabel PriceBurgerLabel1;
    private javax.swing.JLabel PriceBurgerLabel2;
    private javax.swing.JLabel PriceBurgerLabel3;
    private javax.swing.JLabel PriceBurgerLabel4;
    private javax.swing.JLabel PriceBurgerLabel5;
    private javax.swing.JLabel PricePastaLabel1;
    private javax.swing.JLabel PricePastaLabel2;
    private javax.swing.JLabel PricePastaLabel3;
    private javax.swing.JLabel PricePastaLabel4;
    private javax.swing.JLabel PricePastaLabel5;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel SelectedItemLabel2;
    private javax.swing.JPanel SelectedItemPanel;
    private javax.swing.JCheckBox ShakeCheckBox1;
    private javax.swing.JCheckBox ShakeCheckBox2;
    private javax.swing.JCheckBox ShakeCheckBox3;
    private javax.swing.JCheckBox ShakeCheckBox4;
    private javax.swing.JButton ShakeConfirm1;
    private javax.swing.JButton ShakeConfirm2;
    private javax.swing.JButton ShakeConfirm3;
    private javax.swing.JButton ShakeConfirm4;
    private javax.swing.JTextField ShakeCount1;
    private javax.swing.JTextField ShakeCount2;
    private javax.swing.JTextField ShakeCount3;
    private javax.swing.JTextField ShakeCount4;
    private javax.swing.JButton ShakeCountNeg1;
    private javax.swing.JButton ShakeCountNeg2;
    private javax.swing.JButton ShakeCountNeg3;
    private javax.swing.JButton ShakeCountNeg4;
    private javax.swing.JButton ShakeCountPos1;
    private javax.swing.JButton ShakeCountPos2;
    private javax.swing.JButton ShakeCountPos3;
    private javax.swing.JButton ShakeCountPos4;
    private javax.swing.JLabel ShakeLabel;
    private javax.swing.JLabel ShakePriceLabel;
    private javax.swing.JLabel ShakePriceLabel1;
    private javax.swing.JLabel ShakePriceLabel2;
    private javax.swing.JLabel ShakePriceLabel3;
    private javax.swing.JLabel ShakePriceLabel4;
    private javax.swing.JLabel ShakeQuantityLabel;
    private javax.swing.JLabel ShakesLabel2;
    private javax.swing.JButton ShakesListButton2;
    private javax.swing.JPanel ShakesPanel;
    private javax.swing.JCheckBox SidesCheckBox1;
    private javax.swing.JCheckBox SidesCheckBox2;
    private javax.swing.JCheckBox SidesCheckBox3;
    private javax.swing.JCheckBox SidesCheckBox4;
    private javax.swing.JCheckBox SidesCheckBox5;
    private javax.swing.JCheckBox SidesCheckBox6;
    private javax.swing.JTextField SidesCount1;
    private javax.swing.JTextField SidesCount2;
    private javax.swing.JTextField SidesCount3;
    private javax.swing.JTextField SidesCount4;
    private javax.swing.JTextField SidesCount5;
    private javax.swing.JTextField SidesCount6;
    private javax.swing.JButton SidesCountNeg1;
    private javax.swing.JButton SidesCountNeg2;
    private javax.swing.JButton SidesCountNeg3;
    private javax.swing.JButton SidesCountNeg4;
    private javax.swing.JButton SidesCountNeg5;
    private javax.swing.JButton SidesCountNeg6;
    private javax.swing.JButton SidesCountPos1;
    private javax.swing.JButton SidesCountPos2;
    private javax.swing.JButton SidesCountPos3;
    private javax.swing.JButton SidesCountPos4;
    private javax.swing.JButton SidesCountPos5;
    private javax.swing.JButton SidesCountPos6;
    private javax.swing.JLabel SidesLabel;
    private javax.swing.JLabel SidesLabel2;
    private javax.swing.JButton SidesListButton2;
    private javax.swing.JPanel SidesPanel;
    private javax.swing.JLabel SidesPriceLabel;
    private javax.swing.JLabel SidesPriceLabel1;
    private javax.swing.JLabel SidesPriceLabel2;
    private javax.swing.JLabel SidesPriceLabel3;
    private javax.swing.JLabel SidesPriceLabel4;
    private javax.swing.JLabel SidesPriceLabel5;
    private javax.swing.JLabel SidesPriceLabel6;
    private javax.swing.JLabel SidesQuantityLabel;
    private javax.swing.JTextField TotalPriceField;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
