package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {
    private static ouw ouw;

    public interface ouw {
        ExecutorService lh();

        boolean ouw();

        boolean vt();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.vt$vt, reason: collision with other inner class name */
    public interface InterfaceC0207vt {
        void ouw();

        void ouw(Throwable th2);
    }

    public static Activity ouw(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static void ouw(final Context context, final Intent intent, final InterfaceC0207vt interfaceC0207vt) {
        ExecutorService executorServiceLh;
        ouw ouwVar = ouw;
        if (ouwVar == null || !ouwVar.vt() || (executorServiceLh = ouw.lh()) == null) {
            vt(context, intent, interfaceC0207vt);
        } else {
            executorServiceLh.execute(new com.bytedance.sdk.component.pno.pno("startAct") { // from class: com.bytedance.sdk.component.utils.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    vt.vt(context, intent, interfaceC0207vt);
                }
            });
        }
    }

    public static void ouw(ouw ouwVar) {
        ouw = ouwVar;
    }

    public static boolean ouw(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean ouw(final Context context, final Intent intent, final InterfaceC0207vt interfaceC0207vt, boolean z10) {
        ouw ouwVar;
        ExecutorService executorServiceLh;
        if (!z10 || (ouwVar = ouw) == null || !ouwVar.ouw() || (executorServiceLh = ouw.lh()) == null) {
            return vt(context, intent, interfaceC0207vt);
        }
        executorServiceLh.execute(new com.bytedance.sdk.component.pno.pno("startAct") { // from class: com.bytedance.sdk.component.utils.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                vt.vt(context, intent, interfaceC0207vt);
            }
        });
        return true;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53147u);
        context.startActivity(intent);
    }

    public static boolean vt(Context context, Intent intent, InterfaceC0207vt interfaceC0207vt) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                if (interfaceC0207vt == null) {
                    return true;
                }
                interfaceC0207vt.ouw();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0207vt != null) {
                    interfaceC0207vt.ouw(th2);
                }
            }
        }
        return false;
    }
}
