package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FV {
    public static byte[] A0H;
    public static String[] A0I = {"El1apek5TdjhfhN6viIbzGI1k6A8fvYa", "7lO0T01iPA0M2Tn6ez9XJF6fi3WcV0bl", "BUJOgokLGuaRN3Jb1lPoBsNrm7KBSu3J", "mjIihJQoirK71A6rZ4qRVtTe6TTtSgwc", "PHElykquIwSutGmUMi14ryiOqojKYZje", "FFUtkd6qKeeUYHXUT7DV9hX7r9PAWeGY", "aVKnabS1yBALevTpM7jFXLX0kSbTApQh", "pYdHEl16nY3gI4cpQf6RN4y0bom4H0uh"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final F9 A0E = new F9();
    public final FT A0F;
    public final FU A0G;

    static {
        A06();
    }

    public FV(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? FU.A00() : null;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (j12 * ((j10 - j11) / j12));
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public static FT A01(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        C3003lW c3003lWA01 = AbstractC15184a.A02 >= 17 ? C3003lW.A01(applicationContext) : null;
        return c3003lWA01 == null ? C3004lX.A00(applicationContext) : c3003lWA01;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    private void A03() {
        if (AbstractC15184a.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        Surface surface = this.A0C;
        if (A0I[2].charAt(9) != 'u') {
            throw new RuntimeException();
        }
        A0I[2] = "PQOfzOqD2ukvp3odpMH5qIU7xJUCien7";
        FR.A02(surface, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    private void A05() {
        if (AbstractC15184a.A02 < 30 || this.A0C == null) {
            return;
        }
        float fA00 = this.A0E.A06() ? this.A0E.A00() : this.A00;
        if (fA00 == this.A02) {
            return;
        }
        boolean z10 = true;
        if (fA00 != -1.0f && this.A02 != -1.0f) {
            if (Math.abs(fA00 - this.A02) < (this.A0E.A06() && (this.A0E.A03() > 5000000000L ? 1 : (this.A0E.A03() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
                z10 = false;
            }
        } else if (fA00 != -1.0f) {
            z10 = true;
        } else if (this.A0E.A01() < 30) {
            z10 = false;
        }
        if (z10) {
            this.A02 = fA00;
            A09(false);
        }
    }

    public static void A06() {
        A0H = new byte[]{-62, -37, -50, -49, ExifInterface.MARKER_EOI, -46, -115, ExifInterface.MARKER_APP1, -36, -115, -34, -30, -46, -33, -26, -115, -47, -42, -32, -35, ExifInterface.MARKER_EOI, -50, -26, -115, -33, -46, -45, -33, -46, -32, -43, -115, -33, -50, ExifInterface.MARKER_APP1, -46, -121, -102, -107, -106, -96, 119, -93, -110, -98, -106, -125, -106, -99, -106, -110, -92, -106, 121, -106, -99, -95, -106, -93};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            this.A0A = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.A0B = (this.A0A * 80) / 100;
        } else {
            AnonymousClass44.A07(A02(36, 23, 19), A02(0, 36, 79));
            this.A0A = -9223372036854775807L;
            this.A0B = -9223372036854775807L;
        }
    }

    private void A09(boolean z10) {
        if (AbstractC15184a.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.A0D && this.A02 != -1.0f) {
            f10 = this.A02 * this.A01;
        }
        if (z10 || this.A03 != f10) {
            this.A03 = f10;
            FR.A02(this.A0C, f10);
        }
    }

    public static boolean A0A(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public final long A0B(long j10) {
        long j11 = j10;
        if (this.A06 != -1 && this.A0E.A06()) {
            long jA02 = this.A07 + ((long) (((this.A05 - this.A06) * this.A0E.A02()) / this.A01));
            if (A0A(j11, jA02)) {
                j11 = jA02;
            } else {
                A04();
            }
        }
        this.A08 = this.A05;
        this.A09 = j11;
        if (this.A0G == null || this.A0A == -9223372036854775807L) {
            return j11;
        }
        long j12 = this.A0G.A04;
        return j12 == -9223372036854775807L ? j11 : A00(j11, j12, this.A0A) - this.A0B;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((FU) C3M.A01(this.A0G)).A06();
            this.A0F.AGn(new FS() { // from class: com.facebook.ads.redexgen.X.lY
                @Override // com.facebook.ads.redexgen.core.FS
                public final void ACz(Display display) {
                    this.A00.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AJl();
            ((FU) C3M.A01(this.A0G)).A07();
        }
        A03();
    }

    public final void A0F(float f10) {
        this.A00 = f10;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j10) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            this.A07 = this.A09;
        }
        this.A05++;
        this.A0E.A05(1000 * j10);
        A05();
    }
}
