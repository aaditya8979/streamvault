package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC3127nX;
import com.facebook.ads.redexgen.core.C3128nY;
import com.facebook.ads.redexgen.core.C5P;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3126nW<I extends C3128nY, O extends AbstractC3127nX, E extends C5P> implements C5O<I, O, E> {
    public static byte[] A0D;
    public static String[] A0E = {"cgd1TDaxcVMzff1lRtR2y3rhLtmh1J5v", "3mVGt02Eg", "GhemOJNhIn1LMAkty7qqi4u9sWB6uqsq", "Qo0Xi3kRKf", "h5mwzI1V10xDDagqRPLzWxrZN9rQy7u9", "7mnuUFNh1uUIhw2tv7exehIC7mU2Hitk", "5ikXrDS3I2SzCX52iEXUFKqtVJtvkjlK", "jW6s0CcND"};
    public int A00;
    public int A01;
    public int A02;
    public E A03;
    public I A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    static {
        A0S();
    }

    public AbstractC3126nW(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i10 = 0; i10 < this.A00; i10++) {
            ((I[]) this.A0B)[i10] = A0a();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i11 = 0; i11 < this.A01; i11++) {
            ((O[]) this.A0C)[i11] = A0c();
        }
        final String strA0O = A0O(0, 23, 82);
        this.A08 = new Thread(strA0O) { // from class: com.facebook.ads.redexgen.X.5T
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws Throwable {
                if (AbstractC2208Vl.A02(this)) {
                    return;
                }
                try {
                    this.A00.A0R();
                } catch (Throwable th2) {
                    AbstractC2208Vl.A00(th2, this);
                }
            }
        };
        this.A08.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final I A5j() throws C5P {
        I i10;
        I i11;
        synchronized (this.A07) {
            A0Q();
            C3M.A08(this.A04 == null);
            if (this.A00 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.A0B;
                int i12 = this.A00 - 1;
                this.A00 = i12;
                i10 = iArr[i12];
            }
            this.A04 = i10;
            i11 = this.A04;
        }
        return i11;
    }

    public static String A0O(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0P() {
        if (A0W()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.facebook.ads.redexgen.X.5P */
    private void A0Q() throws E, C5P {
        E e10 = this.A03;
        if (e10 != null) {
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (A0X());
    }

    public static void A0S() {
        A0D = new byte[]{-32, 19, 10, -21, 7, -4, 20, 0, 13, -43, -18, 4, 8, 11, 7, 0, -33, 0, -2, 10, -1, 0, 13};
    }

    private void A0T(I i10) {
        i10.A0A();
        I[] iArr = this.A0B;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        iArr[i11] = i10;
    }

    private void A0U(O o10) {
        o10.A0A();
        O[] oArr = this.A0C;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        oArr[i10] = o10;
    }

    private boolean A0W() {
        if (!this.A09.isEmpty()) {
            int i10 = this.A01;
            String[] strArr = A0E;
            if (strArr[6].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "9DwPxvkyUmdJywitv52WFgQf7iOLAqys";
            strArr2[2] = "WYGXgkStQ9kUI1rtTWhvxjquSY9kHuMe";
            if (i10 > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0X() throws InterruptedException {
        E e10;
        synchronized (this.A07) {
            while (!this.A06 && !A0W()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            O o10 = oArr[i10];
            boolean z10 = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A05()) {
                o10.A00(4);
            } else {
                if (iRemoveFirst.A04()) {
                    o10.A00(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.A06()) {
                    o10.A00(134217728);
                }
                try {
                    e10 = (E) A0Y(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) A0Z(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) A0Z(e12);
                }
                if (e10 != null) {
                    synchronized (this.A07) {
                        this.A03 = e10;
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    o10.A0B();
                } else if (o10.A04()) {
                    this.A02++;
                    o10.A0B();
                } else {
                    o10.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o10);
                }
                A0T(iRemoveFirst);
            }
            return true;
        }
    }

    public abstract E A0Y(I i10, O o10, boolean z10);

    public abstract E A0Z(Throwable th2);

    public abstract I A0a();

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0b, reason: merged with bridge method [inline-methods] */
    public final O A5l() throws C5P {
        synchronized (this.A07) {
            A0Q();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    public abstract O A0c();

    public final void A0d(int i10) {
        C3M.A08(this.A00 == this.A0B.length);
        for (I i11 : this.A0B) {
            i11.A0C(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0e, reason: merged with bridge method [inline-methods] */
    public final void AGZ(I i10) throws C5P {
        synchronized (this.A07) {
            A0Q();
            C3M.A07(i10 == this.A04);
            this.A09.addLast(i10);
            A0P();
            this.A04 = null;
        }
    }

    public void A0f(O o10) {
        synchronized (this.A07) {
            A0U(o10);
            A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public final void AGr() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A04 != null) {
                A0T(this.A04);
                this.A04 = null;
            }
            while (!this.A09.isEmpty()) {
                A0T(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                this.A0A.removeFirst().A0B();
            }
        }
    }
}
