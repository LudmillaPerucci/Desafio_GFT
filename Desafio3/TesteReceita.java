package Desafio_GFT.Desafio3;

public class TesteReceita extends MelhorReceita{
    public static void main(String args[]) {
        MelhorReceita ingrediente[] = new MelhorReceita[1];
    
        ingrediente[0] = new MelhorReceita();
        ingrediente[0].setNome("Miojo"); 
        ingrediente[0].setQuantidade(2);
        ingrediente[0].setTempoPreparo(5);
        ingrediente[0].setModoPreparo("Adicionar na agua fervendo e temperar");

        System.out.println("Dados da Receita " + ingrediente.length);

        for(int i = 0 ; i < ingrediente.length; i++){
            System.out.print("Ingrediente: " + (i + 1));
            System.out.print("\t Nome: " + ingrediente[i].getNome());
            System.out.print("\t Quantidade: " + ingrediente[i].getQuantidade());
            System.out.print("\t Tempo de preparo: " + ingrediente[i].getTempoPreparo());
            System.out.println("\t Modo de preparo: " + ingrediente[i].getModoPreparo());
        }
}

}
