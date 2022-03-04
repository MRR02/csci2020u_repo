package jetBuilder;

//'back' portion of text art class implemented as a subsytem component in the project
public class back implements Piece {
   //build() does not return any value nor have any parameters
    @Override
   public void build() {
      //text art
      String str = ("                      /|  ||  |\\\r\n                     / |  ||  | \\\r\n                    /  |  \\/  |  \\\r\n                   /   |      |   \\   \r\n                 //   .|      |.   \\\\\r\n               .' |_./ |      | \\._| '.\r\n              /     _.-|||  |||-._     \\\r\n              \\__.-'   \\||/\\||/   '-.__/        ENGINES ACTIVE");;
      System.out.println(str);  //text art is printed
   }
}