package Design_Patterns.CreationalPatterns.BuilderPattern;

public class Main {
    public static void main(String [] args){
        // Url url = new Url();
        // url.setProtocol("https://");
        // url.setHostname("myWebsite");
        // url.setPort(":8080/");
        // url.setPathParam("homePage");
        // url.setQueryParam("random");


        // System.out.println(url.getProtocol());
        // System.out.println(url.gethostname());
        // System.out.println(url.getPort());
        // System.out.println(url.getPathParam());
        // System.out.println(url.getQueryParam());


        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        /*Creates an instance of the static inner Builder class inside BuilderPattern.
         This object (builder) will temporarily hold all field values you want to set before constructing the final BuilderPattern object.
      ➡️ Memory-wise, this is just a separate object with fields: protocol, hostname, port, etc. */
        builder.protocol("https://").hostname("myWebsite:").port("443");
        /*This line:Calls setter-like methods on the builder:
          builder.protocol("https://") sets the protocol field inside the builder to "https://", then returns the builder object itself.
         .hostname("myWebsite:") sets the hostname, returns the same builder.
         .port("443") sets the port. */
        BuilderPattern builderPattern = builder.build();
        /*It:Calls the BuilderPattern constructor.
        Passes the builder (current instance) to the constructor.
        The constructor of BuilderPattern copies all values from the builder: */

        System.out.println(builderPattern.protocol);
        System.out.println(builderPattern.hostname);
        System.out.println(builderPattern.port);

    }
    
}
