package pctEmpregado;

public class Horario extends Empregado {
	
	private double salario;
	private double horas;
	
	public Horario(String nome, String nrDocto, double rendimento, double salario, double horas) {
		super(nome, nrDocto, rendimento);
		
		if(salario<0)
		{
			throw new IllegalArgumentException("O salario por hora deve ser maior que zero!!!");
		}
		
		if(horas<0)
		{
			throw new IllegalArgumentException("O numero de horas trabalhadas deve ser maior que zero");
		}
		
		this.salario = salario;
		this.horas = horas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario<0)
		{
			throw new IllegalArgumentException("O salario por hora deve ser maior que zero!!!");
		}
		this.salario = salario;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if(horas<0)
		{
			throw new IllegalArgumentException("O numero de horas trabalhadas deve ser maior que zero");
		}
		this.horas = horas;
	}

	@Override
	public double rendimentos() {
		if(getHoras() <= 160)
			setRendimento(getSalario() * getHoras());
		else
			setRendimento(160 * getSalario() + (getHoras() - 160) * getSalario() * 1.5);
		return getRendimento();
	}
	
	
	
}
