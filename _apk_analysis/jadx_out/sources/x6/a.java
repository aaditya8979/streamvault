package x6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s7.a0;
import v6.c;
import v6.e;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends e {
    @Override // v6.e
    public Metadata b(c cVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(a0 a0Var) {
        return new EventMessage((String) s7.a.e(a0Var.x()), (String) s7.a.e(a0Var.x()), a0Var.w(), a0Var.w(), Arrays.copyOfRange(a0Var.d(), a0Var.e(), a0Var.f()));
    }
}
