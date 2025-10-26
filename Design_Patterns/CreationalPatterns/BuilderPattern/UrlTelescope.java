package Design_Patterns.CreationalPatterns.BuilderPattern;

public class UrlTelescope {
    //telescoping constructor problem
    
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public UrlTelescope(){
    }

    public UrlTelescope(String protocol){
        this.protocol = protocol;
    }

    public UrlTelescope(String protocol, String hostname){
        this(protocol);
        this.hostname = hostname;
    }

    public UrlTelescope(String protocol, String hostname, String port ){
        this(protocol,hostname);
        this.port = port;
    }

    public UrlTelescope(String protocol, String hostname, String port, String pathParam ){
        this(protocol,hostname, port);
        this.pathParam = pathParam;
    }

    public UrlTelescope(String protocol, String hostname, String port, String pathParam, String queryParam ){
        this(protocol,hostname, port, pathParam);
        this.queryParam = queryParam;
    }


    
}
