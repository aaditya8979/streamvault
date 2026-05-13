package s6;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import s6.i0;

/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j implements i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.m> f79225b;

    public j(int i10) {
        this(i10, ImmutableList.of());
    }

    public j(int i10, List<com.google.android.exoplayer2.m> list) {
        this.f79224a = i10;
        this.f79225b = list;
    }

    @Override // s6.i0.c
    @Nullable
    public i0 a(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f79216b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 == 27) {
                if (e(4)) {
                    return null;
                }
                return new w(new p(b(bVar), e(1), e(8)));
            }
            if (i10 == 36) {
                return new w(new q(b(bVar)));
            }
            if (i10 == 89) {
                return new w(new l(bVar.f79217c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new f(bVar.f79216b));
                }
                if (i10 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (e(16)) {
                        return null;
                    }
                    return new c0(new v("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (!e(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!e(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i10) {
                                case 130:
                                    if (!e(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new w(new c(bVar.f79216b));
            }
            return new w(new k(bVar.f79216b));
        }
        return new w(new n(c(bVar)));
    }

    public final d0 b(i0.b bVar) {
        return new d0(d(bVar));
    }

    public final k0 c(i0.b bVar) {
        return new k0(d(bVar));
    }

    @Override // s6.i0.c
    public SparseArray<i0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public final List<com.google.android.exoplayer2.m> d(i0.b bVar) {
        String str;
        int i10;
        if (e(32)) {
            return this.f79225b;
        }
        s7.a0 a0Var = new s7.a0(bVar.f79218d);
        List<com.google.android.exoplayer2.m> arrayList = this.f79225b;
        while (a0Var.a() > 0) {
            int iD = a0Var.D();
            int iE = a0Var.e() + a0Var.D();
            if (iD == 134) {
                arrayList = new ArrayList<>();
                int iD2 = a0Var.D() & 31;
                for (int i11 = 0; i11 < iD2; i11++) {
                    String strA = a0Var.A(3);
                    int iD3 = a0Var.D();
                    boolean z10 = (iD3 & 128) != 0;
                    if (z10) {
                        i10 = iD3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bD = (byte) a0Var.D();
                    a0Var.Q(1);
                    List<byte[]> listB = null;
                    if (z10) {
                        listB = s7.e.b((bD & 64) != 0);
                    }
                    arrayList.add(new m.b().e0(str).V(strA).F(i10).T(listB).E());
                }
            }
            a0Var.P(iE);
        }
        return arrayList;
    }

    public final boolean e(int i10) {
        return (i10 & this.f79224a) != 0;
    }
}
