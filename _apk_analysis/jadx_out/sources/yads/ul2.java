package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes4.dex */
public final class ul2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f95714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vl2 f95715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f95716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz1 f95717d;

    public ul2(y00 y00Var, vl2 vl2Var, gy1 gy1Var, bz1 bz1Var) {
        this.f95714a = y00Var;
        this.f95715b = vl2Var;
        this.f95716c = gy1Var;
        this.f95717d = bz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        String strValueOf;
        this.f95717d.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.rating_container);
        Float f10 = this.f95714a.f96957k;
        if (f10 == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        this.f95716c.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.rating_text);
        if (textView != null) {
            vl2 vl2Var = this.f95715b;
            float fFloatValue = f10.floatValue();
            vl2Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                strValueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
