package yads;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class sm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx1 f94881a;

    public sm3(xx1 xx1Var) {
        this.f94881a = xx1Var;
    }

    public final void a(View view, boolean z10) {
        int i10;
        int i11 = z10 ? this.f94881a.f96918a : this.f94881a.f96919b;
        if (z10) {
            i10 = this.f94881a.f96920c;
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = this.f94881a.f96921d;
        }
        view.setBackground(ContextCompat.getDrawable(view.getContext(), i11));
        view.setContentDescription(ContextCompat.getString(view.getContext(), i10));
    }
}
