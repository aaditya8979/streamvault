package wl;

import com.ironsource.C4157n2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ByteBufferPools.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d<ByteBuffer> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f86442h;

    public b(int i10, int i11) {
        super(i10);
        this.f86442h = i11;
    }

    @Override // wl.d
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(@NotNull ByteBuffer byteBuffer) {
        p.k(byteBuffer, C4157n2.f33007p);
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // wl.d
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ByteBuffer h() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f86442h);
        p.h(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // wl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void n(@NotNull ByteBuffer byteBuffer) {
        p.k(byteBuffer, C4157n2.f33007p);
        if (!(byteBuffer.capacity() == this.f86442h)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(!byteBuffer.isDirect())) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
