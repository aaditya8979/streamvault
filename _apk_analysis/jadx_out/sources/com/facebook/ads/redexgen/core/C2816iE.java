package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2816iE extends MR {
    public static byte[] A06;
    public static final String A07;
    public C2818iG A00;
    public V4 A01;
    public boolean A02;
    public final C2529dL A03;
    public final US A04;
    public final AbstractC2303Ze A05;

    static {
        A05();
        A07 = C2816iE.class.getSimpleName();
    }

    public C2816iE(C2529dL c2529dL, US us2, AbstractC2303Ze abstractC2303Ze, C2602eX c2602eX, MS ms2, V4 v42) {
        super(c2529dL, ms2, c2602eX);
        this.A04 = us2;
        this.A05 = abstractC2303Ze;
        this.A03 = c2529dL;
        this.A01 = v42;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, ExifInterface.MARKER_EOI};
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A00 == null || TextUtils.isEmpty(this.A00.A7G())) {
            return;
        }
        this.A03.A0F().A3D();
        AbstractC2016Nw.A02(this.A00.A05(), X0.A00(A04(0, 6, 50)));
        this.A04.AB5(this.A00.A7G(), map);
        if (U7.A19(this.A03)) {
            W2.A00(this.A03).A0E(this.A01 == V4.A09 ? AdPlacementType.MEDIUM_RECTANGLE.toString() : AdPlacementType.BANNER.toString(), this.A00.A7G());
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                XJ.A00(new C2817iF(this));
            }
        }
    }

    public final void A0A(C2818iG c2818iG) {
        this.A00 = c2818iG;
    }
}
