import java.util.ArrayList;

public class TC_Extra_Practice {

	public static void main(String[] args) {
		
		ArrayList<Job> jobs = new ArrayList<Job>();
		
		//jobs.add(new Job("Nigar",14000,1));
		//jobs.add(new Job("Eamy",16000,2));
		//jobs.add(new Job("Mehjaben",20000,3));
		
		
		
	Job nigar = new Job("Nigar",14000,1);
	Job eamy = new Job("Eamy",15000, 2);
	Job mehjaben = new Job("Mehjaben",20000,3);
	
	jobs.add(nigar);
	jobs.add(eamy);
	jobs.add(mehjaben);
	
	
	for(Job job: jobs) {
		if(job.salary>=15000) {
			System.out.print("Name :" +job.name + "\tID :"+ job.id);
			System.out.print("\tSalary :" +job.salary + "\n");
		}
	}
		
		

	}

}
       class Job {
	   String name;
	   int salary;
	   int id;
	   
       Job(String name, int salary,int id) {
		 this.name=name;
		 this.salary= salary;
		 this.id = id;
	 }
	
	 }
 
  