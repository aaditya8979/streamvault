package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gl.w;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.utils.ByteChannelUtilsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BodyProgressKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<wk.a> f71084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kl.a<wk.a> f71085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final al.b<r> f71086c;

    static {
        KType kTypeM;
        KClass kClassB = t.b(wk.a.class);
        KType kTypeM2 = null;
        try {
            kTypeM = t.m(wk.a.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f71084a = new kl.a<>("UploadProgressListenerAttributeKey", new rl.a(kClassB, kTypeM));
        KClass kClassB2 = t.b(wk.a.class);
        try {
            kTypeM2 = t.m(wk.a.class);
        } catch (Throwable unused2) {
        }
        f71085b = new kl.a<>("DownloadProgressListenerAttributeKey", new rl.a(kClassB2, kTypeM2));
        f71086c = i.c("BodyProgress", new l() { // from class: zk.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return BodyProgressKt.c((al.d) obj);
            }
        });
    }

    public static final r c(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        dVar.f(AfterRenderHook.f71083a, new BodyProgressKt$BodyProgress$1$1(null));
        dVar.f(AfterReceiveHook.f71082a, new BodyProgressKt$BodyProgress$1$2(null));
        return r.f5635a;
    }

    @NotNull
    public static final al.b<r> f() {
        return f71086c;
    }

    @NotNull
    public static final dl.c g(@NotNull dl.c cVar, @NotNull wk.a aVar) {
        p.k(cVar, "<this>");
        p.k(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final io.ktor.utils.io.a aVarA = ByteChannelUtilsKt.a(cVar.a(), cVar.getCoroutineContext(), w.b(cVar), aVar);
        return vk.b.b(cVar.L(), null, new l() { // from class: zk.b
            @Override // sn.l
            public final Object invoke(Object obj) {
                return BodyProgressKt.h(aVarA, (dl.c) obj);
            }
        }, 1, null).e();
    }

    public static final io.ktor.utils.io.a h(io.ktor.utils.io.a aVar, dl.c cVar) {
        p.k(cVar, "$this$replaceResponse");
        return aVar;
    }
}
