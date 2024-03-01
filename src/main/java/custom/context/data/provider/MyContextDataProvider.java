package custom.context.data.provider;

import java.util.Map;
import org.apache.logging.log4j.core.util.ContextDataProvider;

public class MyContextDataProvider implements ContextDataProvider {

  @Override
  public Map<String, String> supplyContextData() {
    return Map.of("tenant", "tenant1");
  }

}
