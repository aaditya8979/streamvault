package kd;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: ManagerRetriever.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f73072b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f73073a;

    public static d d() {
        return f73072b;
    }

    public b a(Activity activity) {
        return b(activity.getApplicationContext());
    }

    public b b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a save or read on a null Context");
        }
        if (!(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return c((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return b(((ContextWrapper) context).getBaseContext());
            }
        }
        return e(context);
    }

    public b c(FragmentActivity fragmentActivity) {
        return b(fragmentActivity.getApplicationContext());
    }

    public final b e(Context context) {
        if (this.f73073a == null) {
            synchronized (this) {
                if (this.f73073a == null) {
                    this.f73073a = new b(context.getApplicationContext());
                }
            }
        }
        return this.f73073a;
    }
}
