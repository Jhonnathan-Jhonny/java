package atividade03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Test0_Pilha {

	private static Pilha_IF p ;
	
	@Before //Instanciando a Pilha antes de cada teste
	public void instanciaPilha() throws Exception{
		p = new PilhaComLista();
	}
	
	@Test
	public void testVazia() throws Exception{
		assertTrue(p.isEmpty());
	}
	
	//Meus Testes
	
	@Test
	public void testPushTop() throws Exception{
		p.push(1);
		p.push(2);
		p.push(3);
		
		assertEquals(p.top(),3);
	}
	
	@Test
	public void testPop() throws Exception{
		p.push(1);
		p.push(2);
		p.push(3);
		
		p.pop();
		p.pop();
		p.pop();
		
		assertTrue(p.isEmpty());
	}
	
	@Test (expected = Exception.class)
	public void topIsEmpty() throws Exception{
		p.top();
	}
	
	@Test
	public void testFull() throws Exception {
		for(int i = 0; i < 10; i++) {
			p.push(i);
		}
		assertTrue(p.isFull());
	}
	
    @Test
    public void testPushAndPop() throws Exception {
        assertTrue(p.isEmpty());
        assertFalse(p.isFull());

        for(int i = 0; i < 10; i++) {
        	p.push(i);
        }

        assertTrue(p.isFull());
        assertFalse(p.isEmpty());

        assertEquals(9, p.pop());
        assertEquals(8, p.pop());
        assertEquals(7, p.pop());

        assertFalse(p.isFull());
        assertFalse(p.isEmpty());

        assertEquals(6, p.pop());
        assertEquals(5, p.pop());
        assertEquals(4, p.pop());
        
        for(int i = 0; i < 4; i++) {
        	p.pop();
        }

        assertTrue(p.isEmpty());
        assertFalse(p.isFull());
    }

    @Test
    public void testTop() throws Exception {
        p.push(1);
        p.push(2);

        assertEquals(2, p.top());

        p.pop();

        assertEquals(1, p.top());
    }
	
}