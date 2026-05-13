package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9V extends AbstractC3211ox implements InterfaceC3120nQ {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C3212oy A06;
    public C3206or A07;
    public C3206or A08;
    public C15505g A09;
    public C15505g A0A;
    public CL A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C9X A0E;
    public final SurfaceHolderCallbackC3112nI A0F;
    public final InterfaceC3109nF A0G;
    public final CopyOnWriteArraySet<C8D> A0H;
    public final CopyOnWriteArraySet<InterfaceC14842s> A0I;
    public final CopyOnWriteArraySet<B3> A0J;
    public final CopyOnWriteArraySet<InterfaceC1802Fo> A0K;
    public final CopyOnWriteArraySet<InterfaceC3111nH> A0L;
    public final InterfaceC3116nM[] A0M;

    static {
        A0E();
    }

    public C9V(Context context, C7H c7h, EK ek2, C6S c6s, EU eu, C9U c9u, InterfaceC2851ip<C3T, InterfaceC3109nF> interfaceC2851ip) {
        this(context, c7h, ek2, c6s, eu, c9u, interfaceC2851ip, C3T.A00);
    }

    public C9V(Context context, C7H c7h, EK ek2, C6S c6s, EU eu, C9U c9u, InterfaceC2851ip<C3T, InterfaceC3109nF> interfaceC2851ip, C3T c3t) {
        this.A0F = new SurfaceHolderCallbackC3112nI(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = c7h.A5Q(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, c9u);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C3212oy.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, ek2, c6s, eu, c3t);
        this.A0G = interfaceC2851ip.A43(c3t);
        this.A0G.AIv(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    @Deprecated
    public C9V(C7H c7h, EK ek2, C6S c6s, EU eu, C9U c9u) {
        this(null, c7h, ek2, c6s, eu, c9u, new InterfaceC2851ip() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.facebook.ads.redexgen.core.InterfaceC2851ip
            public final Object A43(Object obj) {
                return new InterfaceC3109nF((C3T) obj) { // from class: com.facebook.ads.redexgen.X.9O
                    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
                    public InterfaceC14912z A00;
                    public InterfaceC15133v A01;
                    public AnonymousClass41<C7W> A02;
                    public boolean A03;
                    public final C3T A07;
                    public final C3177oN A05 = new C3177oN();
                    public final C3175oL A06 = new C3175oL();
                    public final C7Y A08 = new C7Y(this.A05);
                    public final SparseArray<C7U> A04 = new SparseArray<>();

                    {
                        this.A07 = (C3T) C3M.A01(c3t);
                        this.A02 = new AnonymousClass41<>(AbstractC15184a.A0d(), c3t, new InterfaceC15173z() { // from class: com.facebook.ads.redexgen.X.nB
                        });
                    }

                    private final C7U A00() {
                        return A04(this.A08.A06());
                    }

                    private C7U A01(int i10, C3053mL c3053mL) {
                        C3M.A01(this.A00);
                        if (c3053mL != null) {
                            return this.A08.A05(c3053mL) != null ? A04(c3053mL) : A03(Timeline.A02, i10, c3053mL);
                        }
                        Timeline timelineA7Y = this.A00.A7Y();
                        if (!(i10 < timelineA7Y.A07())) {
                            timelineA7Y = Timeline.A02;
                        }
                        return A03(timelineA7Y, i10, null);
                    }

                    private C7U A02(C3192od c3192od) {
                        if (c3192od instanceof C9Y) {
                            C9Y c9y = (C9Y) c3192od;
                            if (c9y.A05 != null) {
                                return A04(new C3053mL(c9y.A05));
                            }
                        }
                        return A00();
                    }

                    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.7U] */
                    @RequiresNonNull({"player"})
                    private final C7U A03(Timeline timeline, int i10, C3053mL c3053mL) {
                        C3053mL c3053mL2 = c3053mL;
                        if (timeline.A0N()) {
                            c3053mL2 = null;
                        }
                        long jA6B = this.A07.A6B();
                        boolean z10 = timeline.equals(this.A00.A7Y()) && i10 == this.A00.A7T();
                        if (c3053mL2 != null && c3053mL2.A00()) {
                            if (z10 && this.A00.A7Q() == c3053mL2.A00 && this.A00.A7R() == c3053mL2.A01) {
                                jA04 = this.A00.A7W();
                            }
                        } else if (z10) {
                            jA04 = this.A00.A7L();
                            String[] strArr = A09;
                            if (strArr[3].length() != strArr[1].length()) {
                                throw new RuntimeException();
                            }
                            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
                        } else {
                            jA04 = timeline.A0N() ? 0L : timeline.A0K(i10, this.A06).A04();
                            String[] strArr2 = A09;
                            if (strArr2[3].length() == strArr2[1].length()) {
                                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
                            }
                        }
                        return new Object(jA6B, timeline, i10, c3053mL2, jA04, this.A00.A7Y(), this.A00.A7T(), this.A08.A06(), this.A00.A7W(), this.A00.A9B()) { // from class: com.facebook.ads.redexgen.X.7U
                            public final int A00;
                            public final int A01;
                            public final long A02;
                            public final long A03;
                            public final long A04;
                            public final long A05;
                            public final Timeline A06;
                            public final Timeline A07;
                            public final C3053mL A08;
                            public final C3053mL A09;

                            {
                                this.A04 = jA6B;
                                this.A07 = timeline;
                                this.A01 = i10;
                                this.A09 = c3053mL2;
                                this.A03 = jA04;
                                this.A06 = timeline;
                                this.A00 = i;
                                this.A08 = c3053mL;
                                this.A02 = j;
                                this.A05 = j;
                            }

                            public final boolean equals(Object obj2) {
                                if (this == obj2) {
                                    return true;
                                }
                                if (obj2 == null || getClass() != obj2.getClass()) {
                                    return false;
                                }
                                C7U c7u = (C7U) obj2;
                                return this.A04 == c7u.A04 && this.A01 == c7u.A01 && this.A03 == c7u.A03 && this.A00 == c7u.A00 && this.A02 == c7u.A02 && this.A05 == c7u.A05 && BX.A01(this.A07, c7u.A07) && BX.A01(this.A09, c7u.A09) && BX.A01(this.A06, c7u.A06) && BX.A01(this.A08, c7u.A08);
                            }

                            public final int hashCode() {
                                return BX.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
                            }
                        };
                    }

                    private C7U A04(C3053mL c3053mL) {
                        C3M.A01(this.A00);
                        Timeline timelineA05 = c3053mL == null ? null : this.A08.A05(c3053mL);
                        if (c3053mL != null && timelineA05 != null) {
                            return A03(timelineA05, timelineA05.A0J(c3053mL.A04, this.A05).A00, c3053mL);
                        }
                        int iA7T = this.A00.A7T();
                        Timeline timelineA7Y = this.A00.A7Y();
                        if (!(iA7T < timelineA7Y.A07())) {
                            timelineA7Y = Timeline.A02;
                        }
                        return A03(timelineA7Y, iA7T, null);
                    }

                    private final void A05(C7U c7u, int i10, InterfaceC15163y<C7W> interfaceC15163y) {
                        this.A04.put(i10, c7u);
                        this.A02.A0A(i10, interfaceC15163y);
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC3109nF
                    public final void AC5() {
                        if (this.A03) {
                            return;
                        }
                        final C7U c7uA00 = A00();
                        this.A03 = true;
                        A05(c7uA00, -1, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n9
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void ACv(final C3155o0 c3155o0) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 27, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n7
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void ACw(final List<C3157o2> list) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 27, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.mz
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void AD6(int i10, C3053mL c3053mL, final CG cg2) {
                        final C7U c7uA01 = A01(i10, c3053mL);
                        A05(c7uA01, 1004, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.nC
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void ADw(int i10, C3053mL c3053mL, final CE ce2, final CG cg2) {
                        final C7U c7uA01 = A01(i10, c3053mL);
                        A05(c7uA01, 1002, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n8
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void ADy(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i10, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C3053mL c3053mL, final CE ce2, final CG cg2, Object obj2, Object obj3) {
                        final C7U c7uA01 = A01(i10, c3053mL);
                        A05(c7uA01, 1001, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n1
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void AE1(int i10, C3053mL c3053mL, final CE ce2, final CG cg2, final IOException iOException, final boolean z10) {
                        final C7U c7uA01 = A01(i10, c3053mL);
                        A05(c7uA01, 1003, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.nD
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AEb(final C3190ob c3190ob) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 12, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n6
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AEd(final C3192od c3192od) {
                        final C7U c7uA02 = A02(c3192od);
                        A05(c7uA02, 10, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.nA
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AEf(final boolean z10, final int i10) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, -1, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n5
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AFB() {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, -1, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n0
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AFQ(Timeline timeline, final int i10) {
                        this.A08.A07((InterfaceC14912z) C3M.A01(this.A00));
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 0, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n3
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC14842s
                    public final void AFU(final C3161o6 c3161o6) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 2, new InterfaceC15163y() { // from class: com.facebook.ads.redexgen.X.n2
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC3109nF
                    public final void AIv(final InterfaceC14912z interfaceC14912z, Looper looper) {
                        C3M.A08(this.A00 == null || this.A08.A03.isEmpty());
                        this.A00 = (InterfaceC14912z) C3M.A01(interfaceC14912z);
                        this.A01 = this.A07.A5H(looper, null);
                        this.A02 = this.A02.A07(looper, new InterfaceC15173z() { // from class: com.facebook.ads.redexgen.X.n4
                        });
                    }
                };
            }
        });
    }

    private final C9X A06(InterfaceC3116nM[] interfaceC3116nMArr, EK ek2, C6S c6s, EU eu, C3T c3t) {
        return new C9X(interfaceC3116nMArr, ek2, c6s, eu, c3t);
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, 124));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, 12, 46, 43, 31, 26, 28, 30, 13, 30, 49, 45, 46, 43, 30, 5, 34, 44, 45, 30, 39, 30, 43, ExifInterface.MARKER_EOI, 26, 37, 43, 30, 26, 29, 50, ExifInterface.MARKER_EOI, 46, 39, 44, 30, 45, ExifInterface.MARKER_EOI, 40, 43, ExifInterface.MARKER_EOI, 43, 30, 41, 37, 26, 28, 30, 29, -25};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3116nM interfaceC3116nM : this.A0M) {
            if (interfaceC3116nM.A9F() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC3116nM).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass71) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3211ox
    public final void A0H(int i10, long j10) {
        this.A0G.AC5();
        this.A0E.A0H(i10, j10);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C3206or A0J() {
        return this.A07;
    }

    public final C3206or A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f10) {
        float fA00 = AbstractC15184a.A00(f10, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC3116nM interfaceC3116nM : this.A0M) {
            if (interfaceC3116nM.A9F() == 1) {
                this.A0E.A0L(interfaceC3116nM).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(InterfaceC14842s interfaceC14842s) {
        this.A0E.A0O(interfaceC14842s);
        this.A0I.add(interfaceC14842s);
    }

    public final void A0P(InterfaceC3111nH interfaceC3111nH) {
        this.A0L.add(interfaceC3111nH);
    }

    public final void A0Q(CL cl2) {
        A0R(cl2, true, true);
    }

    public final void A0R(CL cl2, boolean z10, boolean z11) {
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
        }
        this.A0B = cl2;
        cl2.A3r(this.A0D, this.A0G);
        this.A0E.A0P(cl2, z10, z11);
    }

    public final void A0S(boolean z10) {
        this.A0E.A0Q(z10);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final long A6z() {
        return this.A0E.A6z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final long A7L() {
        return this.A0E.A7L();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final int A7Q() {
        return this.A0E.A7Q();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final int A7R() {
        return this.A0E.A7R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final int A7T() {
        return this.A0E.A7T();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final int A7U() {
        return this.A0E.A7U();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final long A7W() {
        return this.A0E.A7W();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final Timeline A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final long A7k() {
        return this.A0E.A7k();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final long A9B() {
        return this.A0E.A9B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final boolean AAU() {
        return this.A0E.AAU();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14912z
    public final void AJV(boolean z10) {
        this.A0E.AJV(z10);
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
            this.A0B = null;
            if (z10) {
                this.A0B = null;
            }
        }
    }
}
