package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;
import yads.c53;

/* JADX INFO: loaded from: classes11.dex */
public final class c53 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.p f88356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Switch f88357b;

    public c53(View view, rk3 rk3Var) {
        super(view);
        this.f88356a = rk3Var;
        this.f88357b = (Switch) view.findViewById(R$id.item_switch);
    }

    public static final void a(c53 c53Var, aa0 aa0Var, CompoundButton compoundButton, boolean z10) {
        sn.p pVar = c53Var.f88356a;
        aa0Var.getClass();
        pVar.mo2invoke(z90.f97434b, Boolean.valueOf(z10));
    }

    @Override // yads.ea0
    public final void a(final aa0 aa0Var) {
        this.f88357b.setOnCheckedChangeListener(null);
        Switch r02 = this.f88357b;
        aa0Var.getClass();
        r02.setText("Debug Error Indicator");
        this.f88357b.setChecked(aa0Var.f87621a);
        this.f88357b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bt.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                c53.a(this.f6313a, aa0Var, compoundButton, z10);
            }
        });
    }
}
