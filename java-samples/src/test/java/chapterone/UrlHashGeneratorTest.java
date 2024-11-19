package chapterone;

import org.junit.Assert;
import org.junit.Test;

public class UrlHashGeneratorTest {
    UrlHashGenerator urlHashGenerator = new UrlHashGenerator();

    @Test
    public void testGenerateHashMd5() throws Exception {
        String result = urlHashGenerator.generateHashMd5("https://www.example.com");
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testGenerateHashSha256() throws Exception {
        String result = urlHashGenerator.generateHashSha256("https://www.exampleq.com");
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testGenerateHashSha256WithInstant() throws Exception {
        String result = urlHashGenerator.generateHashSha256WithInstant("https://www.exampleq.com");
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme