package yo;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97896a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f97898c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n0 f97897b = new n0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public StringBuilder f97899d = new StringBuilder();

    public static /* synthetic */ boolean P(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.O(z10);
    }

    public static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void z(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f97896a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return aVar.y(str, i10, str2);
    }

    public final void A(@NotNull String str) {
        tn.p.k(str, "key");
        int iY0 = bo.d0.y0(L(0, this.f97896a), str, 0, false, 6, null);
        throw new JsonDecodingException("Encountered an unknown key '" + str + "' at offset " + iY0 + " at path: " + this.f97897b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) j0.i(D(), iY0)));
    }

    public final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c10 = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c10 = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                z(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (cCharAt - c10) + 10;
    }

    @NotNull
    public final StringBuilder C() {
        return this.f97899d;
    }

    @NotNull
    public abstract CharSequence D();

    public final boolean E(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    @Nullable
    public abstract String F(@NotNull String str, boolean z10);

    public byte G() {
        CharSequence charSequenceD = D();
        int i10 = this.f97896a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f97896a = I;
                return (byte) 10;
            }
            char cCharAt = charSequenceD.charAt(I);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f97896a = I;
                return b.a(cCharAt);
            }
            i10 = I + 1;
        }
    }

    @Nullable
    public final String H(boolean z10) {
        String strQ;
        byte bG = G();
        if (z10) {
            if (bG != 1 && bG != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bG != 1) {
                return null;
            }
            strQ = q();
        }
        this.f97898c = strQ;
        return strQ;
    }

    public abstract int I(int i10);

    public final void J(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bG = G();
        if (bG != 8 && bG != 6) {
            s();
            return;
        }
        while (true) {
            byte bG2 = G();
            if (bG2 != 1) {
                if (bG2 == 8 || bG2 == 6) {
                    arrayList.add(Byte.valueOf(bG2));
                } else if (bG2 == 9) {
                    if (((Number) cn.f0.F0(arrayList)).byteValue() != 8) {
                        throw j0.f(this.f97896a, "found ] instead of } at path: " + this.f97897b, D());
                    }
                    cn.b0.R(arrayList);
                } else if (bG2 == 7) {
                    if (((Number) cn.f0.F0(arrayList)).byteValue() != 6) {
                        throw j0.f(this.f97896a, "found } instead of ] at path: " + this.f97897b, D());
                    }
                    cn.b0.R(arrayList);
                } else if (bG2 == 10) {
                    z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                j();
            }
        }
    }

    public abstract int K();

    @NotNull
    public String L(int i10, int i11) {
        return D().subSequence(i10, i11).toString();
    }

    public final String M() {
        String str = this.f97898c;
        tn.p.h(str);
        this.f97898c = null;
        return str;
    }

    public final boolean N() {
        int iK = K();
        CharSequence charSequenceD = D();
        if (iK >= charSequenceD.length() || iK == -1 || charSequenceD.charAt(iK) != ',') {
            return false;
        }
        this.f97896a++;
        return true;
    }

    public final boolean O(boolean z10) {
        int I = I(K());
        int length = D().length() - I;
        if (length < 4 || I == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != D().charAt(I + i10)) {
                return false;
            }
        }
        if (length > 4 && b.a(D().charAt(I + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f97896a = I + 4;
        return true;
    }

    public final void Q(char c10) {
        int i10 = this.f97896a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f97896a = i10 - 1;
                String strS = s();
                this.f97896a = i10;
                if (tn.p.f(strS, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f97896a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.f97896a = i10;
                throw th2;
            }
        }
        String strC = b.c(b.a(c10));
        int i11 = this.f97896a;
        int i12 = i11 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i11 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final boolean R() {
        return D().charAt(this.f97896a - 1) != '\"';
    }

    public final int b(int i10) {
        int I = I(i10);
        if (I == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = I + 1;
        char cCharAt = D().charAt(I);
        if (cCharAt == 'u') {
            return d(D(), i11);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.f97899d.append(cB);
            return i11;
        }
        z(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    public final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f97899d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f97896a = i10;
        w();
        if (this.f97896a + 4 < charSequence.length()) {
            return d(charSequence, this.f97896a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void e(int i10, int i11) {
        this.f97899d.append(D(), i10, i11);
    }

    public abstract boolean f();

    public final boolean g(int i10) {
        int I = I(i10);
        if (I >= D().length() || I == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = I + 1;
        int iCharAt = D().charAt(I) | ' ';
        if (iCharAt == 102) {
            i("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            i("rue", i11);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean h() {
        boolean z10;
        int iK = K();
        if (iK == D().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (D().charAt(iK) == '\"') {
            iK++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(iK);
        if (z10) {
            if (this.f97896a == D().length()) {
                z(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (D().charAt(this.f97896a) != '\"') {
                z(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.f97896a++;
        }
        return zG;
    }

    public final void i(String str, int i10) {
        if (D().length() - i10 < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (D().charAt(i10 + i11) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f97896a = i10 + str.length();
    }

    @NotNull
    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte bK = k();
        if (bK == b10) {
            return bK;
        }
        String strC = b.c(b10);
        int i10 = this.f97896a;
        int i11 = i10 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public abstract void m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f0, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f1, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        z(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (r5 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r0 == r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        if (r10 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0154, code lost:
    
        if (r0 == (r5 - 1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0156, code lost:
    
        if (r1 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (r2 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        if (D().charAt(r5) != '\"') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        z(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        z(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        r18.f97896a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (r9 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        r0 = r11 * o(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019f, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
    
        if (r3 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        z(r18, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e6, code lost:
    
        if (r10 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.a.n():long");
    }

    public final long p() {
        long jN = n();
        if (k() == 10) {
            return jN;
        }
        b.c((byte) 10);
        int i10 = this.f97896a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String q() {
        return this.f97898c != null ? M() : j();
    }

    @NotNull
    public final String r(@NotNull CharSequence charSequence, int i10, int i11) {
        int I;
        tn.p.k(charSequence, "source");
        char cCharAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                I = I(c(i10, i11));
                if (I == -1) {
                    z(this, "Unexpected EOF", I, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    e(i10, i11);
                    I = I(i11);
                    if (I == -1) {
                        z(this, "Unexpected EOF", I, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i11);
                }
            }
            z10 = true;
            i10 = I;
            i11 = i10;
            cCharAt = charSequence.charAt(i11);
        }
        String strL = !z10 ? L(i10, i11) : u(i10, i11);
        this.f97896a = i11 + 1;
        return strL;
    }

    @NotNull
    public final String s() {
        if (this.f97898c != null) {
            return M();
        }
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            z(this, "EOF", iK, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = b.a(D().charAt(iK));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            z(this, "Expected beginning of the string, but got " + D().charAt(iK), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (b.a(D().charAt(iK)) == 0) {
            iK++;
            if (iK >= D().length()) {
                e(this.f97896a, iK);
                int I = I(iK);
                if (I == -1) {
                    this.f97896a = iK;
                    return u(0, 0);
                }
                iK = I;
                z10 = true;
            }
        }
        String strL = !z10 ? L(this.f97896a, iK) : u(this.f97896a, iK);
        this.f97896a = iK;
        return strL;
    }

    @NotNull
    public final String t() {
        String strS = s();
        if (!tn.p.f(strS, "null") || !R()) {
            return strS;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f97896a + ')';
    }

    public final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f97899d.toString();
        tn.p.j(string, "toString(...)");
        this.f97899d.setLength(0);
        return string;
    }

    public final void v() {
        this.f97898c = null;
    }

    public void w() {
    }

    public final void x() {
        if (k() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + D().charAt(this.f97896a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void y(@NotNull String str, int i10, @NotNull String str2) {
        String str3;
        tn.p.k(str, "message");
        tn.p.k(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw j0.f(i10, str + " at path: " + this.f97897b.a() + str3, D());
    }
}
