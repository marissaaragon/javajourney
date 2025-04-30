package problems;
import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) throws Exception{
        float[] list = {1.2f, 3.45f, 6.78f, 9.01f, 2.34f};
        FileOutputStream fos = new FileOutputStream("list.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for(float f:list){
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("list.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for(int i=0;i<length;i++){
            data = dis.readFloat();
            System.out.println(data);
        }
        fis.close();
        dis.close();
    }
}
