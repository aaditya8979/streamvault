package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f18127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18131f;

    public g(List list) {
        this.f18126a = list;
        this.f18127b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18128c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f18127b.length; i10++) {
            c0 c0Var = (c0) this.f18126a.get(i10);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 3);
            e0Var.b();
            gVarA.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.f18114e, null, "application/dvbsubs", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.f18085a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.f18086b), null, null));
            this.f18127b[i10] = gVarA;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z10;
        boolean z11;
        if (this.f18128c) {
            if (this.f18129d == 2) {
                if (nVar.f18796c - nVar.f18795b == 0) {
                    z11 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.f18128c = false;
                    }
                    this.f18129d--;
                    z11 = this.f18128c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f18129d == 1) {
                if (nVar.f18796c - nVar.f18795b == 0) {
                    z10 = false;
                } else {
                    if (nVar.j() != 0) {
                        this.f18128c = false;
                    }
                    this.f18129d--;
                    z10 = this.f18128c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = nVar.f18795b;
            int i11 = nVar.f18796c - i10;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f18127b) {
                nVar.e(i10);
                rVar.a(i11, nVar);
            }
            this.f18130e += i11;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f18128c = true;
            this.f18131f = j10;
            this.f18130e = 0;
            this.f18129d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.f18128c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f18127b) {
                rVar.a(this.f18131f, 1, this.f18130e, 0, null);
            }
            this.f18128c = false;
        }
    }
}
