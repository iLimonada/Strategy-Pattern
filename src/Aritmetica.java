public class Aritmetica implements ICalcMedia{

    @Override
    public double calculaMedia(double a, double b){
        return (a + b) / 2;
    }

    @Override
    public String situacao(double media){
        if(media <=5){
            return "Reprovado";
        }
        else{
            return "Aprovado";
        }
    }
}
