package mycompany.com.core.utils;


import com.jayway.awaitility.core.ConditionFactory;
import mycompany.com.core.logger.LoggerFactory;
import mycompany.com.core.properties.PropertiesController;
import mycompany.com.core.properties.PropertiesNames;
import org.slf4j.Logger;

import static com.jayway.awaitility.Awaitility.with;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public final class WaitUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(WaitUtils.class);

    private static final long TIMEOUT = Long.parseLong(PropertiesController.getProperty(PropertiesNames.WAIT_UTILS_TIMEOUT));
    private static final long INTERVAL = Long.parseLong(PropertiesController.getProperty(PropertiesNames.WAIT_UTILS_INTERVAL));
    private static final String LOG_MESSAGE = "{} (elapsed time {}ms, remaining time {}ms)\n";

    private WaitUtils() {
    }

    public static ConditionFactory doWait() {
        return with()
                .conditionEvaluationListener(condition -> LOGGER.debug(LOG_MESSAGE, condition.getDescription(),
                        condition.getElapsedTimeInMS(), condition.getRemainingTimeInMS()))
                .await().atMost(TIMEOUT, MILLISECONDS).with().pollInterval(INTERVAL, MILLISECONDS);
    }

}