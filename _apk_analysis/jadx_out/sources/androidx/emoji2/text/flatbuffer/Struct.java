package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Struct {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public ByteBuffer f4323bb;
    public int bb_pos;

    public void __reset() {
        __reset(0, null);
    }

    public void __reset(int i10, ByteBuffer byteBuffer) {
        this.f4323bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i10;
        } else {
            this.bb_pos = 0;
        }
    }
}
