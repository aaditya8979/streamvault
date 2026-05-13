package t7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import s7.a0;
import s7.v;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f85079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f85083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f85084f;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10, @Nullable String str) {
        this.f85079a = list;
        this.f85080b = i10;
        this.f85081c = i11;
        this.f85082d = i12;
        this.f85083e = f10;
        this.f85084f = str;
    }

    public static byte[] a(a0 a0Var) {
        int iJ = a0Var.J();
        int iE = a0Var.e();
        a0Var.Q(iJ);
        return s7.e.d(a0Var.d(), iE, iJ);
    }

    public static a b(a0 a0Var) throws ParserException {
        float f10;
        String strA;
        int i10;
        try {
            a0Var.Q(4);
            int iD = (a0Var.D() & 3) + 1;
            if (iD == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iD2 = a0Var.D() & 31;
            for (int i11 = 0; i11 < iD2; i11++) {
                arrayList.add(a(a0Var));
            }
            int iD3 = a0Var.D();
            for (int i12 = 0; i12 < iD3; i12++) {
                arrayList.add(a(a0Var));
            }
            int i13 = -1;
            if (iD2 > 0) {
                v.c cVarL = s7.v.l((byte[]) arrayList.get(0), iD, ((byte[]) arrayList.get(0)).length);
                int i14 = cVarL.f79553f;
                int i15 = cVarL.f79554g;
                float f11 = cVarL.f79555h;
                strA = s7.e.a(cVarL.f79548a, cVarL.f79549b, cVarL.f79550c);
                i13 = i14;
                i10 = i15;
                f10 = f11;
            } else {
                f10 = 1.0f;
                strA = null;
                i10 = -1;
            }
            return new a(arrayList, iD, i13, i10, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e10);
        }
    }
}
