@GET
@Path("/jar")
@Produces(MediaType.APPLICATION_OCTET_STREAM)
public Response downloadFile() {
    File file = new File("/home/user/Downloads/classes.jar");
    ResponseBuilder response = Response.ok((Object) file);
    response.header("Content-Disposition", "attachment;filename=classes.jar");
    return response.build();
}