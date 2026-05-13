package q5;

import a6.k0;
import a6.t;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import n5.c;
import n5.e;

/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f77815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f77816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0932a f77817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Inflater f77818r;

    /* JADX INFO: renamed from: q5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsDecoder.java */
    public static final class C0932a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f77819a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f77820b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f77821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f77822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f77823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f77824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f77825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f77826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f77827i;

        @Nullable
        public n5.b d() {
            int iY;
            if (this.f77822d == 0 || this.f77823e == 0 || this.f77826h == 0 || this.f77827i == 0 || this.f77819a.d() == 0 || this.f77819a.c() != this.f77819a.d() || !this.f77821c) {
                return null;
            }
            this.f77819a.L(0);
            int i10 = this.f77826h * this.f77827i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iY2 = this.f77819a.y();
                if (iY2 != 0) {
                    iY = i11 + 1;
                    iArr[i11] = this.f77820b[iY2];
                } else {
                    int iY3 = this.f77819a.y();
                    if (iY3 != 0) {
                        iY = ((iY3 & 64) == 0 ? iY3 & 63 : ((iY3 & 63) << 8) | this.f77819a.y()) + i11;
                        Arrays.fill(iArr, i11, iY, (iY3 & 128) == 0 ? 0 : this.f77820b[this.f77819a.y()]);
                    }
                }
                i11 = iY;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f77826h, this.f77827i, Bitmap.Config.ARGB_8888);
            float f10 = this.f77824f;
            int i12 = this.f77822d;
            float f11 = f10 / i12;
            float f12 = this.f77825g;
            int i13 = this.f77823e;
            return new n5.b(bitmapCreateBitmap, f11, 0, f12 / i13, 0, this.f77826h / i12, this.f77827i / i13);
        }

        public final void e(t tVar, int i10) {
            int iB;
            if (i10 < 4) {
                return;
            }
            tVar.M(3);
            int i11 = i10 - 4;
            if ((tVar.y() & 128) != 0) {
                if (i11 < 7 || (iB = tVar.B()) < 4) {
                    return;
                }
                this.f77826h = tVar.E();
                this.f77827i = tVar.E();
                this.f77819a.H(iB - 4);
                i11 -= 7;
            }
            int iC = this.f77819a.c();
            int iD = this.f77819a.d();
            if (iC >= iD || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iD - iC);
            tVar.h(this.f77819a.f3620a, iC, iMin);
            this.f77819a.L(iC + iMin);
        }

        public final void f(t tVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f77822d = tVar.E();
            this.f77823e = tVar.E();
            tVar.M(11);
            this.f77824f = tVar.E();
            this.f77825g = tVar.E();
        }

        public final void g(t tVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            tVar.M(2);
            Arrays.fill(this.f77820b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int iY = tVar.y();
                int iY2 = tVar.y();
                int iY3 = tVar.y();
                int iY4 = tVar.y();
                int iY5 = tVar.y();
                double d10 = iY2;
                double d11 = iY3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = iY4 - 128;
                this.f77820b[iY] = k0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (k0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iY5 << 24) | (k0.q(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f77821c = true;
        }

        public void h() {
            this.f77822d = 0;
            this.f77823e = 0;
            this.f77824f = 0;
            this.f77825g = 0;
            this.f77826h = 0;
            this.f77827i = 0;
            this.f77819a.H(0);
            this.f77821c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f77815o = new t();
        this.f77816p = new t();
        this.f77817q = new C0932a();
    }

    @Nullable
    public static n5.b y(t tVar, C0932a c0932a) {
        int iD = tVar.d();
        int iY = tVar.y();
        int iE = tVar.E();
        int iC = tVar.c() + iE;
        n5.b bVarD = null;
        if (iC > iD) {
            tVar.L(iD);
            return null;
        }
        if (iY != 128) {
            switch (iY) {
                case 20:
                    c0932a.g(tVar, iE);
                    break;
                case 21:
                    c0932a.e(tVar, iE);
                    break;
                case 22:
                    c0932a.f(tVar, iE);
                    break;
            }
        } else {
            bVarD = c0932a.d();
            c0932a.h();
        }
        tVar.L(iC);
        return bVarD;
    }

    @Override // n5.c
    public e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f77815o.J(bArr, i10);
        x(this.f77815o);
        this.f77817q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f77815o.a() >= 3) {
            n5.b bVarY = y(this.f77815o, this.f77817q);
            if (bVarY != null) {
                arrayList.add(bVarY);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    public final void x(t tVar) {
        if (tVar.a() <= 0 || tVar.f() != 120) {
            return;
        }
        if (this.f77818r == null) {
            this.f77818r = new Inflater();
        }
        if (k0.d0(tVar, this.f77816p, this.f77818r)) {
            t tVar2 = this.f77816p;
            tVar.J(tVar2.f3620a, tVar2.d());
        }
    }
}
