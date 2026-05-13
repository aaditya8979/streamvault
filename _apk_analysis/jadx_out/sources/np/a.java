package np;

import android.app.Activity;
import java.util.Stack;

/* JADX INFO: compiled from: AppManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Stack<Activity> f75950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f75951b;

    public static a b() {
        if (f75951b == null) {
            f75951b = new a();
        }
        return f75951b;
    }

    public void a(Activity activity) {
        if (f75950a == null) {
            f75950a = new Stack<>();
        }
        f75950a.add(activity);
    }

    public void c(Activity activity) {
        if (activity != null) {
            f75950a.remove(activity);
        }
    }

    public Activity getActivity(Class<?> cls) {
        Stack<Activity> stack = f75950a;
        if (stack == null) {
            return null;
        }
        for (Activity activity : stack) {
            if (activity.getClass().equals(cls)) {
                return activity;
            }
        }
        return null;
    }
}
