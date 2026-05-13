package bp;

import android.content.Context;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f5807c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5808a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f5809b = null;

    public static l a() {
        if (f5807c == null) {
            synchronized (l.class) {
                if (f5807c == null) {
                    f5807c = new l();
                }
            }
        }
        return f5807c;
    }

    public static String b(Context context) {
        return context.getExternalFilesDir("") + File.separator + Constant.PATH_BD_CONFIG;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[Catch: IOException -> 0x007f, TRY_LEAVE, TryCatch #7 {IOException -> 0x007f, blocks: (B:43:0x007b, B:47:0x0083), top: B:55:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap d(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L8f
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L8f
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
        L21:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r1 == 0) goto L3e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r3 = "="
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            int r3 = r1.length     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r4 = 1
            if (r3 <= r4) goto L21
            r3 = 0
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r6.put(r3, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            goto L21
        L3e:
            r2.close()     // Catch: java.io.IOException -> L67
            r0.close()     // Catch: java.io.IOException -> L67
            goto L8f
        L45:
            r6 = move-exception
            goto L4e
        L47:
            r1 = move-exception
            r5 = r2
            r2 = r0
            r0 = r1
            goto L53
        L4c:
            r6 = move-exception
            r0 = r1
        L4e:
            r1 = r2
            goto L79
        L50:
            r0 = move-exception
            r5 = r2
            r2 = r1
        L53:
            r1 = r5
            goto L5a
        L55:
            r6 = move-exception
            r0 = r1
            goto L79
        L58:
            r0 = move-exception
            r2 = r1
        L5a:
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L77
            com.yk.e.util.AdLog.e(r3, r0)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L67
            goto L69
        L67:
            r0 = move-exception
            goto L6f
        L69:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.io.IOException -> L67
            goto L8f
        L6f:
            java.lang.String r1 = r0.getMessage()
            com.yk.e.util.AdLog.e(r1, r0)
            goto L8f
        L77:
            r6 = move-exception
            r0 = r2
        L79:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.io.IOException -> L7f
            goto L81
        L7f:
            r0 = move-exception
            goto L87
        L81:
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.io.IOException -> L7f
            goto L8e
        L87:
            java.lang.String r1 = r0.getMessage()
            com.yk.e.util.AdLog.e(r1, r0)
        L8e:
            throw r6
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.l.d(java.lang.String):java.util.HashMap");
    }

    public final boolean c(String str) {
        try {
            HashMap map = this.f5809b;
            boolean zEquals = (map == null || map.get(str) == null) ? false : Objects.equals(this.f5809b.get(str), this.f5808a.get(str));
            AdLog.i("BdUtils", "getDbConfig, key = " + str + ", state = " + zEquals);
            return zEquals;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return false;
        }
    }
}
