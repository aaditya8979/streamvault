package com.facebook.ads.redexgen.core;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1831Gr {
    public static String[] A00 = {"LICRowSKufdYuvwk0u6bsAkyuycb3o", "3c3IkJ7dOAlpkofMi9kyF", "8", "QmWMZEVudINzrA2kZLMiJGq1bO", "Rty4yJjWzs33", "sO", VastAttributes.HORIZONTAL_POSITION, "tim3YlDUE2i6MxDxj85j1aO5zMSMD9gT"};

    public static int A00(ByteBuffer byteBuffer) {
        return (int) ((48000 * A03(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0)) / 1000000);
    }

    public static int A01(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int A02(byte[] bArr) {
        return ((bArr[11] & 255) << 8) | (bArr[10] & 255);
    }

    public static long A03(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        switch (i12 & 3) {
            case 0:
                i10 = 1;
                break;
            case 1:
            case 2:
                i10 = 2;
                break;
            default:
                i10 = b11 & 63;
                break;
        }
        int i13 = i12 >> 3;
        int i14 = i13 & 3;
        if (i13 < 16) {
            i11 = i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14;
        } else {
            if (A00[7].charAt(3) == 'O') {
                throw new RuntimeException();
            }
            A00[2] = "r0CXzG1";
            i11 = 2500 << i14;
        }
        return ((long) i10) * ((long) i11);
    }

    public static long A04(long j10) {
        return (1000000000 * j10) / 48000;
    }

    public static long A05(byte[] bArr) {
        return A03(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List<byte[]> A06(byte[] bArr) {
        long jA04 = A04(A02(bArr));
        long jA042 = A04(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(A07(jA04));
        arrayList.add(A07(jA042));
        return arrayList;
    }

    public static byte[] A07(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
