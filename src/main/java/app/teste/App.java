package app.teste;

import java.util.LinkedList;
import java.util.List;

public class App 
{
	private static void distancias() {    			
        System.out.println( "Testando distâncias no google maps");
        
		List<Local> locais = new LinkedList<>();
		DistanceCalculator calculos = new DistanceCalculator();
		
		//Lista de locais
		Local l1 = new Local("Great",-3.7465646,-38.5780218);
		Local l2 = new Local("Cantina da Química", -3.7464669, -38.5779165);
		Local l3 = new Local("Cantina da Geologia", -3.7467241,-38.5734502);
		Local l4 = new Local("Lanchonete Alfa e Ômega", -3.7457293,-38.5730363);
		Local l5 = new Local("Cantina+da+Engenharia+de+Pesca", -3.7420005,-38.5759716);
		Local l6 = new Local("Dudes+Lanches",-3.7392888,-38.5713145);
		
		locais.add(l1);
		locais.add(l2);
		locais.add(l3);
		locais.add(l4);
		locais.add(l5);
		locais.add(l6);
		
		//Calcula as distancias entre os locais da lista 
		for (int i=0; i < (locais.size()-1); i++) {
			for (int j=i+1; j<locais.size(); j++) {
				System.out.println("Distancia do " + locais.get(i).getDescricao() + " para " + locais.get(j).getDescricao() + " : "  
						+ calculos.distance(locais.get(i).getLatitude(), locais.get(i).getLogintude(), locais.get(j).getLatitude(), locais.get(j).getLogintude()));		
			}
		}
		System.out.println("");
		
		Usuario usuario = new Usuario("Armando", -3.7465646,-38.5780218);
		//Dado um usuário checa a distancia que ele passou na lista de locais
		calculos.checkUserContext(usuario, locais);
		
	}

    public static void main( String[] args )
    {
    	distancias();
    }

}
