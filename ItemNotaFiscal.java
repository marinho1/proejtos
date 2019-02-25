public class ItemNotaFiscal {

    private int     sequencial;
    private float   quantidade;
    private Produto produto;

    public ItemNotaFiscal(int sequencial, float quantidade, Produto produto) {
        this.sequencial = sequencial;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }
    public void Item(){
        System.out.printf("%d %-15s %25s %4s %13s %n",this.sequencial);
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

}