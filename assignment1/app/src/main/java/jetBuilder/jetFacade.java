package jetBuilder;
/*
This is the facade class, used to communicate with the subsystem of the program
*/
public class jetFacade {
    private Piece noseAndCockpit;
    private Piece wingsAndPayload;
    private Piece enginesAndTail;

    /*
    constructor, where an instance of each component in the subsystem is made
    */
    public jetFacade() {
        noseAndCockpit = new front();
        wingsAndPayload = new middle();
        enginesAndTail = new back();
    }


    /*
    the main function of the facade class, used to carry out the required methods to complete the project's purpose
    build function from each subsystem instance is called
    no return value or parameters
    print statements and Thread.sleep() used for creativity purposes
    */
    public void contstruct() {
        System.out.println("BUILDING F-18...");
        try {                       //try catch required for Thread.sleep(), can be ignored
        Thread.sleep(2900);         //used for time delay
        noseAndCockpit.build();     //front component method build() is called
        Thread.sleep(900);
        wingsAndPayload.build();    //middle component method build() is called
        Thread.sleep(2100);
        enginesAndTail.build();     //back component method build() is called
        }
        catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("READY FOR FLIGHT");
    }
    
}