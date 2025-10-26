package Design_Patterns.CreationalPatterns.BuilderPattern;

public class Url {
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public Url(){
    }

    public Url(String protocol){
        this.protocol = protocol;
    }

    public Url(String protocol,String hostname){
        this.protocol = protocol;
        this.hostname = hostname;
    }

    public Url(String protocol,String hostname,String port){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
    }

    public Url(String protocol,String hostname,String port,String pathParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
    }

    public Url(String protocol,String hostname,String port,String pathParam,String queryParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

    public String getProtocol(){
        return protocol;
    }

    public void setProtocol(String protocol){
        this.protocol = protocol;
    }

    public String gethostname(){
        return hostname;
    }

    public void setHostname(String hostname){
        this.hostname = hostname;
    }

    public String getPort(){
        return port;
    }

    public void setPort(String port){
        this.port = port;
    }

    public String getPathParam(){
        return pathParam;
    }

    public void setPathParam(String pathParam){
        this.pathParam = pathParam;
    }

    public String getQueryParam(){
        return queryParam;
    }

    public void setQueryParam(String queryParam){
        this.queryParam = queryParam;
    }


}
