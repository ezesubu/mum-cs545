package lab2.starbucks.entity;

import lab2.starbucks.respository.DataFacadeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// Implements Singleton Pattern
public class TestDataImpl implements DataFacadeRepository {

    private Database data;
    @Autowired

    public void setDatabase(Database database) {
        this.data = database;
    }

    // Private constructor. Prevents instantiation from other classes.
    private TestDataImpl() {

    }

    // eager init'ed singleton...
    public final static TestDataImpl INSTANCE = new TestDataImpl();

    public String findPassword (String name ) {
        String expectedPassword = data.getPassword(name);
       return expectedPassword;
    }
    public List<String> getAdvice(String roast) {
       return data.getAdvice(roast);
    }
}



