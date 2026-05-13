package ql;

import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.ktor.util.pipeline.DebugPipelineContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: PipelineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @NotNull
    public static final <TSubject, TContext> c<TSubject, TContext> a(@NotNull TContext tcontext, @NotNull List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object>> list, @NotNull TSubject tsubject, @NotNull kotlin.coroutines.d dVar, boolean z10) {
        p.k(tcontext, GAMConfig.KEY_CONTEXT);
        p.k(list, "interceptors");
        p.k(tsubject, "subject");
        p.k(dVar, "coroutineContext");
        return (e.a() || z10) ? new DebugPipelineContext(tcontext, list, tsubject, dVar) : new m(tsubject, tcontext, list);
    }
}
