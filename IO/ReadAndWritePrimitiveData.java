package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
    public static void main(String[] args) throws Exception {
        DataOutputStream o = new DataOutputStream(new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\PrimitiveData.txt"));
        o.writeInt(0);
        o.writeBoolean(true);
        o.writeDouble(4255654);
        o.writeChar('Y');
        o.close();

        DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\PrimitiveData.txt"));
        System.out.println(in.readInt());
        System.out.println(in.readBoolean());
        System.out.println(in.readDouble());
        System.out.println(in.readChar());
        in.close();
    }
}
