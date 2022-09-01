package manyOne;

public class MainApp {

	public static void main(String[] args)
	{
		
		Marks eng =new Marks("English",85);
		Marks tam =new Marks("Tamil",90);
		Marks mat =new Marks("Mathematics",98);
		Marks phy =new Marks("Physics",100);
		Marks chem =new Marks("Chemistry",98);
		Marks computer =new Marks("Computer Science",98);
		
		Marks[] mark =new Marks[6];
		mark[0]=eng;
		mark[1]=tam;
		mark[2]=mat;
		mark[3]=phy;
		mark[4]=chem;
		mark[5]=computer;
		
		
		student stud =new student("Tony stark",17,12,mark);
		stud.display();
		
		

	}

}
