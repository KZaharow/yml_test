import ents.Records;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        InputStream inputStream = new FileInputStream(new File("src/main/resources/test.yaml"));

        Yaml yaml = new Yaml(new Constructor(Records.class));
        Records data = yaml.load(inputStream);
        System.out.println(data);
    }
}
