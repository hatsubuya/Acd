/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		Vehicle vehicle = new Vehicle(4, 50.0, 25.0);
		
        Truck truck = new Truck(2, 100.0, 10.0, 10.0);
        
        OffRoad offRoad = new OffRoad(5, 60.0, 15.0, 12.0);

        
        System.out.println("Informações do veiculo:");
        System.out.println("Passageiros: " + vehicle.getPassengers());
        System.out.println("combustivel maximo: " + vehicle.getFuelCap() + " L");
        System.out.println("eficiencia do combustível: " + vehicle.getMpg() + " mpg");
        System.out.println("distancia maxima " + vehicle.maxDistance() + " km\n");

        System.out.println("Informações do caminhao:");
        System.out.println("Passageiros: " + truck.getPassengers());
        System.out.println("Capacidade de combustível: " + truck.getFuelCap() + " galões");
        System.out.println("Eficiência de combustível: " + truck.getMpg() + " mpg");
        System.out.println("Distância máxima: " + truck.maxDistance() + " milhas");
        System.out.println("Capacidade de carga: " + truck.getCargoCap() + " toneladas\n");

        System.out.println("Informações do veículo Off-Road:");
        System.out.println("Passageiros: " + offRoad.getPassengers());
        System.out.println("Capacidade de combustível: " + offRoad.getFuelCap() + " galões");
        System.out.println("Eficiência de combustível: " + offRoad.getMpg() + " mpg");
        System.out.println("Distância máxima: " + offRoad.maxDistance() + " milhas");
        System.out.println("Clareza do solo: " + offRoad.getGroundClearance() + " unidades");
        
        
        
        
        
	}
}
