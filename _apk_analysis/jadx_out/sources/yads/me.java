package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class me implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f92331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz1 f92332b;

    public me(y00 y00Var, rz1 rz1Var) {
        this.f92331a = y00Var;
        this.f92332b = rz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f92332b.getClass();
        View viewFindViewById = viewGroup.findViewById(R$id.age_divider);
        if (viewFindViewById == null || this.f92331a.f96952f != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // yads.zf0
    public final void c() {
    }
}
