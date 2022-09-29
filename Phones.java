public class Phones extends EletronicItem {

    private float peso;
    private String cor;
    private boolean haveCameras;
    private boolean haveWifi;
    private boolean havePad;
    private boolean haveCord;
    
    public Phones(String versao, String dataFabricacao, float preco, String fabricante, String modelo) {
        super(versao, dataFabricacao, preco, fabricante, modelo);
        
    }
    
}
