package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class u01 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f95466a;

    public u01(View view) {
        super(view);
        this.f95466a = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        this.f95466a.setText(((w90) ba0Var).f96311a);
    }
}
