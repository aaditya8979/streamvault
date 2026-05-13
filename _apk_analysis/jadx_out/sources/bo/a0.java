package bo;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
public class a0 extends z {
    public static final boolean A(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z10) {
        return z10 ? d0.d0(charSequence, charSequence2) : z(charSequence, charSequence2);
    }

    @NotNull
    public static final String B(@NotNull byte[] bArr) {
        tn.p.k(bArr, "<this>");
        return new String(bArr, c.f5639b);
    }

    @NotNull
    public static final String C(@NotNull byte[] bArr, int i10, int i11, boolean z10) {
        tn.p.k(bArr, "<this>");
        cn.d.Companion.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, c.f5639b);
        }
        String string = c.f5639b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String D(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return C(bArr, i10, i11, z10);
    }

    @NotNull
    public static final byte[] E(@NotNull String str) {
        tn.p.k(str, "<this>");
        byte[] bytes = str.getBytes(c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public static final byte[] F(@NotNull String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        tn.p.k(str, "<this>");
        cn.d.Companion.a(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            tn.p.j(strSubstring, "substring(...)");
            Charset charset = c.f5639b;
            tn.p.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            tn.p.j(bytes, "getBytes(...)");
            return bytes;
        }
        ByteBuffer byteBufferEncode = c.f5639b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            tn.p.h(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                tn.p.h(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] G(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return F(str, i10, i11, z10);
    }

    public static final boolean H(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "suffix");
        return !z10 ? str.endsWith(str2) : M(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean I(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(str, str2, z10);
    }

    public static final boolean J(@Nullable String str, @Nullable String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean K(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(str, str2, z10);
    }

    @NotNull
    public static final Comparator<String> L(@NotNull tn.x xVar) {
        tn.p.k(xVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        tn.p.j(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static final boolean M(@NotNull String str, int i10, @NotNull String str2, int i11, int i12, boolean z10) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean N(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return M(str, i10, str2, i11, i12, z10);
    }

    @NotNull
    public static final String O(@NotNull CharSequence charSequence, int i10) {
        tn.p.k(charSequence, "<this>");
        int i11 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        tn.p.h(string);
        return string;
    }

    @NotNull
    public static final String P(@NotNull String str, char c10, char c11, boolean z10) {
        tn.p.k(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            tn.p.j(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (b.h(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @NotNull
    public static final String Q(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "oldValue");
        tn.p.k(str3, "newValue");
        int i10 = 0;
        int iN0 = d0.n0(str, str2, 0, z10);
        if (iN0 < 0) {
            return str;
        }
        int length = str2.length();
        int iE = zn.n.e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iN0);
            sb2.append(str3);
            i10 = iN0 + length;
            if (iN0 >= str.length()) {
                break;
            }
            iN0 = d0.n0(str, str2, iN0 + iE, z10);
        } while (iN0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String R(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return P(str, c10, c11, z10);
    }

    public static /* synthetic */ String S(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return Q(str, str2, str3, z10);
    }

    public static final boolean T(@NotNull String str, @NotNull String str2, int i10, boolean z10) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : M(str, i10, str2, 0, str2.length(), z10);
    }

    public static final boolean U(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "<this>");
        tn.p.k(str2, "prefix");
        return !z10 ? str.startsWith(str2) : M(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean V(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean W(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U(str, str2, z10);
    }

    @NotNull
    public static final String v(@NotNull String str) {
        tn.p.k(str, "<this>");
        Locale locale = Locale.getDefault();
        tn.p.j(locale, "getDefault(...)");
        return w(str, locale);
    }

    @NotNull
    public static final String w(@NotNull String str, @NotNull Locale locale) {
        tn.p.k(str, "<this>");
        tn.p.k(locale, CommonUrlParts.LOCALE);
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            tn.p.j(strSubstring, "substring(...)");
            tn.p.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            tn.p.j(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        tn.p.j(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @NotNull
    public static final String x(@NotNull char[] cArr) {
        tn.p.k(cArr, "<this>");
        return new String(cArr);
    }

    @NotNull
    public static final String y(@NotNull char[] cArr, int i10, int i11) {
        tn.p.k(cArr, "<this>");
        cn.d.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean z(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? d0.e0(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }
}
