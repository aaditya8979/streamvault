package q7;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import e7.g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TrackSelectionOverride.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.a<w> f78125d = new f.a() { // from class: q7.v
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return w.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f78126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList<Integer> f78127c;

    public w(g0 g0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= g0Var.f60866b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f78126b = g0Var;
        this.f78127c = ImmutableList.copyOf((Collection) list);
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ w c(Bundle bundle) {
        return new w((g0) g0.f60865g.fromBundle((Bundle) s7.a.e(bundle.getBundle(b(0)))), Ints.c((int[]) s7.a.e(bundle.getIntArray(b(1)))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f78126b.equals(wVar.f78126b) && this.f78127c.equals(wVar.f78127c);
    }

    public int getType() {
        return this.f78126b.f60868d;
    }

    public int hashCode() {
        return this.f78126b.hashCode() + (this.f78127c.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(b(0), this.f78126b.toBundle());
        bundle.putIntArray(b(1), Ints.n(this.f78127c));
        return bundle;
    }
}
