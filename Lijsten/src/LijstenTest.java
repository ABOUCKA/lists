import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LijstenTest {

	@Test
	void test() {
		EmptyList emptylist1 = new EmptyList();
		EmptyList emptylist2 = new EmptyList();
		
		
		int[] tail = {6, 3};
		int head = 3;
		NonEmptyList nonemptylist1 = new NonEmptyList(head, tail);
		NonEmptyList nonemptylist2 = new NonEmptyList(head, tail);
		

		
		
		
		
			// non empty list tests
			assertEquals("[3, 6, 3]", nonemptylist1.toString());
			assertEquals(nonemptylist1, nonemptylist2);
			assertEquals(nonemptylist1.length(), 3);
			assertEquals(nonemptylist1.getHead(), 3);
			assertEquals(nonemptylist1.getTail(), "[6, 3]");
			
			
			// empty list tests
			assertEquals(emptylist1.toString(), "[]");
			assertEquals(emptylist1.getLength(), 0);
			assertEquals(emptylist1, emptylist2);
			
		}
		
		
	}


