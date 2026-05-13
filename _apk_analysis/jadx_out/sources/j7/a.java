package j7;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g7.b;
import g7.h;
import g7.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f72336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f72337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0851a f72338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Inflater f72339r;

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsDecoder.java */
    public static final class C0851a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f72340a = new a0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f72341b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f72342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f72343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f72347h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f72348i;

        @Nullable
        public g7.b d() {
            int iD;
            if (this.f72343d == 0 || this.f72344e == 0 || this.f72347h == 0 || this.f72348i == 0 || this.f72340a.f() == 0 || this.f72340a.e() != this.f72340a.f() || !this.f72342c) {
                return null;
            }
            this.f72340a.P(0);
            int i10 = this.f72347h * this.f72348i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iD2 = this.f72340a.D();
                if (iD2 != 0) {
                    iD = i11 + 1;
                    iArr[i11] = this.f72341b[iD2];
                } else {
                    int iD3 = this.f72340a.D();
                    if (iD3 != 0) {
                        iD = ((iD3 & 64) == 0 ? iD3 & 63 : ((iD3 & 63) << 8) | this.f72340a.D()) + i11;
                        Arrays.fill(iArr, i11, iD, (iD3 & 128) == 0 ? 0 : this.f72341b[this.f72340a.D()]);
                    }
                }
                i11 = iD;
            }
            return new b.C0768b().f(Bitmap.createBitmap(iArr, this.f72347h, this.f72348i, Bitmap.Config.ARGB_8888)).k(this.f72345f / this.f72343d).l(0).h(this.f72346g / this.f72344e, 0).i(0).n(this.f72347h / this.f72343d).g(this.f72348i / this.f72344e).a();
        }

        public final void e(a0 a0Var, int i10) {
            int iG;
            if (i10 < 4) {
                return;
            }
            a0Var.Q(3);
            int i11 = i10 - 4;
            if ((a0Var.D() & 128) != 0) {
                if (i11 < 7 || (iG = a0Var.G()) < 4) {
                    return;
                }
                this.f72347h = a0Var.J();
                this.f72348i = a0Var.J();
                this.f72340a.L(iG - 4);
                i11 -= 7;
            }
            int iE = this.f72340a.e();
            int iF = this.f72340a.f();
            if (iE >= iF || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iF - iE);
            a0Var.j(this.f72340a.d(), iE, iMin);
            this.f72340a.P(iE + iMin);
        }

        public final void f(a0 a0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f72343d = a0Var.J();
            this.f72344e = a0Var.J();
            a0Var.Q(11);
            this.f72345f = a0Var.J();
            this.f72346g = a0Var.J();
        }

        public final void g(a0 a0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            a0Var.Q(2);
            Arrays.fill(this.f72341b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int iD = a0Var.D();
                int iD2 = a0Var.D();
                int iD3 = a0Var.D();
                int iD4 = a0Var.D();
                int iD5 = a0Var.D();
                double d10 = iD2;
                double d11 = iD3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = iD4 - 128;
                this.f72341b[iD] = m0.p((int) (d10 + (d12 * 1.772d)), 0, 255) | (m0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iD5 << 24) | (m0.p(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f72342c = true;
        }

        public void h() {
            this.f72343d = 0;
            this.f72344e = 0;
            this.f72345f = 0;
            this.f72346g = 0;
            this.f72347h = 0;
            this.f72348i = 0;
            this.f72340a.L(0);
            this.f72342c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f72336o = new a0();
        this.f72337p = new a0();
        this.f72338q = new C0851a();
    }

    @Nullable
    public static g7.b y(a0 a0Var, C0851a c0851a) {
        int iF = a0Var.f();
        int iD = a0Var.D();
        int iJ = a0Var.J();
        int iE = a0Var.e() + iJ;
        g7.b bVarD = null;
        if (iE > iF) {
            a0Var.P(iF);
            return null;
        }
        if (iD != 128) {
            switch (iD) {
                case 20:
                    c0851a.g(a0Var, iJ);
                    break;
                case 21:
                    c0851a.e(a0Var, iJ);
                    break;
                case 22:
                    c0851a.f(a0Var, iJ);
                    break;
            }
        } else {
            bVarD = c0851a.d();
            c0851a.h();
        }
        a0Var.P(iE);
        return bVarD;
    }

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f72336o.N(bArr, i10);
        x(this.f72336o);
        this.f72338q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f72336o.a() >= 3) {
            g7.b bVarY = y(this.f72336o, this.f72338q);
            if (bVarY != null) {
                arrayList.add(bVarY);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    public final void x(a0 a0Var) {
        if (a0Var.a() <= 0 || a0Var.h() != 120) {
            return;
        }
        if (this.f72339r == null) {
            this.f72339r = new Inflater();
        }
        if (m0.l0(a0Var, this.f72337p, this.f72339r)) {
            a0Var.N(this.f72337p.d(), this.f72337p.f());
        }
    }
}
