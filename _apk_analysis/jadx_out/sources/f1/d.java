package f1;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f61401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f61402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f61403d;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.f61403d = eVar;
        this.f61401b = componentName;
        this.f61402c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61403d.c(this.f61401b, this.f61402c);
    }
}
