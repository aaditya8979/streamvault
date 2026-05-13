package com.mbridge.msdk.foundation.same.image;

/* JADX INFO: compiled from: CommonBitmapUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(android.graphics.Bitmap r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1.close()     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L22
            r0.printStackTrace()
        L22:
            r0 = r4
            goto L41
        L24:
            r4 = move-exception
            goto L45
        L26:
            r4 = move-exception
            goto L2c
        L28:
            r4 = move-exception
            goto L44
        L2a:
            r4 = move-exception
            r1 = r0
        L2c:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L33
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L42
        L33:
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.lang.Exception -> L39
            goto L41
        L39:
            r4 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L41
            r4.printStackTrace()
        L41:
            return r0
        L42:
            r4 = move-exception
            r0 = r1
        L44:
            r1 = r0
        L45:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.lang.Exception -> L4b
            goto L53
        L4b:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L53
            r0.printStackTrace()
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.image.a.a(android.graphics.Bitmap):java.io.InputStream");
    }
}
