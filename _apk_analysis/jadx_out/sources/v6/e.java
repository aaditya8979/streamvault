package v6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class e implements a {
    @Override // v6.a
    @Nullable
    public final Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.e(cVar.f21430d);
        s7.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (cVar.f()) {
            return null;
        }
        return b(cVar, byteBuffer);
    }

    @Nullable
    public abstract Metadata b(c cVar, ByteBuffer byteBuffer);
}
