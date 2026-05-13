package fh;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: AutoFocusManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61685f = a.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Collection<String> f61686g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f61687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f61688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61689c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Camera f61690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AsyncTask<?, ?, ?> f61691e;

    /* JADX INFO: compiled from: AutoFocusManager.java */
    public final class b extends AsyncTask<Object, Object, Object> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            a.this.c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f61686g = arrayList;
        arrayList.add("continuous-picture");
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera) {
        this.f61690d = camera;
        c();
    }

    @SuppressLint({"NewApi"})
    public final synchronized void a() {
        if (!this.f61687a && this.f61691e == null) {
            b bVar = new b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f61691e = bVar;
            } catch (RejectedExecutionException e10) {
                Log.w(f61685f, "Could not request auto focus", e10);
            }
        }
    }

    public final synchronized void b() {
        AsyncTask<?, ?, ?> asyncTask = this.f61691e;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.f61691e.cancel(true);
            }
            this.f61691e = null;
        }
    }

    public synchronized void c() {
        if (this.f61689c) {
            this.f61691e = null;
            if (!this.f61687a && !this.f61688b) {
                try {
                    this.f61690d.autoFocus(this);
                    this.f61688b = true;
                } catch (RuntimeException e10) {
                    Log.w(f61685f, "Unexpected exception while focusing", e10);
                    a();
                }
            }
        }
    }

    public synchronized void d() {
        this.f61687a = true;
        if (this.f61689c) {
            b();
            try {
                this.f61690d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f61685f, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z10, Camera camera) {
        this.f61688b = false;
        a();
    }
}
