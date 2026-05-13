package ed;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageLoaderUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f61087a = new l();

    public static final boolean a(@Nullable Context context) {
        if (context instanceof Activity) {
            return !f61087a.b((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                tn.p.i(contextWrapper.getBaseContext(), "null cannot be cast to non-null type android.app.Activity");
                return !f61087a.b((Activity) r2);
            }
        }
        return true;
    }

    public final boolean b(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
