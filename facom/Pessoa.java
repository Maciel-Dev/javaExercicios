package facom;

public class Pessoa {

    private String name;
    private String dataNascimento;
    private double altura;

    Pessoa(String name, String dataNascimento, double altura){
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public String getNome(){
        return name;
    }

    public double getAltura(){
        return altura;
    }

    public void printDados(Pessoa pessoa){

        System.out.println("Nome: " + pessoa.getNome() + "Data de Nascimento: " + pessoa.getDataNascimento() + "Altura: " + pessoa.getAltura());

    }

    public int CalculaIdade(Pessoa pessoa){
        
        
        String[] dataNascimento = pessoa.getDataNascimento().split("/");

        System.out.println(dataNascimento);

        
        return 0;
    }

}
