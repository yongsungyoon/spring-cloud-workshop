package com.skplanet.display.service;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

@Service
public class VineHealthIndicator implements HealthIndicator {

    private boolean initialzed;

    public void setInitialzed(final boolean initialzed) {
        this.initialzed = initialzed;
    }

    @Override
    public Health health() {
        return initialzed ? Health.up().build() : Health.down().build();
    }
}
