package t7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import s7.a0;
import s7.v;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f85109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f85113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f85114f;

    public f(List<byte[]> list, int i10, int i11, int i12, float f10, @Nullable String str) {
        this.f85109a = list;
        this.f85110b = i10;
        this.f85111c = i11;
        this.f85112d = i12;
        this.f85113e = f10;
        this.f85114f = str;
    }

    public static f a(a0 a0Var) throws ParserException {
        int i10;
        int i11;
        try {
            a0Var.Q(21);
            int iD = a0Var.D() & 3;
            int iD2 = a0Var.D();
            int iE = a0Var.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < iD2; i14++) {
                a0Var.Q(1);
                int iJ = a0Var.J();
                for (int i15 = 0; i15 < iJ; i15++) {
                    int iJ2 = a0Var.J();
                    i13 += iJ2 + 4;
                    a0Var.Q(iJ2);
                }
            }
            a0Var.P(iE);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String strC = null;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iD2) {
                int iD3 = a0Var.D() & 63;
                int iJ3 = a0Var.J();
                int i20 = i12;
                while (i20 < iJ3) {
                    int iJ4 = a0Var.J();
                    byte[] bArr2 = s7.v.f79531a;
                    int i21 = iD2;
                    System.arraycopy(bArr2, i12, bArr, i19, bArr2.length);
                    int length = i19 + bArr2.length;
                    System.arraycopy(a0Var.d(), a0Var.e(), bArr, length, iJ4);
                    if (iD3 == 33 && i20 == 0) {
                        v.a aVarH = s7.v.h(bArr, length, length + iJ4);
                        int i22 = aVarH.f79542h;
                        i17 = aVarH.f79543i;
                        f10 = aVarH.f79544j;
                        i10 = iD3;
                        i11 = iJ3;
                        i16 = i22;
                        strC = s7.e.c(aVarH.f79535a, aVarH.f79536b, aVarH.f79537c, aVarH.f79538d, aVarH.f79539e, aVarH.f79540f);
                    } else {
                        i10 = iD3;
                        i11 = iJ3;
                    }
                    i19 = length + iJ4;
                    a0Var.Q(iJ4);
                    i20++;
                    iD2 = i21;
                    iD3 = i10;
                    iJ3 = i11;
                    i12 = 0;
                }
                i18++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iD + 1, i16, i17, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
