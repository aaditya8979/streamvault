package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
public final class C2960kc implements GX {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final InterfaceC1815Gb A0b;
    public static final C3206or A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public IY A0F;
    public boolean A0G;
    public boolean A0H;
    public H1[] A0I;
    public H1[] A0J;
    public final int A0K;
    public final SparseArray<IY> A0L;
    public final C4J A0M;
    public final C4J A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4R A0R;
    public final H1 A0S;
    public final HO A0T;
    public final C1877Im A0U;
    public final ArrayDeque<C2967kj> A0V;
    public final ArrayDeque<IX> A0W;
    public final List<C3206or> A0X;
    public final byte[] A0Y;

    static {
        A0D();
        A0b = new InterfaceC1815Gb() { // from class: com.facebook.ads.redexgen.X.kd
            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final GX[] A5F() {
                return C2960kc.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1814Ga.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C2D().A11(A0A(839, 18, 77)).A14();
    }

    public C2960kc() {
        this(0);
    }

    public C2960kc(int i10) {
        this(i10, null);
    }

    public C2960kc(int i10, C4R c4r) {
        this(i10, c4r, null, Collections.emptyList());
    }

    public C2960kc(int i10, C4R c4r, C1877Im c1877Im, List<C3206or> list) {
        this(i10, c4r, c1877Im, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C2960kc(int i10, C4R c4r, C1877Im c1877Im, List<C3206or> list, H1 h12) {
        this.A0A = -9223372036854775807L;
        this.A0K = i10;
        this.A0R = c4r;
        this.A0U = c1877Im;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = h12;
        this.A0T = new HO();
        this.A0M = new C4J(16);
        this.A0P = new C4J(AbstractC1830Gq.A03);
        this.A0O = new C4J(5);
        this.A0N = new C4J();
        this.A0Y = new byte[16];
        this.A0Q = new C4J(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = GY.A00;
        this.A0J = new H1[0];
        this.A0I = new H1[0];
    }

    public static int A00(int i10) throws C14742i {
        if (i10 >= 0) {
            return i10;
        }
        throw C14742i.A01(A0A(700, 27, 67) + i10, null);
    }

    public static int A01(IY iy, int i10, int i11, C4J c4j, int i12) throws C14742i {
        int iA0C;
        int i13 = i12;
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        C1877Im c1877Im = iy.A05.A03;
        C1879Io c1879Io = iy.A09;
        IP ip2 = (IP) AbstractC15184a.A0f(c1879Io.A06);
        c1879Io.A0C[i10] = c4j.A0L();
        c1879Io.A0E[i10] = c1879Io.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = c1879Io.A0E;
            jArr[i10] = jArr[i10] + ((long) c4j.A0C());
        }
        boolean z10 = (iA00 & 4) != 0;
        int iA0C2 = ip2.A01;
        if (z10) {
            iA0C2 = c4j.A0C();
        }
        boolean z11 = (iA00 & 256) != 0;
        boolean z12 = (iA00 & 512) != 0;
        boolean z13 = (iA00 & 1024) != 0;
        boolean z14 = (iA00 & 2048) != 0;
        long j10 = A0a(c1877Im) ? ((long[]) AbstractC15184a.A0f(c1877Im.A09))[0] : 0L;
        int[] iArr = c1879Io.A0B;
        long[] jArr2 = c1879Io.A0D;
        boolean[] zArr = c1879Io.A0G;
        boolean z15 = c1877Im.A03 == 2 && (i11 & 1) != 0;
        int i14 = i13 + c1879Io.A0C[i10];
        long j11 = c1877Im.A06;
        long j12 = c1879Io.A05;
        while (i13 < i14) {
            if (z11) {
                iA0C = c4j.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = ip2.A00;
            }
            int iA002 = A00(iA0C);
            int iA003 = A00(z12 ? c4j.A0C() : ip2.A03);
            int iA0C3 = z13 ? c4j.A0C() : (i13 == 0 && z10) ? iA0C2 : ip2.A01;
            jArr2[i13] = AbstractC15184a.A0U((((long) (z14 ? c4j.A0C() : 0)) + j12) - j10, 1000000L, j11);
            if (!c1879Io.A09) {
                jArr2[i13] = jArr2[i13] + iy.A05.A02;
            }
            iArr[i13] = iA003;
            zArr[i13] = ((iA0C3 >> 16) & 1) == 0 && (!z15 || i13 == 0);
            j12 += (long) iA002;
            i13++;
        }
        c1879Io.A05 = j12;
        return i14;
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        return II.A01(c4j.A0C()) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A03(C4J c4j) {
        c4j.A0f(8);
        return II.A01(c4j.A0C()) == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A04(C4J c4j) {
        c4j.A0f(12);
        return Pair.create(Integer.valueOf(c4j.A0C()), new IP(c4j.A0C() - 1, c4j.A0C(), c4j.A0C(), c4j.A0C()));
    }

    public static Pair<Long, C3000lT> A05(C4J c4j, long j10) throws C14742i {
        long jA0R;
        long jA0R2;
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        long jA0Q = c4j.A0Q();
        if (iA01 == 0) {
            jA0R = c4j.A0Q();
            jA0R2 = j10 + c4j.A0Q();
        } else {
            jA0R = c4j.A0R();
            jA0R2 = j10 + c4j.A0R();
        }
        long jA0U = AbstractC15184a.A0U(jA0R, 1000000L, jA0Q);
        c4j.A0g(2);
        int iA0M = c4j.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i10 = 0; i10 < iA0M; i10++) {
            int iA0C = c4j.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw C14742i.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c4j.A0Q();
            iArr[i10] = Integer.MAX_VALUE & iA0C;
            jArr[i10] = jA0R2;
            jArr3[i10] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC15184a.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i10] = jA0U2 - jArr3[i10];
            c4j.A0g(4);
            jA0R2 += (long) iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0U), new C3000lT(iArr, jArr, jArr2, jArr3));
    }

    public static DrmInitData A06(List<C2966ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2966ki c2966ki = list.get(i10);
            if (((II) c2966ki).A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c2966ki.A00.A0l();
                UUID uuidA02 = AbstractC1870If.A02(bArrA0l);
                if (uuidA02 == null) {
                    AnonymousClass44.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 66), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A07(SparseArray<IP> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (IP) C3M.A01(sparseArray.get(i10));
    }

    public static IY A08(SparseArray<IY> sparseArray) {
        IY iy = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            IY iyValueAt = sparseArray.valueAt(i10);
            if (iyValueAt.A06 || iyValueAt.A01 != iyValueAt.A05.A01) {
                boolean z10 = iyValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z10 || iyValueAt.A02 != iyValueAt.A09.A01) {
                    long jA05 = iyValueAt.A05();
                    if (jA05 < j10) {
                        iy = iyValueAt;
                        j10 = jA05;
                    }
                }
            }
        }
        return iy;
    }

    public static IY A09(C4J c4j, SparseArray<IY> sparseArray, boolean z10) {
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        IY iyValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c4j.A0C());
        if (iyValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c4j.A0R();
            iyValueAt.A09.A04 = jA0R;
            iyValueAt.A09.A03 = jA0R;
        }
        IP ip2 = iyValueAt.A04;
        iyValueAt.A09.A06 = new IP((iA00 & 2) != 0 ? c4j.A0C() - 1 : ip2.A02, (iA00 & 8) != 0 ? c4j.A0C() : ip2.A00, (iA00 & 16) != 0 ? c4j.A0C() : ip2.A03, (iA00 & 32) != 0 ? c4j.A0C() : ip2.A01);
        return iyValueAt;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        int i10 = 100;
        this.A0J = new H1[2];
        int i11 = 0;
        if (this.A0S != null) {
            this.A0J[0] = this.A0S;
            i11 = 0 + 1;
        }
        if ((this.A0K & 4) != 0) {
            this.A0J[i11] = this.A0E.AJh(100, 5);
            i11++;
            i10 = 100 + 1;
        }
        this.A0J = (H1[]) AbstractC15184a.A1I(this.A0J, i11);
        for (H1 h12 : this.A0J) {
            h12.A6W(A0c);
        }
        this.A0I = new H1[this.A0X.size()];
        int i12 = 0;
        while (i12 < this.A0I.length) {
            H1 h1AJh = this.A0E.AJh(i10, 3);
            h1AJh.A6W(this.A0X.get(i12));
            this.A0I[i12] = h1AJh;
            i12++;
            i10++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, ExifInterface.START_CODE, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, ExifInterface.START_CODE, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, 11, 78, 2, 11, 29, 29, 78, 26, 6, 15, 0, 78, 6, 11, 15, 10, 11, 28, 78, 2, 11, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, ExifInterface.START_CODE, 45, 29, 54, 44, ExifInterface.START_CODE, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, ExifInterface.START_CODE, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, ExifInterface.START_CODE, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, ExifInterface.START_CODE, 108, 45, 56, 35, 33, 108, 40, 41, ExifInterface.START_CODE, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, 64, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, 127, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, ExifInterface.START_CODE, 41, 37, 46, 43, 41, ExifInterface.START_CODE, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, 127, 108, 41, 127, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 127, ExifInterface.START_CODE, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    private void A0E(long j10) {
        while (!this.A0W.isEmpty()) {
            IX ixRemoveFirst = this.A0W.removeFirst();
            this.A03 -= ixRemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = ixRemoveFirst.A01;
            if (ixRemoveFirst.A02) {
                jA05 += j10;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (H1 h12 : this.A0J) {
                h12.AIA(jA05, 1, ixRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C14742i {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j10) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C4J c4j, int i10, C1879Io c1879Io) throws C14742i {
        c4j.A0f(i10 + 8);
        int iA00 = II.A00(c4j.A0C());
        if ((iA00 & 1) != 0) {
            throw C14742i.A00(A0A(458, 56, 30));
        }
        boolean z10 = (iA00 & 2) != 0;
        int iA0L = c4j.A0L();
        if (iA0L == 0) {
            Arrays.fill(c1879Io.A0F, 0, c1879Io.A00, false);
        } else {
            if (iA0L != c1879Io.A00) {
                throw C14742i.A01(A0A(532, 18, 95) + iA0L + A0A(0, 40, 98) + c1879Io.A00, null);
            }
            Arrays.fill(c1879Io.A0F, 0, iA0L, z10);
            c1879Io.A02(c4j.A07());
            c1879Io.A04(c4j);
        }
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C4J c4j, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c4j.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = II.A01(c4j.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                long jA0Q2 = c4j.A0Q();
                jA0U2 = AbstractC15184a.A0U(c4j.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC15184a.A0U(c4j.A0Q(), 1000L, jA0Q2);
                jA0Q = c4j.A0Q();
                break;
            case 1:
                long jA0Q3 = c4j.A0Q();
                jA05 = AbstractC15184a.A0U(c4j.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC15184a.A0U(c4j.A0Q(), 1000L, jA0Q3);
                jA0Q = c4j.A0Q();
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                break;
            default:
                AnonymousClass44.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i10 = 0;
        C4J c4j2 = new C4J(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c4j2.A07();
        H1[] h1Arr = this.A0J;
        int length = h1Arr.length;
        int i11 = 0;
        while (i11 < length) {
            H1 h12 = h1Arr[i11];
            c4j2.A0f(i10);
            h12.AJu(uri);
            h12.AI7(c4j2, iA07);
            i11++;
            i10 = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0W.addLast(new IX(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new IX(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            C4R c4r = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = c4r.A05(jA05);
            } else {
                jA05 = c4r.A05(jA05);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC2805i2.A12)) {
            jA05 = this.A0A;
        }
        H1[] h1Arr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (H1 h13 : h1Arr2) {
            h13.AIA(jA05, 1, iA07, 0, null);
        }
    }

    public static void A0I(C4J c4j, C1879Io c1879Io) throws C14742i {
        c4j.A0f(8);
        int iA0C = c4j.A0C();
        if ((II.A00(iA0C) & 1) == 1) {
            c4j.A0g(8);
        }
        int iA0L = c4j.A0L();
        if (iA0L != 1) {
            throw C14742i.A01(A0A(727, 29, 60) + iA0L, null);
        }
        c1879Io.A03 += II.A01(iA0C) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static void A0J(C4J c4j, C1879Io c1879Io) throws C14742i {
        A0G(c4j, 0, c1879Io);
    }

    public static void A0K(C4J c4j, C1879Io c1879Io, byte[] bArr) throws C14742i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (Arrays.equals(bArr, A0d)) {
            A0G(c4j, 16, c1879Io);
        }
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC2995lN interfaceC2995lN) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC2995lN.readFully(c4j.A0l(), 8, i10);
            A0U(new C2966ki(this.A01, c4j), interfaceC2995lN.A8f(), interfaceC2995lN.A9H());
        } else {
            interfaceC2995lN.AJJ(i10);
        }
        A0F(interfaceC2995lN.A8f());
    }

    private void A0M(InterfaceC2995lN interfaceC2995lN) throws IOException {
        IY iyValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1879Io c1879Io = this.A0L.valueAt(i10).A09;
            if (c1879Io.A0A && c1879Io.A03 < j10) {
                j10 = c1879Io.A03;
                iyValueAt = this.A0L.valueAt(i10);
            }
        }
        if (iyValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8f = (int) (j10 - interfaceC2995lN.A8f());
        if (iA8f < 0) {
            throw C14742i.A01(A0A(384, 39, 59), null);
        }
        interfaceC2995lN.AJJ(iA8f);
        iyValueAt.A09.A05(interfaceC2995lN);
    }

    private void A0N(C2967kj c2967kj) throws C14742i {
        if (((II) c2967kj).A00 == 1836019574) {
            A0P(c2967kj);
            return;
        }
        if (((II) c2967kj).A00 == 1836019558) {
            A0O(c2967kj);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C2967kj c2967kjPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c2967kjPeek.A08(c2967kj);
    }

    private void A0O(C2967kj c2967kj) throws C14742i {
        A0Q(c2967kj, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c2967kj.A02);
        if (drmInitDataA06 != null) {
            int size = this.A0L.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.A0L.valueAt(i10).A0B(drmInitDataA06);
            }
        }
        long j10 = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j10 != -9223372036854775807L) {
                int size2 = this.A0L.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    IY iyValueAt = this.A0L.valueAt(i11);
                    long j11 = this.A0B;
                    if (A0a[5].length() != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        iyValueAt.A0A(j11);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C2967kj c2967kj) throws C14742i {
        C3M.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c2967kj.A02);
        C2967kj c2967kj2 = (C2967kj) C3M.A01(c2967kj.A06(1836475768));
        SparseArray<IP> sparseArray = new SparseArray<>();
        long jA02 = -9223372036854775807L;
        int size = c2967kj2.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2966ki c2966ki = c2967kj2.A02.get(i10);
            if (((II) c2966ki).A00 == 1953654136) {
                Pair<Integer, IP> pairA04 = A04(c2966ki.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (IP) pairA04.second);
            } else if (((II) c2966ki).A00 == 1835362404) {
                jA02 = A02(c2966ki.A00);
            }
        }
        List<C1880Ip> listA0O = IO.A0O(c2967kj, new C1822Gi(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC2851ip() { // from class: com.facebook.ads.redexgen.X.ke
            @Override // com.facebook.ads.redexgen.core.InterfaceC2851ip
            public final Object A43(Object obj2) {
                return this.A00.A0c((C1877Im) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() != 0) {
            C3M.A08(this.A0L.size() == size2);
            for (int i11 = 0; i11 < size2; i11++) {
                C1880Ip c1880Ip = listA0O.get(i11);
                C1877Im c1877Im = c1880Ip.A03;
                this.A0L.get(c1877Im.A00).A0C(c1880Ip, A07(sparseArray, c1877Im.A00));
            }
            return;
        }
        for (int i12 = 0; i12 < size2; i12++) {
            C1880Ip c1880Ip2 = listA0O.get(i12);
            C1877Im c1877Im2 = c1880Ip2.A03;
            this.A0L.put(c1877Im2.A00, new IY(this.A0E.AJh(i12, c1877Im2.A03), c1880Ip2, A07(sparseArray, c1877Im2.A00)));
            this.A08 = Math.max(this.A08, c1877Im2.A04);
        }
        this.A0E.A6G();
    }

    public static void A0Q(C2967kj c2967kj, SparseArray<IY> sparseArray, boolean z10, int i10, byte[] bArr) throws C14742i {
        int size = c2967kj.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2967kj c2967kj2 = c2967kj.A01.get(i11);
            if (((II) c2967kj2).A00 == 1953653094) {
                A0R(c2967kj2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void A0R(C2967kj c2967kj, SparseArray<IY> sparseArray, boolean z10, int i10, byte[] bArr) throws C14742i {
        IY iyA09 = A09(((C2966ki) C3M.A01(c2967kj.A07(1952868452))).A00, sparseArray, z10);
        if (iyA09 == null) {
            return;
        }
        C1879Io c1879Io = iyA09.A09;
        long j10 = c1879Io.A05;
        boolean z11 = c1879Io.A09;
        iyA09.A08();
        iyA09.A06 = true;
        C2966ki c2966kiA07 = c2967kj.A07(1952867444);
        if (c2966kiA07 == null || (i10 & 2) != 0) {
            c1879Io.A05 = j10;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            c1879Io.A09 = z11;
        } else {
            c1879Io.A05 = A03(c2966kiA07.A00);
            c1879Io.A09 = true;
        }
        A0S(c2967kj, iyA09, i10);
        C1877Im c1877Im = iyA09.A05.A03;
        Object objA01 = C3M.A01(c1879Io.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        C1878In c1878InA00 = c1877Im.A00(((IP) objA01).A02);
        C2966ki c2966kiA072 = c2967kj.A07(1935763834);
        if (c2966kiA072 != null) {
            A0V((C1878In) C3M.A01(c1878InA00), c2966kiA072.A00, c1879Io);
        }
        C2966ki c2966kiA073 = c2967kj.A07(1935763823);
        if (c2966kiA073 != null) {
            A0I(c2966kiA073.A00, c1879Io);
        }
        C2966ki c2966kiA074 = c2967kj.A07(1936027235);
        if (c2966kiA074 != null) {
            A0J(c2966kiA074.A00, c1879Io);
        }
        A0T(c2967kj, c1878InA00 != null ? c1878InA00.A02 : null, c1879Io);
        int size = c2967kj.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2966ki c2966ki = c2967kj.A02.get(i11);
            if (((II) c2966ki).A00 == 1970628964) {
                A0K(c2966ki.A00, c1879Io, bArr);
            }
        }
    }

    public static void A0S(C2967kj c2967kj, IY iy, int i10) throws C14742i {
        int i11 = 0;
        int i12 = 0;
        List<C2966ki> list = c2967kj.A02;
        int size = list.size();
        int i13 = 0;
        while (A0a[5].length() != 30) {
            A0a[1] = "g5KWW";
            if (i13 >= size) {
                iy.A02 = 0;
                iy.A00 = 0;
                iy.A01 = 0;
                iy.A09.A03(i11, i12);
                int i14 = 0;
                int iA01 = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    C2966ki c2966ki = list.get(i15);
                    if (((II) c2966ki).A00 == 1953658222) {
                        iA01 = A01(iy, i14, i10, c2966ki.A00, iA01);
                        i14++;
                    }
                }
                return;
            }
            C2966ki c2966ki2 = list.get(i13);
            if (((II) c2966ki2).A00 == 1953658222) {
                C4J c4j = c2966ki2.A00;
                c4j.A0f(12);
                int iA0L = c4j.A0L();
                if (iA0L > 0) {
                    i12 += iA0L;
                    i11++;
                }
            }
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A0T(C2967kj c2967kj, String str, C1879Io c1879Io) throws C14742i {
        C4J c4j = null;
        C4J c4j2 = null;
        for (int i10 = 0; i10 < c2967kj.A02.size(); i10++) {
            C2966ki c2966ki = c2967kj.A02.get(i10);
            C4J c4j3 = c2966ki.A00;
            if (((II) c2966ki).A00 == 1935828848) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j = c4j3;
                }
            } else if (((II) c2966ki).A00 == 1936158820) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j2 = c4j3;
                }
            }
        }
        if (c4j == null || c4j2 == null) {
            return;
        }
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        if (iA01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw C14742i.A00(A0A(126, 39, 73));
        }
        c4j2.A0f(8);
        int iA012 = II.A01(c4j2.A0C());
        c4j2.A0g(4);
        if (iA012 == 1) {
            if (c4j2.A0Q() == 0) {
                throw C14742i.A00(A0A(784, 55, 110));
            }
        } else if (iA012 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw C14742i.A00(A0A(165, 39, 18));
        }
        c4j2.A0g(1);
        int iA0I = c4j2.A0I();
        int i11 = (iA0I & 240) >> 4;
        int i12 = iA0I & 15;
        boolean z10 = c4j2.A0I() == 1;
        if (z10) {
            int iA0I2 = c4j2.A0I();
            byte[] bArr = new byte[16];
            c4j2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c4j2.A0I();
                bArr2 = new byte[iA0I3];
                c4j2.A0k(bArr2, 0, iA0I3);
            }
            c1879Io.A08 = true;
            c1879Io.A07 = new C1878In(z10, str, iA0I2, bArr, i11, i12, bArr2);
        }
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C2966ki c2966ki, long j10, Uri uri) throws C14742i {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c2966ki);
            return;
        }
        if (((II) c2966ki).A00 != 1936286840) {
            if (((II) c2966ki).A00 != 1701671783 || uri == null) {
                return;
            }
            A0H(c2966ki.A00, uri);
            return;
        }
        Pair<Long, C3000lT> pairA05 = A05(c2966ki.A00, j10);
        Long l10 = (Long) pairA05.first;
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
        this.A0C = l10.longValue();
        this.A0E.AIN((InterfaceC1836Gw) pairA05.second);
        this.A0G = true;
    }

    public static void A0V(C1878In c1878In, C4J c4j, C1879Io c1879Io) throws C14742i {
        int i10 = c1878In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int iA0I = c4j.A0I();
        int iA0L = c4j.A0L();
        if (iA0L > c1879Io.A00) {
            throw C14742i.A01(A0A(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 18, 58) + iA0L + A0A(40, 38, 7) + c1879Io.A00, null);
        }
        int i11 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c1879Io.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i12 = 0; i12 < iA0L; i12++) {
                int iA0I2 = c4j.A0I();
                i11 += iA0I2;
                zArr[i12] = iA0I2 > i10;
            }
        } else {
            i11 = 0 + (iA0I * iA0L);
            Arrays.fill(c1879Io.A0F, 0, iA0L, iA0I > i10);
        }
        Arrays.fill(c1879Io.A0F, iA0L, c1879Io.A00, false);
        if (i11 > 0) {
            c1879Io.A02(i11);
        }
    }

    public static boolean A0W(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0X(int r4) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2960kc.A0X(int):boolean");
    }

    private boolean A0Y(InterfaceC2995lN interfaceC2995lN) throws IOException {
        int size;
        int i10;
        if (this.A00 == 0) {
            C4J c4j = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC2995lN.AGh(c4j.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int iA0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = iA0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC2995lN.readFully(this.A0M.A0l(), 8, 8);
            this.A00 += 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8G = interfaceC2995lN.A8G();
            if (jA8G == -1 && !this.A0V.isEmpty()) {
                jA8G = this.A0V.peek().A00;
            }
            if (jA8G != -1) {
                this.A07 = (jA8G - interfaceC2995lN.A8f()) + ((long) this.A00);
            }
        }
        if (this.A07 < this.A00) {
            throw C14742i.A00(A0A(78, 48, 36));
        }
        long jA8f = interfaceC2995lN.A8f() - ((long) this.A00);
        if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
            this.A0E.AIN(new C2990lI(this.A08, jA8f));
            this.A0G = true;
        }
        if (this.A01 == 1836019558) {
            SparseArray<IY> sparseArray = this.A0L;
            if (A0a[0].length() != 3) {
                A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                size = sparseArray.size();
                i10 = 0;
            } else {
                A0a[0] = "3Yh";
                size = sparseArray.size();
                i10 = 0;
            }
            while (i10 < size) {
                C1879Io c1879Io = this.A0L.valueAt(i10).A09;
                c1879Io.A02 = jA8f;
                c1879Io.A03 = jA8f;
                c1879Io.A04 = jA8f;
                i10++;
            }
        }
        if (this.A01 == 1835295092) {
            this.A0F = null;
            this.A09 = this.A07 + jA8f;
            this.A02 = 2;
            return true;
        }
        if (A0W(this.A01)) {
            long jA8f2 = (interfaceC2995lN.A8f() + this.A07) - 8;
            this.A0V.push(new C2967kj(this.A01, jA8f2));
            if (this.A07 == this.A00) {
                A0F(jA8f2);
            } else {
                A0B();
            }
        } else if (A0X(this.A01)) {
            if (this.A00 != 8) {
                throw C14742i.A00(A0A(284, 51, 6));
            }
            if (this.A07 > 2147483647L) {
                throw C14742i.A00(A0A(335, 49, 77));
            }
            C4J c4j2 = new C4J((int) this.A07);
            System.arraycopy(this.A0M.A0l(), 0, c4j2.A0l(), 0, 8);
            this.A0D = c4j2;
            this.A02 = 1;
        } else {
            if (this.A07 > 2147483647L) {
                throw C14742i.A00(A0A(592, 53, 87));
            }
            this.A0D = null;
            this.A02 = 1;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AJJ(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.facebook.ads.redexgen.core.C14742i.A01(A0A(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 35, 125), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC2995lN r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2960kc.A0Z(com.facebook.ads.redexgen.X.lN):boolean");
    }

    public static boolean A0a(C1877Im c1877Im) {
        if (c1877Im.A08 == null || c1877Im.A08.length != 1 || c1877Im.A09 == null) {
            return false;
        }
        if (c1877Im.A08[0] == 0) {
            return true;
        }
        long jA0U = AbstractC15184a.A0U(c1877Im.A08[0] + c1877Im.A09[0], 1000000L, c1877Im.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return jA0U >= c1877Im.A04;
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C2959kb()};
    }

    public final C1877Im A0c(C1877Im c1877Im) {
        return c1877Im;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new IY(gy.AJh(0, this.A0U.A03), new C1880Ip(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new IP(0, 0, 0, 0)));
            this.A0E.A6G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC2995lN)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0L(interfaceC2995lN);
                    break;
                case 2:
                    A0M(interfaceC2995lN);
                    break;
                default:
                    if (A0Z(interfaceC2995lN)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0L.valueAt(i10).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2995lN interfaceC2995lN) throws IOException {
        return AbstractC1875Ik.A01(interfaceC2995lN);
    }
}
