package renato;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class Hello extends Agent 
{ 
    protected void setup() 
    { 
        System.out.println("Setup!!");
        addBehaviour(  // -------- Anonymous SimpleBehaviour 

            new SimpleBehaviour( this ) 
            {
                int n=0;
                
                public void action() 
                {
                    System.out.println( "Hello, World! My name is " + 
                        myAgent.getLocalName() );
                    n++;
                }
        
                public boolean done() {  return n>=3;  }
            }
        );
    }
} 
