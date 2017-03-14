package de.goeri.learning;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:camel-context-blocking.xml")
public class AppTest_Blocking {

    @Produce(uri = "seda:start", context = "MainContext")
    private ProducerTemplate start;

    @Test
    @DirtiesContext
    public void testApp() throws Exception {
        long millis = System.currentTimeMillis();
        while (System.currentTimeMillis() < millis + 10000) {
            for (int i = 0; i < 100; i++)
                start.sendBody(new RequestData(UUID.randomUUID().toString(), String.format("%04d", i)));
            Thread.sleep(1000);
        }
        assertTrue(true);
    }
}
