package custom.context.data.provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class MyContextDataProviderTest {

  @Test
  void test() {
    // it works when the tenant is set via the ThreadContext
    // ThreadContext.put("tenant", "tenant1");

    Logger logger = LogManager.getLogger("MyLogger");
    logger.info("Hello tenant1");
  }

}
