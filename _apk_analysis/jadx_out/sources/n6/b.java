package n6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: compiled from: MotionPhotoDescription.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f75170b;

    /* JADX INFO: compiled from: MotionPhotoDescription.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f75173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f75174d;

        public a(String str, String str2, long j10, long j11) {
            this.f75171a = str;
            this.f75172b = str2;
            this.f75173c = j10;
            this.f75174d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f75169a = j10;
        this.f75170b = list;
    }

    @Nullable
    public MotionPhotoMetadata a(long j10) {
        long j11;
        if (this.f75170b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f75170b.size() - 1; size >= 0; size--) {
            a aVar = this.f75170b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f75171a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f75174d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f75173c;
                j11 = j17;
            }
            if (!zEquals || j12 == j11) {
                z10 = zEquals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j13, j14, this.f75169a, j15, j16);
    }
}
