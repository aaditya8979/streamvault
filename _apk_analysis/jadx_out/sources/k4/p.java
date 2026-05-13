package k4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import z4.b;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.t f72903a = new a6.t(10);

    @Nullable
    public Metadata a(h hVar, @Nullable b.a aVar) throws InterruptedException, IOException {
        Metadata metadataD = null;
        int i10 = 0;
        while (true) {
            try {
                hVar.peekFully(this.f72903a.f3620a, 0, 10);
                this.f72903a.L(0);
                if (this.f72903a.B() != 4801587) {
                    break;
                }
                this.f72903a.M(3);
                int iX = this.f72903a.x();
                int i11 = iX + 10;
                if (metadataD == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f72903a.f3620a, 0, bArr, 0, 10);
                    hVar.peekFully(bArr, 10, iX);
                    metadataD = new z4.b(aVar).d(bArr, i11);
                } else {
                    hVar.advancePeekPosition(iX);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        return metadataD;
    }
}
