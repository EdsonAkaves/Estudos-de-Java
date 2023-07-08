public class Main {

    public static void main(String[] args) {
        float celsius = -40;
        double farenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("%.2f graus Celsius é igual a %.2f graus Farenheit", celsius, farenheit));

        int intFarenheit = (int) farenheit;
        System.out.println(String.format("A parte inteira da temperatura em Farenheit é igual a %d", intFarenheit));
    }
}