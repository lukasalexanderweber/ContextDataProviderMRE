package custom.context.data.provider;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Paths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MyContextDataProviderTest {

  @Test
  void test() {
    Logger logger = LogManager.getLogger("MyLogger");
    logger.info("Hello");
    assertThat(Paths.get("target/logs/tenant1/logs.log")).content()
            .contains("tenant1");
  }

}
