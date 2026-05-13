package com.bytedance.sdk.component.fkw.vt;

import com.bytedance.sdk.component.fkw.fkw;
import com.bytedance.sdk.component.fkw.le;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ouw implements com.bytedance.sdk.component.fkw.yu<lh> {
    private static Map<String, String> ouw(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(5:46|3|4|49|5)|(7:52|6|(1:8)(1:54)|38|39|40|41)|9|47|10|(2:12|13)|14|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.sdk.component.fkw.vt.lh<byte[]> vt(com.bytedance.sdk.component.fkw.fkw r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "InternalHttpClient"
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            java.lang.String r4 = r9.ouw()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            r4 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            r3.connect()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            java.io.InputStream r4 = com.safedk.android.internal.partials.PangleNetworkBridge.urlConnectionGetInputStream(r3)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d java.net.MalformedURLException -> L8b
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.net.MalformedURLException -> L67
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.net.MalformedURLException -> L67
            r6.<init>()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.net.MalformedURLException -> L67
        L30:
            int r7 = r4.read(r5)     // Catch: java.io.IOException -> L5b java.net.MalformedURLException -> L5e java.lang.Throwable -> Lb4
            r8 = -1
            if (r7 == r8) goto L3b
            r6.write(r5, r1, r7)     // Catch: java.io.IOException -> L5b java.net.MalformedURLException -> L5e java.lang.Throwable -> Lb4
            goto L30
        L3b:
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r5 = r6.toByteArray()     // Catch: java.io.IOException -> L5b java.net.MalformedURLException -> L5e java.lang.Throwable -> Lb4
            boolean r9 = r9.vt()     // Catch: java.io.IOException -> L57 java.net.MalformedURLException -> L59 java.lang.Throwable -> Lb4
            if (r9 == 0) goto L4c
            java.util.Map r9 = ouw(r3)     // Catch: java.io.IOException -> L57 java.net.MalformedURLException -> L59 java.lang.Throwable -> Lb4
            r2 = r9
        L4c:
            com.bytedance.sdk.component.utils.tlj.ouw(r4)
            com.bytedance.sdk.component.utils.tlj.ouw(r6)
            java.lang.String r9 = "success"
            goto Lae
        L57:
            r9 = move-exception
            goto L71
        L59:
            r9 = move-exception
            goto L8f
        L5b:
            r9 = move-exception
            r5 = r2
            goto L71
        L5e:
            r9 = move-exception
            r5 = r2
            goto L8f
        L61:
            r9 = move-exception
            r6 = r2
            goto Lb5
        L64:
            r9 = move-exception
            r5 = r2
            goto L70
        L67:
            r9 = move-exception
            r5 = r2
            goto L8e
        L6a:
            r9 = move-exception
            r6 = r2
            goto Lb6
        L6d:
            r9 = move-exception
            r4 = r2
            r5 = r4
        L70:
            r6 = r5
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "IOException:"
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = r9.getMessage()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Lb4
            goto La8
        L8b:
            r9 = move-exception
            r4 = r2
            r5 = r4
        L8e:
            r6 = r5
        L8f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "MalformedURLException:"
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = r9.getMessage()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Lb4
        La8:
            com.bytedance.sdk.component.utils.tlj.ouw(r4)
            com.bytedance.sdk.component.utils.tlj.ouw(r6)
        Lae:
            com.bytedance.sdk.component.fkw.vt.lh r0 = new com.bytedance.sdk.component.fkw.vt.lh
            r0.<init>(r1, r5, r9, r2)
            return r0
        Lb4:
            r9 = move-exception
        Lb5:
            r2 = r4
        Lb6:
            com.bytedance.sdk.component.utils.tlj.ouw(r2)
            com.bytedance.sdk.component.utils.tlj.ouw(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fkw.vt.ouw.vt(com.bytedance.sdk.component.fkw.fkw):com.bytedance.sdk.component.fkw.vt.lh");
    }

    @Override // com.bytedance.sdk.component.fkw.yu
    public final /* synthetic */ le ouw(fkw fkwVar) {
        return vt(fkwVar);
    }
}
