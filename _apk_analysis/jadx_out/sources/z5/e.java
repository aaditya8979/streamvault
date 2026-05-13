package z5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes12.dex */
public class e implements Comparable<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f98207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f98208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final File f98209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f98210g;

    public e(String str, long j10, long j11, long j12, @Nullable File file) {
        this.f98205b = str;
        this.f98206c = j10;
        this.f98207d = j11;
        this.f98208e = file != null;
        this.f98209f = file;
        this.f98210g = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull e eVar) {
        if (!this.f98205b.equals(eVar.f98205b)) {
            return this.f98205b.compareTo(eVar.f98205b);
        }
        long j10 = this.f98206c - eVar.f98206c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f98208e;
    }

    public boolean c() {
        return this.f98207d == -1;
    }
}
