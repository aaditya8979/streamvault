package kotlinx.coroutines;

import bn.r;
import io.l0;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.f0;
import p000do.j0;
import p000do.q2;
import p000do.u0;
import p000do.y;
import tn.p;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class f<T> extends ko.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73318d;

    public f(int i10) {
        this.f73318d = i10;
    }

    public void c(@Nullable Object obj, @NotNull Throwable th2) {
    }

    @NotNull
    public abstract hn.c<T> f();

    @Nullable
    public Throwable g(@Nullable Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar.f59911a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(@Nullable Object obj) {
        return obj;
    }

    public final void i(@NotNull Throwable th2) {
        j0.a(f().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @Nullable
    public abstract Object j();

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            hn.c<T> cVarF = f();
            p.i(cVarF, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            io.h hVar = (io.h) cVarF;
            hn.c<T> cVar = hVar.f71040f;
            Object obj = hVar.f71042h;
            kotlin.coroutines.d context = cVar.getContext();
            Object objI = l0.i(context, obj);
            g gVar = null;
            q2<?> q2VarM = objI != l0.f71285a ? f0.m(cVar, context, objI) : null;
            try {
                kotlin.coroutines.d context2 = cVar.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null && u0.b(this.f73318d)) {
                    gVar = (g) context2.get(g.H8);
                }
                if (gVar != null && !gVar.isActive()) {
                    CancellationException cancellationExceptionB = gVar.B();
                    c(objJ, cancellationExceptionB);
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(cancellationExceptionB)));
                } else if (thG != null) {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thG)));
                } else {
                    Result.a aVar3 = Result.Companion;
                    cVar.resumeWith(Result.m7534constructorimpl(h(objJ)));
                }
                r rVar = r.f5635a;
                if (q2VarM == null || q2VarM.k1()) {
                    l0.f(context, objI);
                }
            } catch (Throwable th2) {
                if (q2VarM == null || q2VarM.k1()) {
                    l0.f(context, objI);
                }
                throw th2;
            }
        } catch (DispatchException e10) {
            j0.a(f().getContext(), e10.getCause());
        } catch (Throwable th3) {
            i(th3);
        }
    }
}
