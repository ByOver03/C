package segundo;

import primero.*;

class B {
	A a= new A();
	C c= new C(a.numero, "Nahuel");
	
	void puntaB() {
		c.info();
	}
}
