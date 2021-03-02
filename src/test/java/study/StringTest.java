package study;

import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringTest {
    @Test
    void spilt(){
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1","2");
    }

}
