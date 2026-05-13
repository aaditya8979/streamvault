package kd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mgs.carparking.widgets.cache.model.Type;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f73066c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md.c f73067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f73068b = new Handler(Looper.getMainLooper());

    public a(Context context) {
        this.f73067a = new md.c(context);
    }

    public static <D> md.d<D> a(String str, Context context, Type type) {
        ld.d.e(str, "path can't be null");
        return c(context).d().a(str, type);
    }

    public static <D> md.d<D> b(String str, Context context) {
        return a(str, context, Type.NORMAL);
    }

    public static a c(Context context) {
        if (f73066c == null) {
            synchronized (a.class) {
                if (f73066c == null) {
                    f73066c = new a(context.getApplicationContext());
                }
            }
        }
        return f73066c;
    }

    public static b e(Context context) {
        return d.d().b(context);
    }

    public md.c d() {
        return this.f73067a;
    }
}
