import java.io.FileOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
	
	private int id;
	private String name;
	public Serialization(int id,String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serialization so= new Serialization(1,"Ricka");
		//FileOutputStream fos=new FileOutputStream("C:\\Ricka\\Documents\\Ricka_Sap\\Personal\Documnets\Random.txt");
		
		
	}

}
