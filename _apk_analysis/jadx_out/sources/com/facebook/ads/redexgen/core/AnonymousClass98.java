package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC3060mS implements InterfaceC1716Cg {
    public long A00;
    public C5H A01;
    public InterfaceC2882jM<InterfaceExecutorC1787Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C3197oi A08;
    public final InterfaceC15404w A09;
    public final C9U A0A;
    public final InterfaceC1710Ca A0B;
    public final InterfaceC1765Ed A0C;

    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C3197oi c3197oi, InterfaceC15404w interfaceC15404w, InterfaceC1710Ca interfaceC1710Ca, C9U c9u, InterfaceC1765Ed interfaceC1765Ed, int i10, InterfaceC2882jM<InterfaceExecutorC1787Ez> interfaceC2882jM) {
        this.A07 = (C2Q) C3M.A01(c3197oi.A03);
        this.A08 = c3197oi;
        this.A09 = interfaceC15404w;
        this.A0B = interfaceC1710Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC1765Ed;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC2882jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            anonymousClass97 = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3177oN A0I(int i10, C3177oN c3177oN, boolean z10) {
                    super.A0I(i10, c3177oN, z10);
                    c3177oN.A05 = true;
                    return c3177oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3175oL A0L(int i10, C3175oL c3175oL, long j10) {
                    super.A0L(i10, c3175oL, j10);
                    c3175oL.A0F = true;
                    return c3175oL;
                }
            };
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3060mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3060mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3054mM A5O(C3053mL c3053mL, EO eo2, long j10) {
        InterfaceC3141nl interfaceC3141nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC3141nlA5A.A3v(this.A01);
        }
        return new C9A(this.A07.A00, interfaceC3141nlA5A, this.A0B.A5P(C16087m.A03), this.A0A, A01(c3053mL), this.A0C, A02(c3053mL), this, eo2, this.A07.A04, this.A06, this.A02 != null ? this.A02.get() : null);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1716Cg
    public final void AFH(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC3054mM interfaceC3054mM) {
        ((C9A) interfaceC3054mM).A0a();
    }
}
