package zad3;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;

class MyException extends Exception{
	public int errorcode=12;
	  public MyException() {
	  System.out.println("zle wymiary: wymiar < 0");
	  }
	 public int returcode()
	 {
		 return errorcode;
	 };
	 
	
	 
}
class ExceptionSample {
	
	  public double doSomething(double a) throws MyException{
		if(a<0){
		  
	 
	  throw new MyException();
		}
		return a;
	  }
}  
public class size {
	public double dlugosc;
	public double szerokosc;
	public double wysokosc;
	public size(double dl,double szer, double wys)
	{
		this.dlugosc=dl;
		this.szerokosc=szer;
		this.wysokosc=wys;
		
	}
	public double objetosc()
	{
		return dlugosc * szerokosc * wysokosc;
	}
	public double powpodlogi()
	{
		return dlugosc * szerokosc;
	}
	public double powscian()
	{
		return dlugosc * wysokosc *2 + szerokosc * wysokosc;
	}
	public double kosztmalscian(double koszt)
	{
		return (dlugosc * wysokosc *2 + szerokosc * wysokosc)*koszt;
	}
	public double kosztpodlogi(double koszt)
	{
		return dlugosc * szerokosc*koszt;
	}



public static void main(String[] args) {
	
	double[][] a=new double[3][5];
	ExceptionSample sample = new ExceptionSample();
	 for(int i=0; i<3; i++){
		 double dl,szer,wys,kosztscian,kosztpodlogi;
		 Scanner klawiatura = new Scanner(System.in);
			System.out.println("Podaj dlugosc ");
			
			try {
				a[i][0]=sample.doSomething(klawiatura.nextInt());
			   } catch (MyException e) {
			    e.printStackTrace();
			    e.returcode();
			    System.out.println("errorcode: "+ e.returcode());
			    };
			
			System.out.println("Podaj szerokosc ");
			
			try {
				a[i][1]=sample.doSomething(klawiatura.nextInt());
			   } catch (MyException e) {
			    e.printStackTrace();
			    e.returcode();
			    System.out.println("errorcode: "+ e.returcode());
			    };
			
			System.out.println("Podaj wysokosc ");
			
			try {
				a[i][2]=sample.doSomething(klawiatura.nextInt());
			   } catch (MyException e) {
			    e.printStackTrace();
			    e.returcode();
			    System.out.println("errorcode: "+ e.returcode());
			    };
			
			System.out.println("koszt scian ");
			
			try {
				a[i][3]=sample.doSomething(klawiatura.nextInt());
			   } catch (MyException e) {
			    e.printStackTrace();
			    e.returcode();
			    System.out.println("errorcode: "+ e.returcode());
			    };
			
			System.out.println("koszt podlogi ");
			
			try {
				a[i][4]=sample.doSomething(klawiatura.nextInt());
			   } catch (MyException e) {
			    e.printStackTrace();
			    e.returcode();
			    System.out.println("errorcode: "+ e.returcode());
			    };
			
			
	              
	         };
	         BufferedWriter writer = null;
	         size salon=new size(a[0][0],a[0][1],a[0][2]);
	     	size kuchnia=new size(a[1][0],a[1][1],a[1][2]);
	     	size sypialnia=new size(a[2][0],a[2][1],a[2][2]);
	File logFile = new File("plik.txt");

	            
	

	try {
		writer = new BufferedWriter(new FileWriter(logFile));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		writer.write("\r\n salon \r\n");
		
		writer.write("\r\n objetosc: " + Double.toString(salon.objetosc()));
		writer.write("\r\n powierzchnia podlogi: " +Double.toString(salon.powpodlogi()));
		writer.write("\r\n powierzchnia scian: " +Double.toString(salon.powscian()));
		writer.write("\r\n koszt malowania scian: " +Double.toString(salon.kosztmalscian(a[0][3])));
		writer.write("\r\n koszt podlogi: " +Double.toString(salon.kosztpodlogi(a[0][4])));
		
writer.write("\r\n kuchnia \r\n");
		
		writer.write("\r\n objetosc: " +Double.toString(kuchnia.objetosc()));
		writer.write("\r\n powierzchnia podlogi: " +Double.toString(kuchnia.powpodlogi()));
		writer.write("\r\n powierzchnia scian: " +Double.toString(kuchnia.powscian()));
		writer.write("\r\nkoszt malowania scian: " +Double.toString(kuchnia.kosztmalscian(a[1][3])));
		writer.write("\r\n koszt podlogi: " +Double.toString(kuchnia.kosztpodlogi(a[1][4])));
		
writer.write("\r\n sypialnia \r\n");
		
		writer.write("\r\n objetosc: " +Double.toString(sypialnia.objetosc()));
		writer.write("\r\n powierzchnia podlogi: " +Double.toString(sypialnia.powpodlogi()));
		writer.write("\r\n powierzchnia scian: " +Double.toString(sypialnia.powscian()));
		writer.write("\r\n koszt malowania scian: " +Double.toString(sypialnia.kosztmalscian(a[2][3])));
		writer.write("\r\n koszt podlogi: " +Double.toString(sypialnia.kosztpodlogi(a[2][4])));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("salon");
	System.out.println(salon.objetosc());
	System.out.println(salon.powpodlogi());
	System.out.println(salon.powscian());
	System.out.println(salon.kosztmalscian(a[0][3]));
	System.out.println(salon.kosztpodlogi(a[0][4]));
	System.out.println("kuchnia");
	System.out.println(kuchnia.objetosc());
	System.out.println(kuchnia.powpodlogi());
	System.out.println(kuchnia.powscian());
	System.out.println(kuchnia.kosztmalscian(a[1][3]));
	System.out.println(kuchnia.kosztpodlogi(a[0][4]));
	System.out.println("sypialnia");
	System.out.println(sypialnia.objetosc());
	System.out.println(sypialnia.powpodlogi());
	System.out.println(sypialnia.powscian());
	System.out.println(sypialnia.kosztmalscian(a[2][3]));
	System.out.println(sypialnia.kosztpodlogi(a[2][4]));
	}}
