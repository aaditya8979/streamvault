package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class xc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f96705e = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f96706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um0 f96707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa2 f96708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f96709d;

    public xc(Dialog dialog, kd kdVar, um0 um0Var, oa2 oa2Var, Handler handler) {
        this.f96706a = dialog;
        this.f96707b = um0Var;
        this.f96708c = oa2Var;
        this.f96709d = handler;
    }
}
