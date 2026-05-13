package a1;

import java.io.File;

/* JADX INFO: compiled from: TotalSizeLruDiskUsage.java */
/* JADX INFO: loaded from: classes11.dex */
public class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3478b;

    public g(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f3478b = j10;
    }

    @Override // a1.e
    public boolean b(File file, long j10, int i10) {
        return j10 <= this.f3478b;
    }
}
