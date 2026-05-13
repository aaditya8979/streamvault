package p000do;

import bn.r;
import kotlin.coroutines.d;
import kotlinx.coroutines.b;
import kotlinx.coroutines.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class x<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f59903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final b f59904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q<Throwable, R, d, r> f59905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Object f59906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Throwable f59907e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(R r10, @Nullable b bVar, @Nullable q<? super Throwable, ? super R, ? super d, r> qVar, @Nullable Object obj, @Nullable Throwable th2) {
        this.f59903a = r10;
        this.f59904b = bVar;
        this.f59905c = qVar;
        this.f59906d = obj;
        this.f59907e = th2;
    }

    public /* synthetic */ x(Object obj, b bVar, q qVar, Object obj2, Throwable th2, int i10, i iVar) {
        this(obj, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x b(x xVar, Object obj, b bVar, q qVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = xVar.f59903a;
        }
        if ((i10 & 2) != 0) {
            bVar = xVar.f59904b;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            qVar = xVar.f59905c;
        }
        q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            obj2 = xVar.f59906d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = xVar.f59907e;
        }
        return xVar.a(obj, bVar2, qVar2, obj4, th2);
    }

    @NotNull
    public final x<R> a(R r10, @Nullable b bVar, @Nullable q<? super Throwable, ? super R, ? super d, r> qVar, @Nullable Object obj, @Nullable Throwable th2) {
        return new x<>(r10, bVar, qVar, obj, th2);
    }

    public final boolean c() {
        return this.f59907e != null;
    }

    public final void d(@NotNull c<?> cVar, @NotNull Throwable th2) {
        b bVar = this.f59904b;
        if (bVar != null) {
            cVar.m(bVar, th2);
        }
        q<Throwable, R, d, r> qVar = this.f59905c;
        if (qVar != null) {
            cVar.n(qVar, th2, this.f59903a);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p.f(this.f59903a, xVar.f59903a) && p.f(this.f59904b, xVar.f59904b) && p.f(this.f59905c, xVar.f59905c) && p.f(this.f59906d, xVar.f59906d) && p.f(this.f59907e, xVar.f59907e);
    }

    public int hashCode() {
        R r10 = this.f59903a;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        b bVar = this.f59904b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        q<Throwable, R, d, r> qVar = this.f59905c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f59906d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f59907e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f59903a + ", cancelHandler=" + this.f59904b + ", onCancellation=" + this.f59905c + ", idempotentResume=" + this.f59906d + ", cancelCause=" + this.f59907e + ')';
    }
}
