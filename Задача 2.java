public class HelloWorld{

     public static void main(String []args){
         int num=39;   //перменная хранит данно целое число 
         int dec=num/10;  //получаем количество десятков как результат деления нацело на 10
         int one=num%10;   // получаем количество единиц как остаток от деления на 10
        System.out.println("In number "+num+" there are"); 
        System.out.println("10 x "+dec+" and "+"1 x "+one);
     }
}