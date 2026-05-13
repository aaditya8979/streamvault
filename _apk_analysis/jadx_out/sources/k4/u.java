package k4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f72927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f72929d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f72926a = i10;
            this.f72927b = bArr;
            this.f72928c = i11;
            this.f72929d = i12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72926a == aVar.f72926a && this.f72928c == aVar.f72928c && this.f72929d == aVar.f72929d && Arrays.equals(this.f72927b, aVar.f72927b);
        }

        public int hashCode() {
            return (((((this.f72926a * 31) + Arrays.hashCode(this.f72927b)) * 31) + this.f72928c) * 31) + this.f72929d;
        }
    }

    void a(a6.t tVar, int i10);

    int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException;

    void c(long j10, int i10, int i11, int i12, @Nullable a aVar);

    void d(Format format);
}
