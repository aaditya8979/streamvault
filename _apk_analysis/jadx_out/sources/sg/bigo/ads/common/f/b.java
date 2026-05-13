package sg.bigo.ads.common.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.f.a;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f82005a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f82006b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f82007c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Application f82008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f82009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<a, Object> f82010f;

    public interface a {
        void a(Activity activity);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.b$b, reason: collision with other inner class name */
    public static class C1014b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f82029a = new b(0);
    }

    private b() {
        this.f82010f = new WeakHashMap();
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static Application a() {
        return f82008d;
    }

    public static synchronized void a(@NonNull Application application) {
        if (f82005a) {
            return;
        }
        f82005a = true;
        f82006b = 0;
        f82007c = 0;
        f82008d = application;
        application.registerActivityLifecycleCallbacks(C1014b.f82029a);
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C1014b.f82029a.f82010f.put(aVar, C1014b.f82029a);
            }
        });
    }

    @Nullable
    public static Activity b() {
        WeakReference<Activity> weakReference = C1014b.f82029a.f82009e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C1014b.f82029a.f82010f.remove(aVar);
            }
        });
    }

    public static int c() {
        int i10;
        if (!f82005a || (i10 = f82007c) < 0) {
            return 0;
        }
        return i10 > 0 ? 1 : 2;
    }

    public static boolean d() {
        return f82007c > 0;
    }

    public static boolean e() {
        return f82006b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        f82006b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f82010f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull final Activity activity) {
        f82006b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f82010f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull final Activity activity) {
        this.f82009e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f82010f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull final Activity activity) {
        this.f82009e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f82010f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (f82007c == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            aVarA.b();
            if (aVarA.f82004d != null && aVarA.c()) {
                aVarA.f82004d.a(aVarA.f82002b, aVarA.f82003c);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter foreground.");
        }
        f82007c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        int i10 = f82007c - 1;
        f82007c = i10;
        if (i10 == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            if (aVarA.f82004d != null && aVarA.c()) {
                a.InterfaceC1013a interfaceC1013a = aVarA.f82004d;
                boolean z10 = aVarA.f82001a;
                long j10 = aVarA.f82002b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = aVarA.f82003c;
                System.currentTimeMillis();
                interfaceC1013a.a(z10, j10, jElapsedRealtime, j11);
            }
            aVarA.f82001a = false;
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter background.");
        }
    }
}
