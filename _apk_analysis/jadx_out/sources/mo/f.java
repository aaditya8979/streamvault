package mo;

import bn.r;
import io.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import mo.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.m0;
import p000do.n;
import p000do.s2;
import sn.q;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes12.dex */
public class f extends SemaphoreAndMutexImpl implements mo.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74821i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final q<lo.f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f74822h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: Mutex.kt */
    public final class a implements p000do.k<r>, s2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final kotlinx.coroutines.c<r> f74823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Object f74824c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull kotlinx.coroutines.c<? super r> cVar, @Nullable Object obj) {
            this.f74823b = cVar;
            this.f74824c = obj;
        }

        public static final r h(f fVar, a aVar, Throwable th2) {
            fVar.d(aVar.f74824c);
            return r.f5635a;
        }

        public static final r k(f fVar, a aVar, Throwable th2, r rVar, kotlin.coroutines.d dVar) {
            f.y().set(fVar, aVar.f74824c);
            fVar.d(aVar.f74824c);
            return r.f5635a;
        }

        @Override // p000do.k
        public void A(@NotNull Object obj) {
            this.f74823b.A(obj);
        }

        @Override // p000do.k
        @Nullable
        public Object D(@NotNull Throwable th2) {
            return this.f74823b.D(th2);
        }

        @Override // p000do.k
        public void P(@NotNull sn.l<? super Throwable, r> lVar) {
            this.f74823b.P(lVar);
        }

        @Override // p000do.k
        public boolean a(@Nullable Throwable th2) {
            return this.f74823b.a(th2);
        }

        @Override // p000do.s2
        public void b(@NotNull b0<?> b0Var, int i10) {
            this.f74823b.b(b0Var, i10);
        }

        @Override // p000do.k
        public boolean d() {
            return this.f74823b.d();
        }

        @Override // p000do.k
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void p(@NotNull r rVar, @Nullable sn.l<? super Throwable, r> lVar) {
            this.f74823b.p(rVar, lVar);
        }

        @Override // p000do.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public <R extends r> void y(@NotNull R r10, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
            f.y().set(f.this, this.f74824c);
            kotlinx.coroutines.c<r> cVar = this.f74823b;
            final f fVar = f.this;
            cVar.p(r10, new sn.l() { // from class: mo.d
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return f.a.h(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // p000do.k, hn.c
        @NotNull
        public kotlin.coroutines.d getContext() {
            return this.f74823b.getContext();
        }

        @Override // p000do.k
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void s(@NotNull h0 h0Var, @NotNull r rVar) {
            this.f74823b.s(h0Var, rVar);
        }

        @Override // p000do.k
        public boolean isActive() {
            return this.f74823b.isActive();
        }

        @Override // p000do.k
        @Nullable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public <R extends r> Object E(@NotNull R r10, @Nullable Object obj, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
            final f fVar = f.this;
            Object objE = this.f74823b.E(r10, obj, new q() { // from class: mo.e
                @Override // sn.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.k(fVar, this, (Throwable) obj2, (r) obj3, (kotlin.coroutines.d) obj4);
                }
            });
            if (objE != null) {
                f.y().set(f.this, this.f74824c);
            }
            return objE;
        }

        @Override // hn.c
        public void resumeWith(@NotNull Object obj) {
            this.f74823b.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f74826a;
        this.f74822h = new q() { // from class: mo.b
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.D(this.f74814b, (lo.f) obj, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ Object B(f fVar, Object obj, hn.c<? super r> cVar) {
        Object objC;
        return (!fVar.a(obj) && (objC = fVar.C(obj, cVar)) == in.a.g()) ? objC : r.f5635a;
    }

    public static final q D(final f fVar, lo.f fVar2, final Object obj, Object obj2) {
        return new q() { // from class: mo.c
            @Override // sn.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.E(this.f74815b, obj, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
            }
        };
    }

    public static final r E(f fVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        fVar.d(obj);
        return r.f5635a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater y() {
        return f74821i;
    }

    public boolean A() {
        return l() == 0;
    }

    public final Object C(Object obj, hn.c<? super r> cVar) {
        kotlinx.coroutines.c cVarB = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        try {
            g(new a(cVarB, obj));
            Object objB = cVarB.B();
            if (objB == in.a.g()) {
                jn.f.c(cVar);
            }
            return objB == in.a.g() ? objB : r.f5635a;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }

    public final int F(Object obj) {
        while (!s()) {
            if (obj == null) {
                return 1;
            }
            int iZ = z(obj);
            if (iZ == 1) {
                return 2;
            }
            if (iZ == 2) {
                return 1;
            }
        }
        f74821i.set(this, obj);
        return 0;
    }

    @Override // mo.a
    public boolean a(@Nullable Object obj) {
        int iF = F(obj);
        if (iF == 0) {
            return true;
        }
        if (iF == 1) {
            return false;
        }
        if (iF != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // mo.a
    @Nullable
    public Object c(@Nullable Object obj, @NotNull hn.c<? super r> cVar) {
        return B(this, obj, cVar);
    }

    @Override // mo.a
    public void d(@Nullable Object obj) {
        while (A()) {
            Object obj2 = f74821i.get(this);
            if (obj2 != g.f74826a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.a.a(f74821i, this, obj2, g.f74826a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @NotNull
    public String toString() {
        return "Mutex@" + m0.b(this) + "[isLocked=" + A() + ",owner=" + f74821i.get(this) + ']';
    }

    public final int z(Object obj) {
        while (A()) {
            Object obj2 = f74821i.get(this);
            if (obj2 != g.f74826a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }
}
