package fit.challenge;

public class ImcCalculator{
    public static String calculate(double weight, double height){
        double imc = weight / (height * height);

        if(imc< 18.5) return "Magreza";
        if(imc < 24.9) return "Normal";
        if(imc < 30) return "Sobrepeso";

        return "Obesidade";
    }
}