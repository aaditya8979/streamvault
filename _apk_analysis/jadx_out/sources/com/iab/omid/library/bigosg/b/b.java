package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f24032a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f24034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f24037f;

    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f24032a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (this.f24036e != z10) {
            this.f24036e = z10;
            if (this.f24035d) {
                g();
                a aVar = this.f24037f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }

    private void e() {
        this.f24034c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    b.this.a(true);
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    b.this.a(false);
                } else {
                    if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return;
                    }
                    b.this.a(false);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f24033b.registerReceiver(this.f24034c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f24033b;
        if (context == null || (broadcastReceiver = this.f24034c) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.f24034c = null;
    }

    private void g() {
        boolean z10 = !this.f24036e;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = com.iab.omid.library.bigosg.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void a(@NonNull Context context) {
        this.f24033b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f24037f = aVar;
    }

    public void b() {
        e();
        this.f24035d = true;
        g();
    }

    public void c() {
        f();
        this.f24035d = false;
        this.f24036e = false;
        this.f24037f = null;
    }

    public boolean d() {
        return !this.f24036e;
    }
}
