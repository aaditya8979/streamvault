package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.Q6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f51331a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f51333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f51336f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f51332b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51337g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f51338h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51339i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51340j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f51341k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51342l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f51343m = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f51340j >= am.this.f51341k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f51333c = context;
    }

    private void a(int i10) throws ProtocolException {
        this.f51332b.setRequestMethod(i10 != 1 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "GET" : "TRACE" : "HEAD" : "DELETE" : "PUT" : "POST");
    }

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f51331a)) {
            f51331a = str;
        }
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private void b() {
        Object obj;
        if (this.f51332b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f51331a)) {
                jSONObject.put("ipv6", f51331a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put(Q6.V0, com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f51332b.addRequestProperty("cypher", String.valueOf(obj));
            this.f51332b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    private void b(int i10) {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (!str.isEmpty()) {
            this.f51332b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f51332b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f51332b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9");
                return;
            }
            this.f51332b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f51334d = i10;
        this.f51335e = i11;
        this.f51336f = bArr;
    }

    public static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f51340j;
        amVar.f51340j = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
      0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.am.c():boolean");
    }

    public abstract String a();

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f51343m);
    }

    public abstract void a(int i10, byte[] bArr);
}
