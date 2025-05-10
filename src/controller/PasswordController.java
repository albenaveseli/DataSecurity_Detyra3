//ALBENA

//package controller;
//
//import model.PasswordEntry;
//import model.User;
//import service.AESService;
//import service.PasswordGenerator;
//import sync.SyncService;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class PasswordController {
//    private final User user = new User();
//    private final AESService aesService = new AESService("1234567890123456"); // 16 chars key
//    private final SyncService syncService = new SyncService(aesService);
//    private String filePath;
//
//    public PasswordController() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Shkruaj rrugën ku dëshiron të ruhen të dhënat (p.sh. Dropbox/data/passwords.sync): ");
//        filePath = scanner.nextLine();
//
//        // Auto-load nëse file ekziston
//        try {
//            File file = new File(filePath);
//            if (file.exists()) {
//                String loadedData = syncService.loadFromFile(filePath);
//                loadPasswordsFromDecryptedData(loadedData);
//                System.out.println("\n[SINKRONIZUAR nga pajisje tjetër]:\n" + loadedData);
//            }
//        } catch (Exception e) {
//            System.out.println("Nuk u arrit të ngarkohen të dhënat ekzistuese.");
//            e.printStackTrace();
//        }
//    }
//
//    private void loadPasswordsFromDecryptedData(String data) {
//        String[] lines = data.split("\n");
//        for (String line : lines) {
//            String[] parts = line.split(",");
//            if (parts.length == 4) {
//                PasswordEntry entry = new PasswordEntry(parts[0], parts[1], parts[2], parts[3]);
//                user.addPassword(entry);
//            }
//        }
//    }
//
//    public void run() {
//        PasswordEntry entry = new PasswordEntry("Facebook", "user@example.com", PasswordGenerator.generate(12), "Social");
//        user.addPassword(entry);
//
//        try {
//            StringBuilder sb = new StringBuilder();
//            for (PasswordEntry e : user.getPasswords()) {
//                sb.append(e.getTitle()).append(",")
//                        .append(e.getUsername()).append(",")
//                        .append(e.getPassword()).append(",")
//                        .append(e.getCategory()).append("\n");
//            }
//
//            syncService.syncToFile(filePath, sb.toString());
//            System.out.println("\n[U sinkronizua me sukses në]: " + filePath);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
