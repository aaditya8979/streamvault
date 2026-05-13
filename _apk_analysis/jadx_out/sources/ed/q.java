package ed;

import android.content.Context;
import android.content.Intent;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: JumpTypeUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class q {
    public static void a(Context context, int i10, String str, String str2) {
        if (i10 == 3) {
            a.a(context, str);
            return;
        }
        if (i10 == 4) {
            Intent intent = new Intent(context, (Class<?>) VideoMoreListActivity.class);
            intent.putExtra("videoTitle", str2);
            intent.putExtra("videoModuleId", Integer.parseInt(str));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return;
        }
        if (i10 == 7) {
            Intent intent2 = new Intent(context, (Class<?>) SpecialDetailNewActivity.class);
            intent2.putExtra("id", Integer.parseInt(str));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
        } else {
            if (i10 <= 100 || i10 >= 106) {
                return;
            }
            op.a.a().b(new ic.b0(i10));
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }
}
