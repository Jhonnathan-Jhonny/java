package atividade03;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class Test0_Fila {
	
	static Fila_IF f ;
		
	@Before //Instanciando a Fila antes de cada teste
	public void instanciaFila() throws Exception{
		f = new FilaComPilhas();
	}
	
	@Test
	public void testVazia() throws Exception{
		f.enqueue(Integer.MAX_VALUE);
		assertFalse(f.isEmpty());
	}
	
	@Test (expected = Exception.class)
	public void testUnderFlow() throws Exception{
		f.dequeue();
	}
	
	//Meus testes
	
	@Test 
	public void testDequeueHead() throws Exception {
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		
		f.dequeue();
		assertEquals(f.head(),2);
	}

	@Test (expected = Exception.class)
	public void headIsEmpty() throws Exception {
		f.head();
	}
	
	public void testHead() throws Exception{
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		assertEquals(1, f.head());
	}
	
	public void testFull() throws Exception{
		f.enqueue(Integer.MAX_VALUE);
		assertTrue(f.isFull());
	}
	
    @Test
    public void testEnqueue() throws Exception {
    	for(int i = 0;i < 10; i++) {
    		f.enqueue(i);
    	}
        assertTrue(f.isFull());
    }
    
    @Test
    public void testDequeue() throws Exception {
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        assertEquals(1, f.dequeue());
        assertEquals(2, f.dequeue());
        assertEquals(3, f.dequeue());
        assertTrue(f.isEmpty());
    }
    
    @Test (expected = Exception.class)
    public void testEnqueueComErro() throws Exception {
        for(int i = 0;i < 10; i++) {
        	f.enqueue(i);
        }
        f.enqueue(11);
    }
    
    @Test (expected = Exception.class)
    public void testDequeueComErro() throws Exception {
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.dequeue();
        f.dequeue();
        f.dequeue();
        f.dequeue();
    }
}