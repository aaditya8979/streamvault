package al;

import bn.r;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CreatePluginUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    @NotNull
    public static final <PluginConfigT> b<PluginConfigT> b(@NotNull String str, @NotNull sn.a<? extends PluginConfigT> aVar, @NotNull sn.l<? super d<PluginConfigT>, r> lVar) {
        p.k(str, "name");
        p.k(aVar, "createConfiguration");
        p.k(lVar, "body");
        return new e(str, aVar, lVar);
    }

    @NotNull
    public static final b<r> c(@NotNull String str, @NotNull sn.l<? super d<r>, r> lVar) {
        p.k(str, "name");
        p.k(lVar, "body");
        return b(str, new sn.a() { // from class: al.h
            @Override // sn.a
            public final Object invoke() {
                return i.d();
            }
        }, lVar);
    }

    public static final r d() {
        return r.f5635a;
    }
}
