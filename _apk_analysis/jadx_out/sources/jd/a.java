package jd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: AppFrontBackHelper.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f72398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f72399b = new C0852a();

    /* JADX INFO: renamed from: jd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public class C0852a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f72400b = 0;

        public C0852a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i10 = this.f72400b + 1;
            this.f72400b = i10;
            if (i10 != 1 || a.this.f72398a == null) {
                return;
            }
            a.this.f72398a.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i10 = this.f72400b - 1;
            this.f72400b = i10;
            if (i10 != 0 || a.this.f72398a == null) {
                return;
            }
            a.this.f72398a.b();
        }
    }

    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public interface b {
        void a();

        void b();
    }

    public void b(Application application, b bVar) {
        this.f72398a = bVar;
        application.registerActivityLifecycleCallbacks(this.f72399b);
    }
}
