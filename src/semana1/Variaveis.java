package semana1;

/**
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 * RESPOSTA:  
 String, � uma variavel que armazena uma sequencia de caracteres
 Exemplo:
 String nome="noilson";
String cidade="Santo Andre";
 String banda="metallica";
 String carro="civic";
 String empresa="cognizant";
 String animal="cavalossauro";
 String pc="computador";
 String bairro="morumbi";
 String rua="jaceru";
 String graci="severina"; 
    
int, serve para armazenar n�meros inteiros
Exemplos:
int dia= 30;
int mes= 12;
int ano= 360;
int idade= 18;
int maximo= 50;
int minimo= 10;
  int valor= 100;
  int a= 1;
  int b= 2;
  int c= 3;
   
double, serve para armazenar n�meros fracionarios/reais
Exemplos:
  double a= 1,1;
  double b= 2,2;
  double c= 3,3;
  double d= 4,4;
  double e= 5,5;
  double f= 6,6;
  double g= 7,7;
  double h= 8,8;
  double i= 9,9;
  double j= 10,0; 
  
boolean, serve para condi��o verdadeira ou falsa  
Exemplo:
boolean sim= true;
boolean nao= false;

char, serve para armazenar um �nico caractere, e este caractere deve estar entre aspas simples ' '   
Exemplos:
char a='1';
char b='2';
char c='3';
char d='4';
Etc....

 *  Armazene a descri��o da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *  nomeDaVariavel: + variavelExplicaão + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {

    	String a="* A vari�vell do tipo String, serve para armazenar uma sequencia de caracteres;";
 String b="* A vari�vel do tipo int, serve para armazenar n�meros inteiros;";
 String c="* A vari�vel do tipo double, serve para armazenar n�meros fracionarios/reais;";
String d="* A vari�vel do tipo boolean, serve para condi��o verdadeira ou falsa;";
String e="* A vari�vel do tipo char, serve para armazenar um �nico caractere, e este caractere deve estar entre aspas simples '';";
String resultado= (a + "\n" +b + "\n" +c + "\n" +d + "\n" +e);
// inprimir resultado     	
System.out.println (resultado);
    }
}