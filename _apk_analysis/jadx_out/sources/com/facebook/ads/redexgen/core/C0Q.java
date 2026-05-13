package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0Q extends AnonymousClass14 implements C6W {
    public static byte[] A0K;
    public static String[] A0L = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;

    @MetaExoPlayerCustomization
    public AudioManager A06;
    public MediaFormat A07;
    public C3206or A08;
    public AnonymousClass75 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final C8C A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C8N A0J;

    static {
        A09();
    }

    public C0Q(Context context, C2801hv c2801hv, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC1678Ar interfaceC1678Ar, C9U c9u, boolean z10, boolean z11, boolean z12, Handler handler, C8D c8d, C16117p c16117p, AnonymousClass38... anonymousClass38Arr) {
        this(context, c2801hv, mediaCodecRendererMetaParameters, interfaceC1678Ar, c9u, z10, z11, z12, handler, c8d, new C3090mw(c16117p, anonymousClass38Arr));
    }

    public C0Q(Context context, C2801hv c2801hv, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC1678Ar interfaceC1678Ar, C9U c9u, boolean z10, boolean z11, boolean z12, Handler handler, C8D c8d, C8N c8n) {
        super(1, c2801hv, mediaCodecRendererMetaParameters, interfaceC1678Ar, c9u, z10, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0F = context.getApplicationContext();
        this.A0J = c8n;
        this.A0H = z11;
        this.A0I = z12;
        this.A0G = new C8C(handler, c8d);
        c8n.AIl(new C3088mu(this));
        c8n.AIg(c2801hv.A0B);
    }

    @MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i10 = this.A11.A07;
        if (!this.A11.A0D) {
            return i10;
        }
        int iA00 = ContextAwareXHEAACDRCTypeUtil.A00(this.A11.A02, this.A11.A03);
        if (!this.A11.A0E) {
            return iA00;
        }
        if (this.A06 == null) {
            this.A06 = (AudioManager) this.A0F.getSystemService(A07(99, 5, 101));
        }
        int iA01 = ContextAwareXHEAACDRCTypeUtil.A01(this.A06);
        if (A0L[3].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "LZogbi5BZWCXkICBwmOMX8OtkvvUDPu5";
        strArr[6] = "HFkZzMhVfRobNZeBREZjfgSbFT9rBjx5";
        return iA01 != 3 ? iA01 : iA00;
    }

    public static int A01(C3206or c3206or) {
        if (A07(104, 9, 112).equals(c3206or.A0W)) {
            return c3206or.A0C;
        }
        return 2;
    }

    private int A02(AR ar2, C3206or c3206or) {
        if (A07(38, 22, 76).equals(ar2.A03) && AbstractC15184a.A02 < 24) {
            int i10 = AbstractC15184a.A02;
            String[] strArr = A0L;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i10 != 23 || !AbstractC15184a.A18(this.A0F)) {
                String[] strArr3 = A0L;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new RuntimeException();
                }
                A0L[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i11 = c3206or.A0B;
        String[] strArr4 = A0L;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i11;
        }
        String[] strArr5 = A0L;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i11;
    }

    private final int A03(AR ar2, C3206or c3206or, C3206or[] c3206orArr) {
        return A02(ar2, c3206or);
    }

    private final MediaFormat A04(C3206or c3206or, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A07(155, 4, 14), str);
        mediaFormat.setInteger(A07(113, 13, 2), c3206or.A06);
        mediaFormat.setInteger(A07(177, 11, 49), c3206or.A0G);
        AnonymousClass46.A06(mediaFormat, c3206or.A0X);
        AnonymousClass46.A04(mediaFormat, A07(141, 14, 43), i10);
        if (AbstractC15184a.A02 >= 23) {
            String strA07 = A07(169, 8, 11);
            String[] strArr = A0L;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(strA07, 0);
        }
        if (c3206or.A0R != null && c3206or.A0R.equals(A07(159, 10, 15)) && this.A11.A0F) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A11.A08);
        }
        return mediaFormat;
    }

    public static /* synthetic */ AnonymousClass75 A05(C0Q c0q) {
        return null;
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A0L[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    private void A08() {
        long jA7X = this.A0J.A7X(AAG());
        if (jA7X != Long.MIN_VALUE) {
            if (!this.A0B) {
                long j10 = this.A04;
                String[] strArr = A0L;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                jA7X = Math.max(j10, jA7X);
            }
            this.A04 = jA7X;
            this.A0B = false;
        }
    }

    public static void A09() {
        A0K = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, -63, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, -59, -59, -57, -110, -56, -55, -57, -36, -38, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, -51, -51, -49, -103, -32, -51, -34, -45, -47, -32, -103, -34, -47, -46, -103, -40, -47, -30, -47, -40, 7, 27, 10, 15, 21, 18, 38, 21, 26, 32, -32, 35, 18, 40, -90, -85, -92, -79, -79, -88, -81, 112, -90, -78, -72, -79, -73, ExifInterface.MARKER_APP1, -34, -21, -24, -27, -19, -34, -59, -62, -49, -52, -50, -55, -47, -62, ExifInterface.MARKER_EOI, -51, -28, -103, -43, -38, -36, ExifInterface.MARKER_APP1, -32, -103, -33, -43, -26, -47, -68, -72, -68, -76, -67, -64, -124, -79, 126, -124, -128, 126, -124, -126, -68, -66, -75, -69, -66, -75, -64, -59, -27, -45, -33, -30, -34, -41, -97, -28, -45, -26, -41, -54, -72, -60, -54, -52, -59, -66, -2, -23, -10, -13, -22, -16, -8, -23};
    }

    private boolean A0A(C3206or c3206or) {
        if (!A07(104, 9, 112).equals(c3206or.A0W)) {
            return this.A0J.AJc(c3206or);
        }
        String[] strArr = A0L;
        if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
        strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
        return false;
    }

    public static boolean A0B(String str) {
        if (AbstractC15184a.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(188, 7, 22).equals(AbstractC15184a.A05) && (AbstractC15184a.A03.startsWith(A07(195, 8, 67)) || AbstractC15184a.A03.startsWith(A07(126, 7, 56)) || AbstractC15184a.A03.startsWith(A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 8, 28)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.C9Z
    public final void A1X() {
        super.A1X();
        this.A0J.AGG();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.C9Z
    public final void A1Y() {
        A08();
        this.A0J.pause();
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.C9Z
    public final void A1Z() {
        try {
            this.A0J.flush();
            try {
                super.A1Z();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.A1Z();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.C9Z
    public final void A1a(long j10, boolean z10) throws C9Y {
        super.A1a(j10, z10);
        if (this.A0D) {
            this.A0J.A6L();
        } else {
            this.A0J.flush();
        }
        this.A04 = j10;
        this.A0A = true;
        this.A0B = true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.C9Z
    public final void A1b(boolean z10, boolean z11) throws C9Y {
        super.A1b(z10, z11);
        this.A0G.A08(this.A0j);
        if (A1V().A00) {
            this.A0J.A6E();
        } else {
            this.A0J.A5r();
        }
        this.A0J.AIw(A1W());
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final int A1g(AO ao2, AR ar2, C3206or c3206or, C3206or c3206or2) {
        return (this.A11.A0N && A02(ar2, c3206or2) <= this.A00 && ar2.A0U(c3206or, c3206or2, true) && c3206or.A08 == 0 && c3206or.A09 == 0 && c3206or2.A08 == 0 && c3206or2.A09 == 0) ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final int A1h(InterfaceC1678Ar interfaceC1678Ar, C9U c9u, C3206or c3206or) throws C1682Av {
        String str = c3206or.A0W;
        boolean z10 = false;
        if (!AbstractC14732h.A0C(str)) {
            return 0;
        }
        int i10 = AbstractC15184a.A02 >= 21 ? 32 : 0;
        boolean zA1G = AnonymousClass14.A1G(c3206or);
        if (zA1G && A0A(c3206or) && C1685Ay.A0I() != null) {
            return i10 | 8 | 4;
        }
        if ((A07(104, 9, 112).equals(str) && !this.A0J.AJe(c3206or.A06, c3206or.A0C)) || !this.A0J.AJe(c3206or.A06, 2)) {
            return 1;
        }
        List<AR> listA1l = A1l(interfaceC1678Ar, c3206or, false);
        if (listA1l.isEmpty()) {
            return AnonymousClass76.A00(1);
        }
        if (!zA1G) {
            return AnonymousClass76.A00(2);
        }
        AR ar2 = listA1l.get(0);
        if (A0L[5].charAt(0) != 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
        strArr[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
        AR ar3 = ar2;
        if (AbstractC15184a.A02 < 21 || ((c3206or.A0G == -1 || ar3.A0Q(c3206or.A0G)) && (c3206or.A06 == -1 || ar3.A0P(c3206or.A06)))) {
            z10 = true;
        }
        return ((z10 && ar3.A0T(c3206or)) ? 16 : 8) | i10 | (z10 ? 4 : 3);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final List<AR> A1l(InterfaceC1678Ar interfaceC1678Ar, C3206or c3206or, boolean z10) throws C1682Av {
        AR arA0I;
        if (c3206or.A0W == null) {
            return Collections.emptyList();
        }
        if (!A0A(c3206or) || (arA0I = C1685Ay.A0I()) == null) {
            return Collections.unmodifiableList(interfaceC1678Ar.A7g(c3206or.A0W, z10, false));
        }
        List<AR> listSingletonList = Collections.singletonList(arA0I);
        String[] strArr = A0L;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
        strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
        return listSingletonList;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void A1o() throws C9Y {
        try {
            this.A0J.AGI();
        } catch (C8M e10) {
            throw A1T(e10, e10.A01, e10.A02, 5002);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void A1s(C3206or c3206or) throws C9Y {
        super.A1s(c3206or);
        this.A08 = c3206or;
        this.A0G.A05(this.A08, null);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void A1u(C3128nY c3128nY) {
        if (!this.A0A || c3128nY.A04()) {
            return;
        }
        if (Math.abs(c3128nY.A01 - this.A04) > 500000) {
            this.A04 = c3128nY.A01;
        }
        this.A0A = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1v(com.facebook.ads.redexgen.core.AO r9, android.media.MediaFormat r10) throws com.facebook.ads.redexgen.core.C9Y {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C0Q.A1v(com.facebook.ads.redexgen.X.AO, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void A1w(AR ar2, AO ao2, C3206or c3206or, MediaCrypto mediaCrypto) {
        this.A00 = A03(ar2, c3206or, A1e());
        this.A0C = A0B(ar2.A03);
        String str = ar2.A02;
        String strA07 = A07(104, 9, 112);
        this.A0E = strA07.equals(str) && !strA07.equals(c3206or.A0W);
        MediaFormat mediaFormatA04 = A04(c3206or, ar2.A01, this.A00);
        ao2.A50(mediaFormatA04, null, mediaCrypto, 0, null);
        if (!this.A0E) {
            this.A07 = null;
        } else {
            this.A07 = mediaFormatA04;
            this.A07.setString(A07(155, 4, 14), c3206or.A0W);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0G.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void A1y(String str, long j10, long j11) {
        this.A0G.A0G(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    @MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final boolean A23(long j10, long j11, AO ao2, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11) throws C9Y {
        if (this.A0E) {
            int i12 = i11 & 2;
            if (A0L[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i12 != 0) {
                ao2.AGy(i10, false);
                return true;
            }
        }
        if (z10) {
            ao2.AGy(i10, false);
            if (A0L[5].charAt(0) != 'p') {
                String[] strArr2 = A0L;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0j.A0B++;
                this.A0J.A9Z();
                return true;
            }
            String[] strArr3 = A0L;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0j.A0B++;
            this.A0J.A9Z();
            return true;
        }
        if (this.A0I && A01(this.A08) == 2 && i11 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            byteBuffer.position(10);
            short s10 = byteBuffer.getShort();
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            this.A01 += byteBuffer.limit() - byteBuffer.position();
            int i13 = this.A02;
            String[] strArr4 = A0L;
            if (strArr4[4].charAt(18) != strArr4[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0L;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i13 + 1;
            this.A05 += (long) Math.abs((int) s10);
            if (this.A01 >= this.A03 * 2) {
                this.A0G.A00((int) (this.A05 / ((long) this.A02)));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0H && byteBuffer.limit() > byteBuffer.position()) {
            int iPosition2 = byteBuffer.position();
            int iLimit2 = byteBuffer.limit();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit2 - iPosition2);
            byteBufferAllocate.put(byteBuffer);
            byteBufferAllocate.flip();
            byteBuffer.position(iPosition2);
            byteBuffer.limit(iLimit2);
            this.A0G.A0K(byteBufferAllocate.array(), j12 / 1000);
        }
        try {
            if (!this.A0J.A9W(byteBuffer, j12, 1)) {
                return false;
            }
            ao2.AGy(i10, false);
            this.A0j.A09++;
            return true;
        } catch (C8H e10) {
            throw A1T(e10, this.A08, e10.A02, 5001);
        } catch (C8M e11) {
            throw A1T(e11, this.A0i, e11.A02, 5002);
        }
    }

    public final void A26() {
        this.A0B = true;
    }

    @Override // com.facebook.ads.redexgen.core.C9Z, com.facebook.ads.redexgen.core.InterfaceC3116nM
    public final C6W A8L() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C6W
    public final C3190ob A8e() {
        return this.A0J.A8e();
    }

    @Override // com.facebook.ads.redexgen.core.C6W
    public final long A8h() {
        if (A92() == 2) {
            A08();
        }
        long j10 = this.A04;
        String[] strArr = A0L;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0L[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j10;
    }

    @Override // com.facebook.ads.redexgen.core.C9Z, com.facebook.ads.redexgen.core.AnonymousClass70
    public final void A9a(int i10, Object obj) throws C9Y {
        switch (i10) {
            case 2:
                this.A0J.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0J.AIW((C3212oy) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9a(i10, obj);
                return;
            case 6:
                this.A0J.AIY((C1P) obj);
                return;
            case 9:
                this.A0J.AJ4(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0J.AIX(((Integer) obj).intValue());
                return;
            case 11:
                this.A09 = null;
                return;
            case 12:
                if (AbstractC15184a.A02 >= 23) {
                    C8N c8n = this.A0J;
                    if (A0L[3].length() != 28) {
                        throw new RuntimeException();
                    }
                    A0L[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                    C16318q.A00(c8n, obj);
                    return;
                }
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.InterfaceC3116nM
    public final boolean AAG() {
        return super.AAG() && this.A0J.AAG();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14, com.facebook.ads.redexgen.core.InterfaceC3116nM
    public final boolean AAV() {
        if (!this.A0J.A9g()) {
            boolean zAAV = super.AAV();
            if (A0L[5].charAt(0) != 'p') {
                throw new RuntimeException();
            }
            A0L[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!zAAV) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.C6W
    public final void AIt(C3190ob c3190ob) {
        this.A0J.AIt(c3190ob);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3116nM, com.facebook.ads.redexgen.core.C7D
    public final String getName() {
        return A07(0, 23, 11);
    }
}
