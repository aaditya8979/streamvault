package sg.bigo.ads.controller.c;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.InputStream, java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.zip.GZIPInputStream] */
    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(byte[] r6) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L59
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L59
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            java.lang.String r4 = "UTF-8"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
        L1f:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L5d
            if (r4 == 0) goto L29
            r3.append(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L5d
            goto L1f
        L29:
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            r6.close()     // Catch: java.io.IOException -> L2f
        L2f:
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L33:
            r0 = move-exception
            goto L49
        L35:
            r3 = r0
            goto L5d
        L37:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L49
        L3c:
            r2 = r0
            goto L5c
        L3e:
            r6 = move-exception
            r2 = r0
            goto L47
        L41:
            r6 = r0
            r2 = r6
            goto L5c
        L44:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L47:
            r0 = r6
            r6 = r2
        L49:
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4e
        L4e:
            if (r6 == 0) goto L53
            r6.close()     // Catch: java.io.IOException -> L53
        L53:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r0
        L59:
            r6 = r0
            r1 = r6
            r2 = r1
        L5c:
            r3 = r2
        L5d:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L62
        L62:
            if (r6 == 0) goto L67
            r6.close()     // Catch: java.io.IOException -> L67
        L67:
            if (r1 == 0) goto L6a
            goto L2f
        L6a:
            if (r3 != 0) goto L6d
            return r0
        L6d:
            java.lang.String r6 = r3.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.c.c.a(byte[]):java.lang.String");
    }
}
