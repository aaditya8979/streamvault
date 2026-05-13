package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17992a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17993b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17994c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17996e;

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17993b;
        byte[] bArr = nVar.f18794a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f18794a = Arrays.copyOf(bArr, Math.max(65025, nVar.f18796c));
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f17996e) {
            this.f17996e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17993b;
            nVar.f18795b = 0;
            nVar.f18796c = 0;
        }
        while (true) {
            if (this.f17996e) {
                return true;
            }
            if (this.f17994c < 0) {
                if (!this.f17992a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f17992a;
                int i13 = gVar.f18001d;
                if ((gVar.f17998a & 1) == 1 && this.f17993b.f18796c == 0) {
                    this.f17995d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f17995d;
                        g gVar2 = this.f17992a;
                        if (i15 >= gVar2.f18000c) {
                            break;
                        }
                        int[] iArr = gVar2.f18003f;
                        this.f17995d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f17995d;
                } else {
                    i11 = 0;
                }
                bVar.a(i13);
                this.f17994c = i11;
            }
            int i16 = this.f17994c;
            this.f17995d = 0;
            int i17 = 0;
            do {
                int i18 = this.f17995d;
                int i19 = i16 + i18;
                g gVar3 = this.f17992a;
                if (i19 >= gVar3.f18000c) {
                    break;
                }
                int[] iArr2 = gVar3.f18003f;
                this.f17995d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f17994c + this.f17995d;
            if (i17 > 0) {
                int iA = this.f17993b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17993b;
                int i21 = nVar2.f18796c + i17;
                if (iA < i21) {
                    nVar2.f18794a = Arrays.copyOf(nVar2.f18794a, i21);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17993b;
                bVar.b(nVar3.f18794a, nVar3.f18796c, i17, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f17993b;
                nVar4.d(nVar4.f18796c + i17);
                this.f17996e = this.f17992a.f18003f[i20 + (-1)] != 255;
            }
            if (i20 == this.f17992a.f18000c) {
                i20 = -1;
            }
            this.f17994c = i20;
        }
    }
}
