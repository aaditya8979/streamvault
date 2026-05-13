package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import r7.y;
import s7.m0;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c<T> extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<T, b<T>> f22261h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Handler f22262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public y f22263j;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements j, com.google.android.exoplayer2.drm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f22264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j.a f22265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b.a f22266d;

        public a(T t10) {
            this.f22265c = c.this.n(null);
            this.f22266d = c.this.l(null);
            this.f22264b = t10;
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void B(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22266d.i();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void D(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22265c.r(nVar, e(oVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void F(int i10, @Nullable i.b bVar, Exception exc) {
            if (c(i10, bVar)) {
                this.f22266d.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void J(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22266d.m();
            }
        }

        public final boolean c(int i10, @Nullable i.b bVar) {
            i.b bVarW;
            if (bVar != null) {
                bVarW = c.this.w(this.f22264b, bVar);
                if (bVarW == null) {
                    return false;
                }
            } else {
                bVarW = null;
            }
            int iY = c.this.y(this.f22264b, i10);
            j.a aVar = this.f22265c;
            if (aVar.f22315a != iY || !m0.c(aVar.f22316b, bVarW)) {
                this.f22265c = c.this.m(iY, bVarW, 0L);
            }
            b.a aVar2 = this.f22266d;
            if (aVar2.f21523a == iY && m0.c(aVar2.f21524b, bVarW)) {
                return true;
            }
            this.f22266d = c.this.k(iY, bVarW);
            return true;
        }

        public final e7.o e(e7.o oVar) {
            long jX = c.this.x(this.f22264b, oVar.f60897f);
            long jX2 = c.this.x(this.f22264b, oVar.f60898g);
            return (jX == oVar.f60897f && jX2 == oVar.f60898g) ? oVar : new e7.o(oVar.f60892a, oVar.f60893b, oVar.f60894c, oVar.f60895d, oVar.f60896e, jX, jX2);
        }

        @Override // com.google.android.exoplayer2.source.j
        public void o(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
            if (c(i10, bVar)) {
                this.f22265c.t(nVar, e(oVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void r(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22265c.p(nVar, e(oVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void t(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22266d.h();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void u(int i10, @Nullable i.b bVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22265c.i(e(oVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void v(int i10, @Nullable i.b bVar, int i11) {
            if (c(i10, bVar)) {
                this.f22266d.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void x(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22265c.v(nVar, e(oVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void y(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22266d.j();
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f22268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i.c f22269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f22270c;

        public b(i iVar, i.c cVar, c<T>.a aVar) {
            this.f22268a = iVar;
            this.f22269b = cVar;
            this.f22270c = aVar;
        }
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract void z(T t10, i iVar, c0 c0Var);

    public final void B(final T t10, i iVar) {
        s7.a.a(!this.f22261h.containsKey(t10));
        i.c cVar = new i.c() { // from class: e7.b
            @Override // com.google.android.exoplayer2.source.i.c
            public final void a(com.google.android.exoplayer2.source.i iVar2, com.google.android.exoplayer2.c0 c0Var) {
                this.f60838a.z(t10, iVar2, c0Var);
            }
        };
        a aVar = new a(t10);
        this.f22261h.put(t10, new b<>(iVar, cVar, aVar));
        iVar.e((Handler) s7.a.e(this.f22262i), aVar);
        iVar.i((Handler) s7.a.e(this.f22262i), aVar);
        iVar.d(cVar, this.f22263j, q());
        if (r()) {
            return;
        }
        iVar.h(cVar);
    }

    @Override // com.google.android.exoplayer2.source.i
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f22261h.values().iterator();
        while (it.hasNext()) {
            it.next().f22268a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    @CallSuper
    public void o() {
        for (b<T> bVar : this.f22261h.values()) {
            bVar.f22268a.h(bVar.f22269b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    @CallSuper
    public void p() {
        for (b<T> bVar : this.f22261h.values()) {
            bVar.f22268a.g(bVar.f22269b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    @CallSuper
    public void s(@Nullable y yVar) {
        this.f22263j = yVar;
        this.f22262i = m0.u();
    }

    @Override // com.google.android.exoplayer2.source.a
    @CallSuper
    public void u() {
        for (b<T> bVar : this.f22261h.values()) {
            bVar.f22268a.b(bVar.f22269b);
            bVar.f22268a.c(bVar.f22270c);
            bVar.f22268a.j(bVar.f22270c);
        }
        this.f22261h.clear();
    }

    @Nullable
    public abstract i.b w(T t10, i.b bVar);

    public long x(T t10, long j10) {
        return j10;
    }

    public int y(T t10, int i10) {
        return i10;
    }
}
