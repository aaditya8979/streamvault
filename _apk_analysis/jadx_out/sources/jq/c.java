package jq;

import hq.h;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: IndirectNIOBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends h implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ByteBuffer f72540p;

    public c(int i10) {
        super(i10, 2, false);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f63602n);
        this.f72540p = byteBufferWrap;
        byteBufferWrap.position(0);
        byteBufferWrap.limit(byteBufferWrap.capacity());
    }

    public c(ByteBuffer byteBuffer, boolean z10) {
        super(byteBuffer.array(), 0, 0, z10 ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException();
        }
        this.f72540p = byteBuffer;
        this.f63579d = byteBuffer.position();
        this.f63580e = byteBuffer.limit();
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
    }

    @Override // jq.d
    public ByteBuffer a0() {
        return this.f72540p;
    }
}
