package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class xs implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f96861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy1 f96862b;

    public /* synthetic */ xs(w02 w02Var) {
        this(w02Var, new jy1());
    }

    public xs(w02 w02Var, jy1 jy1Var) {
        this.f96861a = w02Var;
        this.f96862b = jy1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f96862b.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        cq2 adType = this.f96861a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == cq2.f88585d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // yads.zf0
    public final void c() {
    }
}
