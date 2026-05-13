package ql;

import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: SuspendFunctionGun.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m<TSubject, TContext> extends c<TSubject, TContext> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> f78345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final hn.c<r> f78346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public TSubject f78347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final hn.c<TSubject>[] f78348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78350h;

    /* JADX INFO: compiled from: SuspendFunctionGun.kt */
    public static final class a implements hn.c<r>, jn.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f78351b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<TSubject, TContext> f78352c;

        public a(m<TSubject, TContext> mVar) {
            this.f78352c = mVar;
        }

        public final hn.c<?> b() {
            if (this.f78351b == Integer.MIN_VALUE) {
                this.f78351b = this.f78352c.f78349g;
            }
            if (this.f78351b < 0) {
                this.f78351b = Integer.MIN_VALUE;
                return null;
            }
            try {
                hn.c<?>[] cVarArr = this.f78352c.f78348f;
                int i10 = this.f78351b;
                hn.c<?> cVar = cVarArr[i10];
                if (cVar == null) {
                    return l.f78344b;
                }
                this.f78351b = i10 - 1;
                return cVar;
            } catch (Throwable unused) {
                return l.f78344b;
            }
        }

        @Override // jn.c
        public jn.c getCallerFrame() {
            hn.c<?> cVarB = b();
            if (cVarB instanceof jn.c) {
                return (jn.c) cVarB;
            }
            return null;
        }

        @Override // hn.c
        public kotlin.coroutines.d getContext() {
            hn.c cVar = this.f78352c.f78348f[this.f78352c.f78349g];
            if (cVar != this && cVar != null) {
                return cVar.getContext();
            }
            int i10 = this.f78352c.f78349g - 1;
            while (i10 >= 0) {
                int i11 = i10 - 1;
                hn.c cVar2 = this.f78352c.f78348f[i10];
                if (cVar2 != this && cVar2 != null) {
                    return cVar2.getContext();
                }
                i10 = i11;
            }
            throw new IllegalStateException("Not started".toString());
        }

        @Override // hn.c
        public void resumeWith(Object obj) {
            if (!Result.m7539isFailureimpl(obj)) {
                this.f78352c.m(false);
                return;
            }
            m<TSubject, TContext> mVar = this.f78352c;
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
            p.h(thM7537exceptionOrNullimpl);
            mVar.n(Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull TSubject tsubject, @NotNull TContext tcontext, @NotNull List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object>> list) {
        super(tcontext);
        p.k(tsubject, "initial");
        p.k(tcontext, GAMConfig.KEY_CONTEXT);
        p.k(list, "blocks");
        this.f78345c = list;
        this.f78346d = new a(this);
        this.f78347e = tsubject;
        this.f78348f = new hn.c[list.size()];
        this.f78349g = -1;
    }

    @Override // ql.c
    @Nullable
    public Object a(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar) {
        this.f78350h = 0;
        if (this.f78345c.size() == 0) {
            return tsubject;
        }
        o(tsubject);
        if (this.f78349g < 0) {
            return c(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // ql.c
    @NotNull
    public TSubject b() {
        return this.f78347e;
    }

    @Override // ql.c
    @Nullable
    public Object c(@NotNull hn.c<? super TSubject> cVar) {
        Object objG;
        if (this.f78350h == this.f78345c.size()) {
            objG = b();
        } else {
            k(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
            if (m(true)) {
                l();
                objG = b();
            } else {
                objG = in.a.g();
            }
        }
        if (objG == in.a.g()) {
            jn.f.c(cVar);
        }
        return objG;
    }

    @Override // ql.c
    @Nullable
    public Object d(@NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar) {
        o(tsubject);
        return c(cVar);
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f78346d.getContext();
    }

    public final void k(@NotNull hn.c<? super TSubject> cVar) {
        p.k(cVar, "continuation");
        hn.c<TSubject>[] cVarArr = this.f78348f;
        int i10 = this.f78349g + 1;
        this.f78349g = i10;
        cVarArr[i10] = cVar;
    }

    public final void l() {
        int i10 = this.f78349g;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        hn.c<TSubject>[] cVarArr = this.f78348f;
        this.f78349g = i10 - 1;
        cVarArr[i10] = null;
    }

    public final boolean m(boolean z10) {
        int i10;
        do {
            i10 = this.f78350h;
            if (i10 == this.f78345c.size()) {
                if (z10) {
                    return true;
                }
                Result.a aVar = Result.Companion;
                n(Result.m7534constructorimpl(b()));
                return false;
            }
            this.f78350h = i10 + 1;
            try {
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                n(Result.m7534constructorimpl(kotlin.c.a(th2)));
                return false;
            }
        } while (f.a(this.f78345c.get(i10), this, b(), this.f78346d) != in.a.g());
        return false;
    }

    public final void n(Object obj) {
        int i10 = this.f78349g;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume".toString());
        }
        hn.c<TSubject> cVar = this.f78348f[i10];
        p.h(cVar);
        hn.c<TSubject>[] cVarArr = this.f78348f;
        int i11 = this.f78349g;
        this.f78349g = i11 - 1;
        cVarArr[i11] = null;
        if (!Result.m7539isFailureimpl(obj)) {
            cVar.resumeWith(obj);
            return;
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        p.h(thM7537exceptionOrNullimpl);
        cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(j.a(thM7537exceptionOrNullimpl, cVar))));
    }

    public void o(@NotNull TSubject tsubject) {
        p.k(tsubject, "<set-?>");
        this.f78347e = tsubject;
    }
}
