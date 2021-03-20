package com.practicas.UF4;


public class Persona {
	
	// es mala practica inicializar aqui los valores de los atributos:
	
	private String nom;
	private int edat;
	private String dni; 
	private char sexe;
	private float pes;
	private float alcada;
	
	
	// Constructor por defecto:
	
	public Persona() {
		
		// Inicializamos todas las variables con los valores por defecto: 
		
		this.nom = "";
		this.edat = 0;
		this.dni = this.generaDNI(); // Numero entero de 8 digitos si no encontramos lo de la letra
		this.sexe = 'D';
		this.pes = 0.0f;
		this.alcada = 0.0f;	
	}
	
	public Persona(String nom, int edat, char sexe) { // constructor nom, edat, sexe
		this.nom = nom; // This hace referencia al private String nom
		this.edat = edat;
		this.sexe = this.comprobarSexo(sexe);	
	}
	
	// Un constructor amb tots els atributs com a par�metre.
	
	public Persona(String nom, int edat, char sexe, float pes, float alcada) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.sexe = this.comprobarSexo(sexe);
		this.pes = pes;
		this.alcada = alcada;
		this.dni = this.generaDNI();
	}
	
	
	// Methods:
	
	/* calculaIMC (): calcula si la persona est� en el seu pes ideal (pes en kg / (al�ada ^ 2 en m)). Aquest m�tode retornar� els seg�ents valors:
	 * 
				a) -1 si la f�rmula retorna un valor menor que 20. Aix� vol dir que est� en el seu pes ideal.
				
				b) 0 si la funci� retorna un valor entre 20 i 25 (inclosos). Aix� vol dir que aquesta persona est� per sota del seu pes ideal.
				
				c) 1 si la funci� retorna un valor m�s gran que 25. Aix� vol dir que t� sobrep�s.
	*/
	
	// calcular IMC
	float calculaIMC() {
		float imc = pes / (alcada * alcada);
		
		if (imc < 20) {
			System.out.println("Pes molt baix");
			return -1;
		} else if (imc <= 25) {
			System.out.println("Pes ideal");
			return 0;
		} else {
			System.out.println("Sobrepes");
			return 1;
		} 
	}
	
	// generar DNI (sin letra)
	String generaDNI() {
		
		// calcular numero random del DNI:
		
		int dni = (int)( Math.random() * (99999999 + 1 - 10000000) + 10000000 );
		
		// calcular la letra DNI:
		
		String caracteres = "TRWAGMYFPDXBNJZAQVHLCKE";
		int modulo = dni % 3;
		char lletra = caracteres.charAt(modulo);
		
		String DNI = "";
		DNI += dni;
		DNI += lletra;
		
		return DNI;
	}
	
	// esMajorEdat (): indica si �s major d'edat, retorna un boole�. 
	 
	boolean esMajorEdat () {
			
		if (edat >= 18) { // si es menor de 18
			System.out.println("�s major d'edat");
			return true; // �s major d'edat TRUE
		} else {
			System.out.println("No �s major d'edat");
			return false;  // no �s major d'edat FALSE
		}
	}
			
	// comprobarSexo (char sexe): comprova que el sexe introdu�t �s correcte. 
	// * S� no �s correcte, ser� H. No ser� visible a l'exterior. (Esto quiere decir PRIVATE)
	
	private char comprobarSexo(char sexe) {	
		return sexe == 'D' ? sexe : 'H';	
	}
	
	// toString (): retorna tota la informaci� de l'objecte.
	
	public String toString() {
		
		String auxiliar = "";
		auxiliar += nom + ", " + edat + ", " + dni + ", " + sexe + ", " + pes + " i " + alcada;
		return (auxiliar);
	}
	
	
	// SETTERS AND GETTERS
	
	// click derecho > Source > Generate Setters and Getters
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public float getPes() {
		return pes;
	}

	public void setPes(float pes) {
		this.pes = pes;
	}

	public float getAlcada() {
		return alcada;
	}

	public void setAlcada(float alcada) {
		this.alcada = alcada;
	}


	
	
}
