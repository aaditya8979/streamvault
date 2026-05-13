package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: JavaHttpSpider.java */
/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f35630f = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f35631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35633c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35634d = 3145728;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f35635e;

    public i() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f35631a = gVarD;
        if (gVarD == null) {
            this.f35631a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x002d, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0008, B:5:0x000e, B:21:0x0030, B:23:0x0034, B:24:0x0041), top: B:38:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[Catch: Exception -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0026, blocks: (B:10:0x0022, B:26:0x004c), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto Le
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = r5
        Le:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
        L18:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            if (r4 == 0) goto L22
            r0.append(r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            goto L18
        L22:
            r5.close()     // Catch: java.lang.Exception -> L26
            goto L59
        L26:
            r4 = move-exception
            goto L50
        L28:
            r4 = move-exception
            goto L5f
        L2a:
            r4 = move-exception
            r1 = r5
            goto L30
        L2d:
            r4 = move-exception
            goto L5e
        L2f:
            r4 = move-exception
        L30:
            com.mbridge.msdk.click.entity.a r5 = r3.f35635e     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L41
            com.mbridge.msdk.click.entity.a r5 = new com.mbridge.msdk.click.entity.a     // Catch: java.lang.Throwable -> L2d
            r5.<init>()     // Catch: java.lang.Throwable -> L2d
            r3.f35635e = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L2d
            r5.f35615h = r2     // Catch: java.lang.Throwable -> L2d
        L41:
            java.lang.String r5 = com.mbridge.msdk.click.i.f35630f     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L2d
            com.mbridge.msdk.foundation.tools.q0.b(r5, r4)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.lang.Exception -> L26
            goto L59
        L50:
            java.lang.String r5 = com.mbridge.msdk.click.i.f35630f
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r5, r4)
        L59:
            java.lang.String r4 = r0.toString()
            return r4
        L5e:
            r5 = r1
        L5f:
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.lang.Exception -> L65
            goto L6f
        L65:
            r5 = move-exception
            java.lang.String r0 = com.mbridge.msdk.click.i.f35630f
            java.lang.String r5 = r5.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r5)
        L6f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.i.a(java.io.InputStream, boolean):java.lang.String");
    }

    public com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        int i10;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(Z7.f30794r, "%20");
        this.f35635e = new com.mbridge.msdk.click.entity.a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod("GET");
                if ((!z10 && !z11) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (this.f35631a.J0() && !TextUtils.isEmpty(this.f35632b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f35632b);
                }
                httpsURLConnection2.setConnectTimeout(60000);
                httpsURLConnection2.setReadTimeout(60000);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f35635e.f35608a = httpsURLConnection2.getHeaderField("Location");
                this.f35635e.f35611d = httpsURLConnection2.getHeaderField("Referer");
                this.f35635e.f35613f = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection2);
                this.f35635e.f35609b = httpsURLConnection2.getContentType();
                this.f35635e.f35612e = httpsURLConnection2.getContentLength();
                this.f35635e.f35610c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f35635e.f35610c);
                com.mbridge.msdk.click.entity.a aVar = this.f35635e;
                if (aVar.f35613f == 200 && this.f35633c && (i10 = aVar.f35612e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(MintegralNetworkBridge.urlConnectionGetInputStream(httpsURLConnection2), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f35635e.f35614g = strA.trim();
                            }
                        }
                    } catch (Throwable th2) {
                        q0.b(f35630f, th2.getMessage());
                    }
                }
                this.f35632b = strReplace;
                MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection2);
                return this.f35635e;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f35635e.f35615h = th.getMessage();
                    return this.f35635e;
                } finally {
                    if (httpsURLConnection != null) {
                        MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
