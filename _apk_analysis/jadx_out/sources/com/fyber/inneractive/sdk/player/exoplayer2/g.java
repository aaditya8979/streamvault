package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3978d4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f18303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f18304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f18305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f18306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f18307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f18308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f18309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f18315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f18316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f18317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f18318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f18319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18321s;

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.f18826e + C3978d4.j.f31385e);
        if (aVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f18303a = dVar;
        this.f18311i = false;
        this.f18312j = 1;
        this.f18307e = new CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.f18304b = hVar;
        this.f18315m = x.f18911a;
        this.f18308f = new w();
        this.f18309g = new v();
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f18576d;
        this.f18317o = hVar;
        this.f18318p = s.f18475d;
        f fVar = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f18305c = fVar;
        i iVar = new i(0, 0L);
        this.f18319q = iVar;
        this.f18306d = new l(aVarArr, dVar, cVar, this.f18311i, fVar, iVar, this);
    }

    public final int a() {
        return (this.f18315m.c() || this.f18313k > 0) ? this.f18320r : this.f18315m.a(this.f18319q.f18341a, this.f18309g, false).f18832c;
    }

    public final void a(int i10, long j10) {
        if (i10 < 0 || (!this.f18315m.c() && i10 >= this.f18315m.b())) {
            throw new q();
        }
        this.f18313k++;
        this.f18320r = i10;
        if (!this.f18315m.c()) {
            this.f18315m.a(i10, this.f18308f, 0L);
            long j11 = j10 == -9223372036854775807L ? this.f18308f.f18908e : j10;
            w wVar = this.f18308f;
            int i11 = wVar.f18906c;
            long j12 = wVar.f18910g;
            int i12 = b.f17363a;
            long j13 = (j11 == -9223372036854775807L ? -9223372036854775807L : j11 * 1000) + j12;
            long j14 = this.f18315m.a(i11, this.f18309g, false).f18833d;
            while (j14 != -9223372036854775807L && j13 >= j14 && i11 < this.f18308f.f18907d) {
                j13 -= j14;
                i11++;
                j14 = this.f18315m.a(i11, this.f18309g, false).f18833d;
            }
        }
        if (j10 == -9223372036854775807L) {
            this.f18321s = 0L;
            this.f18306d.f18356f.obtainMessage(3, new j(this.f18315m, i10, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f18321s = j10;
        l lVar = this.f18306d;
        x xVar = this.f18315m;
        int i13 = b.f17363a;
        lVar.f18356f.obtainMessage(3, new j(xVar, i10, j10 != -9223372036854775807L ? j10 * 1000 : -9223372036854775807L)).sendToTarget();
        Iterator it = this.f18307e.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).getClass();
        }
    }

    public final void a(boolean z10) {
        if (this.f18311i != z10) {
            this.f18311i = z10;
            this.f18306d.f18356f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f18307e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.f18312j, z10);
            }
        }
    }

    public final void a(e... eVarArr) {
        l lVar = this.f18306d;
        if (lVar.f18367q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f18356f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }
}
