package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.l f92670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f92671b;

    public n0(pk3 pk3Var, View view) {
        super(view);
        this.f92670a = pk3Var;
        this.f92671b = (TextView) view.findViewById(R$id.item_button);
    }

    public static final void a(n0 n0Var, u90 u90Var, View view) {
        sn.l lVar = n0Var.f92670a;
        u90Var.getClass();
        lVar.invoke(t90.f95110b);
    }

    @Override // yads.ea0
    public final void a(final u90 u90Var) {
        TextView textView = this.f92671b;
        u90Var.getClass();
        textView.setText("Enable Test mode");
        this.f92671b.setOnClickListener(new View.OnClickListener() { // from class: bt.s6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.n0.a(this.f6286b, u90Var, view);
            }
        });
    }
}
