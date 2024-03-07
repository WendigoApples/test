package com.annotations_testing.test.healthCheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import static java.lang.Runtime.getRuntime;

public class MemeoryHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        long freeMemory = Runtime.getRuntime().freeMemory();
        Long totalMemory = Runtime.getRuntime().totalMemory();
        double freeMemoryPercent = ((double) freeMemory / (double) totalMemory) * 100;
        if (freeMemoryPercent > 25) {
            return Health.up()
                    .withDetail("free_memory", freeMemory + " bytes")
                    .withDetail("total_memory", totalMemory + " bytes")
                    .withDetail("free_memory_percent", freeMemoryPercent + "%")
                    .build();
        } else {
            return Health.down()
                    .withDetail("free_memory", freeMemory + " bytes")
                    .withDetail("total_memory", totalMemory + " bytes")
                    .withDetail("free_memory_percent", freeMemoryPercent + "%")
                    .build();

        }
    }
}
