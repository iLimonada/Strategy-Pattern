public class Disciplina {

    private ICalcMedia calcular;
    private String Nome;
    private double P1;
    private double P2;
    private double Media;
    private String Situacao;

    Disciplina(ICalcMedia calc){
        this.calcular = calc;
    }

    void calcularMedia(){
        Media = calcular.calculaMedia(P1,P2);
        Situacao = calcular.situacao(Media);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public double getMedia() {
        return Media;
    }

    public String getSituacao() {
        return Situacao;
    }
}
