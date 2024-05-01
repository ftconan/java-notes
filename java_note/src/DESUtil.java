import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;

public class DESUtil {
    /**
     * 密钥算法
     */
    private static final String ALGORITHM = "DES";
    /**
     * 加密/解密算法-工作模式-填充模式
     */
    private static final String CIPHER_ALGORITHM = "DES/CBC/PKCS5Padding";
    /**
     * 默认编码
     */
    private static final String CHARSET = "utf-8";

    /**
     * 生成key
     *
     * @param password
     * @return
     * @throws Exception
     */
    private static SecretKey generateKey(String password) throws Exception {
        DESKeySpec dks = new DESKeySpec(password.getBytes(CHARSET));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        return keyFactory.generateSecret(dks);
    }

    /**
     * DES加密文件
     *
     * @param srcFile  待加密的文件
     * @param destFile 加密后存放的文件路径
     * @return 加密后的文件路径
     */
    public static String encryptFile(String password, String ivParameter,String srcFile, String destFile) {

        if (password == null || password.length() < 8) {
            throw new RuntimeException("encrypt fail");
        }
        try {
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes(CHARSET));
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, generateKey(password), iv);
            InputStream is = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(destFile);
            CipherInputStream cis = new CipherInputStream(is, cipher);
            byte[] buffer = new byte[1024];
            int r;
            while ((r = cis.read(buffer)) > 0) {
                out.write(buffer, 0, r);
            }
            cis.close();
            is.close();
            out.close();
            return destFile;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * DES解密文件
     *
     * @param srcFile  已加密的文件
     * @param destFile 解密后存放的文件路径
     * @return 解密后的文件路径
     */
    public static String decryptFile(String password, String ivParameter, String srcFile, String destFile) {
        if (password == null || password.length() < 8) {
            throw new RuntimeException("encrypt fail");
        }
        try {
            File file = new File(destFile);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes(CHARSET));
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, generateKey(password), iv);
            InputStream is = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(destFile);
            CipherOutputStream cos = new CipherOutputStream(out, cipher);
            byte[] buffer = new byte[1024];
            int r;
            while ((r = is.read(buffer)) >= 0) {
                cos.write(buffer, 0, r);
            }
            cos.close();
            is.close();
            out.close();
            return destFile;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String password = "xywj@yzt";
        String ivParameter = "xywjmd13";
        String srcFile = "D:\\000-COM\\ftp\\145-671153497-210600-210600-1641458961-02998.zip";
        String destFile = "D:\\000-COM\\ftp\\liaoning\\";
        decryptFile(password, ivParameter, srcFile, destFile);
    }
}
