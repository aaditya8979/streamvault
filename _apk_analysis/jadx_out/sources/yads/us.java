package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f95770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf f95771b;

    public /* synthetic */ us(Context context) {
        this(new Handler(Looper.getMainLooper()), ws.a(context));
    }

    public us(Handler handler, gf gfVar) {
        this.f95770a = handler;
        this.f95771b = gfVar;
    }
}
