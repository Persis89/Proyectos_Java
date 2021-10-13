package práctica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
	
	private int month, day,year;
	
	public void Fecha1() {
		
//		Uso de la Clase Date que sus métodos poco se usan y necesitan agregar valores
		Date fecha= new Date();
		int dia= fecha.getDay();
		int mes= fecha.getMonth();
		int year= fecha.getYear();
		
        System.out.println(dia + 10); // Inicia de 0 a 6 donde 0= Domingo
        System.out.println(mes + 1); // Inicia mes de 0 a 11 donde 0=Enero
        System.out.println(year + 1900); // Necesita agregarse 1900 al año
        
	}
	
	public void Fecha2() {
		
		Calendar cal= Calendar.getInstance(); // No lleva parametros
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); // Inicia Mes de 0 a 11 donde 0= Enero
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
	}
	
	public void Fecha3(int year, int month, int day_of_month, int hour_of_day,int minute,int second) {
		
//		Es lo mismo que el metodo anterior solo que este lleva parametros
		Calendar cal2= new GregorianCalendar(year, month, day_of_month, hour_of_day, minute, second);
		int año= cal2.get(Calendar.YEAR);
		int mes= cal2.get(Calendar.MONTH); // Inicia Mes de 0 - 11 donde 0= Enero
		int dia2= cal2.get(Calendar.DAY_OF_MONTH);
		int hora= cal2.get(Calendar.HOUR_OF_DAY);
		int minutos= cal2.get(Calendar.MINUTE);
		int segundos= cal2.get(Calendar.SECOND);
		
		System.out.println(año);
		System.out.println(mes);
		System.out.println(dia2);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(segundos);
		
	}
	
	public void Fecha4() {
		
		int y= 2021;
		int m= 10 - 1;
		int d= 12;
		int h= 1;
		int mi=23;
		int se= 20;
		
		Calendar cal3= new GregorianCalendar();
		cal3.set(y,m,d,h,mi,se);
		
		System.out.println(cal3.getTime());
		
		Date fecha= new Date();
		cal3.setTime(fecha);
		cal3.getTime();
		
		String cambio= cal3.toString();
		
		System.out.println(cambio);
		System.out.println(cal3.getTime());
		System.out.println(cal3.getTimeInMillis());
		System.out.println(cal3.getTimeZone());
		System.out.println(cal3.getCalendarType()); 
		System.out.println(cal3.getAvailableCalendarTypes());
		
		int año2= cal3.get(Calendar.YEAR);
		int mes2= cal3.get(Calendar.MONTH) + 1;
		int dia2= cal3.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Fecha: " + dia2 + "//"+ mes2 + "//" + año2);
		
		if(mes2 == 1) { // Condicional para imprimir Mes del Año
			
			System.out.println("Enero");
			
		} else if(mes2 == 2) {
			
			System.out.println("Febrero");
			
		} else if(mes2 == 3) {
			
			System.out.println("Marzo");
			
		} else if(mes2 == 4) {
			
			System.out.println("Abril");
			
		} else if(mes2 == 5) {
			
			System.out.println("Mayo");
			
		} else if(mes2 == 6) {
			
			System.out.println("Junio");
			
		} else if(mes2 == 7) {
			
			System.out.println("Julio");
			
		} else if(mes2 == 8) {
			
			System.out.println("Agosto");
			
		} else if(mes2 == 9) {
			
			System.out.println("Septiembre");
			
		} else if(mes2 == 10) {
			
			System.out.println("Octubre");
			
		} else if(mes2 == 11) {
			
			System.out.println("Noviembre");
			
		} else if(mes2 == 12) {
			
			System.out.println("Diciembre");
			
		} else {
			
			System.out.println("Ninguna de las Anteriores");
			
		}
		
	}
	
	public void Fecha5() {
		
//		Fecha Actual
		Date f= new Date();
		System.out.println(f);
		
//		Fecha con Milisegundos
		Date f2= new Date(86400000);
		System.out.println(f2);
		
//		Fecha con parametro
		Date f3= new Date(111,9,12,13,05);
		System.out.println(f3);
		
//		Fecha Actual
		GregorianCalendar gc= new GregorianCalendar();
		System.out.println(gc.getTime());
		
//		Fecha Establecida con parametros
		GregorianCalendar gc2= new GregorianCalendar(2021, 10, 12,1,30,23);
		System.out.println(gc2.toString());
		System.out.println(gc2.getTime());
		
//		Agregar Fecha con Método setTime que modifica fecha de tipo Date
		gc2.setTime(new Date(2020-1900,5-1,10));
		System.out.println(gc2.getTime());
		System.out.println(gc.get(Calendar.AM_PM));
		System.out.println(gc.get(Calendar.AM));
		System.out.println(gc.get(Calendar.ERA));
		
	}
	
	public void Fecha6() {
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM-YYYY-dd");
		Date f4= new Date(2015-1900, 4, 18);
		
//		Convierte de Date a Cadena o String
		String Cadena= sdf.format(f4);
		System.out.println(Cadena);
		System.out.println(sdf.format(f4));
		
		
	}
	
	public static void Fecha7(int d, int m, int y) {
		
//		Convierte el Formato de una Fecha con parametros
		sdf2= new SimpleDateFormat("dd/MM/YYYY");
		
		datos_f= new Date(y - 1900,m - 1,d);
		sdf2.format(datos_f);
		
//		Con el Método de la Clase GregorianCalendar pedir valores o parametros
		gcr= new GregorianCalendar();
		gcr.set(d, m, y);
		
//		Imprimir formmato en pantalla y Metodos
		System.out.println(sdf2.format(datos_f));
		System.out.println(gcr.getTime());
		
		
	}
	
	public static SimpleDateFormat sdf2;
	public static GregorianCalendar gcr;
	public static Date datos_f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha invocar= new Fecha();
//		invocar.Fecha1();
//		invocar.Fecha2();
//		invocar.Fecha3(2021, Calendar.OCTOBER +1, 12, 01, 05, 50); // Se Agrega en Mes +1
//		invocar.Fecha4();
//		invocar.Fecha5();
//		invocar.Fecha6();
		invocar.Fecha7(20, 3, 2018);
		
	}

}
