package g5;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f62070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f62071j;

    public j(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, int i10, Format format, int i11, @Nullable Object obj, byte[] bArr) {
        super(aVar, hVar, i10, format, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f62070i = bArr;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
        this.f62071j = true;
    }

    public abstract void e(byte[] bArr, int i10) throws IOException;

    public byte[] f() {
        return this.f62070i;
    }

    public final void g(int i10) {
        byte[] bArr = this.f62070i;
        if (bArr == null) {
            this.f62070i = new byte[16384];
        } else if (bArr.length < i10 + 16384) {
            this.f62070i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public final void load() throws InterruptedException, IOException {
        try {
            this.f62017h.a(this.f62010a);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f62071j) {
                g(i11);
                i10 = this.f62017h.read(this.f62070i, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f62071j) {
                e(this.f62070i, i11);
            }
        } finally {
            k0.m(this.f62017h);
        }
    }
}
