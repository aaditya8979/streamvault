package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class db3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb3 f88791a;

    public db3() {
        this(new cb3());
    }

    public db3(cb3 cb3Var) {
        this.f88791a = cb3Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public final boolean a(Context context, String str) {
        try {
            this.f88791a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
