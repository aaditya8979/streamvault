package ql;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: PipelineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<TSubject, TContext> implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TContext f78337b;

    public c(@NotNull TContext tcontext) {
        p.k(tcontext, GAMConfig.KEY_CONTEXT);
        this.f78337b = tcontext;
    }

    @Nullable
    public abstract Object a(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar);

    @NotNull
    public abstract TSubject b();

    @Nullable
    public abstract Object c(@NotNull hn.c<? super TSubject> cVar);

    @Nullable
    public abstract Object d(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar);

    @NotNull
    public final TContext getContext() {
        return this.f78337b;
    }
}
