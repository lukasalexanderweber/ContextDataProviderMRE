package custom.context.data.provider;

import java.util.Map;
import org.apache.logging.log4j.core.util.ContextDataProvider;

public class MyContextDataProvider implements ContextDataProvider {

  static final Map<String, String> MAP = Map.of("tenant", "tenant1");

  @Override
  public Map<String, String> supplyContextData() {
    return MAP;
  }

}
