package x4;

import a6.t;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import w4.c;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements w4.a {
    @Override // w4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(cVar.f63711c);
        return new Metadata(b(new t(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage b(t tVar) {
        return new EventMessage((String) a6.a.e(tVar.s()), (String) a6.a.e(tVar.s()), tVar.A(), tVar.A(), Arrays.copyOfRange(tVar.f3620a, tVar.c(), tVar.d()));
    }
}
