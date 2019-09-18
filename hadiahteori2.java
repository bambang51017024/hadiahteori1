import java.util.Scanner;
public class hadiahteori2 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		
		String NM, Alm;
		int Thn;
			System.out.print("Input Nama : ");
			NM=input.nextLine();
			System.out.print("Input Alamat : ");
			Alm=input.nextLine();
			System.out.print("Input Umur : ");
			Thn=input.nextInt();
			System.out.println();
			
			System.out.println("Saudara : "+NM);
			System.out.println("Tinggal Di : "+Alm);
			System.out.println("Berumur : "+Thn+" Thn");
  }   
    
}