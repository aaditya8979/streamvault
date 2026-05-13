package i6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import z6.b;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.a0 f63939a = new s7.a0(10);

    @Nullable
    public Metadata a(l lVar, @Nullable b.a aVar) throws IOException {
        Metadata metadataE = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.peekFully(this.f63939a.d(), 0, 10);
                this.f63939a.P(0);
                if (this.f63939a.G() != 4801587) {
                    break;
                }
                this.f63939a.Q(3);
                int iC = this.f63939a.C();
                int i11 = iC + 10;
                if (metadataE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f63939a.d(), 0, bArr, 0, 10);
                    lVar.peekFully(bArr, 10, iC);
                    metadataE = new z6.b(aVar).e(bArr, i11);
                } else {
                    lVar.advancePeekPosition(iC);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        return metadataE;
    }
}
