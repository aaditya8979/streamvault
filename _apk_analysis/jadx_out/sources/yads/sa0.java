package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public class sa0 extends sq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m20 f94748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f94749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f94751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f94752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f94753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f94754i;

    static {
        ho0.a("goog.exo.decoder");
    }

    public sa0(int i10) {
        this(i10, 0);
    }

    public sa0(int i10, int i11) {
        this.f94748c = new m20();
        this.f94753h = i10;
        this.f94754i = 0;
    }

    public static sa0 d() {
        return new sa0(0, 0);
    }

    public void b() {
        this.f94912b = 0;
        ByteBuffer byteBuffer = this.f94749d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f94752g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f94750e = false;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f94749d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f94752g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void c(int i10) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i11 = i10 + this.f94754i;
        ByteBuffer byteBuffer = this.f94749d;
        if (byteBuffer == null) {
            int i12 = this.f94753h;
            if (i12 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i11);
            } else {
                if (i12 != 2) {
                    throw new ra0(byteBuffer != null ? byteBuffer.capacity() : 0, i11);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i11);
            }
            this.f94749d = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i11 + iPosition;
        if (iCapacity >= i13) {
            this.f94749d = byteBuffer;
            return;
        }
        int i14 = this.f94753h;
        if (i14 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i13);
        } else {
            if (i14 != 2) {
                ByteBuffer byteBuffer2 = this.f94749d;
                throw new ra0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i13);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i13);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f94749d = byteBufferAllocateDirect;
    }
}
