package zp;

import com.ironsource.G5;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AESOperator.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f98383a = "0123456789123456";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f98384b = "2015030120123456";

    public static String a(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f98383a.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(f98384b.getBytes()));
            return new String(cipher.doFinal(b.a(str)), G5.N);
        } catch (Exception unused) {
            return "";
        }
    }
}
