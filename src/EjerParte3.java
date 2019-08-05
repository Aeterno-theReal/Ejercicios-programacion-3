import java.util.Scanner;

public class EjerParte3 {
	
	private static final int MAX_VALUES = 0;
	private static final int MIN_VALUES = 0;

	static int opcionEjercicio(Scanner t)
	{
		int opcion=0;
		
		do {
			
			System.out.print("Introduzca el ejercício deseado [43-52]: ");
			opcion=t.nextInt();
			t.nextLine();
			System.out.println();
			if(opcion<43 || opcion>52)
				System.out.print("Error! el dato que ha introducido está fuera del rango 43-52.\n");
		}while(opcion<43 || opcion>52);
		return opcion;
	}
	
	static void inicializarArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			array[i]=0;
		}
	}
	
	static void rellenarArray(int[] array, Scanner t)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print("Introduzca el valor de índice " + (i+1) + " del array: ");
			array[i]=t.nextInt();
			t.nextLine();
		}
	}
	
	static void mostrarArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
			if(i!=array.length-1)
				System.out.print(", ");
			else
				System.out.println(".");
		}
	}
	
	static void copiarArray(int[] a, int[] b)
	{
		if(a.length == b.length || a.length < b.length)
			for(int i=0; i<a.length; i++)
			{
				b[i]=a[i];
			}
		else
			System.out.println("Error!, el array donde se pretende copiar es mas pequeño que el original.");
	}
	
	static int sumaArray(int[] array)
	{
		int suma=0;
		
		for(int i=0; i<array.length; i++)
		{
			suma=suma+array[i];
		}
		return suma;
	}

	static float mediaArray(int[] array)
	{
		float media=0;
		int suma=0;
		
		for(int i=0; i<array.length; i++)
		{
			suma=suma+array[i];
		}
		media=suma/array.length;
		
		return media;
	}
	
	static void llenarArrayDNI(String[] array)
	{
		array[0]="T";
		array[1]="R";
		array[2]="W";
		array[3]="A";
		array[4]="G";
		array[5]="M";
		array[6]="Y";
		array[7]="F";
		array[8]="P";
		array[9]="D";
		array[10]="X";
		array[11]="B";
		array[12]="N";
		array[13]="J";
		array[14]="Z";
		array[15]="S";
		array[16]="Q";
		array[17]="V";
		array[18]="H";
		array[19]="L";
		array[20]="C";
		array[21]="K";
		array[22]="E";
		array[23]="T";
	}
	
	static void llenarArrayAlfabeto(char[] array)
	{
		array[0]='A';
		array[1]='B';
		array[2]='C';
		array[3]='D';
		array[4]='E';
		array[5]='F';
		array[6]='G';
		array[7]='H';
		array[8]='I';
		array[9]='J';
		array[10]='K';
		array[11]='L';
		array[12]='M';
		array[13]='N';
		array[14]='Ñ';
		array[15]='O';
		array[16]='P';
		array[17]='Q';
		array[18]='R';
		array[19]='S';
		array[20]='T';
		array[21]='U';
		array[22]='V';
		array[23]='W';
		array[24]='X';
		array[25]='Y';
		array[26]='Z';
		array[27]=' ';
		
	}
	
	static String pedirLetras(char[] array, Scanner t)
	{
		String palabra="";
		int opcion=0;
		do {
			System.out.print("Introduzca la posición en decimal de la letra a usar en la palabra oculta [1-28] (-1 para finalizar): ");
			opcion=t.nextInt();
			t.nextLine();
			if(opcion<1 || opcion>array.length)
				System.out.println("Error! El índice que has introducido no está en el rango 1-28.");
			else
				palabra=palabra+array[opcion-1];
		}while(opcion!=-1);
		return palabra;
	}
	
	static void llenarAleatorios(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			array[i]=(int)(Math.random()*11);
		}
	}
	
	static void ocurrenciasAleatorios(int[] array, int[] ocu)
	{
		for(int i=0; i<ocu.length; i++)
		{
			ocu[i]=0;
		}
		
		for(int i=0; i<array.length; i++)
		{
			switch(array[i])
			{
				case 0:
					ocu[0]++;
					break;
				case 1:
					ocu[1]++;
					break;
				case 2:
					ocu[2]++;	
					break;
				case 3:
					ocu[3]++;
					break;
				case 4:
					ocu[4]++;
					break;
				case 5:
					ocu[5]++;
					break;
				case 6:
					ocu[6]++;
					break;
				case 7:
					ocu[7]++;
					break;
				case 8:
					ocu[8]++;
					break;
				case 9:
					ocu[9]++;
					break;
				case 10:
					ocu[10]++;
					break;
			}
		}
	}
	
	static void porcentajeAleatorios(int[] ocu, double[] por)
	{
		for(int i=0; i<por.length; i++)
		{
			por[i]=0;
		}
		
		for(int i=0; i<ocu.length; i++)
		{
			por[i]=(ocu[i]*100)/100.0;
		}
	}
	
	static void mostrarDatos(int[] a, double[] b)
	{
		System.out.println("Para cada número aleatorio: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(i + " = " + a[i] + " ==> " + b[i] + "%.");
		}
	}
		
	static void invertirArray(int[] array)
	{
		int temporal=0;
		
		for(int i=0; i<array.length/2; i++)
		{
			temporal=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temporal;
		}
	}
	
	static int minArray(int[] array)
	{
		int minimo=MAX_VALUES;
		
		for(int i=0; i<array.length; i++)
		{
			if(minimo>array[i])
				minimo=array[i];
		}
		
		return minimo;
	}
	
	static int maxArray(int[] array)
	{
		int maximo=MIN_VALUES;
		
		for(int i=0; i<array.length; i++)
		{
			if(maximo<array[i])
				maximo=array[i];
		}
		
		return maximo;
	}
	
	static int cantPares(int[] array)
	{
		int cont=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2 == 0)	
			cont++;
		}
				
		return cont;
	}
	
	static int cantImpares(int[] array)
	{
		int cont=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2 != 0)	
			cont++;
		}
				
		return cont;
	}
	
	static void numPares(int[] array, int[] pares)
	{
		int cont=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2 == 0)	
			{
				pares[cont]=array[i];
				cont++;
			}
		}
	}
	
	static void numImpares(int[] array, int[] impares)
	{
		int cont=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2 != 0)	
			{
				impares[cont]=array[i];
				cont++;
			}
		}
	}
	
	static int convertirEnteroEnArray(long num, int[] numeros)
	{
		boolean fin=false;
		int digitos=0;
		
		for(int i=0; !fin && i<numeros.length; i++)
		{
			if(num>0)
			{	
				numeros[i]=(int)(num%10);
				num=num/10;
				digitos++;
			}
			else
				fin=true;
		}
		return digitos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int ejercicio=0;

		ejercicio=opcionEjercicio(teclado);
		
		switch(ejercicio)
		{
			case 43:
			{
				int tamano=10;
				int[] array=new int[tamano];
				
				System.out.println("\n-----EJERCICIO 43-----RELLENAR Y MOSTRAR ARRAY DE 10 POSICIONES-----\n");
				rellenarArray(array, teclado);
				System.out.print("El array es: ");
				mostrarArray(array);
				break;
			}
			case 44:
			{
				System.out.println("-----EJERCICIO 44------INVERTIR NUMERO-----");
				int[] inverso = new int[5];
				
				inicializarArray(inverso);
				rellenarArray(inverso, teclado);
				invertirArray(inverso);
				System.out.print("Números al revés: ");
				mostrarArray(inverso);
				break;
			}
			case 45:
			{
				int[] array = {1,2,3,4,5};
				int[] arrayInvertido = new int[5];
				
				copiarArray(array, arrayInvertido);
				invertirArray(arrayInvertido);
				
				System.out.print("El array original es: ");
				mostrarArray(array);
				System.out.print("El array invertido es: ");
				mostrarArray(arrayInvertido);
				
				break;
			}
			case 46:
			{
				int[] array100=new int[100];
				int suma=0;
				float media=0;
				
				for(int i=0; i<100; i++)
				{
					array100[i]=i+1;
				}
				System.out.println("\n-----EJERCICIO 46-----OBTENER SUMA Y MEDIA DE ARRAY CON NUMEROS DEL 1 AL 100-----\n");
				suma=sumaArray(array100);
				media=mediaArray(array100);
				
				System.out.println("La suma de los 100 números es: [" + suma + "] y la media de los 100 números es: [" + media + "].");
				break;
			}
			case 47:
			{
				System.out.println("-----EJERCICIO 47------OBTENER LETRA DNI CON ARRAYS-----");
				int dni=0;
				int resul=0;
				String[] arrayDNI = new String[24];
				
				System.out.print("\nIntroduzca el número de DNI: ");
				dni=teclado.nextInt();
				teclado.nextLine();
				
				resul=dni%23;
				
				llenarArrayDNI(arrayDNI);
				System.out.println("\nLa letra del DNI " + dni + " es la [" + arrayDNI[resul] + "].");
				System.out.println("El DNI completo es: " + dni + arrayDNI[resul]);
				break;
			}
			case 48:
			{
				System.out.println("-----EJERCICIO 48------PALABRA OCULTA-----");
				
				String palabra = " ";
				char[] arrayAlfabeto = new char[28];
				
				llenarArrayAlfabeto(arrayAlfabeto);
				
				palabra=pedirLetras(arrayAlfabeto, teclado);
				
				System.out.println("La palabra que se ha creado es: " + palabra);
				break;
			}
			case 49:
			{
				System.out.println("-----EJERCICIO 49------OCURRENCIAS-----");
				
				int[] aleatorios = new int[100];
				int[] ocurrencias = new int[11];
				
				int min=0, max=0;
				
				llenarAleatorios(aleatorios);
				min=minArray(aleatorios);
				max=maxArray(aleatorios);
				ocurrenciasAleatorios(aleatorios, ocurrencias);
				System.out.println("El valor máximo del array es: " + max);
				System.out.println("El valor mínimo del array es: " + min);
				for(int i=0; i<ocurrencias.length; i++)
				{
					System.out.println("El número de ocurrencias para el número [" + i + "] es: -" + ocurrencias[i] + "-");
				}
				break;
			}
			case 50:
			{
				System.out.println("-----EJERCICIO 50------PALABRA OCULTA-----");
				int[] numeros = new int[10];
				int[] pares;
				int[] impares;
				float mediapares=0, mediaimpares=0;
				
				rellenarArray(numeros, teclado);
				
				pares=new int[cantPares(numeros)];
				impares=new int[cantImpares(numeros)];
				
				for(int i=0; i<numeros.length; i++) 
				{
					numPares(numeros, pares);
					numImpares(numeros, impares);
				}
				mediapares=mediaArray(pares);
				mediaimpares=mediaArray(impares);
				
				System.out.print("\nNúmeros pares: ");
				mostrarArray(pares);
				System.out.print("Números impares: ");
				mostrarArray(impares);
				System.out.println("Media números pares: " + mediapares);
				System.out.println("Media números impares: " + mediaimpares);
				break;
			}
			case 51:
			{
				System.out.println("-----EJERCICIO 51------OCURRENCIAS Y PORCENTAJE-----");
				
				int[] aleatorios = new int[100];
				int[] ocurrencias = new int[11];
				double[] porcentaje = new double[11];
				
				llenarAleatorios(aleatorios);
				ocurrenciasAleatorios(aleatorios, ocurrencias);
				porcentajeAleatorios(ocurrencias, porcentaje);
				mostrarDatos(ocurrencias, porcentaje);
				break;
			}
			case 52:
			{
				System.out.println("-----EJERCICIO 52------NUMERO AL REVÉS CON 20 DÍGITOS-----");
				
				int[] numeros= new int[20];
				int[] inverso;
				long num=0;
				int digitos=0;
				
				System.out.println("Introduzca el número que desea invertir: ");
				num=teclado.nextLong();
				teclado.nextLine();
				
				digitos=convertirEnteroEnArray(num, numeros);
				
				inverso=new int[digitos];
				
				for(int i=0; i<inverso.length; i++)
				{
					inverso[i]=numeros[i];
				}
				
				System.out.println("El número introducido por teclado es: " + num);
				System.out.print("El número invertido es: ");
				
				for(int i=0; i<inverso.length; i++)
				{
					System.out.print(inverso[i]);
				}
				break;
			}
		}
	}

}
