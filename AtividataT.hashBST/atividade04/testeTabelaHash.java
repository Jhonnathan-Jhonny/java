package atividade04;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testeTabelaHash {

	static TabelaHash t;
	@Before 
	public void instanciaTabela() throws Exception{
		t = new TabelaHash(8);
	}
	

	@Test
	public void testInsert() {
	    t.insert(16);
	    t.insert(24);
	    t.insert(3);
	    t.insert(11);
	    t.insert(19);
	    t.insert(4);
	    t.insert(10);
	    t.insert(6);
	    t.insert(14);
	    t.insert(22);
	    t.insert(15);
	    t.insert(12);

	    String expected = "0: 24, 16\n" +
	                      "1: \n" +
	                      "2: 10\n" +
	                      "3: 19, 11, 3\n" +
	                      "4: 12, 4\n" +
	                      "5: \n" +
	                      "6: 22, 14, 6\n" +
	                      "7: 15\n";

	    assertEquals(expected, t.print());
	}

    @Test
    public void testRemover() throws Exception {
        t.insert(24);
        t.insert(16);
        t.insert(10);
        t.insert(19);

        t.remove(16);
        t.remove(10);

        String expected = "0: 24\n" +
                "1: \n" +
                "2: \n" +
                "3: 19\n" +
                "4: \n" +
                "5: \n" +
                "6: \n" +
                "7: \n";

        assertEquals(expected, t.print());
    }

    @Test (expected = Exception.class)
    public void testRemoverExecao() throws Exception {
        t.insert(24);
        t.insert(16);
        t.insert(10);
        t.insert(19);
        
    	t.remove(4);
    }
    
    @Test
    public void testProcurar() throws Exception {
        t.insert(24);
        t.insert(16);
        t.insert(10);
        t.insert(19);

        assertEquals(16, t.search(16));
        assertEquals(10, t.search(10));
        assertEquals(19, t.search(19));
    }
    
    @Test (expected = Exception.class)
    public void testProcurarExecao() throws Exception {
        t.insert(24);
        t.insert(16);
        t.insert(10);
        t.insert(19);
        
    	t.search(4);
    }

}
