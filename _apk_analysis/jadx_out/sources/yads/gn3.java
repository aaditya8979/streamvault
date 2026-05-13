package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class gn3 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f90053a;

    public /* synthetic */ gn3() {
        this(new jy1());
    }

    public gn3(jy1 jy1Var) {
        this.f90053a = jy1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f90053a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
