package yo;

import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes3.dex */
public class h1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f97945e;

    public h1(@NotNull String str) {
        tn.p.k(str, "source");
        this.f97945e = str;
    }

    @Override // yo.a
    @Nullable
    public String F(@NotNull String str, boolean z10) {
        tn.p.k(str, "keyToMatch");
        int i10 = this.f97896a;
        try {
            if (k() == 6 && tn.p.f(H(z10), str)) {
                v();
                if (k() == 5) {
                    return H(z10);
                }
            }
            return null;
        } finally {
            this.f97896a = i10;
            v();
        }
    }

    @Override // yo.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        return -1;
    }

    @Override // yo.a
    public int K() {
        int i10 = this.f97896a;
        if (i10 == -1) {
            return i10;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f97896a = i10;
        return i10;
    }

    @Override // yo.a
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f97945e;
    }

    @Override // yo.a
    public boolean f() {
        int i10 = this.f97896a;
        if (i10 == -1) {
            return false;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f97896a = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.f97896a = i10;
        return false;
    }

    @Override // yo.a
    @NotNull
    public String j() {
        m('\"');
        int i10 = this.f97896a;
        int iQ0 = bo.d0.q0(D(), '\"', i10, false, 4, null);
        if (iQ0 != -1) {
            for (int i11 = i10; i11 < iQ0; i11++) {
                if (D().charAt(i11) == '\\') {
                    return r(D(), this.f97896a, i11);
                }
            }
            this.f97896a = iQ0 + 1;
            String strSubstring = D().substring(i10, iQ0);
            tn.p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        s();
        String strC = b.c((byte) 1);
        int i12 = this.f97896a;
        a.z(this, "Expected " + strC + ", but had '" + ((i12 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // yo.a
    public byte k() {
        String strD = D();
        int i10 = this.f97896a;
        while (i10 != -1 && i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f97896a = i11;
                return b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f97896a = strD.length();
        return (byte) 10;
    }

    @Override // yo.a
    public void m(char c10) {
        if (this.f97896a == -1) {
            Q(c10);
        }
        String strD = D();
        int i10 = this.f97896a;
        while (i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
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
        this.f97896a = -1;
        Q(c10);
    }
}
