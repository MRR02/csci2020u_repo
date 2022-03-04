package jetBuilder;

//'middle' portion of text art class implemented as a subsytem component in the project
public class middle implements Piece {
   //build() does not return any value nor have any parameters
    @Override
   public void build() {
      //text art
      String str = ("                /\\   |   \\__/   |   /\\\r\n               |  |  |   |  |   |  |  |\r\n           /|  |  |,-\\   |  |   /-,|  |  |\\\r\n           ||  |,-'   |  |  |  |   '-,|  ||\r\n           ||-'       |  |  |  |       '-||\r\n|\\     _,-'           |  |  |  |           '-,_     /|\r\n||  ,-'   _           |  |  |  |               '-,  ||\r\n||-'    =(*)=         |  |  |  |                  '-||\r\n||                    |  \\  /  |                    ||\r\n|\\________....--------\\   ||   /--------....________/|        PAYLOAD MOUNTED");
      System.out.println(str);  //text art is printed
   }
}