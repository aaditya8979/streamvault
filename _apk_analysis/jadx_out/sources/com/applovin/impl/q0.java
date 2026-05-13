package com.applovin.impl;

import androidx.core.util.Consumer;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinErrorCodes;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f9630e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f9633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f9634d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9636b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f9635a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f9636b = j10;
        }

        public long a() {
            return this.f9635a;
        }

        public long b() {
            return this.f9636b;
        }
    }

    public class c implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f9638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f9640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f9641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f9642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f9643g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f9637a = str;
            this.f9638b = aVar;
            this.f9639c = str2;
            this.f9640d = obj;
            this.f9641e = z10;
            this.f9642f = bVar;
            this.f9643g = eVar;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    int iC = dVar.c();
                    try {
                        if (iC <= 0) {
                            q0.this.a(this.f9639c, this.f9637a, iC, jE, (Throwable) null);
                            this.f9643g.a(this.f9637a, iC, null, null);
                            return;
                        }
                        if (iC < 200 || iC >= 400) {
                            this.f9643g.a(this.f9637a, iC, null, null);
                            return;
                        }
                        b bVar = this.f9642f;
                        if (bVar != null) {
                            bVar.a(jE);
                        }
                        q0.this.a(this.f9639c, this.f9637a, iC, jE);
                        byte[] bArrD = dVar.d();
                        if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f9641e || u4.b(bArrD) != u4.a.V2)) {
                            q0.this.f9631a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f9637a, this.f9638b.b() != null ? this.f9638b.b().toString() : "");
                        }
                        if (bArrD == null) {
                            this.f9643g.a(this.f9637a, this.f9640d, iC);
                            return;
                        }
                        String str = new String(dVar.d(), Charset.forName("UTF-8"));
                        b bVar2 = this.f9642f;
                        if (bVar2 != null) {
                            bVar2.b(bArrD.length);
                            if (this.f9638b.r()) {
                                q0.this.f9634d = new d(this.f9638b.f(), bArrD.length, jE);
                            }
                        }
                        if (this.f9641e) {
                            String strB = u4.b(bArrD, q0.this.f9631a.i0(), q0.this.f9631a);
                            if (strB == null) {
                                HashMap map = new HashMap(2);
                                map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f9637a));
                                map.put("response", str);
                                q0.this.f9631a.F().trackEvent("rdf", map);
                            }
                            str = strB;
                        }
                        try {
                            this.f9643g.a(this.f9637a, q0.this.a(str, this.f9640d), iC);
                        } catch (Throwable th2) {
                            String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f9637a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                            com.applovin.impl.sdk.o unused = q0.this.f9632b;
                            if (com.applovin.impl.sdk.o.a()) {
                                q0.this.f9632b.a("ConnectionManager", str2, th2);
                            }
                            q0.this.f9631a.D().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f9637a)));
                            this.f9643g.a(this.f9637a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                        }
                    } catch (MalformedURLException e10) {
                        e = e10;
                        i10 = iC;
                        if (this.f9640d != null) {
                            q0.this.a(this.f9639c, this.f9637a, i10, jE, e);
                            this.f9643g.a(this.f9637a, -901, e.getMessage(), null);
                        } else {
                            q0.this.a(this.f9639c, this.f9637a, i10, jE);
                            this.f9643g.a(this.f9637a, this.f9640d, -901);
                        }
                    }
                } catch (Throwable th3) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f9641e) {
                                str3 = u4.b(bArrF, q0.this.f9631a.i0(), q0.this.f9631a);
                            }
                            objA = q0.this.a(str3, this.f9640d);
                        }
                    } catch (Throwable unused2) {
                    }
                    q0.this.a(this.f9639c, this.f9637a, iB, jE, th3);
                    this.f9643g.a(this.f9637a, iB, th3.getMessage(), objA);
                }
            } catch (MalformedURLException e11) {
                e = e11;
                i10 = 0;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9645a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f9647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f9648d;

        public d(String str, long j10, long j11) {
            this.f9646b = str;
            this.f9647c = j10;
            this.f9648d = j11;
        }

        public long a() {
            return this.f9648d;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f9647c;
        }

        public long c() {
            return this.f9645a;
        }

        public String d() {
            return this.f9646b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f9631a = kVar;
        this.f9632b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f9633c = b4Var;
        b4Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f9631a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9632b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9632b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f9631a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9632b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f9631a) + " to " + a(str2), th2);
        }
    }

    public d a() {
        return this.f9634d;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218 A[Catch: all -> 0x026e, TryCatch #2 {all -> 0x026e, blocks: (B:36:0x00f8, B:38:0x0108, B:42:0x0134, B:41:0x0130, B:43:0x0143, B:46:0x0168, B:48:0x0184, B:52:0x01a5, B:68:0x01fe, B:71:0x020d, B:73:0x0218, B:54:0x01a9, B:57:0x01b1, B:63:0x01c9, B:65:0x01cf, B:66:0x01e9, B:49:0x0192, B:74:0x021b, B:76:0x0221, B:77:0x0235, B:59:0x01c2), top: B:99:0x00f8, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.q0.b r25, com.applovin.impl.q0.e r26) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }
}
