package com.savan.opertion;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.savan.main.ClientMain;
import com.savan.utility.ClientUtility;

/**
 * @author SAVAN
 *
 */
@Component
public class ClientOperation {
	
	//initializing logger 
	private static final Logger logger = LogManager.getLogger(ClientMain.class);
	
	//property define as class
	private ClientUtility cliUtility;
	
	
	/**
	 * @param cliUtility the cliUtility to set
	 */
	@Autowired
	public void setCliUtility(ClientUtility cliUtility) {
		this.cliUtility = cliUtility;
	}


	//public method to perform operation
	public void execute(int option, List list) {
		
		Scanner s = new Scanner(System.in);		//Scanner Class Object
		
			try {
				switch (option) {
				// Case 1 : To printing the List 
				case 1:
					System.out.println("The Default List:");
					cliUtility.print(list);
					break;

				//Case 2 : To Add Element To the list
				case 2:
					System.out.println("Enter Number To Insert:");

					int number = s.nextInt(); //element to insert exixsting array

					System.out.println("Enter Position For Insertion:");

					int insposition = s.nextInt(); //position to insert element in exixsting array

					cliUtility.addNumber(list, number, insposition);

					System.out.println("List After Element inserted:");

					cliUtility.print(list);

					cliUtility.sort(list);

					System.out.println("Sorted List After Element inserted:");

					cliUtility.print(list);
					break;

				//Case 3 : To Remove Element From The List
				case 3:
					System.out.println("Enter Position To Delete Element:");

					int delposition = s.nextInt(); //position from delete element in exixsting array

					System.out.println("List before Deletion:");

					cliUtility.print(list);

					cliUtility.delNumber(list, delposition);

					System.out.println("List After Deletion:");

					cliUtility.print(list);

					cliUtility.sort(list);

					System.out.println("Sorted List After Deletion:");

					cliUtility.print(list);
					break;

				//Case 4 : To Perform The Insertion operation
				case 4:
					cliUtility.sort(list);
					System.out.println("List After Insertion Sort Performed");
					cliUtility.print(list);
					break;

				//Case 5 : To Get Out Of TheLoop Of Code Execution
				case 5:
					boolean exit = true;
					break;

				//Default Case To Manage User Input
				default:
					System.out.println("Please Selct Apropriat Option");
					break;
				}
			} catch (Exception e) {
				logger.error(" * Positive Integer Numbers Only..!!");
			} 
	}
}
