package amanda.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.*;


public class Service {

	public static void main(String[] args) throws Exception {
	    String content = readUrl("https://goout.net/services/feeder/v1/events.json?source=jsontest.com");
        Gson gson = new Gson();
		Response response = gson.fromJson(content, Response.class);
		System.out.println(response);
    }



    private static String readUrl(String targetUrl) throws IOException {
        URL url = new URL(targetUrl);
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(url.openStream()));

        StringBuilder stringBuilder = new StringBuilder();

        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null)
        {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        bufferedReader.close();
        return stringBuilder.toString().trim();
    }
}