//ANITA
//package sync;
//
//import service.AESService;
//import util.FileUtil;
//
//public class SyncService {
//    private final AESService aesService;
//
//    public SyncService(AESService aesService) {
//        this.aesService = aesService;
//    }
//
//    public void syncToFile(String filePath, String rawData) throws Exception {
//        String encrypted = aesService.encrypt(rawData);
//        FileUtil.saveToFile(filePath, encrypted);
//    }
//
//    public String loadFromFile(String filePath) throws Exception {
//        String encrypted = FileUtil.readFromFile(filePath);
//        return aesService.decrypt(encrypted);
//    }
//}