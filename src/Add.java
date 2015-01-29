
public class Add {
public void Addi(int a,int b)
{System.out.println(a + b); 
} 
public void Addi(String x,String y){ 
System.out.println(x + y); 

} 
public void Addi(float c,float d)
{
	System.out.println(c+d);
}




	public static void main(String [] args){ 
		Add m= new Add(); 

		m.Addi(7,8); 
		m.Addi("he", "llo"); 
		m.Addi(1.0f,2.0f); 

}; 


}
