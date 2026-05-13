package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public static long a(long j10, int i10) {
        char c10;
        if (i10 == 2) {
            c10 = '\n';
        } else if (i10 == 3) {
            c10 = 20;
        } else {
            if (i10 != 4) {
                return j10;
            }
            c10 = 30;
        }
        return j10 >> c10;
    }

    public static long a(String str, int i10) {
        File file = new File(str);
        if (file.exists()) {
            return a(file.length(), i10);
        }
        return 0L;
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "FileUtils"
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            r7 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r3.read(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r2 = "ftyp"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r2 == 0) goto L31
            java.lang.String r2 = "moov"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r2 == 0) goto L31
            java.lang.String r2 = "contains ftyp moov"
            r4 = 3
            sg.bigo.ads.common.t.a.a(r7, r4, r0, r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r7 = 1
        L31:
            r3.close()     // Catch: java.io.IOException -> L64
            goto L64
        L35:
            r7 = move-exception
            r2 = r3
            goto L65
        L38:
            r2 = move-exception
            goto L40
        L3a:
            r7 = move-exception
            goto L65
        L3c:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "read file "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L35
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = " failed"
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L35
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L35
            sg.bigo.ads.common.t.a.a(r7, r0, r1)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L64
            goto L31
        L64:
            return r7
        L65:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.f.a(java.lang.String):boolean");
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        boolean z10 = false;
        try {
            boolean zMkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists()) {
                return zMkdirs;
            }
            if (zMkdirs) {
                if (file2.createNewFile()) {
                    z10 = true;
                }
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void b(@NonNull File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        a(file2);
                    }
                }
            }
        }
        a(file);
    }

    public static boolean b(String str) {
        if (q.a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean b(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static String c(String str) {
        return str + ".tmp";
    }

    public static void c(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static boolean c(File file) {
        boolean z10 = false;
        try {
            File parentFile = file.getParentFile();
            boolean zMkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            if (file.exists()) {
                return zMkdirs;
            }
            if (zMkdirs) {
                if (file.createNewFile()) {
                    z10 = true;
                }
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public static String d(String str) {
        return str + ".tmp";
    }
}
