package w5;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackSelectionArray.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.trackselection.c[] f86334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86335c;

    public c(com.google.android.exoplayer.trackselection.c... cVarArr) {
        this.f86334b = cVarArr;
        this.f86333a = cVarArr.length;
    }

    @Nullable
    public com.google.android.exoplayer.trackselection.c a(int i10) {
        return this.f86334b[i10];
    }

    public com.google.android.exoplayer.trackselection.c[] b() {
        return (com.google.android.exoplayer.trackselection.c[]) this.f86334b.clone();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f86334b, ((c) obj).f86334b);
    }

    public int hashCode() {
        if (this.f86335c == 0) {
            this.f86335c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f86334b);
        }
        return this.f86335c;
    }
}
