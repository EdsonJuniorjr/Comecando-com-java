package pctFigurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {
		
		FiguraTriangulo triangulo = new FiguraTriangulo();
		triangulo.setAltura(10);
		triangulo.setBase(20);
		triangulo.calculaArea(triangulo.getBase(), triangulo.getAltura());
		
		System.out.println("Calculando a area do triangulo...");
		System.out.println("A altura �: " + triangulo.getAltura());
		System.out.println("A base �: " + triangulo.getBase());
		System.out.println("A area do triangulo �: " + triangulo.getArea());
		System.out.println("-----------------");
		
		FiguraRetangulo retangulo = new FiguraRetangulo();
		retangulo.setAltura(10);
		retangulo.setBase(20);
		retangulo.calculaArea(retangulo.getBase(), retangulo.getAltura());
		
		System.out.println("Calculando a �rea do ret�ngulo...");
		System.out.println("A altura ret�ngulo �: " + retangulo.getAltura());
		System.out.println("A base do ret�ngulo �: " + retangulo.getBase());
		System.out.println("A �rea do ret�ngulo �: " + retangulo.getArea() );

	}

}
