import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad2JoinerTest {

    @Test
    public void shouldJoinAllStrings(){
        Joiner joiner = Joiner.on("#");
        List<String> parametersToJoin = new ArrayList<>(Arrays.asList("#Should", "Join", "All", "Strings"));
        String joinedString = joiner.join(parametersToJoin);
        Assert.assertEquals("#Should#Join#All#Strings", joinedString);
    }

    @Test
    public void shouldJoinAllNotNullStrings(){
        Joiner joiner = Joiner.on(",").skipNulls();
        List<String> parametersToJoin = new ArrayList<>(Arrays.asList("Should", null, "Join", "All", null, "NotNull", "Strings"));
        String joinedString = joiner.join(parametersToJoin);
        Assert.assertEquals("Should,Join,All,NotNull,Strings", joinedString);
    }

    @Test
    public void shouldJoinAllValuesFromColection(){
        Joiner joiner = Joiner.on("$");
        List<Object> parametersToJoin = new ArrayList<>(Arrays.asList("$Should", "Join", "6", "Values", "From", 1,"Collection"));
        String joinedString = joiner.join(parametersToJoin);
        Assert.assertEquals("$Should$Join$6$Values$From$1$Collection", joinedString);
    }
}
