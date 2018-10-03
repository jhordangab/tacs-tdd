package br.ufg.inf.tacs.tdd;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LeilaoTest extends TestCase {

	public LeilaoTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(LeilaoTest.class);
    }

    @SuppressWarnings("deprecation")
	public void menorLanceTest()
    {
    	double menorLanceEsperado = 1000.0;
    	
    	Usuario maior = new Usuario("Maior");
        Usuario meio = new Usuario("Meio");
        Usuario menor = new Usuario("Menor");
        
        Leilao leilao = new Leilao("Celular");
        
        leilao.propoe(new Lance(maior, 1200.0));
        leilao.propoe(new Lance(meio, 1100.0));
        leilao.propoe(new Lance(menor, 1000.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        Assert.assertEquals(menorLanceEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
    
    @SuppressWarnings("deprecation")
	public void maiorLanceTest()
    {
    	double maiorLanceEsperado = 1200.0;
    	
    	Usuario maior = new Usuario("Maior");
        Usuario meio = new Usuario("Meio");
        Usuario menor = new Usuario("Menor");
        
        Leilao leilao = new Leilao("Celular");
        
        leilao.propoe(new Lance(maior, 1200.0));
        leilao.propoe(new Lance(meio, 1100.0));
        leilao.propoe(new Lance(menor, 1000.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        Assert.assertEquals(maiorLanceEsperado, leiloeiro.getMaiorLance(), 0.00001);
    }
}
