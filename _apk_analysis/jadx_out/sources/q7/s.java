package q7;

import androidx.annotation.Nullable;
import e7.g0;

/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f78115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Object f78116i;

    public s(g0 g0Var, int i10, int i11) {
        this(g0Var, i10, i11, 0, null);
    }

    public s(g0 g0Var, int i10, int i11, int i12, @Nullable Object obj) {
        super(g0Var, new int[]{i10}, i11);
        this.f78115h = i12;
        this.f78116i = obj;
    }

    @Override // q7.r
    public int getSelectedIndex() {
        return 0;
    }
}
