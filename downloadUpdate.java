public static void downloadUpdate() {
    String BASE_URL="http://localhost:8080/RESTDemo/rest/jar";
 
    Client client = ClientBuilder.newClient();
 
     
    try {
        URL website = new URL(BASE_URL);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("classes.jar");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
 
    } catch ( Exception ex) {
    ex.printStackTrace();
    }  
      
}