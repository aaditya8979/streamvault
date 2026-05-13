package g7;

import android.os.Bundle;
import com.google.android.exoplayer2.f;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CueGroup.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f62171d = new f(ImmutableList.of(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.a<f> f62172e = new f.a() { // from class: g7.e
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return f.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<b> f62173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62174c;

    public f(List<b> list, long j10) {
        this.f62173b = ImmutableList.copyOf((Collection) list);
        this.f62174c = j10;
    }

    public static ImmutableList<b> b(List<b> list) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f62140e == null) {
                aVarBuilder.a(list.get(i10));
            }
        }
        return aVarBuilder.m();
    }

    public static final f c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return new f(parcelableArrayList == null ? ImmutableList.of() : s7.c.b(b.f62136t, parcelableArrayList), bundle.getLong(d(1)));
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(d(0), s7.c.d(b(this.f62173b)));
        bundle.putLong(d(1), this.f62174c);
        return bundle;
    }
}
