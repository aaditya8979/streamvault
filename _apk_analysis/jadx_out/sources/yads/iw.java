package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class iw extends hk3 {
    public iw(TextView textView) {
        super(textView);
    }

    @Override // yads.hk3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f89689b == gwVar.f90134a) {
            return tn.p.f(textView.getText().toString(), gwVar.f90135b);
        }
        return true;
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        TextView textView = (TextView) view;
        gw gwVar = (gw) obj;
        if (fw.f89689b == gwVar.f90134a) {
            textView.setText(gwVar.f90135b);
        }
    }
}
