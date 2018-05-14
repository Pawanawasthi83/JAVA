package example.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TestSynchronizedCollecction {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();//Non Sync
		List list = Collections.synchronizedList(al);//symchronixed
	}

}
