package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Oj;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f26095a = kotlin.b.b(new sn.a() { // from class: n9.t3
        @Override // sn.a
        public final Object invoke() {
            return Oj.a();
        }
    });

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void a(Runnable runnable) {
        tn.p.k(runnable, "runnable");
        ((Handler) f26095a.getValue()).post(runnable);
    }
}
