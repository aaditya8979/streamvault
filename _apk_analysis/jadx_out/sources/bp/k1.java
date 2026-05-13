package bp;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f5804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f5806d;

    public k1(Activity activity, String str, a0 a0Var) {
        this.f5804b = activity;
        this.f5805c = str;
        this.f5806d = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = r6.f5805c
            java.lang.String r1 = "checkUrl4Head err, msg = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "checkUrl4Head url = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.yk.e.util.AdLog.d(r2)
            r2 = -1
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.net.URLConnection r0 = r4.openConnection()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r3 = "HEAD"
            r0.setRequestMethod(r3)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L74
            r3 = 1500(0x5dc, float:2.102E-42)
            r0.setReadTimeout(r3)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L74
            r0.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L74
            int r1 = r0.getResponseCode()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L74
            r0.disconnect()
            goto L58
        L37:
            r3 = move-exception
            goto L3f
        L39:
            r1 = move-exception
            goto L76
        L3b:
            r0 = move-exception
            r5 = r3
            r3 = r0
            r0 = r5
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r3.getMessage()     // Catch: java.lang.Throwable -> L74
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L74
            com.yk.e.util.AdLog.e(r1)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L57
            r0.disconnect()
        L57:
            r1 = r2
        L58:
            if (r1 == r2) goto L67
            android.app.Activity r0 = r6.f5804b
            bp.a0 r2 = r6.f5806d
            bp.c0 r3 = new bp.c0
            r3.<init>(r2, r1)
            r0.runOnUiThread(r3)
            goto L73
        L67:
            android.app.Activity r0 = r6.f5804b
            bp.a0 r2 = r6.f5806d
            bp.c0 r3 = new bp.c0
            r3.<init>(r2, r1)
            r0.runOnUiThread(r3)
        L73:
            return
        L74:
            r1 = move-exception
            r3 = r0
        L76:
            if (r3 == 0) goto L7b
            r3.disconnect()
        L7b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.k1.run():void");
    }
}
