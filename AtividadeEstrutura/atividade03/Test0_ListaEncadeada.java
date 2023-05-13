package atividade03;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class Test0_ListaEncadeada {
	
	static ListaEncadeada_IF l ;
		
	@Before //Instanciando a Lista antes de cada teste
	public void instanciaLista(){
		l = new ListaEncadeada();
	}
	
	@Test
	public void testSize(){
		assertEquals(0, l.size()); //com a lista vazia
	}
	
	@Test
	public void testRemove(){
		for(int i=1; i <= 5; i++){
			l.insert(i);
		}
		l.remove(3);
		assertEquals(4, l.size());// com lista implementada
	}
	
	//Meus Testes
	
	@Test
	public void testIsEmpty() {
		assertTrue(l.isEmpty());
	}
	@Test
	public void testNotIsEmpty() {
		l.insert(1);
		assertFalse(l.isEmpty());
	}
	
	@Test (expected = Exception.class)
	public void searchElementListIsEmpty() throws Exception{
		l.search(2);
	}
	
	@Test
	public void searchElementListIsFull() throws Exception{
		for(int i = 0; i<= 10; i++) {
			l.insert(i);
		}
		assertEquals(8,l.search(8));
	}
	
	@Test
	public void testRemoveListIsEmpty(){
		l.remove(1);
		assertEquals(0,l.size());
	}
	
	@Test
    public void testToArray() {
        l.insert(1);
        l.insert(2);
        l.insert(3);

        int[] expected = {3, 2, 1};
        int[] result = l.toArray();

        assertArrayEquals(expected, result);
    }

    @Test
    public void testToArrayLitIsEmpty() {
        int[] expected = null;
        int[] result = l.toArray();

        assertArrayEquals(expected, result);
    }
}