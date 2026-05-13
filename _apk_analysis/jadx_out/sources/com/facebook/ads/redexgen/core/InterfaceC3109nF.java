package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC3109nF extends InterfaceC14842s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC3109nF A00 = new InterfaceC3109nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC3109nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void ACv(C3155o0 c3155o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i10, C3053mL c3053mL, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i10, C3053mL c3053mL, CE ce2, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i10, C3053mL c3053mL, CE ce2, CG cg2, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i10, C3053mL c3053mL, CE ce2, CG cg2, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AEb(C3190ob c3190ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AEd(C3192od c3192od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AEf(boolean z10, int i10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AFQ(Timeline timeline, int i10) {
            AbstractC14832r.A00(this, timeline, i10);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
        public final /* synthetic */ void AFU(C3161o6 c3161o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC3109nF
        public final void AIv(InterfaceC14912z interfaceC14912z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC14912z interfaceC14912z, Looper looper);
}
