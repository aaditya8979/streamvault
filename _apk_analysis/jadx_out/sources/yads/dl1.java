package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class dl1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f88900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz1 f88901b;

    public dl1(y00 y00Var, bz1 bz1Var) {
        this.f88900a = y00Var;
        this.f88901b = bz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f88901b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        if (extendedViewContainer != null) {
            y00 y00Var = this.f88900a;
            if (y00Var.f96950d == null && y00Var.f96947a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
