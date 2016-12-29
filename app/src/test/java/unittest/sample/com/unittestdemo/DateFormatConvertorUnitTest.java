package unittest.sample.com.unittestdemo;


import org.junit.Assert;
import org.junit.Test;


/**
 * Created by amol on 29/12/16.
 */

public class DateFormatConvertorUnitTest {


    @Test
    public void convertlongTimetoDate() {
        Assert.assertEquals("29 Dec 2016", DateFormatConvertor.converintoDateFormat(Long.valueOf("1483006916556")));
    }


    @Test
    public void wrongResult() {

        Assert.assertNotEquals("29 Dec", DateFormatConvertor.converintoDateFormat(Long.valueOf("1483006916556")));
    }

    @Test

    public void nullValueValidation() throws Exception {
        try {
            Assert.assertEquals("29 Dec 2016", DateFormatConvertor.converintoDateFormat(Long.valueOf("null")));
        } catch (Exception ec) {
            System.out.print("Timestamp should not be null");
        }

    }

    @Test

    public void specialCharacterValidation() {

        try {
            Assert.assertEquals("29 Dec 2016", DateFormatConvertor.converintoDateFormat(Long.valueOf("null")));
        } catch (Exception ec) {
            System.out.print("Special character's are not allow");
        }

    }

}

