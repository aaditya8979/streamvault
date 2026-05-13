package tl;

import bo.c;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import no.d;
import no.q;
import no.r;
import no.t;
import org.jetbrains.annotations.NotNull;
import tn.p;
import ul.e;

/* JADX INFO: compiled from: CharsetJVM.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final int a(@NotNull CharsetDecoder charsetDecoder, @NotNull r rVar, @NotNull Appendable appendable, int i10) {
        p.k(charsetDecoder, "<this>");
        p.k(rVar, "input");
        p.k(appendable, "dst");
        if (p.f(f(charsetDecoder), c.f5639b)) {
            String strC = t.c(rVar);
            appendable.append(strC);
            return strC.length();
        }
        long jB = e.b(rVar);
        appendable.append(oo.b.a(d.a(rVar), f(charsetDecoder)));
        return (int) jB;
    }

    public static final int b(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence charSequence, int i10, int i11, @NotNull q qVar) {
        p.k(charsetEncoder, "<this>");
        p.k(charSequence, "input");
        p.k(qVar, "dst");
        byte[] bArrC = c(charsetEncoder, charSequence, i10, i11);
        q.h0(qVar, bArrC, 0, 0, 6, null);
        return bArrC.length;
    }

    @NotNull
    public static final byte[] c(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence charSequence, int i10, int i11) {
        p.k(charsetEncoder, "<this>");
        p.k(charSequence, "input");
        if (!(charSequence instanceof String)) {
            return d(charsetEncoder, charSequence, i10, i11);
        }
        if (i10 == 0) {
            String str = (String) charSequence;
            if (i11 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                p.j(bytes, "getBytes(...)");
                return bytes;
            }
        }
        String strSubstring = ((String) charSequence).substring(i10, i11);
        p.j(strSubstring, "substring(...)");
        p.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        p.j(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static final byte[] d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    @NotNull
    public static final Charset e(@NotNull c cVar, @NotNull String str) {
        p.k(cVar, "<this>");
        p.k(str, "name");
        Charset charsetForName = Charset.forName(str);
        p.j(charsetForName, "forName(...)");
        return charsetForName;
    }

    @NotNull
    public static final Charset f(@NotNull CharsetDecoder charsetDecoder) {
        p.k(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        p.h(charset);
        return charset;
    }

    @NotNull
    public static final String g(@NotNull Charset charset) {
        p.k(charset, "<this>");
        String strName = charset.name();
        p.j(strName, "name(...)");
        return strName;
    }
}
