package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ea2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iw3 f89181a = new iw3();

    public static void a(Context context) {
        iw3 iw3Var = f89181a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (iw3Var.f91025a) {
            return;
        }
        iw3Var.f91025a = true;
        jx3 jx3VarA = jx3.a();
        jx3VarA.f91415c.getClass();
        ov3 ov3Var = new ov3();
        ax3 ax3Var = jx3VarA.f91414b;
        Handler handler = new Handler();
        ax3Var.getClass();
        jx3VarA.f91416d = new vw3(handler, applicationContext, ov3Var, jx3VarA);
        bw3.f88180d.a(applicationContext);
        sv3.a(applicationContext);
        WindowManager windowManager = lw3.f92133a;
        lw3.f92135c = applicationContext.getResources().getDisplayMetrics().density;
        lw3.f92133a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new ww3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        fx3.f89722b.f89723a = applicationContext.getApplicationContext();
        pv3 pv3Var = pv3.f93801f;
        if (!pv3Var.f93804c) {
            pv3Var.f93805d.a(applicationContext);
            rw3 rw3Var = pv3Var.f93805d;
            rw3Var.f94630c = pv3Var;
            rw3Var.b();
            pv3Var.f93806e = pv3Var.f93805d.f94629b;
            pv3Var.f93804c = true;
        }
        lx3.f92168d.f92169a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new kx3(), intentFilter);
    }
}
