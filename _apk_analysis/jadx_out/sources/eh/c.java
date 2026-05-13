package eh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: compiled from: InactivityTimer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61144e = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f61145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f61146b = new C0748c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f61147c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AsyncTask<Object, Object, Object> f61148d;

    /* JADX INFO: compiled from: InactivityTimer.java */
    public final class b extends AsyncTask<Object, Object, Object> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                Log.i(c.f61144e, "Finishing activity due to inactivity");
                c.this.f61145a.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: eh.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InactivityTimer.java */
    public final class C0748c extends BroadcastReceiver {
        public C0748c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    c.this.e();
                } else {
                    c.this.d();
                }
            }
        }
    }

    public c(Activity activity) {
        this.f61145a = activity;
        e();
    }

    public final synchronized void d() {
        AsyncTask<Object, Object, Object> asyncTask = this.f61148d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f61148d = null;
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void e() {
        d();
        b bVar = new b();
        this.f61148d = bVar;
        bVar.execute(new Object[0]);
    }

    public synchronized void f() {
        d();
        if (this.f61147c) {
            this.f61145a.unregisterReceiver(this.f61146b);
            this.f61147c = false;
        } else {
            Log.w(f61144e, "PowerStatusReceiver was never registered?");
        }
    }

    public synchronized void g() {
        if (this.f61147c) {
            Log.w(f61144e, "PowerStatusReceiver was already registered?");
        } else {
            this.f61145a.registerReceiver(this.f61146b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f61147c = true;
        }
        e();
    }

    public void h() {
        d();
    }
}
