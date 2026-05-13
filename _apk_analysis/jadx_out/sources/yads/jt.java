package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;
import yads.jt;

/* JADX INFO: loaded from: classes2.dex */
public final class jt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f91348c = new Comparator() { // from class: bt.s3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((jt) obj2).f91350b, ((jt) obj).f91350b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o20 f91349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91350b;

    public jt(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        n20 n20VarB = new n20().a(spannableStringBuilder).a(alignment).a(f10).a(i10).b(f11).b(i11).b();
        if (z10) {
            n20VarB.c(i12);
        }
        this.f91349a = n20VarB.a();
        this.f91350b = i13;
    }
}
