package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass94 implements InterfaceC3016lj {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C3206or[] A04;
    public final int A05;
    public final C3172oH A06;
    public final int[] A07;

    public AnonymousClass94(C3172oH c3172oH, int[] iArr, int i10) {
        C3M.A08(iArr.length > 0);
        this.A02 = i10;
        this.A06 = (C3172oH) C3M.A01(c3172oH);
        this.A05 = iArr.length;
        this.A04 = new C3206or[this.A05];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.A04[i11] = c3172oH.A08(iArr[i11]);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.Dt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnonymousClass94.A07((C3206or) obj, (C3206or) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i12 = 0; i12 < this.A05; i12++) {
            this.A07[i12] = c3172oH.A07(this.A04[i12]);
        }
        this.A03 = new long[this.A05];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C3206or c3206or, C3206or c3206or2) {
        return c3206or2.A05 - c3206or.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3016lj
    public void A5p() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3016lj
    public void A6C() {
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final C3206or A83(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int A89(int i10) {
        return this.A07[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3016lj
    public final C3206or A8u() {
        return this.A04[A8v()];
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final C3172oH A9D() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int A9y(int i10) {
        for (int i11 = 0; i11 < this.A05; i11++) {
            if (this.A07[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3016lj
    public void AEc(float f10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass94 anonymousClass94 = (AnonymousClass94) obj;
        return this.A06 == anonymousClass94.A06 && Arrays.equals(this.A07, anonymousClass94.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.EE
    public final int length() {
        return this.A07.length;
    }
}
