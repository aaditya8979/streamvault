package com.facebook.ads.redexgen.core;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2075Qf implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"YAUr0vF6CX8YQIb3U2BTwiKsPx4egdml", "mCzYZBoaiKXOzjUHkKBQEDESozpM1xd6", "icS38dGHdjVFjizVfUSTymHnsbTrfSoO", "cz24QPO5JMZmQB4F0QhCndjSq8meDVtx", "FtYcbE5Uq8HUJyIzKb3J4QjvmALEd3tS", "OczTw8YbFDCs0vVm57WwAmFlfg0gTpir", "toWNn3QT1tQgvY3MKWHjSENw", "YozzgSFsuZbL3IkC1bDOEp8MFgumFV8x"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C15766g A06;
    public Interpolator A00 = C15766g.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    static {
        A03();
    }

    public RunnableC2075Qf(C15766g c15766g) {
        this.A06 = c15766g;
        this.A01 = new OverScroller(c15766g.getContext(), C15766g.A1A);
    }

    private float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, int i11, int i12, int i13) {
        int iRound;
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        boolean z10 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
        int iSqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
        C15766g c15766g = this.A06;
        int width = z10 ? c15766g.getWidth() : c15766g.getHeight();
        int i14 = width / 2;
        float fA00 = i14 + (i14 * A00(Math.min(1.0f, (iSqrt2 * 1.0f) / width)));
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fA00 / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z10) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / width) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        if (A08[2].charAt(23) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "0orcdyFTKXkoGK9yWPRw9CMcRo5SNB9j";
        strArr[0] = "sq5WBRFpbSiYOu42pzh1wsqhDGiHcevd";
        return iMin;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A08[6].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "lXzWc938MQZaj6BgS1Y9BEfSDAuAR6qF";
            strArr[5] = "B8zmNNge3ag7Hwi7A1PWi4fqxiL6HNqU";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {64, 68, 14, 65, 81, 96, 93, 90, 90};
        String[] strArr = A08;
        if (strArr[1].charAt(2) != strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[7] = "TeOjcoFpg61NRcWtZ7RqEgvJb0vCzhPX";
        strArr2[0] = "wzSzDJFWC0w6xe3VuPJPH24U0YXOvF2u";
        A07 = bArr;
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i10, int i11, int i12, int i13) {
        A0B(i10, i11, A01(i10, i11, i12, i13));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
        } else {
            this.A06.removeCallbacks(this);
            P3.A0D(this.A06, this);
        }
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i10, int i11) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i10, int i11) {
        A06(i10, i11, 0, 0);
    }

    public final void A0B(int i10, int i11, int i12) {
        A0C(i10, i11, i12, C15766g.A1A);
    }

    public final void A0C(int i10, int i11, int i12, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[2].charAt(23) != 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "88zIldbbkktihn9hTQ4sgRWvKPoy0Har";
            strArr[5] = "wazVAycqzf9kUc8ZZnvbPZ6jaLgaodB2";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i10, int i11, Interpolator interpolator) {
        int iA01 = A01(i10, i11, 0, 0);
        if (interpolator == null) {
            interpolator = C15766g.A1A;
        }
        A0C(i10, i11, iA01, interpolator);
        if (A08[6].length() == 25) {
            throw new RuntimeException();
        }
        A08[3] = "4ylqCkbib8Hqjgb9G4JU7JWl2ANwoVnp";
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A06.A06 == null) {
            A08();
            return;
        }
        A04();
        this.A06.A1K();
        OverScroller overScroller = this.A01;
        AbstractC2071Qb abstractC2071Qb = this.A06.A06.A02;
        if (overScroller.computeScrollOffset()) {
            int[] iArr = this.A06.A16;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.A02;
            int i11 = currY - this.A03;
            int iA1f = 0;
            int iA1g = 0;
            this.A02 = currX;
            this.A03 = currY;
            int i12 = 0;
            int i13 = 0;
            if (this.A06.A1w(i10, i11, iArr, null, 1)) {
                i10 -= iArr[0];
                i11 -= iArr[1];
            }
            if (this.A06.A04 != null) {
                this.A06.A1L();
                this.A06.A1M();
                OQ.A01(A02(0, 9, 115));
                C15766g c15766g = this.A06;
                C2073Qd c2073Qd = this.A06.A0s;
                String[] strArr = A08;
                if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "nozOsXlmQMzJhvkopjwZaheFFVNTeY58";
                strArr2[5] = "LtzfvJebeScyRtmgs1USyUey2pVvSmq5";
                c15766g.A1j(c2073Qd);
                if (i10 != 0) {
                    QO qo2 = this.A06.A06;
                    QW qw = this.A06.A0r;
                    C15766g c15766g2 = this.A06;
                    if (A08[4].charAt(19) != '9') {
                        A08[4] = "aF9lT9JucYAVgVWisB0rNkK4be7J2iGb";
                        iA1f = qo2.A1f(i10, qw, c15766g2.A0s);
                        i12 = i10 - iA1f;
                    } else {
                        iA1f = qo2.A1f(i10, qw, c15766g2.A0s);
                        i12 = i10 - iA1f;
                    }
                }
                if (i11 != 0) {
                    QO qo3 = this.A06.A06;
                    QW qw2 = this.A06.A0r;
                    if (A08[4].charAt(19) != '9') {
                        String[] strArr3 = A08;
                        strArr3[7] = "UcFH7yF8zZNprQitZtXhkmlCMHIdnioP";
                        strArr3[0] = "hCBROqFKcvdbLIHuO2wEis8Nwj1iktft";
                        iA1g = qo3.A1g(i11, qw2, this.A06.A0s);
                        i13 = i11 - iA1g;
                    } else {
                        iA1g = qo3.A1g(i11, qw2, this.A06.A0s);
                        i13 = i11 - iA1g;
                    }
                }
                OQ.A00();
                this.A06.A1Q();
                this.A06.A1N();
                this.A06.A1p(false);
                if (abstractC2071Qb != null && !abstractC2071Qb.A0E() && abstractC2071Qb.A0F()) {
                    int iA03 = this.A06.A0s.A03();
                    if (iA03 == 0) {
                        abstractC2071Qb.A09();
                    } else if (abstractC2071Qb.A07() >= iA03) {
                        abstractC2071Qb.A0A(iA03 - 1);
                        abstractC2071Qb.A04(i10 - i12, i11 - i13);
                    } else {
                        int i14 = i10 - i12;
                        if (A08[4].charAt(19) != '9') {
                            String[] strArr4 = A08;
                            strArr4[1] = "2vzJUgZGYJyf60lr7OoRSSfYHAbPRQwN";
                            strArr4[5] = "FZzkKBCO3vggmWhfitA4hZZwekV7eOzC";
                            abstractC2071Qb.A04(i14, i11 - i13);
                        } else {
                            abstractC2071Qb.A04(i14, i11 - i13);
                        }
                    }
                }
            }
            if (!this.A06.A0v.isEmpty()) {
                this.A06.invalidate();
            }
            if (this.A06.getOverScrollMode() != 2) {
                C15766g c15766g3 = this.A06;
                String[] strArr5 = A08;
                if (strArr5[7].charAt(6) != strArr5[0].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[6] = CampaignEx.JSON_KEY_AD_K;
                c15766g3.A1b(i10, i11);
            }
            if (!this.A06.A1v(iA1f, iA1g, i12, i13, null, 1) && (i12 != 0 || i13 != 0)) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                int i15 = i12 != currX ? i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0 : 0;
                if (i13 == currY) {
                    currVelocity = 0;
                } else if (i13 < 0) {
                    currVelocity = -currVelocity;
                } else if (i13 <= 0) {
                    currVelocity = 0;
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1a(i15, currVelocity);
                }
                if ((i15 != 0 || i12 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i13 == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (iA1f != 0 || iA1g != 0) {
                C15766g c15766g4 = this.A06;
                if (A08[6].length() != 25) {
                    A08[3] = "MhQkdHLAPY6K0mrvY0I8ZqPtgRA1J8Gx";
                    c15766g4.A1d(iA1f, iA1g);
                } else {
                    A08[6] = "5ZFiatMajPEhKsDar8BqfzNMKoQTJ";
                    c15766g4.A1d(iA1f, iA1g);
                }
            }
            if (!this.A06.awakenScrollBars()) {
                this.A06.invalidate();
            }
            boolean z10 = (i10 == 0 && i11 == 0) || (i10 != 0 && this.A06.A06.A22() && iA1f == i10) || (i11 != 0 && this.A06.A06.A23() && iA1g == i11);
            if (overScroller.isFinished() || !(z10 || this.A06.A1t(1))) {
                this.A06.setScrollState(0);
                if (C15766g.A1E) {
                    this.A06.A02.A02();
                }
                this.A06.A1Z(1);
            } else {
                A07();
                if (this.A06.A03 != null) {
                    this.A06.A03.A0B(this.A06, i10, i11);
                }
            }
        }
        if (abstractC2071Qb != null) {
            if (abstractC2071Qb.A0E()) {
                abstractC2071Qb.A04(0, 0);
            }
            if (!this.A05) {
                abstractC2071Qb.A09();
            }
        }
        A05();
    }
}
