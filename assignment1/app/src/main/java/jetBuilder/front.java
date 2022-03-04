package jetBuilder;

//'front' portion of text art class implemented as a subsytem component in the project
public class front implements Piece {
   //build() does not return any value nor have any parameters
    @Override
   public void build() {
      //text art
      String str = ("                          /\\\r\n                         |  |\r\n                         |  |\r\n                        .'  '.\r\n                        |    |\r\n                        |    |\r\n                        | /\\ |\r\n                      .' |__|'.\r\n                      |  |  |  |\r\n                     .'  |  |  '.        SYSTEMS ONLINE");
      System.out.println(str); //text art is printed
   }
}