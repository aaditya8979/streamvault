package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dz2 {
    public final ts1 a(ws1 ws1Var) {
        ByteBuffer byteBuffer = ws1Var.f94749d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (ws1Var.b(Integer.MIN_VALUE)) {
            return null;
        }
        return a(ws1Var, byteBuffer);
    }

    public abstract ts1 a(ws1 ws1Var, ByteBuffer byteBuffer);
}
