public class Geometrica implements ICalcMedia{

    @Override
    public double calculaMedia(double a, double b){
        return Math.sqrt(a * b);
    }

    @Override
    public String situacao(double media){
        if(media <=7){
            return "Reprovado";
        }
        else{
            return "Aprovado";
        }
    }
}
