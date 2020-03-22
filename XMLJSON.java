import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

public class XMLTOJSON {
    public static void main(String[] args) throws IOException {
        String xmlFile = System.getProperty("user.dir") + "\\file.xml";

        xmlString = new String(Files.readAllBytes(Paths.get(xmlFile)));
        xmlJSONObj = XML.toJSONObject(xmlString);

        String jsonFile = System.getProperty("user.dir") + "\\file.json";

        try (FileWriter fileWriter = new FileWriter(jsonFile)){
            fileWriter.write(xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR));
        }
    }
}
