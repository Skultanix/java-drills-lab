package com.devmountain;

public class StarWars2 {
    public StarWars2() {
    }
        //Part One
        public static void main(String[] var0){
            String var1 = "Jabba";
            String var2 = "the Hutt";
            int var3 = 600;
            String var4 = "Nal Hutta";
            float var5 = 3.9f;
            int var6 = 1358;
            System.out.println("They call him " + var1 + " " + var2 + ".");
            System.out.println(var1 + " of " + var4 + " was born in " + var3 + " BBY.");
            System.out.println(var1 + " is " + var5 + " meters tall and weighs " + var6 + " kilos.");
            //Part 2
            Float purse = 150.0f;
            purse = (float)((double)purse - 24.3);
            purse -= 45.0f;
            purse *= 2.0f;
            purse -= (purse *= 0.1f);
            System.out.println("Remaining balance in purse is: "+purse+".");
            //Part 3
            String bladeColor = "Purple";
            String handeColor = "Black";
            if ((bladeColor.equals("Purple")) && (handeColor.equals("Black"))) {
                System.out.println("This one's mine!");
            } else {System.out.println("Pass");
            };
            //Ship
            String shipName = "The Deathstar";
            if (shipName.equals("Millenium Falcon")) {
                System.out.println("Let's go!");
            } else {
                System.out.println("I need to hide somewhere.");
            };
            //Spaceport Cantina
            float itemCost = 5.99f;
            boolean isRecommended = false;
            float drinkCost = 0.99f;
            int drinkSize = 23;
            if ((itemCost <= 5) && (isRecommended == true)) {
                System.out.println(var1 + " will order the item.");
            } else {
                System.out.println(var1+" "+var2+ " will not order this paltry dish.");
            };
            if ((drinkCost <= 1) && (drinkSize > 24)) {
                System.out.println(var1+" will have a drink.");
            } else {
                System.out.println(var1+" will not have this swill.");
            };
    };
};