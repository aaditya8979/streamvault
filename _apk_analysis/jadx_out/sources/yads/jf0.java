package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class jf0 implements k93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f91205b;

    public jf0() {
        this(p51.g());
    }

    public jf0(sm2 sm2Var) {
        this.f91204a = 0;
        this.f91205b = sm2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List a(j93 j93Var) {
        String str;
        int i10;
        if (a(32)) {
            return this.f91205b;
        }
        jb2 jb2Var = new jb2(j93Var.f91134c);
        ArrayList arrayList = this.f91205b;
        while (jb2Var.f91149c - jb2Var.f91148b > 0) {
            int iM = jb2Var.m();
            int iM2 = jb2Var.f91148b + jb2Var.m();
            if (iM == 134) {
                arrayList = new ArrayList();
                int iM3 = jb2Var.m() & 31;
                for (int i11 = 0; i11 < iM3; i11++) {
                    String strA = jb2Var.a(3, bu.f88145c);
                    int iM4 = jb2Var.m();
                    boolean z10 = (iM4 & 128) != 0;
                    if (z10) {
                        i10 = iM4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bM = (byte) jb2Var.m();
                    jb2Var.e(jb2Var.f91148b + 1);
                    List listSingletonList = null;
                    if (z10) {
                        listSingletonList = Collections.singletonList((bM & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    lx0 lx0Var = new lx0();
                    lx0Var.f92148k = str;
                    lx0Var.f92140c = strA;
                    lx0Var.C = i10;
                    lx0Var.f92150m = listSingletonList;
                    arrayList.add(new mx0(lx0Var));
                }
            }
            jb2Var.e(iM2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final m93 a(int i10, j93 j93Var) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new ic2(new nv1(j93Var.f91132a));
            }
            if (i10 == 21) {
                return new ic2(new x21());
            }
            if (i10 == 27) {
                if (a(4)) {
                    return null;
                }
                return new ic2(new l01(new nx2(a(j93Var)), a(1), a(8)));
            }
            if (i10 == 36) {
                return new ic2(new n01(new nx2(a(j93Var))));
            }
            if (i10 == 89) {
                return new ic2(new pl0(j93Var.f91133b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new ic2(new j0(j93Var.f91132a));
                }
                if (i10 == 257) {
                    return new sw2(new ub2("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new sw2(new ub2("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i10) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new ic2(new g0(j93Var.f91132a));
            }
            return new ic2(new wk0(j93Var.f91132a));
        }
        return new ic2(new f01(new gb3(a(j93Var))));
    }

    public final boolean a(int i10) {
        return (i10 & this.f91204a) != 0;
    }
}
