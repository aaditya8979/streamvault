package o5;

import android.text.Layout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Cea708Cue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends n5.b implements Comparable<b> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f76147q;

    public b(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12, z10, i13);
        this.f76147q = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull b bVar) {
        int i10 = bVar.f76147q;
        int i11 = this.f76147q;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
