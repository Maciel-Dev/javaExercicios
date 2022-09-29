public class EletronicItem {

    private String versao;
    private String dataFabricacao;
    private float preco;
    private String fabricante;
    private String modelo;

    public EletronicItem(String versao, String dataFabricacao, float preco, String fabricante, String modelo) {
        this.versao = versao;
        this.dataFabricacao = dataFabricacao;
        this.preco = preco;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setDataFabricacao(String dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getVersao() {
        return this.versao;
    }

    public String getDataFabricacao() {
        return this.dataFabricacao;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }
}

