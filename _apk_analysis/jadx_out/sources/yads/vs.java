package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class vs implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f96180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us f96181b;

    public vs(jy1 jy1Var, us usVar) {
        this.f96180a = jy1Var;
        this.f96181b = usVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f96180a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        if (textView != null) {
            us usVar = this.f96181b;
            usVar.f95770a.postDelayed(new l33(textView, usVar.f95771b), 2000L);
        }
    }

    @Override // yads.zf0
    public final void c() {
        us usVar = this.f96181b;
        usVar.f95770a.removeCallbacksAndMessages(null);
        usVar.f95771b.cancel();
    }
}
