package hq;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface d extends Cloneable {

    /* JADX INFO: compiled from: Buffer.java */
    public interface a {
    }

    byte[] H();

    void I(int i10, byte b10);

    int J(int i10, byte[] bArr, int i11, int i12);

    int K(InputStream inputStream, int i10) throws IOException;

    int L();

    int M(int i10, byte[] bArr, int i11, int i12);

    d N(int i10, int i11);

    String O();

    String P(Charset charset);

    byte Q(int i10);

    boolean R(d dVar);

    void S();

    int T();

    int U(int i10, d dVar);

    void V(int i10);

    byte[] W();

    void X(int i10);

    int Y(byte[] bArr);

    boolean Z();

    int b0(byte[] bArr, int i10, int i11);

    d buffer();

    void c0();

    void clear();

    d d0();

    int e0();

    byte get();

    d get(int i10);

    int getIndex();

    boolean hasContent();

    int i0();

    boolean isReadOnly();

    boolean j0();

    int k0(d dVar);

    void l0(int i10);

    int length();

    d m0();

    byte peek();

    void put(byte b10);

    int skip(int i10);

    String toString(String str);

    void writeTo(OutputStream outputStream) throws IOException;
}
