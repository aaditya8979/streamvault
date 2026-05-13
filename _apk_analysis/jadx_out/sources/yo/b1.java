package yo;

import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes9.dex */
public class b1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f0 f97903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final char[] f97904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f97905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final i f97906h;

    public b1(@NotNull f0 f0Var, @NotNull char[] cArr) {
        tn.p.k(f0Var, "reader");
        tn.p.k(cArr, "buffer");
        this.f97903e = f0Var;
        this.f97904f = cArr;
        this.f97905g = 128;
        this.f97906h = new i(cArr);
        U(0);
    }

    @Override // yo.a
    @Nullable
    public String F(@NotNull String str, boolean z10) {
        tn.p.k(str, "keyToMatch");
        return null;
    }

    @Override // yo.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        this.f97896a = i10;
        w();
        if (this.f97896a == 0) {
            return D().length() == 0 ? -1 : 0;
        }
        return -1;
    }

    @Override // yo.a
    public int K() {
        int I;
        int i10 = this.f97896a;
        while (true) {
            I = I(i10);
            if (I != -1) {
                char cCharAt = D().charAt(I);
                if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                    break;
                }
                i10 = I + 1;
            } else {
                break;
            }
        }
        this.f97896a = I;
        return I;
    }

    @Override // yo.a
    @NotNull
    public String L(int i10, int i11) {
        return D().e(i10, i11);
    }

    @Override // yo.a
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public i D() {
        return this.f97906h;
    }

    public int T(char c10, int i10) {
        i iVarD = D();
        int length = iVarD.length();
        while (i10 < length) {
            if (iVarD.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void U(int i10) {
        char[] cArrB = D().b();
        if (i10 != 0) {
            int i11 = this.f97896a;
            cn.p.h(cArrB, cArrB, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (true) {
            if (i10 == length) {
                break;
            }
            int iA = this.f97903e.a(cArrB, i10, length - i10);
            if (iA == -1) {
                D().f(i10);
                this.f97905g = -1;
                break;
            }
            i10 += iA;
        }
        this.f97896a = 0;
    }

    public final void V() {
        p.f97972c.c(this.f97904f);
    }

    @Override // yo.a
    public void e(int i10, int i11) {
        StringBuilder sbC = C();
        sbC.append(D().b(), i10, i11 - i10);
        tn.p.j(sbC, "append(...)");
    }

    @Override // yo.a
    public boolean f() {
        w();
        int i10 = this.f97896a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f97896a = I;
                return false;
            }
            char cCharAt = D().charAt(I);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f97896a = I;
                return E(cCharAt);
            }
            i10 = I + 1;
        }
    }

    @Override // yo.a
    @NotNull
    public String j() {
        m('\"');
        int i10 = this.f97896a;
        int iT = T('\"', i10);
        if (iT != -1) {
            for (int i11 = i10; i11 < iT; i11++) {
                if (D().charAt(i11) == '\\') {
                    return r(D(), this.f97896a, i11);
                }
            }
            this.f97896a = iT + 1;
            return L(i10, iT);
        }
        int I = I(i10);
        if (I != -1) {
            return r(D(), this.f97896a, I);
        }
        String strC = b.c((byte) 1);
        int i12 = this.f97896a;
        int i13 = i12 - 1;
        a.z(this, "Expected " + strC + ", but had '" + ((i12 == D().length() || i13 < 0) ? "EOF" : String.valueOf(D().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // yo.a
    public byte k() {
        w();
        i iVarD = D();
        int i10 = this.f97896a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f97896a = I;
                return (byte) 10;
            }
            int i11 = I + 1;
            byte bA = b.a(iVarD.charAt(I));
            if (bA != 3) {
                this.f97896a = i11;
                return bA;
            }
            i10 = i11;
        }
    }

    @Override // yo.a
    public void m(char c10) {
        w();
        i iVarD = D();
        int i10 = this.f97896a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f97896a = I;
                Q(c10);
                return;
            }
            int i11 = I + 1;
            char cCharAt = iVarD.charAt(I);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f97896a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    Q(c10);
                }
            }
            i10 = i11;
        }
    }

    @Override // yo.a
    public void w() {
        int length = D().length() - this.f97896a;
        if (length > this.f97905g) {
            return;
        }
        U(length);
    }
}
