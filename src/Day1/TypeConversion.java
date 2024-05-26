package Day1;

public class TypeConversion {
    public static void main(String[] args) {
        //type conversion

        int firstV = 6;
        double secondV = 161.45; //if you want conversion to int, you will get 161 beacuse the program get number from before .

        int result = (int) secondV; //explicit  : açıklamalı //if you remove (int), you will get error. raad line 14
        double result2 = firstV;    //unExplicit : açıklama olmadan

        //double->float->long->int->short->byte//
        //Use with explanation when converting uppercase to lowercase


        //--------------------//

        String numberWithString = String.valueOf(secondV);
        System.out.println(numberWithString);

        //--------------------//

        String text = "42";
        String secondText = "42.26";
        int value = Integer.parseInt(text);
        double value2 = Double.parseDouble(secondText);

    }
}
