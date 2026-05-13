package ul;

import java.io.EOFException;
import java.nio.ByteBuffer;
import no.m;
import no.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ByteReadPacketExtensions.jvm.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(@NotNull r rVar, @NotNull l<? super ByteBuffer, bn.r> lVar) throws EOFException {
        p.k(rVar, "<this>");
        p.k(lVar, "block");
        ro.d dVar = ro.d.f78921a;
        no.a buffer = rVar.getBuffer();
        if (!(!buffer.exhausted())) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        m mVarM = buffer.m();
        p.h(mVarM);
        byte[] bArrB = mVarM.b(true);
        int iF = mVarM.f();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iF, mVarM.d() - iF);
        p.h(byteBufferWrap);
        lVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iF;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > mVarM.j()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(iPosition);
        }
    }
}
