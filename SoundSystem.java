public class SoundSystem extends EletronicItem{

    private float Decibel;
    

    public SoundSystem(String versao, String dataFabricacao, float preco, String fabricante, String modelo, float Decibel) {
        super(versao, dataFabricacao, preco, fabricante, modelo);
        this.Decibel = Decibel;

    }
    
    public void setDecibel(float Decibel) {
        this.Decibel = Decibel;
    }

    public float getDecibel() {
        return this.Decibel;
    }
}
