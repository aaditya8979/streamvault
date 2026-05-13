package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes3.dex */
public final class id {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f90770d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final um0 f90771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa2 f90772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f90773c;

    public /* synthetic */ id(um0 um0Var, oa2 oa2Var) {
        this(um0Var, oa2Var, new b1());
    }

    public id(um0 um0Var, oa2 oa2Var, b1 b1Var) {
        this.f90771a = um0Var;
        this.f90772b = oa2Var;
        this.f90773c = b1Var;
    }

    public static final void a(DialogInterface dialogInterface) {
        f90770d = false;
    }

    public final void a(Activity activity, kd kdVar, rc rcVar) {
        ad adVar = new ad(activity, false, 14);
        ke1 ke1Var = new ke1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        tn.p.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(adVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (ub.a(35)) {
                uc.a(viewGroup2);
            }
            viewGroup2.addView(kdVar);
        }
        View viewFindViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new zc(viewGroup, dialog, ke1Var));
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new yc(dialog, ke1Var));
        }
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: bt.s2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yads.id.a(dialogInterface);
            }
        });
        um0 um0Var = this.f90771a;
        oa2 oa2Var = this.f90772b;
        Handler handler = new Handler(Looper.getMainLooper());
        xc xcVar = new xc(dialog, kdVar, um0Var, oa2Var, handler);
        String str = rcVar.f94359b;
        String str2 = rcVar.f94360c;
        kdVar.setAdtuneWebViewListener(new vc(xcVar));
        kdVar.setOptOutUrl(str2);
        kdVar.loadUrl(str);
        handler.postDelayed(new wc(xcVar), xc.f96705e);
        dialog.show();
    }

    public final void a(View view, rc rcVar) {
        Activity activity;
        Activity activityB;
        if (f90770d) {
            return;
        }
        this.f90773c.getClass();
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (j1.f91068a) {
                k1 k1Var = j1.f91069b;
                activityB = k1Var != null ? k1Var.b() : null;
            }
            activity = activityB;
        }
        if (activity == null || !tb.a((Context) activity)) {
            return;
        }
        try {
            kd kdVar = new kd(activity);
            f90770d = true;
            a(activity, kdVar, rcVar);
        } catch (Throwable unused) {
            f90770d = false;
        }
    }
}
