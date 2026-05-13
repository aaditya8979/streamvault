package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f31607d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f31608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f31610c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f31607d == null) {
            synchronized (ContextProvider.class) {
                if (f31607d == null) {
                    f31607d = new ContextProvider();
                }
            }
        }
        return f31607d;
    }

    public Context getActiveContext() {
        Activity activity = this.f31608a;
        return activity != null ? activity : this.f31609b;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f31609b;
        return (context != null || (activity = this.f31608a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f31608a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f31610c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f31608a = activity;
            Iterator<a> it = this.f31610c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f31608a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f31610c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f31608a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f31609b = context;
        }
    }
}
