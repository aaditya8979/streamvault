package com.moloco.sdk.internal.http;

import bn.r;
import cl.f;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.publisher.Moloco;
import gl.n;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.UserAgentKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import uk.h;
import uk.j;
import zk.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final r a(w wVar, i0 i0Var, n nVar) {
        p.k(nVar, "$this$headers");
        nVar.e("X-Moloco-App-Info", "AppBundle/" + wVar.a() + "; AppVersion/" + wVar.b() + "; AppKey/" + Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
        nVar.e("X-Moloco-Device-Info", "make/" + i0Var.f() + "; model/" + i0Var.h() + "; hwv/" + i0Var.d() + "; osv/" + i0Var.j() + "; OS/Android;");
        nVar.e("X-Moloco-SDK-Info", "SdkVersion/4.4.0");
        return r.f5635a;
    }

    public static final r b(final w wVar, final i0 i0Var, DefaultRequest.a aVar) {
        p.k(aVar, "$this$defaultRequest");
        f.b(aVar, new l() { // from class: com.moloco.sdk.internal.http.d
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.a(wVar, i0Var, (n) obj);
            }
        });
        return r.f5635a;
    }

    public static final r c(final w wVar, final i0 i0Var, h hVar) {
        p.k(hVar, "$this$HttpClient");
        hVar.m(UserAgentKt.d(), new l() { // from class: com.moloco.sdk.internal.http.b
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.d((m0) obj);
            }
        });
        h.n(hVar, HttpTimeoutKt.m(), null, 2, null);
        h.n(hVar, HttpRequestRetryKt.s(), null, 2, null);
        io.ktor.client.plugins.a.c(hVar, new l() { // from class: com.moloco.sdk.internal.http.c
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.b(wVar, i0Var, (DefaultRequest.a) obj);
            }
        });
        return r.f5635a;
    }

    public static final r d(m0 m0Var) {
        p.k(m0Var, "$this$install");
        m0Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.core.e.b().invoke());
        return r.f5635a;
    }

    @NotNull
    public static final HttpClient e(@NotNull final w wVar, @NotNull final i0 i0Var) {
        p.k(wVar, "appInfo");
        p.k(i0Var, "deviceInfo");
        return j.a(new l() { // from class: com.moloco.sdk.internal.http.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.c(wVar, i0Var, (h) obj);
            }
        });
    }
}
