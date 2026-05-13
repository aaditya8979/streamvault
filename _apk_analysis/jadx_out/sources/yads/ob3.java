package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import yads.ob3;

/* JADX INFO: loaded from: classes12.dex */
public final class ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f93169c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f93170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93171b;

    public /* synthetic */ ob3(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public ob3(Context context, Handler handler) {
        this.f93170a = handler;
        this.f93171b = context.getApplicationContext();
    }

    public static final void a(ob3 ob3Var) {
        Toast.makeText(ob3Var.f93171b, f93169c, 1).show();
    }

    public final void a() {
        this.f93170a.post(new Runnable() { // from class: bt.l7
            @Override // java.lang.Runnable
            public final void run() {
                ob3.a(this.f6138b);
            }
        });
    }
}
