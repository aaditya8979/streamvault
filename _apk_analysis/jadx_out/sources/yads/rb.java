package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;

/* JADX INFO: loaded from: classes12.dex */
public final class rb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.a f94344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f94345b;

    public rb(View view, uk3 uk3Var) {
        super(view);
        this.f94344a = uk3Var;
        this.f94345b = (TextView) view.findViewById(R$id.item_text);
    }

    public static final void a(rb rbVar, View view) {
        rbVar.f94344a.invoke();
    }

    public final void a() {
        this.f94345b.setText(this.itemView.getContext().getString(R$string.ad_units));
        this.f94345b.setOnClickListener(new View.OnClickListener() { // from class: bt.e9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.rb.a(this.f6018b, view);
            }
        });
    }

    @Override // yads.ea0
    public final /* bridge */ /* synthetic */ void a(ba0 ba0Var) {
        a();
    }
}
