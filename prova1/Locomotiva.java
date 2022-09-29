package prova1;

import java.util.ArrayList;

public class Locomotiva extends VeiculoLinha {
    private String matricula;
    private double potenciaMaxima;
    private double deslocamentoCarga;
    ArrayList<VeiculoLinha> vagao = new ArrayList<VeiculoLinha>();

    public Locomotiva(double peso, double largura, double altura, double comprimento, double pesoMaxSuportado, String matricula, double potenciaMaxima, double deslocamentoCarga){
        super(peso, largura, altura, comprimento, pesoMaxSuportado);
        this.matricula = matricula;
        this.potenciaMaxima = potenciaMaxima;
        this.deslocamentoCarga = deslocamentoCarga;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setPotenciaMaxima(double potenciaMaxima){
        this.potenciaMaxima = potenciaMaxima;
    }

    public void setDeslocamentoCarga(double deslocamentoCarga){
        this.deslocamentoCarga = deslocamentoCarga;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double getPotenciaMaxima(){
        return this.potenciaMaxima;
    }

    public double getDeslocamentoCarga(){
        return this.deslocamentoCarga;
    }

    public ArrayList<VeiculoLinha> getVagoes(){
        return this.vagao;
    }

    public void vagaoInfo(int pos){
        VeiculoLinha vagPos = getVagoes().get(pos);
        System.out.print(vagPos.getAltura());
    }

    public static Locomotiva createLocomotiva(){
        return new Locomotiva(0 , 0 , 0 , 0 , 0 , "" , 0 , 0);
    }
}
