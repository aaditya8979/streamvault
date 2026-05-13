package p000do;

import bn.r;
import hn.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59831b = AtomicIntegerFieldUpdater.newUpdater(d.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p0<T>[] f59832a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: Await.kt */
    public final class a extends u1 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f59833i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final k<List<? extends T>> f59834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public y0 f59835g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull k<? super List<? extends T>> kVar) {
            this.f59834f = kVar;
        }

        public final void A(@Nullable d<T>.b bVar) {
            f59833i.set(this, bVar);
        }

        public final void B(@NotNull y0 y0Var) {
            this.f59835g = y0Var;
        }

        @Override // p000do.u1
        public boolean u() {
            return false;
        }

        @Override // p000do.u1
        public void v(@Nullable Throwable th2) {
            if (th2 != null) {
                Object objD = this.f59834f.D(th2);
                if (objD != null) {
                    this.f59834f.A(objD);
                    d<T>.b bVarX = x();
                    if (bVarX != null) {
                        bVarX.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (d.d().decrementAndGet(d.this) == 0) {
                k<List<? extends T>> kVar = this.f59834f;
                p0[] p0VarArr = d.this.f59832a;
                ArrayList arrayList = new ArrayList(p0VarArr.length);
                for (p0 p0Var : p0VarArr) {
                    arrayList.add(p0Var.l());
                }
                kVar.resumeWith(Result.m7534constructorimpl(arrayList));
            }
        }

        @Nullable
        public final d<T>.b x() {
            return (b) f59833i.get(this);
        }

        @NotNull
        public final y0 y() {
            y0 y0Var = this.f59835g;
            if (y0Var != null) {
                return y0Var;
            }
            p.C("handle");
            return null;
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    public final class b implements kotlinx.coroutines.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d<T>.a[] f59837b;

        public b(@NotNull d<T>.a[] aVarArr) {
            this.f59837b = aVarArr;
        }

        @Override // kotlinx.coroutines.b
        public void a(@Nullable Throwable th2) {
            b();
        }

        public final void b() {
            for (d<T>.a aVar : this.f59837b) {
                aVar.y().dispose();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f59837b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull p0<? extends T>[] p0VarArr) {
        this.f59832a = p0VarArr;
        this.notCompletedCount$volatile = p0VarArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f59831b;
    }

    @Nullable
    public final Object c(@NotNull c<? super List<? extends T>> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        int length = this.f59832a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            p0 p0Var = this.f59832a[i10];
            p0Var.start();
            a aVar = new a(cVar2);
            aVar.B(JobKt__JobKt.o(p0Var, false, aVar, 1, null));
            r rVar = r.f5635a;
            aVarArr[i10] = aVar;
        }
        d<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (cVar2.d()) {
            bVar.b();
        } else {
            n.c(cVar2, bVar);
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB;
    }
}
