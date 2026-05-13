package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f18274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18275b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18279f;

    public w(v vVar) {
        this.f18274a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f18279f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int iJ = z10 ? nVar.f18795b + nVar.j() : -1;
        if (this.f18279f) {
            if (!z10) {
                return;
            }
            this.f18279f = false;
            nVar.e(iJ);
            this.f18277d = 0;
        }
        while (true) {
            int i10 = nVar.f18796c - nVar.f18795b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f18277d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f18795b - 1);
                    if (iJ2 == 255) {
                        this.f18279f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f18796c - nVar.f18795b, 3 - this.f18277d);
                nVar.a(this.f18275b.f18794a, this.f18277d, iMin);
                int i12 = this.f18277d + iMin;
                this.f18277d = i12;
                if (i12 == 3) {
                    this.f18275b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f18275b;
                    nVar2.e(nVar2.f18795b + 1);
                    int iJ3 = this.f18275b.j();
                    int iJ4 = this.f18275b.j();
                    this.f18278e = (iJ3 & 128) != 0;
                    this.f18276c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f18275b.a();
                    int i13 = this.f18276c;
                    if (iA < i13) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f18275b;
                        byte[] bArr = nVar3.f18794a;
                        nVar3.c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f18275b.f18794a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f18276c - i11);
                nVar.a(this.f18275b.f18794a, this.f18277d, iMin2);
                int i14 = this.f18277d + iMin2;
                this.f18277d = i14;
                int i15 = this.f18276c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f18278e) {
                        byte[] bArr2 = this.f18275b.f18794a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18829h[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
                        if (i16 != 0) {
                            this.f18279f = true;
                            return;
                        }
                        this.f18275b.c(this.f18276c - 4);
                    } else {
                        this.f18275b.c(i15);
                    }
                    this.f18274a.a(this.f18275b);
                    this.f18277d = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f18274a.a(vVar, jVar, e0Var);
        this.f18279f = true;
    }
}
