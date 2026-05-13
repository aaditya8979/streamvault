package v;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: VpModuleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f85857a;

    public static void a(@NonNull Context context) {
        f85857a = context.getApplicationContext();
    }

    public static Context getContext() {
        Context context = f85857a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("should be initialized in application");
    }
}
