package org.pmt.util;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestUtil {

    public String requestHttp(URL url, String requestMethod) throws IOException {
        String response = null;
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(requestMethod);
        conn.connect();
        if(conn.getResponseCode() == 200) {
            InputStream in = conn.getInputStream();
            String encoding = conn.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;
            response = IOUtils.toString(in, encoding);
        }
        return response;
    }

}
