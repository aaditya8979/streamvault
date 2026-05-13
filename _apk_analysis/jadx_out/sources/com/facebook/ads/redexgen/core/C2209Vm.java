package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2209Vm<T> implements InterfaceC2166Tu<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public C2158Tm A00;
    public C2158Tm A01;
    public List<C2209Vm<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C2157Tl A04;
    public final U1 A05;

    static {
        A01();
    }

    public C2209Vm(C2163Tr c2163Tr, InterfaceC2171Tz interfaceC2171Tz) throws IOException {
        this.A05 = new U1(c2163Tr.A04(A00(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE, 4, 103)), interfaceC2171Tz);
        this.A04 = new C2157Tl(new File(c2163Tr.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(interfaceC2171Tz);
        this.A01 = this.A00;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {68, 102, 105, 39, 104, 105, 107, 126, 39, 99, 98, 107, 98, 115, 98, 39, 100, 114, 117, 116, 104, 117, 116, 39, 119, 104, 110, 105, 115, 110, 105, 96, 39, 102, 115, 39, 115, 111, 98, 39, 99, 102, 115, 102, 101, 102, 116, 98, 39, 116, 115, 102, 117, 115, 87, 97, 102, 103, 123, 102, 52, 100, 123, 103, 125, 96, 125, 123, 122, 52, 125, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 56, 52, 117, 122, 112, 52, 102, 113, 119, 123, 102, 112, 52, 114, 125, 120, 113, 52, 103, 113, 101, 97, 113, 122, 119, 113, 52, 103, 96, 117, 102, 96, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 46, 52, 112, 117, 96, 117, 52, 124, 117, 103, 52, 100, 102, 123, 118, 117, 118, 120, 109, 52, 118, 113, 113, 122, 52, 120, 123, 103, 96, 28, ExifInterface.START_CODE, 45, 44, 48, 45, 127, 47, 48, 44, 54, 43, 54, 48, 49, 127, 54, 44, 127, 62, 43, 127, 119, 122, 59, 115, 122, 59, 118, 115, 127, 61, ExifInterface.START_CODE, 43, 127, 45, 58, 60, 48, 45, 59, 127, 57, 54, 51, 58, 127, 44, 58, 46, ExifInterface.START_CODE, 58, 49, 60, 58, 127, 48, 49, 51, 38, 127, 55, 62, 44, 127, 57, 54, 51, 58, 127, 122, 59, 101, 127, 59, 62, 43, 62, 127, 55, 62, 44, 127, 47, 45, 48, 61, 62, 61, 51, 38, 127, 61, 58, 58, 49, 127, 51, 48, 44, 43, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 70, 67, 67, 7, 67, 70, 83, 70, 7, 83, 72, 7, 75, 72, 64, 8, 47, 39, 34, 43, ExifInterface.START_CODE, 110, 58, 33, 110, 45, 34, 43, 47, 60, 110, ExifInterface.START_CODE, 47, 58, 47, 44, 47, 61, 43, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 43, 40, 57, 46, 37, 109, 41, 44, 57, 44, 109, 43, 63, 34, 32, 109, 33, 34, ExifInterface.START_CODE, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 71, 69, 84, 0, 82, 69, 67, 79, 82, 68, 0, 67, 79, 85, 78, 84, 73, 110, 102, 99, 106, 107, 47, 123, 96, 47, 122, 127, 107, 110, 123, 106, 47, 105, 102, 99, 106, 47, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, 16, 6, 36, 11, 14, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, 16, 6, 38, 3, 22, 3, 0, 3, 17, 7, 66, 1, 14, 13, 17, 7, 6, 119, 64, 70, 74, 87, 65, 99, 76, 73, 64, 103, 68, 86, 64, 65, 119, 64, 70, 74, 87, 65, 97, 68, 81, 68, 71, 68, 86, 64, 5, 76, 86, 5, 70, 73, 74, 86, 64, 65, 119, 76, 73, 76, 77, 85, 76, 2, 112, 71, 65, 77, 80, 70, 100, 75, 78, 71, 96, 67, 81, 71, 70, 112, 71, 65, 77, 80, 70, 102, 67, 86, 67, 64, 67, 81, 71, 2, 68, 71, 86, 65, 74, 70, 80, 87, 86, 74, 87, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    private void A02(int i10, int i11) throws IOException {
        this.A00 = new C2158Tm(i10, i11);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(C2210Vn c2210Vn) throws U3 {
        if (this.A03) {
            throw new U3(A00(427, 39, 60));
        }
        if (!A06(c2210Vn)) {
            throw new U3(A00(466, 43, 59));
        }
        if (c2210Vn.A6P() == 0) {
            return;
        }
        if (this.A00.A04(c2210Vn.A00().A02) != 0) {
            throw new U3(A00(0, 54, 30));
        }
        try {
            Iterator<C2170Ty> it = c2210Vn.A00.iterator();
            while (it.hasNext()) {
                if (it.next().A00 != this.A05.A07() || !this.A05.A0D()) {
                    A02(this.A05.A06(), c2210Vn.A00().A00);
                    break;
                }
                A02(this.A05.A06(), 0);
            }
            if (this.A01.A04(this.A00) < 0) {
                this.A01 = this.A00;
            }
        } catch (IOException e10) {
            throw new U3(A00(361, 30, 22), e10);
        }
    }

    private void A05(InterfaceC2171Tz interfaceC2171Tz) throws IOException {
        C2158Tm c2158Tm = new C2158Tm(this.A05.A06(), 0);
        if (c2158Tm.A04(this.A00) > 0) {
            interfaceC2171Tz.AHs(String.format(Locale.US, A00(54, 102, 13), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c2158Tm.A02()), Integer.valueOf(c2158Tm.A03())));
            this.A00 = c2158Tm;
            return;
        }
        while (c2158Tm.A02() < this.A00.A02()) {
            if (this.A05.A0D()) {
                c2158Tm = new C2158Tm(this.A05.A06(), 0);
            } else {
                interfaceC2171Tz.AHs(String.format(Locale.US, A00(156, 101, 70), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c2158Tm.A02())));
                this.A00 = new C2158Tm(this.A05.A06(), this.A05.A07());
                this.A04.A04(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(C2210Vn c2210Vn) {
        if (!this.A02.remove(c2210Vn)) {
            return false;
        }
        if (c2210Vn.A6P() > 0 && c2210Vn.A01().A02.A05(c2210Vn.A01().A01).equals(this.A01)) {
            this.A01 = c2210Vn.A00().A02;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2166Tu
    public final synchronized InterfaceC2165Tt A6O(byte[] bArr, int[] iArr) throws U3 {
        C2209Vm<T>.RecordFileBasedFetch c2210Vn;
        if (this.A03) {
            throw new U3(A00(391, 36, 123));
        }
        int iA02 = 0;
        int i10 = 0;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = true;
            while (true) {
                C2161Tp c2161TpA0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, iA02, iArr, i10);
                int iA00 = c2161TpA0A.A01().A00() - c2161TpA0A.A01().A01();
                iA02 += c2161TpA0A.A01().A02();
                i10 += iA00;
                if (c2161TpA0A.A01().A03() == EnumC2159Tn.A03) {
                    arrayList.add(c2161TpA0A);
                }
                if (c2161TpA0A.A01().A03() == EnumC2159Tn.A04) {
                    break;
                }
                if (c2161TpA0A.A01().A03() != EnumC2159Tn.A05) {
                    this.A01 = this.A01.A05(iA00);
                } else {
                    if (this.A05.A06() + this.A05.A08() == this.A01.A02() + 1) {
                        z10 = false;
                        break;
                    }
                    this.A01 = new C2158Tm(this.A01.A02() + 1, 0);
                }
            }
            c2210Vn = new C2210Vn(this, arrayList, z10);
            this.A02.add(c2210Vn);
            if (!arrayList.isEmpty()) {
                this.A01 = c2210Vn.A01().A02.A05(c2210Vn.A01().A01);
            }
        } catch (IOException e10) {
            throw new U3(A00(306, 29, 84), e10);
        }
        return c2210Vn;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2166Tu
    public final synchronized int A8k() throws U3 {
        int iA09;
        if (this.A03) {
            throw new U3(A00(427, 39, 60));
        }
        try {
            iA09 = this.A05.A09();
            if (this.A00.A02() == this.A05.A06()) {
                iA09 -= this.A00.A03();
            }
        } catch (IOException e10) {
            throw new U3(A00(335, 26, 57), e10);
        }
        return iA09;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2166Tu
    public final synchronized void AJW(byte[] bArr) throws U3 {
        if (this.A03) {
            throw new U3(A00(427, 39, 60));
        }
        try {
            this.A05.A0C(bArr);
        } catch (IOException e10) {
            throw new U3(A00(257, 25, 62), e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2166Tu
    public final synchronized void clear() throws U3 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new U3(A00(282, 24, 87), e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
