//circle lenght with radius 4  Lr=2*pi*r

public class HelloWorld{

     public static void main(String []args){
         int r=4;     //переменная хранит радиус круга. целое число
         double lr=2*Math.PI*r;    //вычисление длины окружности. вещественное число.  Math.PI - это константа пи из стандартной библиотеки 
         
        System.out.println("Radius= "+r); 
        System.out.println("Circle length ="+lr);
     }
}