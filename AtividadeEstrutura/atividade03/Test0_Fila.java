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
	public void cabecaVazia() throws Exception {
		f.head();
	}
	
	public void testCheia() throws Exception{
		f.enqueue(Integer.MAX_VALUE);
		assertTrue(f.isFull());
	}
}