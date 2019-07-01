package org.camunda.demo.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAccountWorker {

    private static final String TOPIC_NAME = "createAccount";
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountWorker.class.getName());

    public static void main(String[] args) {

        LOGGER.info("working " + TOPIC_NAME + " is beginning to poll for work.....");
        GenericWorker worker = new GenericWorker(TOPIC_NAME);
        worker.work();

    }
}
