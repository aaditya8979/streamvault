package jq;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: DirectNIOBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends hq.a implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f72534s = vq.b.a(b.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ByteBuffer f72535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ReadableByteChannel f72536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InputStream f72537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WritableByteChannel f72538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OutputStream f72539r;

    public b(int i10) {
        super(2, false);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        this.f72535n = byteBufferAllocateDirect;
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(byteBufferAllocateDirect.capacity());
    }

    public b(ByteBuffer byteBuffer, boolean z10) {
        super(z10 ? 0 : 2, false);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException();
        }
        this.f72535n = byteBuffer;
        l0(byteBuffer.position());
        X(byteBuffer.limit());
    }

    @Override // hq.d
    public void I(int i10, byte b10) {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("index<0: " + i10 + "<0");
        }
        if (i10 <= e0()) {
            this.f72535n.put(i10, b10);
            return;
        }
        throw new IllegalArgumentException("index>capacity(): " + i10 + ">" + e0());
    }

    @Override // hq.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        if ((i10 + i12 > e0() && (i12 = e0() - i10) == 0) || i12 < 0) {
            return -1;
        }
        try {
            this.f72535n.position(i10);
            this.f72535n.get(bArr, i11, i12);
            return i12;
        } finally {
            this.f72535n.position(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r9.f72536o = null;
        r9.f72537p = r10;
     */
    @Override // hq.a, hq.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int K(java.io.InputStream r10, int r11) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.channels.ReadableByteChannel r0 = r9.f72536o
            if (r0 == 0) goto Le
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto Le
            java.io.InputStream r0 = r9.f72537p
            if (r10 == r0) goto L16
        Le:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r10)
            r9.f72536o = r0
            r9.f72537p = r10
        L16:
            if (r11 < 0) goto L1e
            int r0 = r9.L()
            if (r11 <= r0) goto L22
        L1e:
            int r11 = r9.L()
        L22:
            int r0 = r9.T()
            r1 = 0
            r3 = r11
            r2 = r1
            r4 = r2
            r5 = r4
        L2b:
            r6 = 0
            if (r2 >= r11) goto L86
            java.nio.ByteBuffer r5 = r9.f72535n     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r5.position(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.nio.ByteBuffer r5 = r9.f72535n     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            int r7 = r0 + r3
            r5.limit(r7)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.nio.channels.ReadableByteChannel r5 = r9.f72536o     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            java.nio.ByteBuffer r7 = r9.f72535n     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            int r5 = r5.read(r7)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r5 >= 0) goto L49
            r9.f72536o = r6     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r9.f72537p = r10     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            goto L86
        L49:
            if (r5 <= 0) goto L53
            int r0 = r0 + r5
            int r2 = r2 + r5
            int r3 = r3 - r5
            r9.X(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r4 = r1
            goto L5a
        L53:
            int r7 = r4 + 1
            r8 = 1
            if (r4 <= r8) goto L59
            goto L86
        L59:
            r4 = r7
        L5a:
            int r7 = r10.available()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r7 > 0) goto L2b
            goto L86
        L61:
            r11 = move-exception
            goto L69
        L63:
            r11 = move-exception
            r9.f72536o = r6     // Catch: java.lang.Throwable -> L61
            r9.f72537p = r10     // Catch: java.lang.Throwable -> L61
            throw r11     // Catch: java.lang.Throwable -> L61
        L69:
            java.nio.channels.ReadableByteChannel r0 = r9.f72536o
            if (r0 == 0) goto L77
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L77
            r9.f72536o = r6
            r9.f72537p = r10
        L77:
            java.nio.ByteBuffer r10 = r9.f72535n
            r10.position(r1)
            java.nio.ByteBuffer r10 = r9.f72535n
            int r0 = r10.capacity()
            r10.limit(r0)
            throw r11
        L86:
            if (r5 >= 0) goto La8
            if (r2 != 0) goto La8
            r11 = -1
            java.nio.channels.ReadableByteChannel r0 = r9.f72536o
            if (r0 == 0) goto L99
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L99
            r9.f72536o = r6
            r9.f72537p = r10
        L99:
            java.nio.ByteBuffer r10 = r9.f72535n
            r10.position(r1)
            java.nio.ByteBuffer r10 = r9.f72535n
            int r0 = r10.capacity()
            r10.limit(r0)
            return r11
        La8:
            java.nio.channels.ReadableByteChannel r11 = r9.f72536o
            if (r11 == 0) goto Lb6
            boolean r11 = r11.isOpen()
            if (r11 != 0) goto Lb6
            r9.f72536o = r6
            r9.f72537p = r10
        Lb6:
            java.nio.ByteBuffer r10 = r9.f72535n
            r10.position(r1)
            java.nio.ByteBuffer r10 = r9.f72535n
            int r11 = r10.capacity()
            r10.limit(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b.K(java.io.InputStream, int):int");
    }

    @Override // hq.a, hq.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("index<0: " + i10 + "<0");
        }
        if (i10 + i12 > e0() && (i12 = e0() - i10) < 0) {
            throw new IllegalArgumentException("index>capacity(): " + i10 + ">" + e0());
        }
        try {
            this.f72535n.position(i10);
            int iRemaining = this.f72535n.remaining();
            if (i12 > iRemaining) {
                i12 = iRemaining;
            }
            if (i12 > 0) {
                this.f72535n.put(bArr, i11, i12);
            }
            return i12;
        } finally {
            this.f72535n.position(0);
        }
    }

    @Override // hq.d
    public byte Q(int i10) {
        return this.f72535n.get(i10);
    }

    @Override // hq.a, hq.d
    public int U(int i10, hq.d dVar) {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        byte[] bArrW = dVar.W();
        if (bArrW != null) {
            return M(i10, bArrW, dVar.getIndex(), dVar.length());
        }
        hq.d dVarBuffer = dVar.buffer();
        if (!(dVarBuffer instanceof b)) {
            return super.U(i10, dVar);
        }
        ByteBuffer byteBufferDuplicate = ((b) dVarBuffer).f72535n;
        ByteBuffer byteBuffer = this.f72535n;
        if (byteBufferDuplicate == byteBuffer) {
            byteBufferDuplicate = byteBuffer.duplicate();
        }
        try {
            this.f72535n.position(i10);
            int iRemaining = this.f72535n.remaining();
            int length = dVar.length();
            if (length <= iRemaining) {
                iRemaining = length;
            }
            byteBufferDuplicate.position(dVar.getIndex());
            byteBufferDuplicate.limit(dVar.getIndex() + iRemaining);
            this.f72535n.put(byteBufferDuplicate);
            return iRemaining;
        } finally {
            this.f72535n.position(0);
            byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
            byteBufferDuplicate.position(0);
        }
    }

    @Override // hq.d
    public byte[] W() {
        return null;
    }

    @Override // jq.d
    public ByteBuffer a0() {
        return this.f72535n;
    }

    @Override // hq.d
    public int e0() {
        return this.f72535n.capacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hq.a, hq.d
    public void writeTo(OutputStream outputStream) throws IOException {
        int iWrite;
        WritableByteChannel writableByteChannel = this.f72538q;
        if (writableByteChannel == null || !writableByteChannel.isOpen() || outputStream != this.f72539r) {
            this.f72538q = Channels.newChannel(outputStream);
            this.f72539r = outputStream;
        }
        synchronized (this.f72535n) {
            loop0: while (true) {
                int i10 = 0;
                while (true) {
                    try {
                        try {
                            if (!hasContent() || !this.f72538q.isOpen()) {
                                break loop0;
                            }
                            this.f72535n.position(getIndex());
                            this.f72535n.limit(T());
                            iWrite = this.f72538q.write(this.f72535n);
                            if (iWrite < 0) {
                                break loop0;
                            }
                            if (iWrite > 0) {
                                break;
                            }
                            int i11 = i10 + 1;
                            if (i10 > 1) {
                                break loop0;
                            } else {
                                i10 = i11;
                            }
                        } catch (IOException e10) {
                            this.f72538q = null;
                            this.f72539r = null;
                            throw e10;
                        }
                    } finally {
                        WritableByteChannel writableByteChannel2 = this.f72538q;
                        if (writableByteChannel2 != null && !writableByteChannel2.isOpen()) {
                            this.f72538q = null;
                            this.f72539r = null;
                        }
                        this.f72535n.position(0);
                        ByteBuffer byteBuffer = this.f72535n;
                        byteBuffer.limit(byteBuffer.capacity());
                    }
                }
                skip(iWrite);
            }
        }
    }
}
