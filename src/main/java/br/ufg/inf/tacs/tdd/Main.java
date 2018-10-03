package br.ufg.inf.tacs.tdd;

public class Main 
{
    public static void main( String[] args )
    {
        Usuario maior = new Usuario("Maior");
        Usuario meio = new Usuario("Meio");
        Usuario menor = new Usuario("Menor");
        
        Leilao leilao = new Leilao("Celular");
        
        leilao.propoe(new Lance(maior, 1200.0));
        leilao.propoe(new Lance(meio, 1100.0));
        leilao.propoe(new Lance(menor, 1000.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        System.out.println(leiloeiro.getMaiorLance());
        System.out.println(leiloeiro.getMenorLance());
    }
}
