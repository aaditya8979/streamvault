package ql;

import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: PipelineJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    @Nullable
    public static final <TSubject, TContext> Object a(@NotNull q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object> qVar, @NotNull c<TSubject, TContext> cVar, @NotNull TSubject tsubject, @NotNull hn.c<? super r> cVar2) {
        p.k(qVar, "interceptor");
        p.k(cVar, GAMConfig.KEY_CONTEXT);
        p.k(tsubject, "subject");
        p.k(cVar2, "continuation");
        return ((q) y.e(qVar, 3)).invoke(cVar, tsubject, cVar2);
    }
}
