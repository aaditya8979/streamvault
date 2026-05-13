package e6;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.y1;
import e6.b;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import s7.p;

/* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
/* JADX INFO: loaded from: classes10.dex */
public class n1 implements e6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.d f60714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.b f60715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0.d f60716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f60717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<b.a> f60718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s7.p<b> f60719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.v f60720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s7.m f60721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f60722j;

    /* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0.b f60723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList<i.b> f60724b = ImmutableList.of();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableMap<i.b, com.google.android.exoplayer2.c0> f60725c = ImmutableMap.of();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public i.b f60726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i.b f60727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i.b f60728f;

        public a(c0.b bVar) {
            this.f60723a = bVar;
        }

        @Nullable
        public static i.b c(com.google.android.exoplayer2.v vVar, ImmutableList<i.b> immutableList, @Nullable i.b bVar, c0.b bVar2) {
            com.google.android.exoplayer2.c0 currentTimeline = vVar.getCurrentTimeline();
            int currentPeriodIndex = vVar.getCurrentPeriodIndex();
            Object objQ = currentTimeline.u() ? null : currentTimeline.q(currentPeriodIndex);
            int iG = (vVar.isPlayingAd() || currentTimeline.u()) ? -1 : currentTimeline.j(currentPeriodIndex, bVar2).g(s7.m0.w0(vVar.getCurrentPosition()) - bVar2.q());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                i.b bVar3 = immutableList.get(i10);
                if (i(bVar3, objQ, vVar.isPlayingAd(), vVar.getCurrentAdGroupIndex(), vVar.getCurrentAdIndexInAdGroup(), iG)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (i(bVar, objQ, vVar.isPlayingAd(), vVar.getCurrentAdGroupIndex(), vVar.getCurrentAdIndexInAdGroup(), iG)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean i(i.b bVar, @Nullable Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f60899a.equals(obj)) {
                return (z10 && bVar.f60900b == i10 && bVar.f60901c == i11) || (!z10 && bVar.f60900b == -1 && bVar.f60903e == i12);
            }
            return false;
        }

        public final void b(ImmutableMap.b<i.b, com.google.android.exoplayer2.c0> bVar, @Nullable i.b bVar2, com.google.android.exoplayer2.c0 c0Var) {
            if (bVar2 == null) {
                return;
            }
            if (c0Var.f(bVar2.f60899a) != -1) {
                bVar.g(bVar2, c0Var);
                return;
            }
            com.google.android.exoplayer2.c0 c0Var2 = this.f60725c.get(bVar2);
            if (c0Var2 != null) {
                bVar.g(bVar2, c0Var2);
            }
        }

        @Nullable
        public i.b d() {
            return this.f60726d;
        }

        @Nullable
        public i.b e() {
            if (this.f60724b.isEmpty()) {
                return null;
            }
            return (i.b) y1.f(this.f60724b);
        }

        @Nullable
        public com.google.android.exoplayer2.c0 f(i.b bVar) {
            return this.f60725c.get(bVar);
        }

        @Nullable
        public i.b g() {
            return this.f60727e;
        }

        @Nullable
        public i.b h() {
            return this.f60728f;
        }

        public void j(com.google.android.exoplayer2.v vVar) {
            this.f60726d = c(vVar, this.f60724b, this.f60727e, this.f60723a);
        }

        public void k(List<i.b> list, @Nullable i.b bVar, com.google.android.exoplayer2.v vVar) {
            this.f60724b = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f60727e = list.get(0);
                this.f60728f = (i.b) s7.a.e(bVar);
            }
            if (this.f60726d == null) {
                this.f60726d = c(vVar, this.f60724b, this.f60727e, this.f60723a);
            }
            m(vVar.getCurrentTimeline());
        }

        public void l(com.google.android.exoplayer2.v vVar) {
            this.f60726d = c(vVar, this.f60724b, this.f60727e, this.f60723a);
            m(vVar.getCurrentTimeline());
        }

        public final void m(com.google.android.exoplayer2.c0 c0Var) {
            ImmutableMap.b<i.b, com.google.android.exoplayer2.c0> bVarBuilder = ImmutableMap.builder();
            if (this.f60724b.isEmpty()) {
                b(bVarBuilder, this.f60727e, c0Var);
                if (!y7.i.a(this.f60728f, this.f60727e)) {
                    b(bVarBuilder, this.f60728f, c0Var);
                }
                if (!y7.i.a(this.f60726d, this.f60727e) && !y7.i.a(this.f60726d, this.f60728f)) {
                    b(bVarBuilder, this.f60726d, c0Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f60724b.size(); i10++) {
                    b(bVarBuilder, this.f60724b.get(i10), c0Var);
                }
                if (!this.f60724b.contains(this.f60726d)) {
                    b(bVarBuilder, this.f60726d, c0Var);
                }
            }
            this.f60725c = bVarBuilder.c();
        }
    }

    public n1(s7.d dVar) {
        this.f60714b = (s7.d) s7.a.e(dVar);
        this.f60719g = new s7.p<>(s7.m0.K(), dVar, new p.b() { // from class: e6.i0
            @Override // s7.p.b
            public final void a(Object obj, s7.l lVar) {
                n1.d1((b) obj, lVar);
            }
        });
        c0.b bVar = new c0.b();
        this.f60715c = bVar;
        this.f60716d = new c0.d();
        this.f60717e = new a(bVar);
        this.f60718f = new SparseArray<>();
    }

    public static /* synthetic */ void C1(b.a aVar, boolean z10, b bVar) {
        bVar.t0(aVar, z10);
        bVar.F(aVar, z10);
    }

    public static /* synthetic */ void S1(b.a aVar, int i10, v.e eVar, v.e eVar2, b bVar) {
        bVar.Y(aVar, i10);
        bVar.c0(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void d1(b bVar, s7.l lVar) {
    }

    public static /* synthetic */ void d2(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.d0(aVar, str, j10);
        bVar.A(aVar, str, j11, j10);
        bVar.z(aVar, 2, str, j10);
    }

    public static /* synthetic */ void f2(b.a aVar, g6.e eVar, b bVar) {
        bVar.n0(aVar, eVar);
        bVar.M(aVar, 2, eVar);
    }

    public static /* synthetic */ void g1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.u0(aVar, str, j10);
        bVar.l0(aVar, str, j11, j10);
        bVar.z(aVar, 1, str, j10);
    }

    public static /* synthetic */ void g2(b.a aVar, g6.e eVar, b bVar) {
        bVar.B(aVar, eVar);
        bVar.o(aVar, 2, eVar);
    }

    public static /* synthetic */ void i1(b.a aVar, g6.e eVar, b bVar) {
        bVar.H(aVar, eVar);
        bVar.M(aVar, 1, eVar);
    }

    public static /* synthetic */ void i2(b.a aVar, com.google.android.exoplayer2.m mVar, g6.g gVar, b bVar) {
        bVar.S(aVar, mVar);
        bVar.j(aVar, mVar, gVar);
        bVar.r0(aVar, 2, mVar);
    }

    public static /* synthetic */ void j1(b.a aVar, g6.e eVar, b bVar) {
        bVar.L(aVar, eVar);
        bVar.o(aVar, 1, eVar);
    }

    public static /* synthetic */ void j2(b.a aVar, t7.x xVar, b bVar) {
        bVar.O(aVar, xVar);
        bVar.o0(aVar, xVar.f85196b, xVar.f85197c, xVar.f85198d, xVar.f85199e);
    }

    public static /* synthetic */ void k1(b.a aVar, com.google.android.exoplayer2.m mVar, g6.g gVar, b bVar) {
        bVar.g(aVar, mVar);
        bVar.G(aVar, mVar, gVar);
        bVar.r0(aVar, 1, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(com.google.android.exoplayer2.v vVar, b bVar, s7.l lVar) {
        bVar.w(vVar, new b.C0740b(lVar, this.f60718f));
    }

    public static /* synthetic */ void y1(b.a aVar, int i10, b bVar) {
        bVar.h0(aVar);
        bVar.b0(aVar, i10);
    }

    @Override // com.google.android.exoplayer2.v.d
    public void A(final com.google.android.exoplayer2.i iVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 29, new p.a() { // from class: e6.u0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).f0(aVarV0, iVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void B(int i10, @Nullable i.b bVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1026, new p.a() { // from class: e6.n
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).m0(aVarZ0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void D(int i10, @Nullable i.b bVar, final e7.n nVar, final e7.o oVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1001, new p.a() { // from class: e6.c1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).q0(aVarZ0, nVar, oVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void E(final com.google.android.exoplayer2.d0 d0Var) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 2, new p.a() { // from class: e6.t
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).Z(aVarV0, d0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void F(int i10, @Nullable i.b bVar, final Exception exc) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1024, new p.a() { // from class: e6.i1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).r(aVarZ0, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void G(com.google.android.exoplayer2.v vVar, v.c cVar) {
    }

    @Override // e6.a
    public final void H(List<i.b> list, @Nullable i.b bVar) {
        this.f60717e.k(list, bVar, (com.google.android.exoplayer2.v) s7.a.e(this.f60720h));
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void I(@Nullable final com.google.android.exoplayer2.p pVar, final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 1, new p.a() { // from class: e6.f1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarV0, pVar, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void J(int i10, @Nullable i.b bVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1027, new p.a() { // from class: e6.e1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarZ0);
            }
        });
    }

    public final b.a V0() {
        return X0(this.f60717e.d());
    }

    public final b.a W0(com.google.android.exoplayer2.c0 c0Var, int i10, @Nullable i.b bVar) {
        long contentPosition;
        i.b bVar2 = c0Var.u() ? null : bVar;
        long jElapsedRealtime = this.f60714b.elapsedRealtime();
        boolean z10 = c0Var.equals(this.f60720h.getCurrentTimeline()) && i10 == this.f60720h.getCurrentMediaItemIndex();
        long jE = 0;
        if (bVar2 != null && bVar2.b()) {
            if (z10 && this.f60720h.getCurrentAdGroupIndex() == bVar2.f60900b && this.f60720h.getCurrentAdIndexInAdGroup() == bVar2.f60901c) {
                jE = this.f60720h.getCurrentPosition();
            }
        } else {
            if (z10) {
                contentPosition = this.f60720h.getContentPosition();
                return new b.a(jElapsedRealtime, c0Var, i10, bVar2, contentPosition, this.f60720h.getCurrentTimeline(), this.f60720h.getCurrentMediaItemIndex(), this.f60717e.d(), this.f60720h.getCurrentPosition(), this.f60720h.getTotalBufferedDuration());
            }
            if (!c0Var.u()) {
                jE = c0Var.r(i10, this.f60716d).e();
            }
        }
        contentPosition = jE;
        return new b.a(jElapsedRealtime, c0Var, i10, bVar2, contentPosition, this.f60720h.getCurrentTimeline(), this.f60720h.getCurrentMediaItemIndex(), this.f60717e.d(), this.f60720h.getCurrentPosition(), this.f60720h.getTotalBufferedDuration());
    }

    public final b.a X0(@Nullable i.b bVar) {
        s7.a.e(this.f60720h);
        com.google.android.exoplayer2.c0 c0VarF = bVar == null ? null : this.f60717e.f(bVar);
        if (bVar != null && c0VarF != null) {
            return W0(c0VarF, c0VarF.l(bVar.f60899a, this.f60715c).f21389d, bVar);
        }
        int currentMediaItemIndex = this.f60720h.getCurrentMediaItemIndex();
        com.google.android.exoplayer2.c0 currentTimeline = this.f60720h.getCurrentTimeline();
        if (!(currentMediaItemIndex < currentTimeline.t())) {
            currentTimeline = com.google.android.exoplayer2.c0.f21384b;
        }
        return W0(currentTimeline, currentMediaItemIndex, null);
    }

    public final b.a Y0() {
        return X0(this.f60717e.e());
    }

    public final b.a Z0(int i10, @Nullable i.b bVar) {
        s7.a.e(this.f60720h);
        if (bVar != null) {
            return this.f60717e.f(bVar) != null ? X0(bVar) : W0(com.google.android.exoplayer2.c0.f21384b, i10, bVar);
        }
        com.google.android.exoplayer2.c0 currentTimeline = this.f60720h.getCurrentTimeline();
        if (!(i10 < currentTimeline.t())) {
            currentTimeline = com.google.android.exoplayer2.c0.f21384b;
        }
        return W0(currentTimeline, i10, null);
    }

    @Override // e6.a
    public final void a(final com.google.android.exoplayer2.m mVar, @Nullable final g6.g gVar) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1017, new p.a() { // from class: e6.m0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.i2(aVarB1, mVar, gVar, (b) obj);
            }
        });
    }

    public final b.a a1() {
        return X0(this.f60717e.g());
    }

    @Override // e6.a
    public final void b(final g6.e eVar) {
        final b.a aVarA1 = a1();
        o2(aVarA1, 1020, new p.a() { // from class: e6.a0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.f2(aVarA1, eVar, (b) obj);
            }
        });
    }

    public final b.a b1() {
        return X0(this.f60717e.h());
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void c(final t7.x xVar) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 25, new p.a() { // from class: e6.x0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.j2(aVarB1, xVar, (b) obj);
            }
        });
    }

    public final b.a c1(@Nullable PlaybackException playbackException) {
        e7.p pVar;
        return (!(playbackException instanceof ExoPlaybackException) || (pVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? V0() : X0(new i.b(pVar));
    }

    @Override // e6.a
    public final void d(final com.google.android.exoplayer2.m mVar, @Nullable final g6.g gVar) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1009, new p.a() { // from class: e6.b0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.k1(aVarB1, mVar, gVar, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void e(final Metadata metadata) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 28, new p.a() { // from class: e6.j0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).y(aVarV0, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void f(final com.google.android.exoplayer2.u uVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 12, new p.a() { // from class: e6.o0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).I(aVarV0, uVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void g(final g7.f fVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 27, new p.a() { // from class: e6.h0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).t(aVarV0, fVar);
            }
        });
    }

    @Override // e6.a
    public final void h(final g6.e eVar) {
        final b.a aVarA1 = a1();
        o2(aVarA1, 1013, new p.a() { // from class: e6.l0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.i1(aVarA1, eVar, (b) obj);
            }
        });
    }

    @Override // e6.a
    public final void i(final g6.e eVar) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1007, new p.a() { // from class: e6.c0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.j1(aVarB1, eVar, (b) obj);
            }
        });
    }

    @Override // e6.a
    public final void j(final g6.e eVar) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1015, new p.a() { // from class: e6.l
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.g2(aVarB1, eVar, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void k(final v.e eVar, final v.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f60722j = false;
        }
        this.f60717e.j((com.google.android.exoplayer2.v) s7.a.e(this.f60720h));
        final b.a aVarV0 = V0();
        o2(aVarV0, 11, new p.a() { // from class: e6.s0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.S1(aVarV0, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void l(com.google.android.exoplayer2.c0 c0Var, final int i10) {
        this.f60717e.l((com.google.android.exoplayer2.v) s7.a.e(this.f60720h));
        final b.a aVarV0 = V0();
        o2(aVarV0, 0, new p.a() { // from class: e6.p0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).q(aVarV0, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void m(final com.google.android.exoplayer2.q qVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 14, new p.a() { // from class: e6.l1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).i0(aVarV0, qVar);
            }
        });
    }

    @Override // e6.a
    @CallSuper
    public void n(final com.google.android.exoplayer2.v vVar, Looper looper) {
        s7.a.g(this.f60720h == null || this.f60717e.f60724b.isEmpty());
        this.f60720h = (com.google.android.exoplayer2.v) s7.a.e(vVar);
        this.f60721i = this.f60714b.createHandler(looper, null);
        this.f60719g = this.f60719g.e(looper, new p.b() { // from class: e6.q
            @Override // s7.p.b
            public final void a(Object obj, s7.l lVar) {
                this.f60755a.m2(vVar, (b) obj, lVar);
            }
        });
    }

    public final void n2() {
        final b.a aVarV0 = V0();
        o2(aVarV0, 1028, new p.a() { // from class: e6.y0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).N(aVarV0);
            }
        });
        this.f60719g.j();
    }

    @Override // e6.a
    public final void notifySeekStarted() {
        if (this.f60722j) {
            return;
        }
        final b.a aVarV0 = V0();
        this.f60722j = true;
        o2(aVarV0, -1, new p.a() { // from class: e6.e
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).g0(aVarV0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void o(int i10, @Nullable i.b bVar, final e7.n nVar, final e7.o oVar, final IOException iOException, final boolean z10) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1003, new p.a() { // from class: e6.a1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).p0(aVarZ0, nVar, oVar, iOException, z10);
            }
        });
    }

    public final void o2(b.a aVar, int i10, p.a<b> aVar2) {
        this.f60718f.put(i10, aVar);
        this.f60719g.l(i10, aVar2);
    }

    @Override // e6.a
    public final void onAudioCodecError(final Exception exc) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1029, new p.a() { // from class: e6.k0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).y0(aVarB1, exc);
            }
        });
    }

    @Override // e6.a
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1008, new p.a() { // from class: e6.p
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.g1(aVarB1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // e6.a
    public final void onAudioDecoderReleased(final String str) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1012, new p.a() { // from class: e6.r
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).D(aVarB1, str);
            }
        });
    }

    @Override // e6.a
    public final void onAudioPositionAdvancing(final long j10) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1010, new p.a() { // from class: e6.s
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).x(aVarB1, j10);
            }
        });
    }

    @Override // e6.a
    public final void onAudioSinkError(final Exception exc) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1014, new p.a() { // from class: e6.v
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).l(aVarB1, exc);
            }
        });
    }

    @Override // e6.a
    public final void onAudioUnderrun(final int i10, final long j10, final long j11) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1011, new p.a() { // from class: e6.t0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).n(aVarB1, i10, j10, j11);
            }
        });
    }

    @Override // r7.d.a
    public final void onBandwidthSample(final int i10, final long j10, final long j11) {
        final b.a aVarY0 = Y0();
        o2(aVarY0, 1006, new p.a() { // from class: e6.g1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).V(aVarY0, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onCues(final List<g7.b> list) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 27, new p.a() { // from class: e6.r0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).k(aVarV0, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 30, new p.a() { // from class: e6.k
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).C(aVarV0, i10, z10);
            }
        });
    }

    @Override // e6.a
    public final void onDroppedFrames(final int i10, final long j10) {
        final b.a aVarA1 = a1();
        o2(aVarA1, 1018, new p.a() { // from class: e6.z
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).s(aVarA1, i10, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onIsLoadingChanged(final boolean z10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 3, new p.a() { // from class: e6.n0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.C1(aVarV0, z10, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onIsPlayingChanged(final boolean z10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 7, new p.a() { // from class: e6.u
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).s0(aVarV0, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 5, new p.a() { // from class: e6.g0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).K(aVarV0, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onPlaybackStateChanged(final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 4, new p.a() { // from class: e6.k1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).W(aVarV0, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 6, new p.a() { // from class: e6.w
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).k0(aVarV0, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, -1, new p.a() { // from class: e6.x
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).v0(aVarV0, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.google.android.exoplayer2.v.d
    public void onRenderedFirstFrame() {
    }

    @Override // e6.a
    public final void onRenderedFirstFrame(final Object obj, final long j10) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 26, new p.a() { // from class: e6.v0
            @Override // s7.p.a
            public final void invoke(Object obj2) {
                ((b) obj2).f(aVarB1, obj, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onRepeatModeChanged(final int i10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 8, new p.a() { // from class: e6.d0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).d(aVarV0, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onSeekProcessed() {
        final b.a aVarV0 = V0();
        o2(aVarV0, -1, new p.a() { // from class: e6.q0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).a0(aVarV0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onShuffleModeEnabledChanged(final boolean z10) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 9, new p.a() { // from class: e6.j
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).Q(aVarV0, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 23, new p.a() { // from class: e6.d1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).m(aVarB1, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 24, new p.a() { // from class: e6.f0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).T(aVarB1, i10, i11);
            }
        });
    }

    @Override // e6.a
    public final void onVideoCodecError(final Exception exc) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1030, new p.a() { // from class: e6.m1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).U(aVarB1, exc);
            }
        });
    }

    @Override // e6.a
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1016, new p.a() { // from class: e6.g
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.d2(aVarB1, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // e6.a
    public final void onVideoDecoderReleased(final String str) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 1019, new p.a() { // from class: e6.i
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).v(aVarB1, str);
            }
        });
    }

    @Override // e6.a
    public final void onVideoFrameProcessingOffset(final long j10, final int i10) {
        final b.a aVarA1 = a1();
        o2(aVarA1, 1021, new p.a() { // from class: e6.d
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).E(aVarA1, j10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void onVolumeChanged(final float f10) {
        final b.a aVarB1 = b1();
        o2(aVarB1, 22, new p.a() { // from class: e6.j1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).i(aVarB1, f10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void p(@Nullable final PlaybackException playbackException) {
        final b.a aVarC1 = c1(playbackException);
        o2(aVarC1, 10, new p.a() { // from class: e6.h
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).j0(aVarC1, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public final void q(final PlaybackException playbackException) {
        final b.a aVarC1 = c1(playbackException);
        o2(aVarC1, 10, new p.a() { // from class: e6.o
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarC1, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void r(int i10, @Nullable i.b bVar, final e7.n nVar, final e7.o oVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1002, new p.a() { // from class: e6.w0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).X(aVarZ0, nVar, oVar);
            }
        });
    }

    @Override // e6.a
    @CallSuper
    public void release() {
        ((s7.m) s7.a.i(this.f60721i)).post(new Runnable() { // from class: e6.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f60705b.n2();
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void s(final q7.y yVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 19, new p.a() { // from class: e6.f
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).w0(aVarV0, yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void t(int i10, @Nullable i.b bVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1023, new p.a() { // from class: e6.c
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).p(aVarZ0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void u(int i10, @Nullable i.b bVar, final e7.o oVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1004, new p.a() { // from class: e6.z0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).R(aVarZ0, oVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void v(int i10, @Nullable i.b bVar, final int i11) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1022, new p.a() { // from class: e6.h1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                n1.y1(aVarZ0, i11, (b) obj);
            }
        });
    }

    @Override // e6.a
    @CallSuper
    public void w(b bVar) {
        s7.a.e(bVar);
        this.f60719g.c(bVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void x(int i10, @Nullable i.b bVar, final e7.n nVar, final e7.o oVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1000, new p.a() { // from class: e6.b1
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarZ0, nVar, oVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b
    public final void y(int i10, @Nullable i.b bVar) {
        final b.a aVarZ0 = Z0(i10, bVar);
        o2(aVarZ0, 1025, new p.a() { // from class: e6.y
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).e0(aVarZ0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v.d
    public void z(final v.b bVar) {
        final b.a aVarV0 = V0();
        o2(aVarV0, 13, new p.a() { // from class: e6.e0
            @Override // s7.p.a
            public final void invoke(Object obj) {
                ((b) obj).x0(aVarV0, bVar);
            }
        });
    }
}
