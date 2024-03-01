package custom.context.data.provider;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin(name = "my", category = StrLookup.CATEGORY)
public class MyStrLookup implements StrLookup{
    @Override
    public String lookup(final String key) {
        return MyContextDataProvider.MAP.get(key);
    }

    @Override
    public String lookup(final LogEvent event, final String key) {
        return lookup(key);
    }
}
