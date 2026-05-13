package yo;

import com.ironsource.G5;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CharsetReader.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InputStream f97980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Charset f97981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CharsetDecoder f97982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ByteBuffer f97983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f97985f;

    public r(@NotNull InputStream inputStream, @NotNull Charset charset) {
        tn.p.k(inputStream, "inputStream");
        tn.p.k(charset, G5.M);
        this.f97980a = inputStream;
        this.f97981b = charset;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        tn.p.j(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f97982c = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(k.f97951c.d());
        tn.p.j(byteBufferWrap, "wrap(...)");
        this.f97983d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f97982c.decode(this.f97983d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (z10 || !charBufferWrap.hasRemaining()) {
                    break;
                }
                if (b() < 0) {
                    z10 = true;
                    if (charBufferWrap.position() == 0 && !this.f97983d.hasRemaining()) {
                        break;
                    }
                    this.f97982c.reset();
                } else {
                    continue;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f97982c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    public final int b() {
        this.f97983d.compact();
        try {
            int iLimit = this.f97983d.limit();
            int iPosition = this.f97983d.position();
            int i10 = this.f97980a.read(this.f97983d.array(), this.f97983d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.f97983d;
            tn.p.i(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            this.f97983d.flip();
            return this.f97983d.remaining();
        } finally {
            this.f97983d.flip();
        }
    }

    public final int c() {
        if (this.f97984e) {
            this.f97984e = false;
            return this.f97985f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f97985f = cArr[1];
            this.f97984e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(@NotNull char[] cArr, int i10, int i11) {
        tn.p.k(cArr, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (!((i10 >= 0 && i10 < cArr.length) && i11 >= 0 && i10 + i11 <= cArr.length)) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + cArr.length).toString());
        }
        if (this.f97984e) {
            cArr[i10] = this.f97985f;
            i10++;
            i11--;
            this.f97984e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(cArr, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            cArr[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        k kVar = k.f97951c;
        byte[] bArrArray = this.f97983d.array();
        tn.p.j(bArrArray, "array(...)");
        kVar.c(bArrArray);
    }
}
