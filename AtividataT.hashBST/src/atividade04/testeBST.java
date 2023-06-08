package atividade04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;


public class testeBST {
	
	static BST a ;
	
	@Before 
	public void instanciaBST() throws Exception{
		a = new BST();
	}

	@Test
	public void testeProcurar() throws Exception {
		for(int i=0;i<6;i++) {
			a.insert(i);
		}
		int valor = a.search(4);
		assertEquals(valor,4);
	}
	@Test (expected = Exception.class)
	public void execaoBusca() throws Exception {
		a.search(2);
	}
	
	@Test
	public void testePreOrdem() {
		a.insert(10);
	    a.insert(5);
	    a.insert(15);
	    a.insert(3);
	    a.insert(7);
		
		assertEquals(Arrays.toString(a.preOrder()),Arrays.toString(new int[]{10,5,3,7,15}));
	}
	
	@Test
	public void testeOrdem() {
		a.insert(10);
	    a.insert(5);
	    a.insert(15);
	    a.insert(3);
	    a.insert(7);
		
		assertEquals(Arrays.toString(a.order()),Arrays.toString(new int[]{3,5,7,10,15}));
	}
	
	@Test
	public void testePosOrdem() {
		a.insert(10);
	    a.insert(5);
	    a.insert(15);
	    a.insert(3);
	    a.insert(7);
		
		assertEquals(Arrays.toString(a.postOrder()),Arrays.toString(new int[]{3,7,5,15,10}));
	}
	
	@Test
	public void testIsComplitTrue() {
        a.insert(10);
        a.insert(5);
        a.insert(15);
        a.insert(3);
        a.insert(7);
        a.insert(12);
        a.insert(17);
        a.insert(2);
        a.insert(4);
        a.insert(6);
        a.insert(9);
        a.insert(14);
        a.insert(16);
        a.insert(18);
        a.insert(11);
    
        assertTrue(a.isComplete());
	}
	
	@Test
	public void testIsComplitFalse() {
        a.insert(10);
        a.insert(5);
        a.insert(15);
        a.insert(3);
        a.insert(12);
        a.insert(2);
        a.insert(6);
        a.insert(9);
    
        assertFalse(a.isComplete());
	}
}
