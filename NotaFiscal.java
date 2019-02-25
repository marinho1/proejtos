import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;


public class NotaFiscal {
    private int  numero;
    private Calendar dataEmissao;
    private ArrayList<ItemNotaFiscal> items;
    private Cliente cliente;


    public NotaFiscal() {
        this.items = new ArrayList<ItemNotaFiscal>();
    }

    public NotaFiscal(int numero, Calendar dataEmissao, ArrayList<ItemNotaFiscal> items, Cliente cliente) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.items = items;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ArrayList<ItemNotaFiscal> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemNotaFiscal> items) {
        this.items = items;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void inserirItemNotaFiscal (ItemNotaFiscal item) {
        this.items.add(item);
    }

    public float calcularValorNota () {
        float valorNota=0;
        // Pecorre a lista de itens
        for (ItemNotaFiscal itnf : this.items)  {
            // vai somando a variavel valorNota a quantidade de cada item * o valor
            // do produto associado ao item
            valorNota = valorNota +
                    (itnf.getQuantidade() * itnf.getProduto().getValor());
        }
        return valorNota;

    }

    }


