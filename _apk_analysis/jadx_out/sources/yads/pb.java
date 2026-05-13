package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class pb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.l f93515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f93516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f93517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f93518d;

    public pb(vk3 vk3Var, View view) {
        super(view);
        this.f93515a = vk3Var;
        this.f93516b = (TextView) view.findViewById(R$id.item_name);
        this.f93517c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.f93518d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    public static final void a(pb pbVar, r90 r90Var, View view) {
        pbVar.f93515a.invoke(r90Var.f94329c);
    }

    @Override // yads.ea0
    public final void a(final r90 r90Var) {
        this.f93516b.setText(r90Var.f94327a);
        this.f93517c.setText(r90Var.f94328b);
        this.f93518d.setText(r90Var.f94329c);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: bt.b8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.pb.a(this.f5956b, r90Var, view);
            }
        });
    }
}
