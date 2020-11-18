import java.util.Scanner;
import scala.util.control.Breaks._
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var count=0
    var s:Double=0
    while(count!=2)
    {
        var a=input.nextDouble()
     if(a>=0 &&a<=10)
    {
        s=s+a;
        count=count+1;
    }
    else
    {
        printf("nota invalida\n")
    }
    }
    printf("media = %.2f\n",s/2)

}
}
 
