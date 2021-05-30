package notes;

import objects.DLL;

public class DLLDriver {

	//this will show how to iterate through a doubly linked list, and perform other functionalities
	//we will do this with an additional DLL object to represent the whole list
	
	public static void main (String[] args) {
		DLL<String> dll = new DLL<String>();
		dll.addToFront("Diana");
		dll.traverse(); //diana
		dll.addToFront("Alexa");
		dll.traverse();
		//alexa diana
		dll.addToFront("Kyle");
		dll.traverse(); //kyle alexa diana
		dll.addAfter("Kyle", "Oreo");
		dll.traverse(); // Kyle Oreo Alexa Diana
		dll.delete("Alexa");
		dll.traverse(); // Kyle Oreo Diana
		dll.delete("Kyle");
		dll.traverse(); //Oreo Diana
		dll.delete("Diana");
		dll.traverse(); //Oreo
	}
}
