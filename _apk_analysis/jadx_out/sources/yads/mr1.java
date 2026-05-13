package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import yads.mr1;

/* JADX INFO: loaded from: classes9.dex */
public final class mr1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70 f92505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.l f92506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn.l f92507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public et f92508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f92509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f92510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f92511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f92512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f92513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f92514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f92515k;

    public mr1(View view, z70 z70Var, sk3 sk3Var, tk3 tk3Var) {
        super(view);
        this.f92505a = z70Var;
        this.f92506b = sk3Var;
        this.f92507c = tk3Var;
        this.f92509e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f92510f = (ImageView) view.findViewById(R$id.item_logo);
        this.f92511g = (TextView) view.findViewById(R$id.item_name);
        this.f92512h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.f92513i = (TextView) view.findViewById(R$id.item_info_first);
        this.f92514j = (TextView) view.findViewById(R$id.item_info_second);
        this.f92515k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void a(mr1 mr1Var, y90 y90Var, View view) {
        mr1Var.f92507c.invoke(y90Var.f97039e);
    }

    public static final void b(mr1 mr1Var, y90 y90Var, View view) {
        mr1Var.f92506b.invoke(y90Var);
    }

    @Override // yads.ea0
    public final void a(final y90 y90Var) {
        Context context = this.itemView.getContext();
        this.f92511g.setText(y90Var.f97035a);
        x80 x80Var = y90Var.f97037c;
        if (x80Var != null) {
            this.f92513i.setVisibility(0);
            this.f92513i.setText(x80Var.f96656a);
            this.f92513i.setTextAppearance(context, x80Var.f96659d);
            this.f92513i.setTextColor(ik.a(this.itemView.getContext(), x80Var.f96657b));
            TextView textView = this.f92513i;
            Integer num = x80Var.f96658c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.f92513i.setVisibility(8);
        }
        q50 q50Var = y90Var.f97038d;
        this.f92514j.setText(q50Var.f93890a);
        this.f92514j.setTextAppearance(context, q50Var.f93892c);
        this.f92514j.setTextColor(ik.a(this.itemView.getContext(), q50Var.f93891b));
        LinearLayout linearLayout = this.f92509e;
        String str = y90Var.f97039e;
        linearLayout.setClickable(((str == null || bo.d0.u0(str)) && y90Var.f97041g == null) ? false : true);
        String str2 = y90Var.f97039e;
        if (str2 == null || bo.d0.u0(str2)) {
            this.f92515k.setVisibility(8);
        } else {
            this.f92515k.setVisibility(0);
            this.f92509e.setOnClickListener(new View.OnClickListener() { // from class: bt.n6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mr1.a(this.f6180b, y90Var, view);
                }
            });
        }
        this.f92510f.setImageResource(0);
        et etVar = this.f92508d;
        if (etVar != null) {
            etVar.cancel();
        }
        z70 z70Var = this.f92505a;
        String str3 = y90Var.f97036b;
        if (str3 == null) {
            str3 = "";
        }
        this.f92508d = z70Var.a(str3, this.f92510f);
        if (y90Var.f97041g == null) {
            this.f92512h.setVisibility(8);
        } else {
            this.f92512h.setVisibility(0);
            this.f92509e.setOnClickListener(new View.OnClickListener() { // from class: bt.o6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mr1.b(this.f6201b, y90Var, view);
                }
            });
        }
    }
}
