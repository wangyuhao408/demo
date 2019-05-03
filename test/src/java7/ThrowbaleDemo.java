package java7;

import java.io.*;

public class ThrowbaleDemo {
    public void java7Before (String fileName) throws IOException {
        FileInputStream inputStream = null;
        IOException readExpection = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (IOException e) {
            readExpection = e;
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    if (readExpection == null) {
                        readExpection = e;
                    }
                }
            }
            if (readExpection != null) {
                throw new IOException(readExpection);
            }
        }
    }

    public void java7AddSuppressed(String fileName) throws IOException {
        FileInputStream inputStream = null;
        IOException readExpection = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (IOException e) {
            readExpection = e;
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    if (readExpection == null) {
                        readExpection.addSuppressed(e);
                    }
                }
            }
            if (readExpection != null) {
                throw new IOException(readExpection);
            }
        }
        System.out.println(readExpection.getSuppressed().length);
    }

    public void catchManyExpection () {
        try {
            Integer.parseInt("Hello");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    //实现主动释放资源
    public String tryWithResources(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder builder = new StringBuilder();
            String line = null;
            while((line=reader.readLine())!=null){
                builder.append(line);
                builder.append(String.format("%n"));
            }
            return builder.toString();
        }
    }

    //try中管理多个资源
    public void tryManyResources(String fromPath, String toPath) throws IOException {
        try ( InputStream input = new FileInputStream(fromPath);
              OutputStream output = new FileOutputStream(toPath) ) {
            byte[] buffer = new byte[8192];
            int len = -1;
            while( (len=input.read(buffer))!=-1 ) {
                output.write(buffer, 0, len);
            }
        }
    }


}
