package APIProject;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class KarateRunner {

    @Test
    public void runTests() {
        Results results = Runner.path("classpath:APIProject/letsshop.feature").parallel(1);
        assertEquals(results.getFailCount(), 0, results.getErrorMessages());
    }
}