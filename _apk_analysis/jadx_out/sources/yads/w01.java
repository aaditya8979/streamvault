package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f96246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96247d;

    public w01(List list, int i10, float f10, String str) {
        this.f96244a = list;
        this.f96245b = i10;
        this.f96246c = f10;
        this.f96247d = str;
    }

    public static w01 a(jb2 jb2Var) throws ob2 {
        int i10;
        try {
            jb2Var.e(jb2Var.f91148b + 21);
            int iM = jb2Var.m() & 3;
            int iM2 = jb2Var.m();
            int i11 = jb2Var.f91148b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < iM2; i14++) {
                jb2Var.e(jb2Var.f91148b + 1);
                int iR = jb2Var.r();
                for (int i15 = 0; i15 < iR; i15++) {
                    int iR2 = jb2Var.r();
                    i13 += iR2 + 4;
                    jb2Var.e(jb2Var.f91148b + iR2);
                }
            }
            jb2Var.e(i11);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String strA = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < iM2) {
                int iM3 = jb2Var.m() & 127;
                int iR3 = jb2Var.r();
                int i18 = i12;
                while (i18 < iR3) {
                    int iR4 = jb2Var.r();
                    System.arraycopy(dy1.f89024a, i12, bArr, i17, 4);
                    int i19 = i17 + 4;
                    System.arraycopy(jb2Var.f91147a, jb2Var.f91148b, bArr, i19, iR4);
                    if (iM3 == 33 && i18 == 0) {
                        ay1 ay1VarA = dy1.a(bArr, i19, i19 + iR4);
                        float f11 = ay1VarA.f87842g;
                        i10 = iM2;
                        strA = jx.a(ay1VarA.f87836a, ay1VarA.f87837b, ay1VarA.f87838c, ay1VarA.f87839d, ay1VarA.f87840e, ay1VarA.f87841f);
                        f10 = f11;
                    } else {
                        i10 = iM2;
                    }
                    i17 = i19 + iR4;
                    jb2Var.e(jb2Var.f91148b + iR4);
                    i18++;
                    iM2 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            return new w01(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ob2("Error parsing HEVC config", e10, true, 1);
        }
    }
}
