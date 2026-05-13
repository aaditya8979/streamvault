package ab;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: ActivityCompatHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static boolean a(Context context) {
        if (context instanceof Activity) {
            return !c((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            if (((ContextWrapper) context).getBaseContext() instanceof Activity) {
                return !c((Activity) r2.getBaseContext());
            }
        }
        return true;
    }

    public static boolean b(FragmentActivity fragmentActivity, String str) {
        return !c(fragmentActivity) && fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) == null;
    }

    public static boolean c(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
