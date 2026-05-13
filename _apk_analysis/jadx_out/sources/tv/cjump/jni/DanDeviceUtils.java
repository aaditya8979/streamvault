package tv.cjump.jni;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public class DanDeviceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ARCH f85420a = ARCH.Unknown;

    public enum ARCH {
        Unknown,
        ARM,
        X86,
        MIPS,
        ARM64
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static synchronized ARCH a() {
        RandomAccessFile randomAccessFile;
        byte[] bArr = new byte[20];
        File file = new File(Environment.getRootDirectory(), "lib/libc.so");
        if (file.canRead()) {
            ?? r32 = 0;
            RandomAccessFile randomAccessFile2 = null;
            RandomAccessFile randomAccessFile3 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    randomAccessFile.readFully(bArr);
                    ?? r33 = 8;
                    r33 = 8;
                    r33 = 8;
                    r33 = 8;
                    int i10 = bArr[18] | (bArr[19] << 8);
                    if (i10 == 3) {
                        f85420a = ARCH.X86;
                    } else if (i10 == 8) {
                        f85420a = ARCH.MIPS;
                    } else if (i10 == 40) {
                        f85420a = ARCH.ARM;
                    } else if (i10 != 183) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("libc.so is unknown arch: ");
                        sb2.append(Integer.toHexString(i10));
                        Log.e("NativeBitmapFactory", sb2.toString());
                        r33 = sb2;
                    } else {
                        f85420a = ARCH.ARM64;
                    }
                    try {
                        randomAccessFile.close();
                        r32 = r33;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e11) {
                    e = e11;
                    randomAccessFile2 = randomAccessFile;
                    e.printStackTrace();
                    r32 = randomAccessFile2;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                            r32 = randomAccessFile2;
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e13) {
                    e = e13;
                    randomAccessFile3 = randomAccessFile;
                    e.printStackTrace();
                    r32 = randomAccessFile3;
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                            r32 = randomAccessFile3;
                        } catch (IOException e14) {
                            e = e14;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r32 = randomAccessFile;
                    if (r32 != 0) {
                        try {
                            r32.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e16) {
                e = e16;
            } catch (IOException e17) {
                e = e17;
            }
        }
        return f85420a;
    }

    public static String b() {
        return Build.CPU_ABI;
    }

    public static String c() {
        try {
            Field declaredField = Build.class.getDeclaredField("CPU_ABI2");
            if (declaredField == null) {
                return null;
            }
            Object obj = declaredField.get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d() {
        return Build.MANUFACTURER.equalsIgnoreCase("MagicBox") && Build.PRODUCT.equalsIgnoreCase("MagicBox");
    }

    public static boolean e() {
        return Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") && Build.PRODUCT.equalsIgnoreCase("dredd");
    }

    public static boolean f() {
        return e() || d();
    }

    public static boolean g() {
        return (i("armeabi-v7a") || i("armeabi")) && ARCH.ARM.equals(a());
    }

    public static boolean h() {
        return i("x86") || ARCH.X86.equals(a());
    }

    public static boolean i(String str) {
        String strB = b();
        if (TextUtils.isEmpty(strB) || !strB.equalsIgnoreCase(str)) {
            return !TextUtils.isEmpty(c()) && strB.equalsIgnoreCase(str);
        }
        return true;
    }
}
