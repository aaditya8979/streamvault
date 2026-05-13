package i5;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Period1.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f63767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f63769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f63770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final d f63771e;

    public f(@Nullable String str, long j10, List<a> list, List<e> list2) {
        this(str, j10, list, list2, null);
    }

    public f(@Nullable String str, long j10, List<a> list, List<e> list2, @Nullable d dVar) {
        this.f63767a = str;
        this.f63768b = j10;
        this.f63769c = Collections.unmodifiableList(list);
        this.f63770d = Collections.unmodifiableList(list2);
        this.f63771e = dVar;
    }

    public int a(int i10) {
        int size = this.f63769c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f63769c.get(i11).f63731b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
