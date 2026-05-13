package gl;

import cn.w0;
import cn.x0;
import com.ironsource.G5;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Codecs.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<Byte> f62490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f62491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f62492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<Byte> f62493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f62494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f62495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<Byte> f62496g;

    static {
        List listO0 = cn.f0.O0(cn.f0.N0(new zn.c('a', 'z'), new zn.c('A', 'Z')), new zn.c('0', '9'));
        ArrayList arrayList = new ArrayList(cn.x.x(listO0, 10));
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f62490a = cn.f0.l1(arrayList);
        f62491b = cn.f0.l1(cn.f0.O0(cn.f0.N0(new zn.c('a', 'z'), new zn.c('A', 'Z')), new zn.c('0', '9')));
        f62492c = cn.f0.l1(cn.f0.O0(cn.f0.N0(new zn.c('a', 'f'), new zn.c('A', 'F')), new zn.c('0', '9')));
        Set setJ = w0.j(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', Character.valueOf(G5.T), '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(cn.x.x(setJ, 10));
        Iterator it2 = setJ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f62493d = arrayList2;
        f62494e = w0.j(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', Character.valueOf(G5.T), '-', '.', '_', '~');
        f62495f = x0.m(f62491b, w0.j('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List listP = cn.w.p('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(cn.x.x(listP, 10));
        Iterator it3 = listP.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f62496g = arrayList3;
    }

    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'A';
        if (!('A' <= c10 && c10 < 'G')) {
            c11 = 'a';
            if (!('a' <= c10 && c10 < 'g')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final String f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) throws URLDecodeException {
        int i13 = i11 - i10;
        if (i13 > 255) {
            i13 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i13);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char cCharAt = charSequence.charAt(i12);
            if (z10 && cCharAt == '+') {
                sb2.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i11 - i12) / 3];
                }
                int i14 = 0;
                while (i12 < i11 && charSequence.charAt(i12) == '%') {
                    int i15 = i12 + 2;
                    if (i15 >= i11) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i12, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i12);
                    }
                    int i16 = i12 + 1;
                    int iE = e(charSequence.charAt(i16));
                    int iE2 = e(charSequence.charAt(i15));
                    if (iE == -1 || iE2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i16) + charSequence.charAt(i15) + ", in " + ((Object) charSequence) + ", at " + i12);
                    }
                    bArr[i14] = (byte) ((iE * 16) + iE2);
                    i12 += 3;
                    i14++;
                }
                sb2.append(bo.a0.D(bArr, 0, i14 + 0, false, 4, null));
            } else {
                sb2.append(cCharAt);
            }
            i12++;
        }
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str;
        }
        String strSubstring = str.substring(i10, i11);
        tn.p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String h(@NotNull String str, int i10, int i11, @NotNull Charset charset) {
        tn.p.k(str, "<this>");
        tn.p.k(charset, G5.M);
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = bo.c.f5639b;
        }
        return h(str, i10, i11, charset);
    }

    @NotNull
    public static final String j(@NotNull String str, int i10, int i11, boolean z10, @NotNull Charset charset) {
        tn.p.k(str, "<this>");
        tn.p.k(charset, G5.M);
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = bo.c.f5639b;
        }
        return j(str, i10, i11, z10, charset);
    }

    @NotNull
    public static final String l(@NotNull String str, final boolean z10) {
        tn.p.k(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = bo.c.f5639b.newEncoder();
        tn.p.j(charsetEncoderNewEncoder, "newEncoder(...)");
        w(tl.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new sn.l() { // from class: gl.c
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.n(sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String m(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l(str, z10);
    }

    public static final bn.r n(StringBuilder sb2, boolean z10, byte b10) {
        if (f62490a.contains(Byte.valueOf(b10)) || f62496g.contains(Byte.valueOf(b10))) {
            sb2.append((char) b10);
        } else if (z10 && b10 == 32) {
            sb2.append('+');
        } else {
            sb2.append(z(b10));
        }
        return bn.r.f5635a;
    }

    @NotNull
    public static final String o(@NotNull String str) {
        tn.p.k(str, "<this>");
        return l(str, true);
    }

    @NotNull
    public static final String p(@NotNull String str, boolean z10, boolean z11) {
        int i10;
        tn.p.k(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        Charset charset = bo.c.f5639b;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((!z10 && cCharAt == '/') || f62491b.contains(Character.valueOf(cCharAt)) || f62494e.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                i11++;
            } else {
                if (!z11 && cCharAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set<Character> set = f62492c;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(cCharAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = bo.b.i(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                tn.p.j(charsetEncoderNewEncoder, "newEncoder(...)");
                int i14 = i13 + i11;
                w(tl.b.c(charsetEncoderNewEncoder, str, i11, i14), new sn.l() { // from class: gl.b
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return e.r(sb2, ((Byte) obj).byteValue());
                    }
                });
                i11 = i14;
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String q(String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return p(str, z10, z11);
    }

    public static final bn.r r(StringBuilder sb2, byte b10) {
        sb2.append(z(b10));
        return bn.r.f5635a;
    }

    @NotNull
    public static final String s(@NotNull String str) {
        tn.p.k(str, "<this>");
        return q(str, true, false, 2, null);
    }

    @NotNull
    public static final String t(@NotNull String str, final boolean z10, final boolean z11, @NotNull Charset charset) {
        tn.p.k(str, "<this>");
        tn.p.k(charset, G5.M);
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        tn.p.j(charsetEncoderNewEncoder, "newEncoder(...)");
        w(tl.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new sn.l() { // from class: gl.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.v(z11, sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String u(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = bo.c.f5639b;
        }
        return t(str, z10, z11, charset);
    }

    public static final bn.r v(boolean z10, StringBuilder sb2, boolean z11, byte b10) {
        if (b10 == 32) {
            if (z10) {
                sb2.append('+');
            } else {
                sb2.append("%20");
            }
        } else if (f62490a.contains(Byte.valueOf(b10)) || (!z11 && f62493d.contains(Byte.valueOf(b10)))) {
            sb2.append((char) b10);
        } else {
            sb2.append(z(b10));
        }
        return bn.r.f5635a;
    }

    public static final void w(no.r rVar, final sn.l<? super Byte, bn.r> lVar) {
        ul.e.c(rVar, new sn.l() { // from class: gl.d
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.x(lVar, (no.a) obj));
            }
        });
    }

    public static final boolean x(sn.l lVar, no.a aVar) {
        tn.p.k(aVar, "buffer");
        while (ul.a.a(aVar)) {
            lVar.invoke(Byte.valueOf(aVar.readByte()));
        }
        return true;
    }

    public static final char y(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 10) {
            z10 = true;
        }
        return (char) (z10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
    }

    public static final String z(byte b10) {
        int i10 = b10 & 255;
        return bo.a0.x(new char[]{'%', y(i10 >> 4), y(i10 & 15)});
    }
}
