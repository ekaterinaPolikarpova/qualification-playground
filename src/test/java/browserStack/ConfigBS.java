import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class BrowserStackConfig {
    private Map<String, Object> config;

    public BrowserStackConfig() {
        Yaml yaml = new Yaml();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("browserstack.yml")) {
            config = yaml.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Cannot load browserstack.yml", e);
        }
    }

    public String get(String key) {
        return (String) config.get(key);
    }
}
