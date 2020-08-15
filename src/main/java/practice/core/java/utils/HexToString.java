package practice.core.java.utils;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;

public class HexToString {
    public static void main(String[] args) throws DecoderException, UnsupportedEncodingException {
        String hexString = "676175726f76206f6a6861";
        byte[] bytes = Hex.decodeHex(hexString.toCharArray());
        System.out.println(new String(bytes, "UTF-8"));
    }
}
