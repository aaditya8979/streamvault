package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes12.dex */
public abstract class gw3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xv3 f90143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw3 f90144b;

    public gw3(fw3 fw3Var) {
        this.f90144b = fw3Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        xv3 xv3Var = this.f90143a;
        if (xv3Var != null) {
            mw3 mw3Var = (mw3) xv3Var;
            mw3Var.f92592c = null;
            mw3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
