package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class je1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f91191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f91192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f91193c;

    public je1(View view) {
        super(view);
        this.f91191a = (TextView) view.findViewById(R$id.item_title);
        this.f91192b = (TextView) view.findViewById(R$id.item_subtitle);
        this.f91193c = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        x90 x90Var = (x90) ba0Var;
        String str = x90Var.f96677a;
        x80 x80Var = x90Var.f96678b;
        q50 q50Var = x90Var.f96679c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.f91191a.setVisibility(0);
            this.f91191a.setText(str);
        } else {
            this.f91191a.setVisibility(8);
        }
        if (x80Var == null || !(!bo.d0.u0(x80Var.f96656a))) {
            this.f91192b.setVisibility(8);
        } else {
            this.f91192b.setVisibility(0);
            this.f91192b.setText(x80Var.f96656a);
            this.f91192b.setTextColor(ik.a(context, x80Var.f96657b));
            Integer num = x80Var.f96658c;
            this.f91192b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (q50Var == null || !(!bo.d0.u0(q50Var.f93890a))) {
            this.f91193c.setVisibility(8);
            return;
        }
        this.f91193c.setVisibility(0);
        this.f91193c.setText(q50Var.f93890a);
        this.f91193c.setTextColor(ik.a(context, q50Var.f93891b));
    }
}
