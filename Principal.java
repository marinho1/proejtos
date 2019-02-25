import javax.xml.crypto.Data;
import java.io.OutputStream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

public class Principal {


    public static void main(String args[]) {
        // Criar um Cliente
        Cliente C1 = new Cliente("Roberto Melo");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        // Criar tres objetos de Produto
        Produto p1 = new Produto("Red Label", "500ml", 60.00f);
        Produto p2 = new Produto("Cachaça Prata", "500ml", 55.00f);
        Produto p3 = new Produto("Coca-Cola ", "30ml", 3.50f);

        // Cria uma Nota Fiscal
        NotaFiscal nf1 = new NotaFiscal();

        // Associar a Nota ao Cliente
        nf1.setCliente(C1);

        // Armazena a data atual (pega a data do sistema)
        nf1.setDataEmissao(java.util.Calendar.getInstance());

        // Armazena o numero da Nota Fiscal
        nf1.setNumero(7942);

        // cria três items de nota fiscal
        // Item 1 sequecial=1, 10 KG de Farinha
        ItemNotaFiscal itnf1 = new ItemNotaFiscal(1, 2, p1);
        // Item 2 sequencial=2, 5 KG de Feijão
        ItemNotaFiscal itnf2 = new ItemNotaFiscal(2, 3, p2);
        // Item 3 sequencial=3, 6 pacotes de Macarrão
        ItemNotaFiscal itnf3 = new ItemNotaFiscal(3, 6, p3);

        // Inserir os items na Nota Fiscal
        nf1.inserirItemNotaFiscal(itnf1);
        nf1.inserirItemNotaFiscal(itnf2);
        nf1.inserirItemNotaFiscal(itnf3);


        String dt = "Data: ";
        String spc = "----------------------------------------------------------";
        String seq = "Seq";
        String des = "Descrição";
        String vlu = "Valor Unitário";
        String qtd = "Qtd";
        String vli = "Valor Item";

        System.out.printf("               Bar Puzzles - CUPOM FISCAL -             \n");
        System.out.println(spc);
        System.out.printf("Nota Fiscal: %d %30s%s\n", nf1.getNumero(),dt,dtf.format(localDate));
        System.out.printf("Cliente: %s\n", C1.getNome());
        System.out.println(spc);
        System.out.printf("%s %9s %29s %3s %3s\n",seq,des,vlu,qtd,vli );
        System.out.println(spc);
        System.out.printf("%-3s %-34s %s %-8s %s\n",itnf1.getSequencial(), p1.getDescricao(),p1.getValor(),itnf1.getQuantidade(),(p1.getValor()*itnf1.getQuantidade()));
        System.out.printf("%-3s %-34s %s %-8s %s\n",itnf2.getSequencial(), p2.getDescricao(),p2.getValor(),itnf2.getQuantidade(),(p2.getValor()*itnf2.getQuantidade()));
        System.out.printf("%-3s %-35s %s %-9s %s\n",itnf3.getSequencial(), p3.getDescricao(),p3.getValor(),itnf3.getQuantidade(),(p3.getValor()*itnf3.getQuantidade()));
        System.out.println(spc);
        System.out.println("Valor total: "+ nf1.calcularValorNota() + "\nObrigado e volte sempre!" );

        }
    }



