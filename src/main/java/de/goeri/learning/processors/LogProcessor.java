package de.goeri.learning.processors;

import de.goeri.learning.RequestData;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.MDC;

/**
 * Created by Goeran on 14.03.17.
 */
public class LogProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        RequestData request = exchange.getIn().getBody(RequestData.class);
        if (request != null) {
            MDC.put("ID", request.getElementId());
            MDC.put("COUND_ID", request.getCountId());
            MDC.put("DELTA", String.valueOf(request.getDelta()));
        }
    }
}
