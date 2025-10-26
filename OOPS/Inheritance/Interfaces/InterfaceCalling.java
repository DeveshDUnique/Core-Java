package OOPS.Inheritance.Interfaces;


interface I1{

}


interface I2{

}

interface I3 extends I1,I2{  // interface extends to other interface

}


class C1 implements I1,I2{ // interface implements in class

}

class C2 extends C1 implements I1,I2 { //extends the class and implements the interface

}

class C3 extends C1{  // class C3 extends C1,C2 // NOT OK

}

public class InterfaceCalling {

    public static void main(String[] args) {

        // class C3 extends C1,C2 // NOT OK
        // class C1 extends I1 // NOT OK
		// class C2 implements C1 // NOT OK
        //interface I2 implements I1 // NOT OK
		// interface I3 extends C1// NOT OK
		// interface I3 implements C1// NOT OK
        // class C2 implements I1 extends C1 // NOT OK
       
    }
}







