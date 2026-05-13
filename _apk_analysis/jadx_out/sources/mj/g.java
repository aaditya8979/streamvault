package mj;

import io.bidmachine.media3.common.util.ParsableByteArray;

/* JADX INFO: compiled from: StreamNameChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements a {
    public final String name;

    private g(String str) {
        this.name = str;
    }

    public static g parseFrom(ParsableByteArray parsableByteArray) {
        return new g(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    @Override // mj.a
    public int getType() {
        return 1852994675;
    }
}
