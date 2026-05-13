package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3038m5 implements EA {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final C3T A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final EU A09;
    public final int A0A;

    public C3038m5() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C3038m5(int i10, int i11, int i12, float f10) {
        this(null, -1, i10, i11, i12, 1279, 719, f10, 0.75f, 2000L, C3T.A00);
    }

    public C3038m5(EU eu) {
        this(eu, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, C3T.A00);
    }

    public C3038m5(@MetaExoPlayerCustomization("No longer set through factory") EU eu, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i10, @MetaExoPlayerCustomization("Removed from upstream") int i11, int i12, int i13, int i14, int i15, float f10, float f11, long j10, C3T c3t) {
        this.A09 = eu;
        this.A0A = i10;
        this.A05 = i11;
        this.A02 = i12;
        this.A06 = i13;
        this.A04 = i14;
        this.A03 = i15;
        this.A00 = f10;
        this.A01 = f11;
        this.A07 = j10;
        this.A08 = c3t;
    }

    private final C14400y A00(C3172oH c3172oH, int[] iArr, int i10, EU eu, AbstractC1673Am<C1754Ds> abstractC1673Am) {
        return new C14400y(c3172oH, iArr, i10, eu, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC1673Am, this.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.EA
    public final InterfaceC3016lj[] A5T(E9[] e9Arr, EU eu, C3053mL c3053mL, Timeline timeline) {
        AbstractC1673Am abstractC1673AmA00 = C14400y.A00(e9Arr);
        InterfaceC3016lj[] interfaceC3016ljArr = new InterfaceC3016lj[e9Arr.length];
        for (int i10 = 0; i10 < e9Arr.length; i10++) {
            E9 e92 = e9Arr[i10];
            if (e92 != null && e92.A02.length != 0) {
                int length = e92.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                interfaceC3016ljArr[i10] = length == 1 ? new C14390x(e92.A01, e92.A02[0], e92.A00) : A00(e92.A01, e92.A02, e92.A00, eu, (AbstractC1673Am) abstractC1673AmA00.get(i10));
            }
        }
        return interfaceC3016ljArr;
    }
}
