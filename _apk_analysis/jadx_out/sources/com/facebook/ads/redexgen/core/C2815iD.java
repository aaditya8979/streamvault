package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2815iD extends MR {
    public static byte[] A02;

    @Nullable
    public final C2813iB A00;
    public final US A01;

    static {
        A02();
    }

    public C2815iD(C2529dL c2529dL, MS ms2, C2602eX c2602eX, US us2, C2813iB c2813iB) {
        super(c2529dL, ms2, c2602eX);
        this.A01 = us2;
        this.A00 = c2813iB;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A00 == null || TextUtils.isEmpty(this.A00.A7G())) {
            return;
        }
        this.A02.A0F().A3D();
        AbstractC2016Nw.A02(this.A00.A0X(), X0.A00(A01(0, 6, 62)));
        this.A01.AB5(this.A00.A7G(), map);
        if (U7.A19(this.A02)) {
            W2.A00(this.A02).A0E(AdPlacementType.MEDIUM_RECTANGLE.toString(), this.A00.A7G());
        }
    }
}
