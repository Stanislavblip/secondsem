import junit.framework.TestCase;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class JUNIT3 {
    private static final int HI_BYTE_MASK = 0xf0;
    private static final int LOW_BYTE_MASK = 0x0f;

    private static final char[] HEX_SYMBOLS = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
    };

    @Contract("null -> true")
    public static boolean isEmpty(final CharSequence sequence) {
        return sequence == null || sequence.length() <= 0;
    }

    @NotNull
    public static String toHexString(final byte[] data) {
        final StringBuffer builder = new StringBuffer(2 * data.length);
        for (byte item : data) {
            builder.append(HEX_SYMBOLS[(HI_BYTE_MASK & item) >>> 4]);
            builder.append(HEX_SYMBOLS[(LOW_BYTE_MASK & item)]);
        }
        return builder.toString();
    }
}

class StringUtilsJUnit3Test extends TestCase {
    private final Map toHexStringData = new HashMap();

    protected void setUp() throws Exception {
        toHexStringData.put("", new byte[0]);
        toHexStringData.put("01020d112d7f", new byte[]{1, 2, 13, 17, 45, 127});
        toHexStringData.put("00fff21180", new byte[]{0, -1, -14, 17, -128});
        //...
    }

    protected void tearDown() throws Exception {
        toHexStringData.clear();
    }

    public void testToHexString() {
        for (Iterator iterator = toHexStringData.keySet().iterator(); iterator.hasNext(); ) {
            final String expected = (String) iterator.next();
            final byte[] testData = (byte[]) toHexStringData.get(expected);
            final String actual = StringUtils.toHexString(testData);
            assertEquals(expected, actual);
        }
    }
}