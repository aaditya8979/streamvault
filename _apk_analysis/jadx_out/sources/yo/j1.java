package yo;

import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends h1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(@NotNull String str) {
        super(str);
        tn.p.k(str, "source");
    }

    @Override // yo.a
    public byte G() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f97896a = iK;
        return b.a(strD.charAt(iK));
    }

    @Override // yo.h1, yo.a
    public int K() {
        int i10;
        int iQ0 = this.f97896a;
        if (iQ0 == -1) {
            return iQ0;
        }
        String strD = D();
        while (iQ0 < strD.length()) {
            char cCharAt = strD.charAt(iQ0);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                if (cCharAt != '/' || (i10 = iQ0 + 1) >= strD.length()) {
                    break;
                }
                char cCharAt2 = strD.charAt(i10);
                if (cCharAt2 == '*') {
                    int iR0 = bo.d0.r0(strD, "*/", iQ0 + 2, false, 4, null);
                    if (iR0 == -1) {
                        this.f97896a = strD.length();
                        a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iQ0 = iR0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iQ0 = bo.d0.q0(strD, '\n', iQ0 + 2, false, 4, null);
                    if (iQ0 == -1) {
                        iQ0 = strD.length();
                    }
                }
            }
            iQ0++;
        }
        this.f97896a = iQ0;
        return iQ0;
    }

    @Override // yo.h1, yo.a
    public boolean f() {
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // yo.h1, yo.a
    public byte k() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f97896a = iK + 1;
        return b.a(strD.charAt(iK));
    }

    @Override // yo.h1, yo.a
    public void m(char c10) {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            this.f97896a = -1;
            Q(c10);
        }
        char cCharAt = strD.charAt(iK);
        this.f97896a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
