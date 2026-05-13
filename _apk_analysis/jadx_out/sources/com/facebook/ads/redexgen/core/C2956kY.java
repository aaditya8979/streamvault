package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2956kY implements GX, InterfaceC1836Gw {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC1815Gb A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public MotionPhotoMetadata A0F;
    public C1867Ic[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C4J A0J;
    public final C4J A0K;
    public final C4J A0L;
    public final C4J A0M;
    public final C1874Ij A0N;
    public final ArrayDeque<C2967kj> A0O;
    public final List<Metadata.Entry> A0P;

    static {
        A0C();
        A0S = new InterfaceC1815Gb() { // from class: com.facebook.ads.redexgen.X.kZ
            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final GX[] A5F() {
                return C2956kY.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1815Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1814Ga.A01(this, uri, map);
            }
        };
    }

    public C2956kY() {
        this(0);
    }

    public C2956kY(int i10) {
        this.A0I = i10;
        this.A04 = (i10 & 4) != 0 ? 3 : 0;
        this.A0N = new C1874Ij();
        this.A0P = new ArrayList();
        this.A0J = new C4J(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C4J(AbstractC1830Gq.A03);
        this.A0K = new C4J(4);
        this.A0M = new C4J();
        this.A08 = -1;
        this.A0E = GY.A00;
        this.A0G = new C1867Ic[0];
    }

    public static int A00(int i10) {
        switch (i10) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j10) {
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        int i10 = -1;
        long j12 = Long.MAX_VALUE;
        long j13 = Long.MAX_VALUE;
        boolean z11 = true;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            C1867Ic[] c1867IcArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i12 >= c1867IcArr.length) {
                if (j13 == Long.MAX_VALUE || !z11) {
                    return i10;
                }
                long j14 = 10485760 + j13;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (j12 < j14) {
                        return i10;
                    }
                } else if (j12 < j14) {
                    return i10;
                }
                return i11;
            }
            C1867Ic c1867Ic = this.A0G[i12];
            int i13 = c1867Ic.A00;
            if (i13 != c1867Ic.A04.A01) {
                long j15 = c1867Ic.A04.A06[i13];
                long j16 = ((long[][]) AbstractC15184a.A0f(this.A0H))[i12][i13];
                long j17 = j15 - j10;
                boolean z12 = j17 < 0 || j17 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z12 && z10) || (z12 == z10 && j17 < j11)) {
                    z10 = z12;
                    j11 = j17;
                    i10 = i12;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        j12 = j16;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        j12 = j16;
                    }
                }
                if (j16 < j13) {
                    j13 = j16;
                    z11 = z12;
                    i11 = i12;
                }
            }
            i12++;
        }
    }

    public static int A02(C4J c4j) {
        c4j.A0f(8);
        int iA00 = A00(c4j.A0C());
        if (iA00 != 0) {
            return iA00;
        }
        c4j.A0g(4);
        while (c4j.A07() > 0) {
            int iA002 = A00(c4j.A0C());
            if (iA002 != 0) {
                return iA002;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A03(com.facebook.ads.redexgen.core.InterfaceC2995lN r22, com.facebook.ads.redexgen.core.C1833Gt r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2956kY.A03(com.facebook.ads.redexgen.X.lN, com.facebook.ads.redexgen.X.Gt):int");
    }

    private int A04(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        int iA07 = this.A0N.A07(interfaceC2995lN, c1833Gt, this.A0P);
        if (iA07 == 1 && c1833Gt.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C1880Ip c1880Ip, long j10) {
        int iA00 = c1880Ip.A00(j10);
        return iA00 == -1 ? c1880Ip.A01(j10) : iA00;
    }

    public static long A06(C1880Ip c1880Ip, long j10, long j11) {
        int iA05 = A05(c1880Ip, j10);
        return iA05 == -1 ? j11 : Math.min(c1880Ip.A06[iA05], j11);
    }

    private final C1835Gv A07(long j10, int i10) {
        long jA06;
        long j11;
        int iA01;
        if (this.A0G.length == 0) {
            return new C1835Gv(C1837Gx.A04);
        }
        long j12 = -9223372036854775807L;
        long jA062 = -1;
        int i11 = i10 != -1 ? i10 : this.A03;
        if (i11 != -1) {
            C1880Ip c1880Ip = this.A0G[i11].A04;
            int iA05 = A05(c1880Ip, j10);
            if (iA05 == -1) {
                return new C1835Gv(C1837Gx.A04);
            }
            j11 = c1880Ip.A07[iA05];
            jA06 = c1880Ip.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j11 < j10 && iA05 < c1880Ip.A01 - 1 && (iA01 = c1880Ip.A01(j10)) != -1 && iA01 != iA05) {
                j12 = c1880Ip.A07[iA01];
                jA062 = c1880Ip.A06[iA01];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j11 = j10;
            } else {
                A0R[2] = "SenK5aC";
                j11 = j10;
            }
        }
        if (i10 == -1) {
            for (int i12 = 0; i12 < this.A0G.length; i12++) {
                if (i12 != this.A03) {
                    C1880Ip c1880Ip2 = this.A0G[i12].A04;
                    jA06 = A06(c1880Ip2, j11, jA06);
                    if (j12 != -9223372036854775807L) {
                        jA062 = A06(c1880Ip2, j12, jA062);
                    }
                }
            }
        }
        C1837Gx c1837Gx = new C1837Gx(j11, jA06);
        return j12 == -9223372036854775807L ? new C1835Gv(c1837Gx) : new C1835Gv(c1837Gx, new C1837Gx(j12, jA062));
    }

    public static /* synthetic */ C1877Im A08(C1877Im c1877Im) {
        return c1877Im;
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 != 2 || (this.A0I & 2) == 0) {
            return;
        }
        this.A0E.AJh(0, 4).A6W(new C2D().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
        this.A0E.A6G();
        this.A0E.AIN(new C2990lI(-9223372036854775807L));
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, 63, ExifInterface.START_CODE, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    private void A0D(long j10) throws C14742i {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j10) {
            C2967kj c2967kjPop = this.A0O.pop();
            if (((II) c2967kjPop).A00 == 1836019574) {
                A0G(c2967kjPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A08(c2967kjPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j10) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(InterfaceC2995lN interfaceC2995lN) throws IOException {
        this.A0M.A0d(8);
        interfaceC2995lN.AG9(this.A0M.A0l(), 0, 8);
        IO.A0Q(this.A0M);
        interfaceC2995lN.AJJ(this.A0M.A09());
        interfaceC2995lN.AI1();
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C2967kj c2967kj) throws C14742i {
        int i10;
        int size = -1;
        long jMax = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        Metadata metadata2 = null;
        boolean z10 = this.A02 == 1;
        C1822Gi c1822Gi = new C1822Gi();
        C2966ki c2966kiA07 = c2967kj.A07(1969517665);
        if (c2966kiA07 != null) {
            Pair<Metadata, Metadata> pairA0A = IO.A0A(c2966kiA07);
            metadata = (Metadata) pairA0A.first;
            metadata2 = (Metadata) pairA0A.second;
            if (metadata != null) {
                c1822Gi.A05(metadata);
            }
        }
        C2967kj c2967kjA06 = c2967kj.A06(1835365473);
        Metadata metadataA0F = c2967kjA06 != null ? IO.A0F(c2967kjA06) : null;
        List<C1880Ip> listA0O = IO.A0O(c2967kj, c1822Gi, -9223372036854775807L, null, (this.A0I & 1) != 0, z10, new InterfaceC2851ip() { // from class: com.facebook.ads.redexgen.X.ka
            @Override // com.facebook.ads.redexgen.core.InterfaceC2851ip
            public final Object A43(Object obj) {
                return C2956kY.A08((C1877Im) obj);
            }
        });
        int size2 = listA0O.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C1880Ip c1880Ip = listA0O.get(i11);
            if (c1880Ip.A01 != 0) {
                C1877Im c1877Im = c1880Ip.A03;
                C1867Ic c1867Ic = new C1867Ic(c1877Im, c1880Ip, this.A0E.AJh(i11, c1877Im.A03));
                long j12 = c1877Im.A04 != -9223372036854775807L ? c1877Im.A04 : c1880Ip.A02;
                jMax = Math.max(jMax, j12);
                if (1 == c1877Im.A03) {
                    j11 = j12;
                } else if (2 == c1877Im.A03) {
                    j10 = j12;
                }
                if (A09(75, 13, 125).equals(c1877Im.A07.A0W)) {
                    int i12 = c1880Ip.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i10 = i12 * 16;
                } else {
                    i10 = c1880Ip.A00 + 30;
                }
                C2D c2dA07 = c1877Im.A07.A07();
                c2dA07.A0h(i10);
                if (c1877Im.A03 == 2 && j12 > 0 && c1880Ip.A01 > 1) {
                    c2dA07.A0X(c1880Ip.A01 / (j12 / 1000000.0f));
                }
                if (jMax > 0 && c1880Ip.A01 > 0 && c1880Ip.A05.length == c1880Ip.A01) {
                    long j13 = 0;
                    for (int i13 = 0; i13 < c1880Ip.A01; i13++) {
                        j13 += (long) c1880Ip.A05[i13];
                    }
                    c2dA07.A0a((int) ((8000000 * j13) / jMax));
                }
                IZ.A0D(c1877Im.A03, c1822Gi, c2dA07);
                int i14 = c1877Im.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata2;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                IZ.A0C(i14, metadata, metadataA0F, c2dA07, metadataArr);
                c1867Ic.A01.A6W(c2dA07.A14());
                if (c1877Im.A03 == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(c1867Ic);
            } else {
                if (A0R[1].charAt(1) != 'b') {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j10;
        this.A0A = j11;
        this.A0G = (C1867Ic[]) arrayList.toArray(new C1867Ic[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6G();
        this.A0E.AIN(this);
    }

    private void A0H(C1867Ic c1867Ic, long j10) {
        C1880Ip c1880Ip = c1867Ic.A04;
        int iA00 = c1880Ip.A00(j10);
        if (iA00 == -1) {
            iA00 = c1880Ip.A01(j10);
        }
        c1867Ic.A00 = iA00;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0J(int r4) {
        /*
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r4 == r0) goto L8d
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r4 == r0) goto L8d
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2956kY.A0R
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2956kY.A0R
            java.lang.String r1 = "UHuXZ9PGVGxrhu"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "Sv1JTBT1egKeuo"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L8d
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r4 == r0) goto L8d
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r4 == r0) goto L8d
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r4 == r0) goto L8d
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r4 == r0) goto L8d
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r4 == r0) goto L8d
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r4 == r0) goto L8d
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r4 == r0) goto L8d
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r4 == r0) goto L8d
            r3 = 1937007471(0x7374636f, float:1.9362445E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2956kY.A0R
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L91
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2956kY.A0R
            java.lang.String r1 = "0EWWhWMRQ7MgS85x4CKboIorprSqD"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L8d
        L6f:
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r4 == r0) goto L8d
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r4 == r0) goto L8d
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 == r0) goto L8d
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r4 == r0) goto L8d
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r4 == r0) goto L8d
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r4 != r0) goto L8f
        L8d:
            r0 = 1
        L8e:
            return r0
        L8f:
            r0 = 0
            goto L8e
        L91:
            if (r4 == r3) goto L8d
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2956kY.A0J(int):boolean");
    }

    private boolean A0K(InterfaceC2995lN interfaceC2995lN) throws IOException {
        C2967kj c2967kjPeek;
        if (this.A00 == 0) {
            if (!interfaceC2995lN.AGh(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC2995lN.readFully(this.A0J.A0l(), 8, 8);
            this.A00 += 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8G = interfaceC2995lN.A8G();
            if (jA8G == -1 && (c2967kjPeek = this.A0O.peek()) != null) {
                jA8G = c2967kjPeek.A00;
            }
            if (jA8G != -1) {
                this.A09 = (jA8G - interfaceC2995lN.A8f()) + ((long) this.A00);
            }
        }
        if (this.A09 < this.A00) {
            throw C14742i.A00(A09(0, 48, 61));
        }
        if (A0I(this.A01)) {
            long jA8f = (interfaceC2995lN.A8f() + this.A09) - ((long) this.A00);
            if (this.A09 != this.A00 && this.A01 == 1835365473) {
                A0F(interfaceC2995lN);
            }
            this.A0O.push(new C2967kj(this.A01, jA8f));
            if (this.A09 == this.A00) {
                A0D(jA8f);
            } else {
                A0A();
            }
        } else if (A0J(this.A01)) {
            C3M.A08(this.A00 == 8);
            C3M.A08(this.A09 <= 2147483647L);
            C4J c4j = new C4J((int) this.A09);
            System.arraycopy(this.A0J.A0l(), 0, c4j.A0l(), 0, 8);
            this.A0D = c4j;
            this.A04 = 1;
        } else {
            A0E(interfaceC2995lN.A8f() - ((long) this.A00));
            this.A0D = null;
            this.A04 = 1;
        }
        return true;
    }

    private boolean A0L(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        long j10 = this.A09 - ((long) this.A00);
        long jA8f = interfaceC2995lN.A8f() + j10;
        boolean z10 = false;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC2995lN.readFully(c4j.A0l(), this.A00, (int) j10);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c4j);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C2966ki(this.A01, c4j));
            }
        } else if (j10 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC2995lN.AJJ((int) j10);
        } else {
            c1833Gt.A00 = interfaceC2995lN.A8f() + j10;
            z10 = true;
        }
        A0D(jA8f);
        return z10 && this.A04 != 2;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C2956kY()};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[][] A0N(com.facebook.ads.redexgen.core.C1867Ic[] r16) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2956kY.A0N(com.facebook.ads.redexgen.X.Ic[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        return A07(j10, -1);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2995lN interfaceC2995lN, C1833Gt c1833Gt) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC2995lN)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(interfaceC2995lN, c1833Gt)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A03(interfaceC2995lN, c1833Gt);
                case 3:
                    return A04(interfaceC2995lN, c1833Gt);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j10 != 0) {
            for (C1867Ic c1867Ic : this.A0G) {
                A0H(c1867Ic, j11);
                if (c1867Ic.A02 != null) {
                    c1867Ic.A02.A02();
                }
            }
            return;
        }
        int i10 = this.A04;
        String[] strArr = A0R;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0R;
        strArr2[3] = "BBO5nGzNDCjhdG";
        strArr2[7] = "Qq9RZt6cBQ724Z";
        if (i10 != 3) {
            A0A();
        } else {
            this.A0N.A08();
            this.A0P.clear();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2995lN interfaceC2995lN) throws IOException {
        return AbstractC1875Ik.A02(interfaceC2995lN, (this.A0I & 2) != 0);
    }
}
