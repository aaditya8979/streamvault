package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpec.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f40664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f40665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f40666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f40667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f40668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f40669j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f40672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f40673d;

    /* JADX INFO: compiled from: ConnectionSpec.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f40674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f40675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f40676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f40677d;

        public a(j jVar) {
            this.f40674a = jVar.f40670a;
            this.f40675b = jVar.f40672c;
            this.f40676c = jVar.f40673d;
            this.f40677d = jVar.f40671b;
        }

        public a(boolean z10) {
            this.f40674a = z10;
        }

        public a a(boolean z10) {
            if (!this.f40674a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f40677d = z10;
            return this;
        }

        public a a(d0... d0VarArr) {
            if (!this.f40674a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[d0VarArr.length];
            for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                strArr[i10] = d0VarArr[i10].f40216a;
            }
            return b(strArr);
        }

        public a a(g... gVarArr) {
            if (!this.f40674a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f40294a;
            }
            return a(strArr);
        }

        public a a(String... strArr) {
            if (!this.f40674a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f40675b = (String[]) strArr.clone();
            return this;
        }

        public j a() {
            return new j(this);
        }

        public a b(String... strArr) {
            if (!this.f40674a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f40676c = (String[]) strArr.clone();
            return this;
        }
    }

    static {
        g gVar = g.f40265n1;
        g gVar2 = g.f40268o1;
        g gVar3 = g.f40271p1;
        g gVar4 = g.f40274q1;
        g gVar5 = g.f40277r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f40235d1;
        g gVar8 = g.f40226a1;
        g gVar9 = g.f40238e1;
        g gVar10 = g.f40256k1;
        g gVar11 = g.f40253j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f40664e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f40249i0, g.f40252j0, g.G, g.K, g.f40254k};
        f40665f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f40666g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f40667h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f40668i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f40669j = new a(false).a();
    }

    public j(a aVar) {
        this.f40670a = aVar.f40674a;
        this.f40672c = aVar.f40675b;
        this.f40673d = aVar.f40676c;
        this.f40671b = aVar.f40677d;
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f40672c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f40227b, sSLSocket.getEnabledCipherSuites(), this.f40672c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f40673d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f40322q, sSLSocket.getEnabledProtocols(), this.f40673d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f40227b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public List<g> a() {
        String[] strArr = this.f40672c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f40673d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f40672c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f40670a) {
            return false;
        }
        String[] strArr = this.f40673d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f40322q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f40672c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f40227b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.f40670a;
    }

    public boolean c() {
        return this.f40671b;
    }

    public List<d0> d() {
        String[] strArr = this.f40673d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f40670a;
        if (z10 != jVar.f40670a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f40672c, jVar.f40672c) && Arrays.equals(this.f40673d, jVar.f40673d) && this.f40671b == jVar.f40671b);
    }

    public int hashCode() {
        if (this.f40670a) {
            return ((((Arrays.hashCode(this.f40672c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f40673d)) * 31) + (!this.f40671b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f40670a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f40672c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f40673d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f40671b + ")";
    }
}
