package ed;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: AdEventUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }
}
