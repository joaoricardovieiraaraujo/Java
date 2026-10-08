public class Media {
    public static void main(String[] args) {
        double bim1 = 9;
        double bim2 = 5;
        double bim3 = 8;
        double bim4 = 5;
        double Media = (bim1 + bim2 + bim3 + bim4) / 4;
        if (Media < 5) {
            System.out.println("A média do aluno foi " + Media + " REPROVADO!!");
        }else {
            System.out.println("A média do aluno foi " + Media + " APROVADO!!");
        }
    }
}