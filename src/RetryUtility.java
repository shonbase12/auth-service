// Structured logging implementation in RetryUtility.java

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryUtility {
    private static final Logger logger = LoggerFactory.getLogger(RetryUtility.class);

    public static void retry(Runnable task) {
        try {
            task.run();
            logger.info("Task executed successfully.");
        } catch (Exception e) {
            logger.error("Task execution failed: {}", e.getMessage(), e);
            // Implement retry logic here
        }
    }
}