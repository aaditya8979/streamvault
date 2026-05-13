package yo;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(@NotNull f0 f0Var, @NotNull char[] cArr) {
        super(f0Var, cArr);
        tn.p.k(f0Var, "reader");
        tn.p.k(cArr, "buffer");
    }

    @Override // yo.a
    public byte G() {
        w();
        i iVarD = D();
        int iK = K();
        if (iK >= iVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f97896a = iK;
        return b.a(iVarD.charAt(iK));
    }

    @Override // yo.b1, yo.a
    public int K() {
        int I;
        int i10 = this.f97896a;
        while (true) {
            I = I(i10);
            if (I == -1) {
                break;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = I + 1;
            } else {
                if (cCharAt != '/' || I + 1 >= D().length()) {
                    break;
                }
                Pair<Integer, Boolean> pairW = W(I);
                int iIntValue = pairW.component1().intValue();
                if (!pairW.component2().booleanValue()) {
                    I = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.f97896a = I;
        return I;
    }

    public final Pair<Integer, Boolean> W(int i10) {
        int i11 = i10 + 2;
        char cCharAt = D().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return bn.h.a(Integer.valueOf(i10), Boolean.FALSE);
            }
            int I = i11;
            while (i10 != -1) {
                int iQ0 = bo.d0.q0(D(), '\n', I, false, 4, null);
                if (iQ0 != -1) {
                    return bn.h.a(Integer.valueOf(iQ0 + 1), Boolean.TRUE);
                }
                I = I(D().length());
                i10 = I;
            }
            return bn.h.a(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iX = i11;
        while (i10 != -1) {
            int iR0 = bo.d0.r0(D(), "*/", iX, false, 4, null);
            if (iR0 != -1) {
                return bn.h.a(Integer.valueOf(iR0 + 2), Boolean.TRUE);
            }
            if (D().charAt(D().length() - 1) == '*') {
                iX = X(D().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iX = I(D().length());
            }
            i10 = iX;
        }
        this.f97896a = D().length();
        a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int X(int i10) {
        if (D().length() - i10 > this.f97905g) {
            return i10;
        }
        this.f97896a = i10;
        w();
        if (this.f97896a == 0) {
            return D().length() == 0 ? -1 : 0;
        }
        return -1;
    }

    @Override // yo.b1, yo.a
    public boolean f() {
        w();
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // yo.b1, yo.a
    public byte k() {
        w();
        i iVarD = D();
        int iK = K();
        if (iK >= iVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f97896a = iK + 1;
        return b.a(iVarD.charAt(iK));
    }

    @Override // yo.b1, yo.a
    public void m(char c10) {
        w();
        i iVarD = D();
        int iK = K();
        if (iK >= iVarD.length() || iK == -1) {
            this.f97896a = -1;
            Q(c10);
        }
        char cCharAt = iVarD.charAt(iK);
        this.f97896a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
