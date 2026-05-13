package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class yo extends sa0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f97257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f97258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f97259l;

    public yo() {
        super(2);
        this.f97259l = 32;
    }

    public final boolean a(sa0 sa0Var) {
        ByteBuffer byteBuffer;
        if (!(!sa0Var.b(1073741824))) {
            throw new IllegalArgumentException();
        }
        if (!(!sa0Var.b(268435456))) {
            throw new IllegalArgumentException();
        }
        if (!(!sa0Var.b(4))) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f97258k;
        if (i10 > 0) {
            if (i10 >= this.f97259l || sa0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = sa0Var.f94749d;
            if (byteBuffer2 != null && (byteBuffer = this.f94749d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f97258k;
        this.f97258k = i11 + 1;
        if (i11 == 0) {
            this.f94751f = sa0Var.f94751f;
            if (sa0Var.b(1)) {
                this.f94912b = 1;
            }
        }
        if (sa0Var.b(Integer.MIN_VALUE)) {
            this.f94912b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = sa0Var.f94749d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f94749d.put(byteBuffer3);
        }
        this.f97257j = sa0Var.f94751f;
        return true;
    }

    @Override // yads.sa0
    public final void b() {
        super.b();
        this.f97258k = 0;
    }
}
