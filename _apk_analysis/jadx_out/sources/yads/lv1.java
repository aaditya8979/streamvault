package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class lv1 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f92121m = new jb2();

    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        o20 o20VarA;
        jb2 jb2Var = this.f92121m;
        jb2Var.f91147a = bArr;
        jb2Var.f91149c = i10;
        jb2Var.f91148b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            jb2 jb2Var2 = this.f92121m;
            int i11 = jb2Var2.f91149c - jb2Var2.f91148b;
            if (i11 <= 0) {
                return new mv1(arrayList);
            }
            if (i11 < 8) {
                throw new t43("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iB = jb2Var2.b();
            if (this.f92121m.b() == 1987343459) {
                jb2 jb2Var3 = this.f92121m;
                int i12 = iB - 8;
                CharSequence charSequenceA = null;
                n20 n20VarA = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new t43("Incomplete vtt cue box header found.");
                    }
                    int iB2 = jb2Var3.b();
                    int iB3 = jb2Var3.b();
                    int i13 = iB2 - 8;
                    String strA = ib3.a(jb2Var3.f91147a, jb2Var3.f91148b, i13);
                    jb2Var3.e(jb2Var3.f91148b + i13);
                    i12 = (i12 - 8) - i13;
                    if (iB3 == 1937011815) {
                        po3 po3Var = new po3();
                        qo3.a(strA, po3Var);
                        n20VarA = po3Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = qo3.a(null, strA.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (n20VarA != null) {
                    n20VarA.f92694a = charSequenceA;
                    o20VarA = n20VarA.a();
                } else {
                    Pattern pattern = qo3.f94092a;
                    po3 po3Var2 = new po3();
                    po3Var2.f93688c = charSequenceA;
                    o20VarA = po3Var2.a().a();
                }
                arrayList.add(o20VarA);
            } else {
                jb2 jb2Var4 = this.f92121m;
                jb2Var4.e(jb2Var4.f91148b + (iB - 8));
            }
        }
    }
}
