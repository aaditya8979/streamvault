package sg.bigo.ads.common.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.o.f;

/* JADX INFO: loaded from: classes12.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f82284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f82285d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f82288e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82287b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue<IBinder> f82286a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.f82288e = context;
    }

    public static e a(Context context) {
        if (f82284c == null) {
            synchronized (e.class) {
                if (f82284c == null) {
                    f82284c = new e(context);
                }
            }
        }
        return f82284c;
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (f82285d) {
                this.f82286a.clear();
                this.f82286a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }

    private void b() {
        try {
            synchronized (f82285d) {
                this.f82286a.clear();
            }
        } catch (Exception unused) {
        }
    }

    public final f a(long j10, TimeUnit timeUnit) {
        try {
            IBinder iBinderPoll = this.f82286a.poll(j10, timeUnit);
            if (iBinderPoll == null) {
                return null;
            }
            a(iBinderPoll);
            return f.a.a(iBinderPoll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f82287b) {
            try {
                this.f82287b = false;
                b();
                this.f82288e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }
}
