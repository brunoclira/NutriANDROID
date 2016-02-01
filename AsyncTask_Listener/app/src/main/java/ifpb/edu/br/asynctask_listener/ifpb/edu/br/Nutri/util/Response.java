package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.util;

/**
 * Created by Bruno on 01/02/2016.
 */

public class Response {

    private int statusCodeHttp;

    private String contentValue;

    public Response(int statusCodeHttp, String contentValue) {
        this.statusCodeHttp = statusCodeHttp;
        this.contentValue = contentValue;
    }

    public int getStatusCodeHttp() {
        return statusCodeHttp;
    }

    public void setStatusCodeHttp(int statusCodeHttp) {
        this.statusCodeHttp = statusCodeHttp;
    }

    public String getContentValue() {
        return contentValue;
    }

    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }
}
