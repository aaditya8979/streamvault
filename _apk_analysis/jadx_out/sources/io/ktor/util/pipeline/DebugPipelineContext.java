package io.ktor.util.pipeline;

import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.c;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: DebugPipelineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DebugPipelineContext<TSubject, TContext> extends c<TSubject, TContext> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> f71227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f71228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public TSubject f71229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(@NotNull TContext tcontext, @NotNull List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object>> list, @NotNull TSubject tsubject, @NotNull d dVar) {
        super(tcontext);
        p.k(tcontext, GAMConfig.KEY_CONTEXT);
        p.k(list, "interceptors");
        p.k(tsubject, "subject");
        p.k(dVar, "coroutineContext");
        this.f71227c = list;
        this.f71228d = dVar;
        this.f71229e = tsubject;
    }

    @Override // ql.c
    @Nullable
    public Object a(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar) {
        this.f71230f = 0;
        j(tsubject);
        return c(cVar);
    }

    @Override // ql.c
    @NotNull
    public TSubject b() {
        return this.f71229e;
    }

    @Override // ql.c
    @Nullable
    public Object c(@NotNull hn.c<? super TSubject> cVar) {
        int i10 = this.f71230f;
        if (i10 < 0) {
            return b();
        }
        if (i10 < this.f71227c.size()) {
            return i(cVar);
        }
        f();
        return b();
    }

    @Override // ql.c
    @Nullable
    public Object d(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar) {
        j(tsubject);
        return c(cVar);
    }

    public void f() {
        this.f71230f = -1;
    }

    @Override // p000do.l0
    @NotNull
    public d getCoroutineContext() {
        return this.f71228d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(hn.c<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = (io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            goto L2e
        L26:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2e:
            kotlin.c.b(r7)
            r7 = r6
        L32:
            int r2 = r7.f71230f
            r4 = -1
            if (r2 != r4) goto L38
            goto L43
        L38:
            java.util.List<sn.q<ql.c<TSubject, TContext>, TSubject, hn.c<? super bn.r>, java.lang.Object>> r4 = r7.f71227c
            int r5 = r4.size()
            if (r2 < r5) goto L48
            r7.f()
        L43:
            java.lang.Object r7 = r7.b()
            return r7
        L48:
            java.lang.Object r4 = r4.get(r2)
            sn.q r4 = (sn.q) r4
            int r2 = r2 + 1
            r7.f71230f = r2
            java.lang.Object r2 = r7.b()
            r0.label = r3
            java.lang.Object r2 = r4.invoke(r7, r2, r0)
            if (r2 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.DebugPipelineContext.i(hn.c):java.lang.Object");
    }

    public void j(@NotNull TSubject tsubject) {
        p.k(tsubject, "<set-?>");
        this.f71229e = tsubject;
    }
}
