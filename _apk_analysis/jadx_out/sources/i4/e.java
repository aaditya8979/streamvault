package i4;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: DecoderInputBuffer.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f63710b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ByteBuffer f63711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ByteBuffer f63714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63715g;

    public e(int i10) {
        this.f63715g = i10;
    }

    public static e f() {
        return new e(0);
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f63715g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f63711c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public void b(int i10) {
        ByteBuffer byteBuffer = this.f63711c;
        if (byteBuffer == null) {
            this.f63711c = a(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f63711c.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            return;
        }
        ByteBuffer byteBufferA = a(i11);
        byteBufferA.order(this.f63711c.order());
        if (iPosition > 0) {
            this.f63711c.flip();
            byteBufferA.put(this.f63711c);
        }
        this.f63711c = byteBufferA;
    }

    public final void c() {
        this.f63711c.flip();
        ByteBuffer byteBuffer = this.f63714f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    @Override // i4.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f63711c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f63714f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f63712d = false;
    }

    public final boolean d() {
        return getFlag(1073741824);
    }

    public final boolean e() {
        return this.f63711c == null && this.f63715g == 0;
    }

    public void g(int i10) {
        ByteBuffer byteBuffer = this.f63714f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f63714f = ByteBuffer.allocate(i10);
        } else {
            this.f63714f.clear();
        }
    }
}
