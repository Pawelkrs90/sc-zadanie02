import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Zad2SplitterTest {

    @Test
    public void shouldSplitAllStrings(){
        String stringToSplit = "should,Split,All,Strings";
        List<String> splittedList = Splitter.on(',')
                                            .splitToList(stringToSplit);

        String[] expectedSplittedValues =  {"should","Split","All","Strings"};
        Assert.assertArrayEquals(splittedList.toArray(), expectedSplittedValues);
    }

    @Test
    public void shouldSplitAllNotEmptyStrings(){
        String stringToSplit = "should,,Split,,All,Not,,Empty,,Strings";
        List<String> splittedList = Splitter.on(",")
                .omitEmptyStrings()
                .splitToList(stringToSplit);

        String[] expectedSplittedValues =  {"should","Split","All","Not","Empty","Strings"};
        Assert.assertArrayEquals(splittedList.toArray(), expectedSplittedValues);
    }

    @Test
    public void shouldSplitAllNotBlankStrings(){
        String stringToSplit = "should,   ,Split,,All,Not, ,Blank,                            ,Strings";
        List<String> splittedList = Splitter.on(",")
                                            .omitEmptyStrings()
                                            .trimResults()
                                            .splitToList(stringToSplit);

        String[] expectedSplittedValues =  {"should","Split","All","Not","Blank","Strings"};
        Assert.assertArrayEquals(splittedList.toArray(), expectedSplittedValues);
    }



}
