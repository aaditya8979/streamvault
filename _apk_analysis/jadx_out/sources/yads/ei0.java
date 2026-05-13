package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import yads.ei0;

/* JADX INFO: loaded from: classes7.dex */
public final class ei0 implements ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f89261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f89262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f89263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mi0 f89264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wi0 f89265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f89266f;

    public ei0(w02 w02Var, kz kzVar, at1 at1Var, mi0 mi0Var, wi0 wi0Var) {
        this.f89261a = w02Var;
        this.f89262b = kzVar;
        this.f89263c = at1Var;
        this.f89264d = mi0Var;
        this.f89265e = wi0Var;
    }

    public static final void a(ei0 ei0Var, DialogInterface dialogInterface) {
        ei0Var.f89266f = null;
    }

    public final void a(Context context) {
        gi0 gi0Var;
        Object next;
        try {
            mi0 mi0Var = this.f89264d;
            w02 w02Var = this.f89261a;
            mi0Var.getClass();
            List listD = w02Var.d();
            if (listD != null) {
                Iterator it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str = ((gi0) next).f89988a;
                    fg0[] fg0VarArr = fg0.f89568b;
                    if (tn.p.f(str, "close_dialog")) {
                        break;
                    }
                }
                gi0Var = (gi0) next;
            } else {
                gi0Var = null;
            }
            if (gi0Var == null) {
                this.f89262b.e();
                return;
            }
            bn.g gVarB = kotlin.b.b(new fi0(context, null));
            this.f89265e.getClass();
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), (DivConfiguration) gVarB.getValue(), 0, null, 4, null), null, 0, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(context, com.yandex.mobile.ads.R$style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: bt.j1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ei0.a(this.f6093b, dialogInterface);
                }
            });
            div2View.setActionHandler(new nw(new mw(dialog, this.f89262b)));
            div2View.setData(gi0Var.f89992e, gi0Var.f89993f);
            dialog.setContentView(div2View);
            this.f89266f = dialog;
            dialog.show();
        } catch (Throwable th2) {
            this.f89263c.reportError("Failed to show DivKit close dialog", th2);
        }
    }
}
