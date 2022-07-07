package pctFigurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {
		
		FiguraTriangulo triangulo = new FiguraTriangulo();
		triangulo.setAltura(10);
		triangulo.setBase(20);
		triangulo.calculaArea(triangulo.getBase(), triangulo.getAltura());
		
		System.out.println("Calculando a area do triangulo...");
		System.out.println("A altura é: " + triangulo.getAltura());
		System.out.println("A base é: " + triangulo.getBase());
		System.out.println("A area do triangulo é: " + triangulo.getArea());
		System.out.println("-----------------");
		
		FiguraRetangulo retangulo = new FiguraRetangulo();
		retangulo.setAltura(10);
		retangulo.setBase(20);
		retangulo.calculaArea(retangulo.getBase(), retangulo.getAltura());
		
		System.out.println("Calculando a área do retângulo...");
		System.out.println("A altura retângulo é: " + retangulo.getAltura());
		System.out.println("A base do retângulo é: " + retangulo.getBase());
		System.out.println("A área do retângulo é: " + retangulo.getArea() );

	}

}
