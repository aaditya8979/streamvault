package io.ktor.client.engine.android;

import bn.r;
import cn.w0;
import gl.s;
import io.ktor.client.engine.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import sn.p;
import xk.d;
import yk.e;
import zk.f0;

/* JADX INFO: compiled from: AndroidClientEngine.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidClientEngine extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f71073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Set<d<?>> f71074g;

    /* JADX INFO: compiled from: HttpRequest.kt */
    public static final class a implements p<String, String, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f71075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HttpURLConnection f71076c;

        public a(boolean z10, HttpURLConnection httpURLConnection) {
            this.f71075b = z10;
            this.f71076c = httpURLConnection;
        }

        public final void a(String str, String str2) {
            tn.p.k(str, "key");
            tn.p.k(str2, "value");
            if (this.f71075b && tn.p.f(str, s.f62569a.g())) {
                return;
            }
            this.f71076c.addRequestProperty(str, str2);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(String str, String str2) {
            a(str, str2);
            return r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(@NotNull e eVar) {
        super("ktor-android");
        tn.p.k(eVar, "config");
        this.f71073f = eVar;
        this.f71074g = w0.j(f0.f98297a, bl.a.f5605a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final cl.h m(kotlin.coroutines.d r11, cl.e r12, jl.c r13, nl.c r14, java.net.HttpURLConnection r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidClientEngine.m(kotlin.coroutines.d, cl.e, jl.c, nl.c, java.net.HttpURLConnection):cl.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad A[PHI: r1
      0x01ad: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:54:0x01aa, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.client.engine.HttpClientEngine
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@org.jetbrains.annotations.NotNull cl.e r18, @org.jetbrains.annotations.NotNull hn.c<? super cl.h> r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidClientEngine.g(cl.e, hn.c):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e getConfig() {
        return this.f71073f;
    }

    public final HttpURLConnection o(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection;
        URL url = new URL(str);
        Proxy proxyB = getConfig().b();
        if (proxyB == null || (uRLConnectionOpenConnection = url.openConnection(proxyB)) == null) {
            uRLConnectionOpenConnection = url.openConnection();
            tn.p.j(uRLConnectionOpenConnection, "openConnection(...)");
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    @Override // io.ktor.client.engine.b, io.ktor.client.engine.HttpClientEngine
    @NotNull
    public Set<d<?>> u() {
        return this.f71074g;
    }
}
