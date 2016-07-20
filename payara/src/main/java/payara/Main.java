package payara;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

//import java.util.logging.Level;

//import org.glassfish.embeddable.BootstrapProperties;
//import org.glassfish.embeddable.GlassFish;
//import org.glassfish.embeddable.GlassFishException;
//import org.glassfish.embeddable.GlassFishProperties;
//import org.glassfish.embeddable.GlassFishRuntime;

//import com.hazelcast.logging.Logger;

public class Main {

	public static void main(String[] args) throws  BootstrapException {
		
		/* try 
	        {
	            BootstrapProperties bootstrap = new BootstrapProperties();
	            GlassFishRuntime runtime = GlassFishRuntime.bootstrap();
	            GlassFishProperties glassfishProperties = new GlassFishProperties();
	            glassfishProperties.setPort("http-listener", 8083);
	            glassfishProperties.setPort("https-listener", 8184);
	            GlassFish glassfish = runtime.newGlassFish(glassfishProperties);
	            glassfish.start();
	        }
	        
	        catch (GlassFishException ex) 
	        {
	            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, 
	                    null, ex);
	        }*/
		PayaraMicro.getInstance()                           
        .addDeployment("wars/wars-0.0.1-SNAPSHOT.war")                            
    	.bootStrap();    
	}
	
}
