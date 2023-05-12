package atividade03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
	public void topVazio() throws Exception{
		p.top();
	}
	
	@Test
	public void testCheio() throws Exception {
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		p.push(6);
		p.push(7);
		p.push(8);
		p.push(9);
		p.push(10);
		assertTrue(p.isFull());
	}
	
}