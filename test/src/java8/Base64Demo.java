package java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Demo {

    public void base64DemoTest() throws UnsupportedEncodingException {
        String base64EncodeString = Base64.getEncoder()
                .encodeToString("wangyuhao".getBytes("UTF-8"));
        System.out.println("base64 ±àÂë" + "  " + base64EncodeString);
        byte[] base64DecodedString = Base64.getDecoder()
                .decode(base64EncodeString);
        System.out.println("Ô­Ê¼×Ö·û" + "  " + new String(base64DecodedString, "utf-8"));
    }
}
