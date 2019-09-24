package com.utech.working_professional_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import working_lib.Certification;
import working_lib.IBreakableItem;
import working_lib.NetworkingProfessional;
import working_lib.Pipe;
import working_lib.Pliers;
import working_lib.PlumbingProfessional;
import working_lib.Professional;
import working_lib.PvcPipe;
import working_lib.Router;
import working_lib.Tool;
import working_lib.Wrench;

public class Driver {

	@SuppressWarnings({ "unused", "unused", "unused" })
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

 		
		Scanner k = new Scanner(System.in);
		List<Tool> list = new ArrayList<Tool>();
		Tool a = new Pliers("deawoo");
		Tool b = new Pliers("coby ");
		Tool c = new Pliers("pansonic");
		Tool d = new Pliers("dell");
		Tool e = new Pliers("Acer");

		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

//		System.out.println(" please enter your Name, Salary and Certifications(Number,Name) respectively  ");
//		Professional x = new PlumbingProfessional(k.next());
//		Certification j = new Certification(k.nextInt(), k.next());// stores certification information together in one
//																	// certification
//		x.addCertification(j);// add certificate to customers certificate list

//		System.out.print("Id--- " + x.getId() + "Name--- " + x.getName().toString()); 
		
		//d Prompt the user for details relating to their profession and create a professional object 
		//and store it in a variable named “prof” of type Professional
		
 		String name,certName,ans ;
 		int number,i,id ;
 		float salary;
 		try {
 			// block of code gathering information from professional
	 		System.out.println("please enter your id ");
	 		id = k.nextInt();
			System.out.println("please enter your profession name ");
			name = k.next();
			System.out.println("please enter your Salary ");
			salary = k.nextFloat();
			List<Certification> certlist = new ArrayList<Certification>();
			//Certification certArray[];
			
			do {// block of code adding info to the professionals certification list  
					
					System.out.println("please enter your certificate number  ");
					number = k.nextInt();
					System.out.println("please enter your certificate name  ");
					certName = k.next();
					certlist.add(new Certification(number,certName));
					
					System.out.println("Would you like to Enter another certificate ? ");
					ans=k.next();
			}
			while (ans.equalsIgnoreCase("yes"));
	 		
			Pipe elbow = new PvcPipe(2.0f,3.9f,"pink");
			Wrench wrench = new Wrench("lug",1.5f);
			Pliers pliers = new Pliers("slip-joint");
			
			elbow.updateDamage(45f);
			
			if ( name.equalsIgnoreCase("plumber"))
			{
				 PlumbingProfessional prof = new PlumbingProfessional(id,name,salary,certlist);
				 prof.fixPipe(elbow, pliers);
				 prof.fixPipe(elbow, wrench);

			//	Certification m = new Certification(k.nextInt(), k.next());
			}
			else if(name.equalsIgnoreCase("networker"))
			{
				 NetworkingProfessional prof = new NetworkingProfessional(id,name,salary,certlist);
				//Certification l = new Certification(k.nextInt(), k.next());

			}
			
			
			
 		}
 		catch(Exception f) {
 			System.out.println("An error has occured ");

 		}
		
		// e
		IBreakableItem Item = new PvcPipe();
		Item.updateDamage((float) 3.5);
		//f

		// g
		System.out.println("Amazing Work!");

	}

}
