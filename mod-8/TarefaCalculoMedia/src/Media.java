public class Media {
    public double n1;
    public double n2;
    public double n3;
    public double n4;

    public Media(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    /**
     * Método para média aritmética das notas
     */
    public void mediaNotas(){
        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("média: %.2f \n", media);
    }
}
