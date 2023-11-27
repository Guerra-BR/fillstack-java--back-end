public class Main {
    public static void main(String[] args) {
        double média = calculaMedia(2, 5, 7.8, 10);

        System.out.println("A média das notas é:" + média);
    }

    private static double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        double somatoria = nota1 + nota2 + nota3 + nota4;

        return somatoria / 4;
    }
}