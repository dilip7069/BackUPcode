package dummy;
import java.util.*;


public class One 
{

    public static void main(String[] args) throws InterruptedException
    {
       Scanner sc=new Scanner(System.in);
       int nodes=sc.nextInt();
       int queries=sc.nextInt();
       int matrix[][] = new int[nodes][2];
       int localhead, localtail;
       int choice,node;
       int node1, node2; 
       int max=0,temp;
       int head;
       localhead=sc.nextInt();
       head=localhead;
       localtail=sc.nextInt();
       matrix[localtail][0]=localhead;
       for(int i=1;i<nodes-1;i++)
       {
           localhead=sc.nextInt();
           localtail=sc.nextInt();
           matrix[localtail][0]=localhead;
       }
       
       for(int i=0;i<queries;i++)
       {
           choice=sc.nextInt();
           if(choice==1)
           {   
               
               node=sc.nextInt();
               matrix[node][1]=sc.nextInt();
              
           }
           else if(choice==2)
           {
               max=0;
               node1=sc.nextInt();
               node2=sc.nextInt();
               while(node2!=head)
               {
                   temp=matrix[node2][1];
                   node2=matrix[node2][0];
                   if(max<temp)
                   {
                       max=temp;
                   }
                   Thread.sleep(1000);
                   System.out.println("Node"+node2);
                       
               }
           }
           sc.nextLine();
       }
 
       System.out.println(max);
       sc.close();
    }
}
