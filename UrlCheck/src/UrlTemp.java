import java.net.*;
import java.io.*;


import com.google.gson.*;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.json.JSONArray;



import javax.activation.DataHandler;
import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UrlTemp {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
Coordinates coord = new Coordinates(54.69,25.28);
;
URL url = new URL("https://api.darksky.net/forecast/5349013d1719c7589232a8aecaaea17b/"+coord.getLon()+","+coord.getLat()+"?exclude=minutely,daily,hourly,alerts,flags");
//67f909868e97aa25f0e6d72b88054c25
              URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
            in.close();
        URLConnection request = url.openConnection();
        request.connect();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject rootobj = root.getAsJsonObject();
        String latitude    = rootobj.get("latitude")  .getAsString();
        String longitude   = rootobj.get("longitude") .getAsString();
        System.out.println("Latitude="+latitude);
        System.out.println("Longitude="+longitude);
        JsonObject jsonObject2 = (JsonObject) rootobj;
        JsonObject info = (JsonObject)  jsonObject2.get("currently");
        System.out.println("Wind speed ="+info.get("windSpeed"));
        System.out.println("Wind Bearing="+info.get("windBearing"));
        Direction dir = new Direction();
        dir.setBearing(info.get("windBearing").getAsDouble());
        System.out.println("Wind direction: "+dir.getDirection());





    }
}
