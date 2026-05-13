package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NH {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public SF A00;
    public EnumC2318Zt A01 = EnumC2318Zt.A05;
    public ArrayList<C2440bt> A02 = new ArrayList<>();
    public final AbstractC1982Mo A03;
    public final NG A04;

    static {
        A06();
    }

    public NH(C2529dL c2529dL, NU nu, NG ng2, String str) {
        this.A03 = A01(c2529dL, nu, str, nu.A03());
        this.A04 = ng2;
    }

    private AdError A00(C2529dL c2529dL, AbstractC2804hy abstractC2804hy) {
        if (abstractC2804hy != null && !abstractC2804hy.A27().isEmpty()) {
            return null;
        }
        c2529dL.A08().AAy(A04(62, 3, 33), AbstractC2142Sv.A0Z, new C2143Sw(A04(5, 43, 20)));
        return AdError.internalError(2006);
    }

    public static AbstractC1982Mo A01(C2529dL c2529dL, NU nu, String str, JSONObject jSONObject) {
        AbstractC1982Mo abstractC1982MoA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC1982MoA00 = C2802hw.A01(jSONObject, c2529dL, true);
                abstractC1982MoA00.A1L(true);
                abstractC1982MoA00.A1I(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (abstractC1982MoA00 == null) {
            abstractC1982MoA00 = AnonymousClass77.A00(jSONObject, c2529dL);
        }
        abstractC1982MoA00.A1H(str);
        TF tfA01 = nu.A01();
        if (tfA01 != null) {
            abstractC1982MoA00.A1D(tfA01.A06());
        }
        return abstractC1982MoA00;
    }

    private SF A03(C2529dL c2529dL) {
        return this.A00 != null ? this.A00 : new SF(c2529dL);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, ExifInterface.MARKER_APP1, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, ExifInterface.MARKER_APP1, -34, ExifInterface.MARKER_EOI, -107, -74, ExifInterface.MARKER_EOI, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, ExifInterface.MARKER_APP1, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    private void A08(C2529dL c2529dL, AnonymousClass77 anonymousClass77) {
        NB nbA07 = anonymousClass77.A20().A0H().A07();
        A0B(nbA07 != null ? nbA07.A0B() : EnumC2318Zt.A05);
        C2786hb c2786hb = new C2786hb(this);
        SF sf2 = new SF(c2529dL);
        boolean z10 = U7.A2A(c2529dL) && C2101Rf.A0A(anonymousClass77.A1C());
        if (!z10) {
            NR.A02(c2529dL, anonymousClass77, true, c2786hb);
            return;
        }
        C2101Rf c2101Rf = new C2101Rf(sf2, anonymousClass77.A1C(), anonymousClass77.A0v(), anonymousClass77.A17(), z10, new C2785ha(this));
        sf2.A0e(new C2172Ua(anonymousClass77.A25(), c2529dL.A0A()));
        c2101Rf.A0B();
    }

    private void A09(C2529dL c2529dL, EnumSet<CacheFlag> enumSet, AbstractC2804hy abstractC2804hy, int i10, NG ng2) {
        boolean zA1Y = abstractC2804hy.A1Y();
        SF sfA03 = A03(c2529dL);
        sfA03.A0e(new C2172Ua(abstractC2804hy.A25(), c2529dL.A0A()));
        boolean z10 = U7.A2A(c2529dL) && C2101Rf.A0A(abstractC2804hy.A1C());
        if (z10) {
            new C2101Rf(sfA03, abstractC2804hy.A1C(), abstractC2804hy.A0v(), abstractC2804hy.A17(), z10, new C2791hi(this, c2529dL, zA1Y, abstractC2804hy, ng2)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (zA1Y) {
            SB sb2 = new SB(abstractC2804hy.A0s(), abstractC2804hy.A17(), strA04);
            sb2.A04 = true;
            sb2.A03 = A04(0, 5, 78);
            sfA03.A0Y(sb2);
        }
        sfA03.A0d(new SD(abstractC2804hy.A23().A01(), C2495cm.A04, C2495cm.A04, abstractC2804hy.A17(), A04(96, 12, 117)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean zA2s = U7.A2s(c2529dL, C2584eF.A03());
        for (C1983Mp c1983Mp : abstractC2804hy.A27()) {
            SD sd2 = new SD(c1983Mp.A0H().A08(), NN.A00(c1983Mp.A0H()), NN.A01(c1983Mp.A0H()), abstractC2804hy.A17(), A04(96, 12, 117));
            if (i11 == 0) {
                sfA03.A0c(sd2);
            } else {
                sfA03.A0d(sd2);
            }
            Iterator<String> it = c1983Mp.A0K().A02().iterator();
            while (it.hasNext()) {
                sfA03.A0d(new SD(it.next(), -1, -1, abstractC2804hy.A17(), A04(96, 12, 117)));
            }
            if (zContains && !TextUtils.isEmpty(c1983Mp.A0H().A09())) {
                SB sb3 = new SB(c1983Mp.A0H().A09(), abstractC2804hy.A17(), A04(96, 12, 117), c1983Mp.A0H().A06());
                sb3.A04 = false;
                if (i11 == 0) {
                    if (!zA1Y || zA2s) {
                        sfA03.A0b(sb3);
                    } else {
                        sfA03.A0Y(sb3);
                    }
                } else if (!zA1Y || zA2s) {
                    sfA03.A0a(sb3);
                } else {
                    sfA03.A0Z(sb3);
                }
            }
            i11++;
        }
        sfA03.A0X(new C2789hg(this, c2529dL, zA1Y, abstractC2804hy, ng2), new S8(abstractC2804hy.A17(), strA04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2529dL c2529dL, EnumSet<CacheFlag> enumSet, C2802hw c2802hw, AbstractC2804hy abstractC2804hy, int i10, NG ng2) {
        A09(c2529dL, enumSet, abstractC2804hy, i10, new C2793hk(this, c2529dL, abstractC2804hy, c2802hw, i10, ng2, enumSet));
    }

    private void A0B(EnumC2318Zt enumC2318Zt) {
        this.A01 = enumC2318Zt;
    }

    private boolean A0C(C2529dL c2529dL, AbstractC2804hy abstractC2804hy) {
        AdError adErrorA00 = A00(c2529dL, abstractC2804hy);
        if (adErrorA00 == null) {
            return false;
        }
        this.A04.ACF(adErrorA00);
        return true;
    }

    public final AbstractC1982Mo A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return com.facebook.ads.redexgen.core.EnumC2199Vb.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        return com.facebook.ads.redexgen.core.EnumC2199Vb.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.EnumC2199Vb A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Mo r0 = r5.A03
            boolean r0 = r0.A1T()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.Mo r4 = r5.A03
            com.facebook.ads.redexgen.X.hy r4 = (com.facebook.ads.redexgen.core.AbstractC2804hy) r4
            boolean r0 = r4.A1Y()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A06
            return r0
        L18:
            java.util.List r0 = r4.A27()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.Mp r0 = r4.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            com.facebook.ads.redexgen.X.NB r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.NH.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.NH.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.NH.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.NH.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2199Vb.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.NH.A0E():com.facebook.ads.redexgen.X.Vb");
    }

    public final EnumC2318Zt A0F() {
        return this.A01;
    }

    public final String A0G() {
        return this.A03.A1T() ? ((C2802hw) this.A03).A20() : ((AbstractC2804hy) this.A03).A25();
    }

    public final void A0H() {
        this.A04.AJm();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1F(rewardData);
        this.A03.A1J(str);
        if (A0D().A1T()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2529dL c2529dL, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC2199Vb.A04) {
            C2802hw c2802hw = (C2802hw) this.A03;
            AbstractC2804hy abstractC2804hyA1w = c2802hw.A1w();
            if (A0C(c2529dL, abstractC2804hyA1w) || abstractC2804hyA1w == null) {
                return;
            }
            this.A04.AGo();
            A0A(c2529dL, enumSet, c2802hw, abstractC2804hyA1w, 0, this.A04);
            return;
        }
        AbstractC2804hy abstractC2804hy = (AbstractC2804hy) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2529dL, abstractC2804hy)) {
            return;
        }
        this.A04.AGo();
        if (A0E() != EnumC2199Vb.A0C) {
            A09(c2529dL, enumSet, (AnonymousClass77) this.A03, -1, this.A04);
            return;
        }
        AnonymousClass77 anonymousClass77 = (AnonymousClass77) this.A03;
        String[] strArr2 = A06;
        if (strArr2[2].length() == strArr2[6].length()) {
            A08(c2529dL, anonymousClass77);
        } else {
            A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
            A08(c2529dL, anonymousClass77);
        }
    }

    public final boolean A0K() {
        return this.A03.A1P();
    }

    public final boolean A0L(AbstractC2804hy abstractC2804hy) {
        return !TextUtils.isEmpty(abstractC2804hy.A20().A0H().A09());
    }
}
