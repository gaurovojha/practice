package practice.core.java.designpattern.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException{
		int c = super.read();
		return (c==-1 	? c : Character.toLowerCase((char)c));
	}

	public int read(byte[] b, int offSet, int len) throws IOException{
		int result = super.read(b,offSet,len);
		for(int i = offSet ; i<offSet+result ; i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
