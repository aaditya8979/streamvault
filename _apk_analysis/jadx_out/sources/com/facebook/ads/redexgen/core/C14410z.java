package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C14410z extends C9Z implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C3206or A05;
    public InterfaceC2945kN A06;
    public C16057j A07;
    public AbstractC16047i A08;
    public AbstractC16047i A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C6N A0E;
    public final InterfaceC1749Dn A0F;
    public final InterfaceC1752Dq A0G;

    static {
        A09();
    }

    public C14410z(InterfaceC1752Dq interfaceC1752Dq, Looper looper, InterfaceC1749Dn interfaceC1749Dn) {
        super(3);
        this.A0G = (InterfaceC1752Dq) C3M.A01(interfaceC1752Dq);
        this.A0D = looper == null ? null : AbstractC15184a.A0c(looper, this);
        this.A0F = interfaceC1749Dn;
        this.A0E = new C6N();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        C3M.A01(this.A09);
        if (this.A01 >= this.A09.A7w()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7v(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j10) {
        int iA8S = this.A09.A8S(j10);
        if (iA8S == 0 || this.A09.A7w() == 0) {
            return ((AbstractC3127nX) this.A09).A01;
        }
        String[] strArr = A0I;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
        strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
        if (iA8S != -1) {
            return this.A09.A7v(iA8S - 1);
        }
        AbstractC16047i abstractC16047i = this.A09;
        if (A0I[1].length() != 10) {
            return abstractC16047i.A7v(this.A09.A7w() - 1);
        }
        A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
        return abstractC16047i.A7v(this.A09.A7w() - 1);
    }

    @SideEffectFree
    private long A02(long j10) {
        C3M.A08(j10 != -9223372036854775807L);
        C3M.A08(this.A04 != -9223372036854775807L);
        return j10 - this.A04;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
            i13++;
        }
    }

    private void A04() {
        A0B(new C3155o0(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5C((C3206or) C3M.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC2945kN) C3M.A01(this.A06)).AGr();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    public static void A09() {
        A0H = new byte[]{89, 127, 104, 126, 99, 126, 102, 111, ExifInterface.START_CODE, 110, 111, 105, 101, 110, 99, 100, 109, ExifInterface.START_CODE, 108, 107, 99, 102, 111, 110, 36, ExifInterface.START_CODE, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, 63, 8, 3, 9, 8, 31, 8, 31};
    }

    private void A0A(C3155o0 c3155o0) {
        this.A0G.ACw(c3155o0.A01);
        this.A0G.ACv(c3155o0);
    }

    private void A0B(C3155o0 c3155o0) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c3155o0).sendToTarget();
        } else {
            A0A(c3155o0);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C1751Dp c1751Dp) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c1751Dp).sendToTarget();
        }
    }

    private void A0D(C2944kM c2944kM) {
        AnonymousClass44.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c2944kM);
        A0C(new C1751Dp(this.A05, c2944kM));
        A04();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1a(long j10, boolean z10) {
        this.A03 = j10;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC2945kN) C3M.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1c(C3206or[] c3206orArr, long j10, long j11) {
        this.A04 = j11;
        this.A05 = c3206orArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3116nM
    public final boolean AAG() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3116nM
    public final boolean AAV() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3116nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AHn(long r10, long r12) throws com.facebook.ads.redexgen.core.C5P {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C14410z.AHn(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.core.C7D
    public final int AJb(C3206or c3206or) {
        return this.A0F.AJc(c3206or) ? AnonymousClass76.A00(4) : AbstractC14732h.A0E(c3206or.A0W) ? AnonymousClass76.A00(1) : AnonymousClass76.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3116nM, com.facebook.ads.redexgen.core.C7D
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C3155o0) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
