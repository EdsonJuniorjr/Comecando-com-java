package pctEmpregado;

public class TestePagamento {

	public static void main(String[] args) {
		
		Salario sal = new Salario("Jo�o", "123456789", 0, 2500);
		
		System.out.println("*** Rendimento de Mensalistas ***");
		System.out.println("Nome           : " + sal.getNome());
		System.out.println("Documento      : " + sal.getNrDocto());
		System.out.println("Salario mensal :" + sal.getSalarioMensal());
		
		
		sal.rendimentos();
		
		System.out.println("..........................");
		System.out.println("Rendimento     : " + sal.getRendimento());
		System.out.println("__________________________");
		System.out.println("");
		
		Horario hor = new Horario("Jo�o", "123456789", 0, 30.00, 12.0);
		
		System.out.println("*** Rendimento de Horistas ***");
		System.out.println("Nome            : " + hor.getNome());
		System.out.println("Documento       : " + hor.getNrDocto());
		System.out.println("Valor Hora      :" + hor.getSalario());
		System.out.println("N�mero de horas :" + hor.getHoras());

		
		hor.rendimentos();
		
		System.out.println("..........................");
		System.out.println("Rendimento      : " + hor.getRendimento());
		System.out.println("__________________________");
		System.out.println("");
		
		Comissao com = new Comissao("Jo�o", "123456789", 0, 20000.00, 0.45);
		
		System.out.println("*** Rendimento de Comissionados ***");
		System.out.println("Nome             : " + com.getNome());
		System.out.println("Documento        : " + com.getNrDocto());
		System.out.println("Vendas Brutas    : " + com.getVendaBruta());
		System.out.println("Taxa de comiss�o : " + com.getTaxaComissao());

		
		com.rendimentos();
		
		System.out.println("..........................");
		System.out.println("Rendimento       : " + com.getRendimento());
		System.out.println("__________________________");
		System.out.println("");

	}

}
