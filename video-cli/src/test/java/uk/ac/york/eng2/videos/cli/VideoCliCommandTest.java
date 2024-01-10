package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VideoCliCommandTest {

    @Test
    public void testWithCommandLineOption() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
            String[] args = new String[] { "-v" };
            PicocliRunner.run(VideoCliCommand.class, ctx, args);

            // video-cli
            assertTrue(baos.toString().contains("Hi!"));
        }
    }
    
    @Test
    public void postThenGetUser() throws Exception {
    	try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
    		ByteArrayOutputStream baos = new ByteArrayOutputStream();
    		System.setOut(new PrintStream(baos));
    		PicocliRunner.run(VideoCliCommand.class, ctx, new String[] {"add-user", "WHAT"});
    		assertTrue(baos.toString().contains("CREATED"), "The new book was created");
//            PicocliRunner.run(VideoCliCommand.class, ctx, args);

            // video-cli
//            assertTrue(baos.toString().contains("Hi!"));
    		
    		baos = new ByteArrayOutputStream();
    		System.setOut(new PrintStream(baos));
    		PicocliRunner.run(VideoCliCommand.class, ctx, new String[] {"get-users"});
    		final String newOutput = baos.toString().trim();
    		final String[] newLines = newOutput.split(System.lineSeparator());
    		int lineNumber = 0;
    		assertTrue(newLines.length > 0);
    		for (String line : newLines) {
    			++lineNumber;
    			assertTrue(line.startsWith("User"));
    		}
        }
    }
}
