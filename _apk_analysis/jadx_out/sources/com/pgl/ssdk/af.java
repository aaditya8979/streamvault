package com.pgl.ssdk;

import java.io.BufferedInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class af {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String a(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(android.content.Context):java.lang.String");
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int i10;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i10 = bufferedInputStream.read(bArr);
                if (i10 > 0) {
                    sb2.append(new String(bArr, 0, i10));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } while (i10 >= 4096);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r2.write(r6)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r6 = 10
            r2.write(r6)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r2.flush()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r2.close()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r1.waitFor()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            java.lang.String r6 = a(r3)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L7a
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            r3.close()     // Catch: java.io.IOException -> L42
            goto L46
        L42:
            r0 = move-exception
            r0.printStackTrace()
        L46:
            r0 = r6
            goto L76
        L48:
            r6 = move-exception
            goto L5c
        L4a:
            r6 = move-exception
            goto L7c
        L4c:
            r6 = move-exception
            r3 = r0
            goto L5c
        L4f:
            r6 = move-exception
            goto L55
        L51:
            r6 = move-exception
            goto L5a
        L53:
            r6 = move-exception
            r1 = r0
        L55:
            r2 = r1
            r1 = r0
            goto L80
        L58:
            r6 = move-exception
            r1 = r0
        L5a:
            r2 = r0
            r3 = r2
        L5c:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r6 = move-exception
            r6.printStackTrace()
        L69:
            if (r3 == 0) goto L73
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r6 = move-exception
            r6.printStackTrace()
        L73:
            if (r1 != 0) goto L76
            goto L79
        L76:
            r1.destroy()
        L79:
            return r0
        L7a:
            r6 = move-exception
            r0 = r3
        L7c:
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
        L80:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.io.IOException -> L86
            goto L8a
        L86:
            r0 = move-exception
            r0.printStackTrace()
        L8a:
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.io.IOException -> L90
            goto L94
        L90:
            r0 = move-exception
            r0.printStackTrace()
        L94:
            if (r2 == 0) goto L99
            r2.destroy()
        L99:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(java.lang.String):java.lang.String");
    }

    private static void a(byte[] bArr, int i10, byte[] bArr2) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
        }
    }
}
