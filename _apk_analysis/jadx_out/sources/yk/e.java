package yk;

import bn.r;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import xk.f;

/* JADX INFO: compiled from: AndroidEngineConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97891d = 100000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97892e = 100000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public l<? super HttpsURLConnection, r> f97893f = new l() { // from class: yk.c
        @Override // sn.l
        public final Object invoke(Object obj) {
            return e.j((HttpsURLConnection) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public l<? super HttpURLConnection, r> f97894g = new l() { // from class: yk.d
        @Override // sn.l
        public final Object invoke(Object obj) {
            return e.i((HttpURLConnection) obj);
        }
    };

    public static final r i(HttpURLConnection httpURLConnection) {
        p.k(httpURLConnection, "<this>");
        return r.f5635a;
    }

    public static final r j(HttpsURLConnection httpsURLConnection) {
        p.k(httpsURLConnection, "it");
        return r.f5635a;
    }

    public final int e() {
        return this.f97891d;
    }

    @NotNull
    public final l<HttpURLConnection, r> f() {
        return this.f97894g;
    }

    public final int g() {
        return this.f97892e;
    }

    @NotNull
    public final l<HttpsURLConnection, r> h() {
        return this.f97893f;
    }
}
