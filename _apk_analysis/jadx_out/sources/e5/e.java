package e5;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import e4.v0;
import e5.b0;
import e5.r;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e<T> extends e5.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<T, b> f60379g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Handler f60380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public y5.q f60381i;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f60382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0.a f60383c;

        public a(T t10) {
            this.f60383c = e.this.n(null);
            this.f60382b = t10;
        }

        public final boolean a(int i10, @Nullable r.a aVar) {
            r.a aVarY;
            if (aVar != null) {
                aVarY = e.this.y(this.f60382b, aVar);
                if (aVarY == null) {
                    return false;
                }
            } else {
                aVarY = null;
            }
            int iA = e.this.A(this.f60382b, i10);
            b0.a aVar2 = this.f60383c;
            if (aVar2.f60347a == iA && a6.k0.c(aVar2.f60348b, aVarY)) {
                return true;
            }
            this.f60383c = e.this.m(iA, aVarY, 0L);
            return true;
        }

        public final b0.c b(b0.c cVar) {
            long jZ = e.this.z(this.f60382b, cVar.f60364f);
            long jZ2 = e.this.z(this.f60382b, cVar.f60365g);
            return (jZ == cVar.f60364f && jZ2 == cVar.f60365g) ? cVar : new b0.c(cVar.f60359a, cVar.f60360b, cVar.f60361c, cVar.f60362d, cVar.f60363e, jZ, jZ2);
        }

        @Override // e5.b0
        public void c(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f60383c.z(bVar, b(cVar));
            }
        }

        @Override // e5.b0
        public void d(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f60383c.L();
            }
        }

        @Override // e5.b0
        public void f(int i10, @Nullable r.a aVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f60383c.m(b(cVar));
            }
        }

        @Override // e5.b0
        public void g(int i10, @Nullable r.a aVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f60383c.O(b(cVar));
            }
        }

        @Override // e5.b0
        public void n(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f60383c.C(bVar, b(cVar), iOException, z10);
            }
        }

        @Override // e5.b0
        public void o(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f60383c.w(bVar, b(cVar));
            }
        }

        @Override // e5.b0
        public void q(int i10, r.a aVar) {
            if (a(i10, aVar) && e.this.F((r.a) a6.a.e(this.f60383c.f60348b))) {
                this.f60383c.I();
            }
        }

        @Override // e5.b0
        public void u(int i10, r.a aVar) {
            if (a(i10, aVar) && e.this.F((r.a) a6.a.e(this.f60383c.f60348b))) {
                this.f60383c.J();
            }
        }

        @Override // e5.b0
        public void v(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f60383c.F(bVar, b(cVar));
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f60385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f60386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f60387c;

        public b(r rVar, r.b bVar, b0 b0Var) {
            this.f60385a = rVar;
            this.f60386b = bVar;
            this.f60387c = b0Var;
        }
    }

    public int A(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public abstract void B(T t10, r rVar, v0 v0Var);

    public final void D(final T t10, r rVar) {
        a6.a.a(!this.f60379g.containsKey(t10));
        r.b bVar = new r.b() { // from class: e5.d
            @Override // e5.r.b
            public final void b(r rVar2, v0 v0Var) {
                this.f60376b.B(t10, rVar2, v0Var);
            }
        };
        a aVar = new a(t10);
        this.f60379g.put(t10, new b(rVar, bVar, aVar));
        rVar.c((Handler) a6.a.e(this.f60380h), aVar);
        rVar.a(bVar, this.f60381i);
        if (r()) {
            return;
        }
        rVar.e(bVar);
    }

    public final void E(T t10) {
        b bVar = (b) a6.a.e(this.f60379g.remove(t10));
        bVar.f60385a.d(bVar.f60386b);
        bVar.f60385a.f(bVar.f60387c);
    }

    public boolean F(r.a aVar) {
        return true;
    }

    @Override // e5.r
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b> it = this.f60379g.values().iterator();
        while (it.hasNext()) {
            it.next().f60385a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // e5.b
    @CallSuper
    public void p() {
        for (b bVar : this.f60379g.values()) {
            bVar.f60385a.e(bVar.f60386b);
        }
    }

    @Override // e5.b
    @CallSuper
    public void q() {
        for (b bVar : this.f60379g.values()) {
            bVar.f60385a.h(bVar.f60386b);
        }
    }

    @Override // e5.b
    @CallSuper
    public void s(@Nullable y5.q qVar) {
        this.f60381i = qVar;
        this.f60380h = new Handler();
    }

    @Override // e5.b
    @CallSuper
    public void u() {
        for (b bVar : this.f60379g.values()) {
            bVar.f60385a.d(bVar.f60386b);
            bVar.f60385a.f(bVar.f60387c);
        }
        this.f60379g.clear();
    }

    public final void w(T t10) {
        b bVar = (b) a6.a.e(this.f60379g.get(t10));
        bVar.f60385a.e(bVar.f60386b);
    }

    public final void x(T t10) {
        b bVar = (b) a6.a.e(this.f60379g.get(t10));
        bVar.f60385a.h(bVar.f60386b);
    }

    @Nullable
    public r.a y(T t10, r.a aVar) {
        return aVar;
    }

    public long z(@Nullable T t10, long j10) {
        return j10;
    }
}
