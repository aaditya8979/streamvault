package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s f18322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.v[] f18324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f18325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f18332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f18334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a[] f18335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a[] f18336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f18337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f18338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.u f18339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f18340s;

    public h(a[] aVarArr, a[] aVarArr2, long j10, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, Object obj, int i10, boolean z10, long j11) {
        this.f18335n = aVarArr;
        this.f18336o = aVarArr2;
        this.f18326e = j10;
        this.f18337p = iVar;
        this.f18338q = cVar;
        this.f18339r = uVar;
        obj.getClass();
        this.f18323b = obj;
        this.f18327f = i10;
        this.f18329h = z10;
        this.f18328g = j11;
        this.f18324c = new com.fyber.inneractive.sdk.player.exoplayer2.source.v[aVarArr.length];
        this.f18325d = new boolean[aVarArr.length];
        this.f18322a = uVar.a(i10, cVar.f17365a, j11);
    }

    public final long a(long j10, boolean z10, boolean[] zArr) {
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = this.f18334m.f18598b;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= hVar.f18594a) {
                break;
            }
            boolean[] zArr2 = this.f18325d;
            if (z10 || !this.f18334m.a(this.f18340s, i11)) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        long jA = this.f18322a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[]) hVar.f18595b.clone(), this.f18325d, this.f18324c, zArr, j10);
        this.f18340s = this.f18334m;
        this.f18331j = false;
        int i12 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.v[] vVarArr = this.f18324c;
            if (i12 >= vVarArr.length) {
                c cVar = this.f18338q;
                a[] aVarArr = this.f18335n;
                z zVar = this.f18334m.f18597a;
                cVar.f17370f = 0;
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (hVar.f18595b[i13] != null) {
                        int i14 = cVar.f17370f;
                        int i15 = aVarArr[i13].f17233a;
                        int i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
                        if (i15 == 0) {
                            i10 = 16777216;
                        } else if (i15 == 1) {
                            i10 = C.DEFAULT_AUDIO_BUFFER_SIZE;
                        } else if (i15 == 2) {
                            i10 = 13107200;
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                throw new IllegalStateException();
                            }
                            i10 = 131072;
                        }
                        cVar.f17370f = i14 + i10;
                    }
                }
                cVar.f17365a.a(cVar.f17370f);
                return jA;
            }
            if (vVarArr[i12] != null) {
                if (hVar.f18595b[i12] == null) {
                    throw new IllegalStateException();
                }
                this.f18331j = true;
            } else if (hVar.f18595b[i12] != null) {
                throw new IllegalStateException();
            }
            i12++;
        }
    }

    public final void a() {
        try {
            this.f18339r.a(this.f18322a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }
}
