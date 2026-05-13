package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import d6.k1;
import e6.s1;
import e7.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s7.m0;

/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f22190a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f22194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j.a f22195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f22196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<c, b> f22197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set<c> f22198i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public r7.y f22201l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e7.c0 f22199j = new c0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.h, c> f22192c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Object, c> f22193d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f22191b = new ArrayList();

    /* JADX INFO: compiled from: MediaSourceList.java */
    public final class a implements com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.drm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f22202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j.a f22203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b.a f22204d;

        public a(c cVar) {
            this.f22203c = s.this.f22195f;
            this.f22204d = s.this.f22196g;
            this.f22202b = cVar;
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void B(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22204d.i();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void D(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22203c.r(nVar, oVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void F(int i10, @Nullable i.b bVar, Exception exc) {
            if (c(i10, bVar)) {
                this.f22204d.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void J(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22204d.m();
            }
        }

        public final boolean c(int i10, @Nullable i.b bVar) {
            i.b bVarN;
            if (bVar != null) {
                bVarN = s.n(this.f22202b, bVar);
                if (bVarN == null) {
                    return false;
                }
            } else {
                bVarN = null;
            }
            int iR = s.r(this.f22202b, i10);
            j.a aVar = this.f22203c;
            if (aVar.f22315a != iR || !m0.c(aVar.f22316b, bVarN)) {
                this.f22203c = s.this.f22195f.x(iR, bVarN, 0L);
            }
            b.a aVar2 = this.f22204d;
            if (aVar2.f21523a == iR && m0.c(aVar2.f21524b, bVarN)) {
                return true;
            }
            this.f22204d = s.this.f22196g.u(iR, bVarN);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.j
        public void o(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
            if (c(i10, bVar)) {
                this.f22203c.t(nVar, oVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void r(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22203c.p(nVar, oVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void t(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22204d.h();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void u(int i10, @Nullable i.b bVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22203c.i(oVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void v(int i10, @Nullable i.b bVar, int i11) {
            if (c(i10, bVar)) {
                this.f22204d.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public void x(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
            if (c(i10, bVar)) {
                this.f22203c.v(nVar, oVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void y(int i10, @Nullable i.b bVar) {
            if (c(i10, bVar)) {
                this.f22204d.j();
            }
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.i f22206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i.c f22207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f22208c;

        public b(com.google.android.exoplayer2.source.i iVar, i.c cVar, a aVar) {
            this.f22206a = iVar;
            this.f22207b = cVar;
            this.f22208c = aVar;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.g f22209a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22213e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<i.b> f22211c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f22210b = new Object();

        public c(com.google.android.exoplayer2.source.i iVar, boolean z10) {
            this.f22209a = new com.google.android.exoplayer2.source.g(iVar, z10);
        }

        public void a(int i10) {
            this.f22212d = i10;
            this.f22213e = false;
            this.f22211c.clear();
        }

        @Override // d6.k1
        public c0 getTimeline() {
            return this.f22209a.P();
        }

        @Override // d6.k1
        public Object getUid() {
            return this.f22210b;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public interface d {
        void onPlaylistUpdateRequested();
    }

    public s(d dVar, e6.a aVar, Handler handler, s1 s1Var) {
        this.f22190a = s1Var;
        this.f22194e = dVar;
        j.a aVar2 = new j.a();
        this.f22195f = aVar2;
        b.a aVar3 = new b.a();
        this.f22196g = aVar3;
        this.f22197h = new HashMap<>();
        this.f22198i = new HashSet();
        aVar2.f(handler, aVar);
        aVar3.g(handler, aVar);
    }

    public static Object m(Object obj) {
        return com.google.android.exoplayer2.a.B(obj);
    }

    @Nullable
    public static i.b n(c cVar, i.b bVar) {
        for (int i10 = 0; i10 < cVar.f22211c.size(); i10++) {
            if (cVar.f22211c.get(i10).f60902d == bVar.f60902d) {
                return bVar.c(p(cVar, bVar.f60899a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return com.google.android.exoplayer2.a.C(obj);
    }

    public static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.E(cVar.f22210b, obj);
    }

    public static int r(c cVar, int i10) {
        return i10 + cVar.f22212d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(com.google.android.exoplayer2.source.i iVar, c0 c0Var) {
        this.f22194e.onPlaylistUpdateRequested();
    }

    public c0 A(int i10, int i11, e7.c0 c0Var) {
        s7.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f22199j = c0Var;
        B(i10, i11);
        return i();
    }

    public final void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f22191b.remove(i12);
            this.f22193d.remove(cVarRemove.f22210b);
            g(i12, -cVarRemove.f22209a.P().t());
            cVarRemove.f22213e = true;
            if (this.f22200k) {
                u(cVarRemove);
            }
        }
    }

    public c0 C(List<c> list, e7.c0 c0Var) {
        B(0, this.f22191b.size());
        return f(this.f22191b.size(), list, c0Var);
    }

    public c0 D(e7.c0 c0Var) {
        int iQ = q();
        if (c0Var.getLength() != iQ) {
            c0Var = c0Var.cloneAndClear().cloneAndInsert(0, iQ);
        }
        this.f22199j = c0Var;
        return i();
    }

    public c0 f(int i10, List<c> list, e7.c0 c0Var) {
        if (!list.isEmpty()) {
            this.f22199j = c0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f22191b.get(i11 - 1);
                    cVar.a(cVar2.f22212d + cVar2.f22209a.P().t());
                } else {
                    cVar.a(0);
                }
                g(i11, cVar.f22209a.P().t());
                this.f22191b.add(i11, cVar);
                this.f22193d.put(cVar.f22210b, cVar);
                if (this.f22200k) {
                    x(cVar);
                    if (this.f22192c.isEmpty()) {
                        this.f22198i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i10, int i11) {
        while (i10 < this.f22191b.size()) {
            this.f22191b.get(i10).f22212d += i11;
            i10++;
        }
    }

    public com.google.android.exoplayer2.source.h h(i.b bVar, r7.b bVar2, long j10) {
        Object objO = o(bVar.f60899a);
        i.b bVarC = bVar.c(m(bVar.f60899a));
        c cVar = (c) s7.a.e(this.f22193d.get(objO));
        l(cVar);
        cVar.f22211c.add(bVarC);
        com.google.android.exoplayer2.source.f fVarA = cVar.f22209a.a(bVarC, bVar2, j10);
        this.f22192c.put(fVarA, cVar);
        k();
        return fVarA;
    }

    public c0 i() {
        if (this.f22191b.isEmpty()) {
            return c0.f21384b;
        }
        int iT = 0;
        for (int i10 = 0; i10 < this.f22191b.size(); i10++) {
            c cVar = this.f22191b.get(i10);
            cVar.f22212d = iT;
            iT += cVar.f22209a.P().t();
        }
        return new d6.s1(this.f22191b, this.f22199j);
    }

    public final void j(c cVar) {
        b bVar = this.f22197h.get(cVar);
        if (bVar != null) {
            bVar.f22206a.h(bVar.f22207b);
        }
    }

    public final void k() {
        Iterator<c> it = this.f22198i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f22211c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f22198i.add(cVar);
        b bVar = this.f22197h.get(cVar);
        if (bVar != null) {
            bVar.f22206a.g(bVar.f22207b);
        }
    }

    public int q() {
        return this.f22191b.size();
    }

    public boolean s() {
        return this.f22200k;
    }

    public final void u(c cVar) {
        if (cVar.f22213e && cVar.f22211c.isEmpty()) {
            b bVar = (b) s7.a.e(this.f22197h.remove(cVar));
            bVar.f22206a.b(bVar.f22207b);
            bVar.f22206a.c(bVar.f22208c);
            bVar.f22206a.j(bVar.f22208c);
            this.f22198i.remove(cVar);
        }
    }

    public c0 v(int i10, int i11, int i12, e7.c0 c0Var) {
        s7.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f22199j = c0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iT = this.f22191b.get(iMin).f22212d;
        m0.v0(this.f22191b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f22191b.get(iMin);
            cVar.f22212d = iT;
            iT += cVar.f22209a.P().t();
            iMin++;
        }
        return i();
    }

    public void w(@Nullable r7.y yVar) {
        s7.a.g(!this.f22200k);
        this.f22201l = yVar;
        for (int i10 = 0; i10 < this.f22191b.size(); i10++) {
            c cVar = this.f22191b.get(i10);
            x(cVar);
            this.f22198i.add(cVar);
        }
        this.f22200k = true;
    }

    public final void x(c cVar) {
        com.google.android.exoplayer2.source.g gVar = cVar.f22209a;
        i.c cVar2 = new i.c() { // from class: d6.l1
            @Override // com.google.android.exoplayer2.source.i.c
            public final void a(com.google.android.exoplayer2.source.i iVar, com.google.android.exoplayer2.c0 c0Var) {
                this.f59657a.t(iVar, c0Var);
            }
        };
        a aVar = new a(cVar);
        this.f22197h.put(cVar, new b(gVar, cVar2, aVar));
        gVar.e(m0.w(), aVar);
        gVar.i(m0.w(), aVar);
        gVar.d(cVar2, this.f22201l, this.f22190a);
    }

    public void y() {
        for (b bVar : this.f22197h.values()) {
            try {
                bVar.f22206a.b(bVar.f22207b);
            } catch (RuntimeException e10) {
                s7.q.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f22206a.c(bVar.f22208c);
            bVar.f22206a.j(bVar.f22208c);
        }
        this.f22197h.clear();
        this.f22198i.clear();
        this.f22200k = false;
    }

    public void z(com.google.android.exoplayer2.source.h hVar) {
        c cVar = (c) s7.a.e(this.f22192c.remove(hVar));
        cVar.f22209a.f(hVar);
        cVar.f22211c.remove(((com.google.android.exoplayer2.source.f) hVar).f22294b);
        if (!this.f22192c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
