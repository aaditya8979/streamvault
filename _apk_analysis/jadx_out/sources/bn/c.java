package bn;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.y;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class c<T, R> extends b<T, R> implements hn.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public sn.q<? super b<?, ?>, Object, ? super hn.c<Object>, ? extends Object> f5609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f5610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public hn.c<Object> f5611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Object f5612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull sn.q<? super b<T, R>, ? super T, ? super hn.c<? super R>, ? extends Object> qVar, T t10) {
        super(null);
        tn.p.k(qVar, "block");
        this.f5609b = qVar;
        this.f5610c = t10;
        tn.p.i(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f5611d = this;
        this.f5612e = kotlin.a.f73203a;
    }

    @Override // bn.b
    @Nullable
    public Object b(T t10, @NotNull hn.c<? super R> cVar) {
        tn.p.i(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f5611d = cVar;
        this.f5610c = t10;
        Object objG = in.a.g();
        if (objG == in.a.g()) {
            jn.f.c(cVar);
        }
        return objG;
    }

    public final R c() {
        while (true) {
            R r10 = (R) this.f5612e;
            hn.c<Object> cVar = this.f5611d;
            if (cVar == null) {
                kotlin.c.b(r10);
                return r10;
            }
            if (Result.m7536equalsimpl0(kotlin.a.f73203a, r10)) {
                try {
                    sn.q<? super b<?, ?>, Object, ? super hn.c<Object>, ? extends Object> qVar = this.f5609b;
                    Object obj = this.f5610c;
                    Object objF = !(qVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.f(qVar, this, obj, cVar) : ((sn.q) y.e(qVar, 3)).invoke(this, obj, cVar);
                    if (objF != in.a.g()) {
                        cVar.resumeWith(Result.m7534constructorimpl(objF));
                    }
                } catch (Throwable th2) {
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th2)));
                }
            } else {
                this.f5612e = kotlin.a.f73203a;
                cVar.resumeWith(r10);
            }
        }
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        this.f5611d = null;
        this.f5612e = obj;
    }
}
