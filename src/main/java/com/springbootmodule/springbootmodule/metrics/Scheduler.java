package com.springbootmodule.springbootmodule.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Dictionary;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Scheduler {

    private final AtomicInteger thisGauge;
    private final Counter counter;

    public Scheduler(MeterRegistry registry) {
        this.thisGauge = registry.gauge("custom_gauge", new AtomicInteger(0));
        this.counter = registry.counter("custom_counter");
    }

    @Scheduled(fixedDelayString = "1000", initialDelayString = "0")
    public void schedulingTask(int query) {
        this.thisGauge.set(query);
        this.counter.increment();
    }
}
