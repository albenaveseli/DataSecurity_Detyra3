//AGNESA
//package util;
//
//import java.io.*;
//
//public class FileUtil {
//    public static void saveToFile(String filename, String data) throws IOException {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
//            writer.write(data);
//        }
//    }
//
//    public static String readFromFile(String filename) throws IOException {
//        StringBuilder sb = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                sb.append(line);
//            }
//        }
//        return sb.toString();
//    }
//}