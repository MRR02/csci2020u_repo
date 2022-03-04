/*
 * Mohammadreza Rahbar
 * 3/3/2022
 * Program that prints text art using a facade design pattern implementation
 */
package jetBuilder;
//main class, AKA the 'simple interface'
public class App {

    public static void main(String[] args) {

        jetFacade jet = new jetFacade();    //instance of facade class is made

        jet.contstruct();       //program is called to run through the facade instance method
    }
}
