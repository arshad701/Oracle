
package controller;
import model.WoodItem;

import java.io.*;
import java.util.StringTokenizer;




public class HardwoodSeller {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// the input.txt has the order details which is saved in the src folder
		//use it for execution.
		readInputFile("input.txt");
		
	}
	
	public static void readInputFile(String inputFilePath)throws IOException {
		
			//entering the 6 items since there are 6 wood types 
			WoodItem wood[] = new WoodItem[6];
			
			
		    BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
		    try {
		        //reading the lines
		        String line = br.readLine();
		        String line2 = br.readLine();
		        
		        //It gets the values of the first line in the string array
		        String[] s1 = line.split(";");
		        
		        
		        int x = 0;
		        StringTokenizer st=new StringTokenizer(line2,";:");
		        
		        //for storing the names and values of the line
		        String name[] = new String[6];
		        int value[] = new int[6]; 
		        
		        while(st.hasMoreElements()){
		        	 name[x] = st.nextToken();
		        	
		        	 value[x] = Integer.parseInt(st.nextToken());
		        	 x++;
		        }
		        
		       int k=0; 
		        
		        for(k=0;k<x;k++)
				{
                             
                  float delivery = 0.0f;
                  double price = 0.0f;
                  float time = 0.0f;
                  String woody = name[k];
                  if(woody.equals("Cherry"))
                    {
                	  price=(float) 5.95;
                      delivery=2.5f;
                    }
                 else if(woody.equals("Curly Maple"))
                    {
                       price=(float)6.0;
                       delivery=1.5f;
                    }
                 else if(woody.equals("Genuine Mahogany"))
                                    {
                                     price=(float)9.60;
                                     delivery=3.0f;
                                    }
                 else if(woody.equals("Wenge"))
                                    {
                                     price=(float)22.35;
                                     delivery=5f;
                                    }
                 else if(woody.equals("White Oak"))
                                    {
                                     price=(float)6.70;
                                     delivery=2.3f;
                                    }
                 else if(woody.equals("Saw Dust"))
                                    {
                                     price=(float)1.5;
                                     delivery=1f;
                                    }
                 int no_of_bds=value[k];
                                    
                 if(no_of_bds>0&&no_of_bds<=100)
                                    {
                                    time=1;
                                    }
                 else if(no_of_bds>100&&no_of_bds<=200)
                                    {
                                      time=2;
                                    }
                 else if(no_of_bds>200&&no_of_bds<=300)
                                    {
                                     time=3;
                                    }
                 else if(no_of_bds>300&&no_of_bds<=400)
                                    {
                                     time=4;
                                    }
                 else if(no_of_bds>400&&no_of_bds<=500)
                                    {
                                      time=5;
                                     }
                 else if(no_of_bds>500&&no_of_bds<1000)
                                   {
                                     time=5.5f;
                                    }
				
               double deltime=(double)delivery*time;
                                 
               double total_price=(double)no_of_bds*price;
                                  //double feet1=(double)feet;
                             wood[k]=new WoodItem(woody,deltime,price,no_of_bds,total_price);
                         }
		        System.out.println("Buyername: "+s1[0]);
		        System.out.println("Address: "+s1[1]);
		                
		 for(int j=0;j<x;j++)
		     {
		      System.out.println("Wood type: "+wood[j].getType()+" -- "+wood[j].getQuantity()+" -- "+wood[j].getPrice());
		      System.out.println("total price is : "+wood[j].getTotal());
		                                   
		     }
		     double max=0.0;
		                                
		    for (int temp = 0; temp < x; temp++)
		                {
		                    if (wood[temp].getBaseDeliveryTime() > max)
		                 {
		                  max = wood[temp].getBaseDeliveryTime();
		                  
		                 }
		        
		                }  
		                System.out.println("estimated deliverytime is :" + max);                       
		                        
		     
		    double total = 0.0;         
		    for(int p=0;p<x;p++)
		    {
		    
		    	 total += wood[p].getTotal();
		    }
		                
		     System.out.println("The total price of the product is :" + total);           
		          
		    } finally {
		        br.close();
		    }
		}
	}
	

