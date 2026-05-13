package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import s6.i0;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f79416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.z f79417b = new s7.z(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79418c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s7.j0 f79420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79427l;

    public w(m mVar) {
        this.f79416a = mVar;
    }

    @Override // s6.i0
    public final void a(s7.a0 a0Var, int i10) throws ParserException {
        s7.a.i(this.f79420e);
        if ((i10 & 1) != 0) {
            int i11 = this.f79418c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    s7.q.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f79425j != -1) {
                        s7.q.i("PesReader", "Unexpected start indicator: expected " + this.f79425j + " more bytes");
                    }
                    this.f79416a.packetFinished();
                }
            }
            f(1);
        }
        while (a0Var.a() > 0) {
            int i12 = this.f79418c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (c(a0Var, this.f79417b.f79571a, Math.min(10, this.f79424i)) && c(a0Var, null, this.f79424i)) {
                            e();
                            i10 |= this.f79426k ? 4 : 0;
                            this.f79416a.packetStarted(this.f79427l, i10);
                            f(3);
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = a0Var.a();
                        int i13 = this.f79425j;
                        int i14 = i13 != -1 ? iA - i13 : 0;
                        if (i14 > 0) {
                            iA -= i14;
                            a0Var.O(a0Var.e() + iA);
                        }
                        this.f79416a.a(a0Var);
                        int i15 = this.f79425j;
                        if (i15 != -1) {
                            int i16 = i15 - iA;
                            this.f79425j = i16;
                            if (i16 == 0) {
                                this.f79416a.packetFinished();
                                f(1);
                            }
                        }
                    }
                } else if (c(a0Var, this.f79417b.f79571a, 9)) {
                    f(d() ? 2 : 0);
                }
            } else {
                a0Var.Q(a0Var.a());
            }
        }
    }

    @Override // s6.i0
    public void b(s7.j0 j0Var, i6.m mVar, i0.d dVar) {
        this.f79420e = j0Var;
        this.f79416a.b(mVar, dVar);
    }

    public final boolean c(s7.a0 a0Var, @Nullable byte[] bArr, int i10) {
        int iMin = Math.min(a0Var.a(), i10 - this.f79419d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.Q(iMin);
        } else {
            a0Var.j(bArr, this.f79419d, iMin);
        }
        int i11 = this.f79419d + iMin;
        this.f79419d = i11;
        return i11 == i10;
    }

    public final boolean d() {
        this.f79417b.p(0);
        int iH = this.f79417b.h(24);
        if (iH != 1) {
            s7.q.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f79425j = -1;
            return false;
        }
        this.f79417b.r(8);
        int iH2 = this.f79417b.h(16);
        this.f79417b.r(5);
        this.f79426k = this.f79417b.g();
        this.f79417b.r(2);
        this.f79421f = this.f79417b.g();
        this.f79422g = this.f79417b.g();
        this.f79417b.r(6);
        int iH3 = this.f79417b.h(8);
        this.f79424i = iH3;
        if (iH2 == 0) {
            this.f79425j = -1;
        } else {
            int i10 = ((iH2 + 6) - 9) - iH3;
            this.f79425j = i10;
            if (i10 < 0) {
                s7.q.i("PesReader", "Found negative packet payload size: " + this.f79425j);
                this.f79425j = -1;
            }
        }
        return true;
    }

    public final void e() {
        this.f79417b.p(0);
        this.f79427l = -9223372036854775807L;
        if (this.f79421f) {
            this.f79417b.r(4);
            long jH = ((long) this.f79417b.h(3)) << 30;
            this.f79417b.r(1);
            long jH2 = jH | ((long) (this.f79417b.h(15) << 15));
            this.f79417b.r(1);
            long jH3 = jH2 | ((long) this.f79417b.h(15));
            this.f79417b.r(1);
            if (!this.f79423h && this.f79422g) {
                this.f79417b.r(4);
                long jH4 = ((long) this.f79417b.h(3)) << 30;
                this.f79417b.r(1);
                long jH5 = jH4 | ((long) (this.f79417b.h(15) << 15));
                this.f79417b.r(1);
                long jH6 = jH5 | ((long) this.f79417b.h(15));
                this.f79417b.r(1);
                this.f79420e.b(jH6);
                this.f79423h = true;
            }
            this.f79427l = this.f79420e.b(jH3);
        }
    }

    public final void f(int i10) {
        this.f79418c = i10;
        this.f79419d = 0;
    }

    @Override // s6.i0
    public final void seek() {
        this.f79418c = 0;
        this.f79419d = 0;
        this.f79423h = false;
        this.f79416a.seek();
    }
}
