package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KM {
    public static byte[] A05;
    public static String[] A06 = {"gE3mKe15PNIaoXw7ttCb9BorVTDWlR1u", "LRWwjDWdMU47wKVJIcB7Dut7mBvG0frC", "1lKwwAamcRIeYNpKQmj3IU07DDHuEgLY", "PqJP3Ph6GQQTo5wwFfkOi3DhrQyazUzj", "oFDIgUdhkULxBDQwmRB0TUbB416shGBK", "6jC", "Mah1O8vNWMLKc07TjmSj8tDHohOggjyp", "Z13UpOvZxGzeJ6F9B1HjNNGKJhd06uk1"};
    public static final byte[] A07;
    public int A00;
    public int A01;
    public byte[] A02;
    public int A03;
    public boolean A04;

    static {
        A01();
        A07 = new byte[]{0, 0, 1};
    }

    public KM(int i10) {
        this.A02 = new byte[i10];
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 40;
            if (A06[1].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "wQP1xK4QaPLi3BINLWGwqVwIKxpADjCS";
            strArr[4] = "tYYHT9Q4g7LWTA4ojTcqgpuHTrSkfP7y";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-63, -85, -81, -84, -53, -34, -38, -35, -34, -21, 125, -106, -115, -96, -104, -115, -117, -100, -115, -116, 72, -101, -100, -119, -102, -100, 72, -117, -105, -116, -115, 72, -98, -119, -108, -99, -115};
    }

    public final void A02() {
        this.A04 = false;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A03(byte[] bArr, int i10, int i11) {
        if (this.A04) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.A02;
            String[] strArr = A06;
            if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qvT0stT6nyeuoq7Xaws2DTrioTiQOWPH";
            strArr2[3] = "mzlXvCjE0xOVoENXvkyoTP7ZFwdNwR6s";
            if (bArr2.length < this.A00 + i12) {
                this.A02 = Arrays.copyOf(this.A02, (this.A00 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.A02, this.A00, i12);
            this.A00 += i12;
        }
    }

    public final boolean A04(int i10, int i11) {
        int i12 = this.A03;
        String strA00 = A00(10, 27, 0);
        String strA002 = A00(0, 10, 81);
        switch (i12) {
            case 0:
                if (i10 == 176) {
                    this.A03 = 1;
                    this.A04 = true;
                }
                break;
            case 1:
                if (i10 == 181) {
                    this.A03 = 2;
                } else {
                    AnonymousClass44.A07(strA002, strA00);
                    A02();
                }
                break;
            case 2:
                if (i10 <= 31) {
                    this.A03 = 3;
                } else {
                    AnonymousClass44.A07(strA002, strA00);
                    A02();
                }
                break;
            case 3:
                if ((i10 & 240) == 32) {
                    this.A01 = this.A00;
                    this.A03 = 4;
                } else {
                    AnonymousClass44.A07(strA002, strA00);
                    if (A06[1].charAt(21) == 'L') {
                        throw new RuntimeException();
                    }
                    A06[5] = "gGPh0dY5R1jiAvQEAzw3sN7yDmu";
                    A02();
                }
                break;
            case 4:
                if (i10 == 179 || i10 == 181) {
                    this.A00 -= i11;
                    String[] strArr = A06;
                    if (strArr[0].charAt(12) != strArr[3].charAt(12)) {
                        throw new RuntimeException();
                    }
                    A06[1] = "cUZSIM6xSUtrWMgJjUWxh9bxB3Jsh26G";
                    this.A04 = false;
                    return true;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        A03(A07, 0, A07.length);
        return false;
    }
}
