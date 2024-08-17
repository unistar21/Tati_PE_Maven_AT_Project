package runners;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.school.SchoolTestJUnit;

@RunWith(Suite.class)
@Suite.SuiteClasses({SchoolTestJUnit.class})
public class SchoolRunnner {

}

