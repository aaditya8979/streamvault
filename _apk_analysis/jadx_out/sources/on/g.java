package on;

import bn.r;
import com.ironsource.G5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
public class g extends e {
    public static final void d(@NotNull File file, @NotNull byte[] bArr) throws IOException {
        p.k(file, "<this>");
        p.k(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            r rVar = r.f5635a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    @NotNull
    public static final ByteBuffer e(int i10, @NotNull CharsetEncoder charsetEncoder) {
        p.k(charsetEncoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        p.j(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void f(@NotNull File file, @NotNull Charset charset, @NotNull l<? super String, r> lVar) {
        p.k(file, "<this>");
        p.k(charset, G5.M);
        p.k(lVar, "action");
        k.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static final CharsetEncoder g(@NotNull Charset charset) {
        p.k(charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    @NotNull
    public static final List<String> h(@NotNull File file, @NotNull Charset charset) {
        p.k(file, "<this>");
        p.k(charset, G5.M);
        final ArrayList arrayList = new ArrayList();
        f(file, charset, new l() { // from class: on.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return g.j(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List i(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        return h(file, charset);
    }

    public static final r j(ArrayList arrayList, String str) {
        p.k(str, "it");
        arrayList.add(str);
        return r.f5635a;
    }

    @NotNull
    public static final String k(@NotNull File file, @NotNull Charset charset) throws IOException {
        p.k(file, "<this>");
        p.k(charset, G5.M);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = k.e(inputStreamReader);
            b.a(inputStreamReader, null);
            return strE;
        } finally {
        }
    }

    public static /* synthetic */ String l(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bo.c.f5639b;
        }
        return k(file, charset);
    }

    public static final void m(@NotNull File file, @NotNull byte[] bArr) {
        p.k(file, "<this>");
        p.k(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            r rVar = r.f5635a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void n(@NotNull File file, @NotNull String str, @NotNull Charset charset) throws IOException {
        p.k(file, "<this>");
        p.k(str, "text");
        p.k(charset, G5.M);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            p(fileOutputStream, str, charset);
            r rVar = r.f5635a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void o(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = bo.c.f5639b;
        }
        n(file, str, charset);
    }

    public static final void p(@NotNull OutputStream outputStream, @NotNull String str, @NotNull Charset charset) throws IOException {
        p.k(outputStream, "<this>");
        p.k(str, "text");
        p.k(charset, G5.M);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            p.j(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderG = g(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        p.h(charsetEncoderG);
        ByteBuffer byteBufferE = e(8192, charsetEncoderG);
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int iMin = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            p.j(cArrArray, "array(...)");
            str.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderG.encode(charBufferAllocate, byteBufferE, i12 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferE.array(), 0, byteBufferE.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferE.clear();
            i10 = i12;
        }
    }
}
