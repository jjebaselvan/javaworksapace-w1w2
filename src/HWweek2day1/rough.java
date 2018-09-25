package HWweek2day1;

public class rough {

	public static void main(String[] args) {
		public class Employee {
		    private String name;
		    private int ID;
		    private double salary;
		    
		    public Employee( String name, int ID, double salary){
		        setNome(name);
		        setID(ID);
		        setSalario(salary);
		    }

		    public void display(){
		        System.out.printf("Employee %s, ID:%d earns %.2f per month", getName(),getID(),getSalary());
		    }
		    
		    public void setName( String name ){
		        this.name = name;
		    }
		    
		    public void setID( int ID ){
		        this.ID = ID;
		    }
		    
		    public void setSalary( double salary ){
		        this.salary = salary;
		    }
		    
		    public String getName(){
		        return name;
		    }
		    
		    public int getID(){
		        return ID;
		    }
		    
		    public double getSalary(){
		        return salary;
		    }
		}

	}

}
