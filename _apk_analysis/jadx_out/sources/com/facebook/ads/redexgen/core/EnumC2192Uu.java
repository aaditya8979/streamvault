package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC2192Uu {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC2192Uu[] A02;
    public static final EnumC2192Uu A03;
    public static final EnumC2192Uu A04;
    public static final EnumC2192Uu A05;

    static {
        A02();
        A03 = new EnumC2192Uu(A01(0, 7, 61), 0);
        A05 = new EnumC2192Uu(A01(10, 2, 108), 1);
        A04 = new EnumC2192Uu(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC2192Uu(String str, int i10) {
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC2192Uu enumC2192Uu) {
        if (enumC2192Uu == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (C2191Ut.A00[enumC2192Uu.ordinal()]) {
            case 1:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 2:
                return VideoAutoplayBehavior.ON;
            case 3:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    public static /* synthetic */ EnumC2192Uu[] A03() {
        EnumC2192Uu[] enumC2192UuArr = new EnumC2192Uu[3];
        enumC2192UuArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC2192UuArr[1] = A05;
        enumC2192UuArr[2] = A04;
        return enumC2192UuArr;
    }

    public static EnumC2192Uu valueOf(String str) {
        return (EnumC2192Uu) Enum.valueOf(EnumC2192Uu.class, str);
    }

    public static EnumC2192Uu[] values() {
        return (EnumC2192Uu[]) A02.clone();
    }
}
