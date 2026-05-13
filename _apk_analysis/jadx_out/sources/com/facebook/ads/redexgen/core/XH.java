package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XH {
    public static byte[] A0I;
    public static String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    static {
        A02();
        A0K = XH.class.getSimpleName();
    }

    private EnumC2237Wq A00() {
        if (this.A0G == null || this.A0F == null) {
            return EnumC2237Wq.A0J;
        }
        View view = this.A0G;
        String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                EnumC2237Wq enumC2237Wq = EnumC2237Wq.A0H;
                String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return enumC2237Wq;
            }
            Object tag = this.A0G.getTag(EnumC2237Wq.A02);
            if (tag == null) {
                return EnumC2237Wq.A0I;
            }
            if (tag instanceof EnumC2237Wq) {
                return (EnumC2237Wq) tag;
            }
            EnumC2237Wq enumC2237Wq2 = EnumC2237Wq.A0K;
            if (A0J[2].charAt(2) == 'm') {
                A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                return enumC2237Wq2;
            }
        }
        throw new RuntimeException();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, 12, 115, 127, 60, 51, 54, 60, 52, 56, ExifInterface.START_CODE, 62, 45, 59, 11, 54, 50, 58, 101, 127, 75, 78, 122, 69, 89, 67, 94, 67, 69, 68, 114, 94, 91, 111, 80, 76, 86, 75, 86, 80, 81, 102, 105, 102, 99, 105, 97, 78, 111, 102, 107, 115, 94, 99, 103, 111, 119, 120, 125, 119, 127, 76, 47, 32, 37, 47, 39, 21, 95, 80, 85, 95, 87, 89, 88, 106, 85, 89, 75, 104, 93, 91, 1, 10, 0, 48, 13, 9, 1, 115, 120, 114, 78, 46, 37, 47, 18, 20, 29, 0, 17, 23, 108, 97, 109, 99, 108, 112, 56, 34, 18, 61, 56, 50, 58, 22, 36, 48, 35, 53, 20, 63, 48, 51, 61, 52, 53, 107, 113, 84, 71, 66, 79, 83, 85, 126, 118, 101, 96, 109, 113, 119, 93, 14, 25, 31, 19, 14, 24, 21, 18, 27, 92, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, 70, 92, 99, 100, 113, 98, 100, 68, 121, 125, 117, 115, 116, 97, 114, 116, 88, 36, 35, 54, 37, 35, 14, 15, 17, 28, 12, 16};
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        if (!this.A0H) {
            return null;
        }
        String strValueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        long j10 = (this.A0C <= 0 || this.A0D <= this.A0C) ? -1L : this.A0D - this.A0C;
        HashMap map = new HashMap();
        map.put(A01(20, 11, 76), String.valueOf(this.A04));
        map.put(A01(31, 11, 89), String.valueOf(this.A05));
        map.put(A01(186, 5, 30), String.valueOf(this.A06));
        map.put(A01(102, 6, 98), String.valueOf(this.A03));
        map.put(A01(42, 14, 108), String.valueOf(j10));
        map.put(A01(165, 9, 118), String.valueOf(this.A0E));
        map.put(A01(82, 7, 2), String.valueOf(this.A0D));
        map.put(A01(174, 6, 102), String.valueOf(this.A0A));
        map.put(A01(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 6, 49), String.valueOf(this.A0B));
        map.put(A01(56, 6, 114), String.valueOf(this.A07));
        map.put(A01(62, 6, 42), String.valueOf(this.A08));
        map.put(A01(89, 4, 112), String.valueOf(this.A07));
        map.put(A01(93, 4, 45), String.valueOf(this.A08));
        map.put(A01(97, 5, 20), String.valueOf(this.A00));
        map.put(A01(129, 7, 64), strValueOf);
        map.put(A01(136, 7, 98), strValueOf);
        map.put(A01(68, 14, 90), String.valueOf(A00().A06()));
        return map;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 26) + this.A0C;
        }
    }

    public final void A06(C2529dL c2529dL, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c2529dL.A0F().AK0();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                String[] strArr = A0J;
                if (strArr[3].charAt(6) == strArr[5].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0J;
                strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                if (motionRange != null && motionRange2 != null) {
                    this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        view.getLocationInWindow(new int[2]);
        view2.getLocationInWindow(new int[2]);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (r2[0] / AbstractC2232Wl.A02);
                this.A05 = (int) (r2[1] / AbstractC2232Wl.A02);
                this.A06 = (int) (view.getWidth() / AbstractC2232Wl.A02);
                this.A03 = (int) (view.getHeight() / AbstractC2232Wl.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + r5[0]) - r2[0]) / AbstractC2232Wl.A02);
                this.A0B = (int) (((((int) (motionEvent.getY() + 0.5f)) + r5[1]) - r2[1]) / AbstractC2232Wl.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + r5[0]) - r2[0]) / AbstractC2232Wl.A02);
                this.A08 = (int) (((((int) (motionEvent.getY() + 0.5f)) + r5[1]) - r2[1]) / AbstractC2232Wl.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        int iA07 = U7.A07(context);
        long jA03 = A03();
        boolean z10 = iA07 >= 0 && jA03 < ((long) iA07);
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 55) + z10 + A01(2, 18, 57) + iA07 + A01(0, 2, 74) + jA03;
        }
        return z10;
    }
}
