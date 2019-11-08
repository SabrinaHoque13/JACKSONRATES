package com.spartaglobal.HTTPServices;

import com.spartaglobal.APIProject.FixerURLConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.http.HttpClient;

public class FixerHTTPServices {
    private CloseableHttpResponse fixerResponse;
    private String fixerCommentsJSONString;

    //public CloseableHttpResponse getFixerResponse() { return fixerResponse;}


    public void executeAlbumsGetRequest(){
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        String commentsServiceURL = FixerURLConfig.BASEURL;
        HttpGet httpGet = new HttpGet(commentsServiceURL);
        try {
            fixerResponse = closeableHttpClient.execute(httpGet);
            fixerCommentsJSONString = EntityUtils.toString(fixerResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String getFixerCommentsJSONString() { return fixerCommentsJSONString; }
}
