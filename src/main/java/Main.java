import ents.Entity;
import ents.Records;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStream inputStream = new FileInputStream(new File("src/main/resources/test.yaml"));

        Yaml yaml = new Yaml(new Constructor(Records.class));
        Records r = yaml.load(inputStream);
        List<Entity> filtred = r
                .getRecords()
                .stream()
                .filter(e -> e.getKEY1().equals("hhh"))
                .collect(Collectors.toList());

        if (filtred.isEmpty()) throw new Exception("1");
        if (filtred.size() > 1) throw new Exception("2");
        //return filtred
          //      .get(0)
            //    .getKEY2();

        System.out.println(filtred);
    }
}
