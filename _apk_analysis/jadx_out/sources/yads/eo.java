package yads;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eo implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f89330b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f89332d;

    public eo(boolean z10) {
        this.f89329a = z10;
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        if (this.f89330b.contains(r83Var)) {
            return;
        }
        this.f89330b.add(r83Var);
        this.f89331c++;
    }

    public final void b(u30 u30Var) {
        this.f89332d = u30Var;
        for (int i10 = 0; i10 < this.f89331c; i10++) {
            r83 r83Var = (r83) this.f89330b.get(i10);
            boolean z10 = this.f89329a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f88792n;
                if (z10 && (u30Var.f95530i & 8) != 8) {
                    if (dc0Var.f88804f == 0) {
                        ((f53) dc0Var.f88802d).getClass();
                        dc0Var.f88805g = SystemClock.elapsedRealtime();
                    }
                    dc0Var.f88804f++;
                }
            }
        }
    }

    public final void c(int i10) {
        u30 u30Var = this.f89332d;
        int i11 = ib3.f90737a;
        for (int i12 = 0; i12 < this.f89331c; i12++) {
            r83 r83Var = (r83) this.f89330b.get(i12);
            boolean z10 = this.f89329a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f88792n;
                if (z10 && (u30Var.f95530i & 8) != 8) {
                    dc0Var.f88806h += (long) i10;
                }
            }
        }
    }

    public final void d() {
        int i10;
        a13 a13Var;
        float f10;
        long j10;
        u30 u30Var = this.f89332d;
        int i11 = ib3.f90737a;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f89331c) {
            r83 r83Var = (r83) this.f89330b.get(i13);
            boolean z10 = this.f89329a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f88792n;
                if (!z10 || (u30Var.f95530i & 8) == 8) {
                    i10 = i13;
                } else {
                    if (dc0Var.f88804f <= 0) {
                        throw new IllegalStateException();
                    }
                    ((f53) dc0Var.f88802d).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i14 = (int) (jElapsedRealtime - dc0Var.f88805g);
                    dc0Var.f88808j += (long) i14;
                    long j11 = dc0Var.f88809k;
                    long j12 = dc0Var.f88806h;
                    dc0Var.f88809k = j11 + j12;
                    if (i14 > 0) {
                        float f11 = (j12 * 8000.0f) / i14;
                        b13 b13Var = dc0Var.f88801c;
                        int iSqrt = (int) Math.sqrt(j12);
                        if (b13Var.f87873d != 1) {
                            Collections.sort(b13Var.f87871b, b13.f87868h);
                            b13Var.f87873d = 1;
                        }
                        int i15 = b13Var.f87876g;
                        if (i15 > 0) {
                            a13[] a13VarArr = b13Var.f87872c;
                            int i16 = i15 - 1;
                            b13Var.f87876g = i16;
                            a13Var = a13VarArr[i16];
                        } else {
                            a13Var = new a13();
                        }
                        int i17 = b13Var.f87874e;
                        b13Var.f87874e = i17 + 1;
                        a13Var.f87547a = i17;
                        a13Var.f87548b = iSqrt;
                        a13Var.f87549c = f11;
                        b13Var.f87871b.add(a13Var);
                        b13Var.f87875f += iSqrt;
                        while (true) {
                            int i18 = b13Var.f87875f;
                            int i19 = b13Var.f87870a;
                            if (i18 <= i19) {
                                break;
                            }
                            int i20 = i18 - i19;
                            a13 a13Var2 = (a13) b13Var.f87871b.get(i12);
                            int i21 = a13Var2.f87548b;
                            if (i21 <= i20) {
                                b13Var.f87875f -= i21;
                                b13Var.f87871b.remove(i12);
                                int i22 = b13Var.f87876g;
                                if (i22 < 5) {
                                    a13[] a13VarArr2 = b13Var.f87872c;
                                    b13Var.f87876g = i22 + 1;
                                    a13VarArr2[i22] = a13Var2;
                                }
                            } else {
                                a13Var2.f87548b = i21 - i20;
                                b13Var.f87875f -= i20;
                            }
                        }
                        if (dc0Var.f88808j >= 2000 || dc0Var.f88809k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            b13 b13Var2 = dc0Var.f88801c;
                            if (b13Var2.f87873d != 0) {
                                Collections.sort(b13Var2.f87871b, b13.f87869i);
                                b13Var2.f87873d = i12;
                            }
                            float f12 = 0.5f * b13Var2.f87875f;
                            int i23 = i12;
                            int i24 = i23;
                            while (true) {
                                if (i23 < b13Var2.f87871b.size()) {
                                    a13 a13Var3 = (a13) b13Var2.f87871b.get(i23);
                                    i24 += a13Var3.f87548b;
                                    if (i24 >= f12) {
                                        f10 = a13Var3.f87549c;
                                        break;
                                    }
                                    i23++;
                                } else if (b13Var2.f87871b.isEmpty()) {
                                    f10 = Float.NaN;
                                } else {
                                    ArrayList arrayList = b13Var2.f87871b;
                                    f10 = ((a13) arrayList.get(arrayList.size() - 1)).f87549c;
                                }
                            }
                            dc0Var.f88810l = (long) f10;
                        }
                        long j13 = dc0Var.f88806h;
                        long j14 = dc0Var.f88810l;
                        if (i14 == 0 && j13 == 0 && j14 == dc0Var.f88811m) {
                            i10 = i13;
                            j10 = 0;
                        } else {
                            dc0Var.f88811m = j14;
                            i10 = i13;
                            j10 = 0;
                            dc0Var.f88800b.a(i14, j13, j14);
                        }
                        dc0Var.f88805g = jElapsedRealtime;
                        dc0Var.f88806h = j10;
                    } else {
                        i10 = i13;
                    }
                    dc0Var.f88804f--;
                }
            }
            i13 = i10 + 1;
            i12 = 0;
        }
        this.f89332d = null;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f89331c; i10++) {
            ((r83) this.f89330b.get(i10)).getClass();
        }
    }
}
