package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import d6.x0;
import g6.a;
import g6.c;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f21429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ByteBuffer f21430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ByteBuffer f21433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21435i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.currentCapacity = i10;
            this.requiredCapacity = i11;
        }
    }

    static {
        x0.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f21429c = new c();
        this.f21434h = i10;
        this.f21435i = i11;
    }

    public static DecoderInputBuffer p() {
        return new DecoderInputBuffer(0);
    }

    @Override // g6.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f21430d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f21433g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f21431e = false;
    }

    public final ByteBuffer l(int i10) {
        int i11 = this.f21434h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f21430d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void m(int i10) {
        int i11 = i10 + this.f21435i;
        ByteBuffer byteBuffer = this.f21430d;
        if (byteBuffer == null) {
            this.f21430d = l(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f21430d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i12);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f21430d = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f21430d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f21433g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean o() {
        return d(1073741824);
    }

    public void q(int i10) {
        ByteBuffer byteBuffer = this.f21433g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f21433g = ByteBuffer.allocate(i10);
        } else {
            this.f21433g.clear();
        }
    }
}
