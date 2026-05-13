package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4711cj implements InterfaceC4923l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public We f66538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenInfo f66539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4685bj f66542e = new C4685bj();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f66543f = new WeakReference(null);

    public final We a(Context context) {
        if (this.f66538a == null) {
            this.f66538a = new We(C4696c4.l().c(context).a(context));
        }
        We we2 = this.f66538a;
        tn.p.h(we2);
        return we2;
    }

    @WorkerThread
    public final synchronized void a(@NotNull Activity activity) {
        this.f66543f = new WeakReference(activity);
        if (!this.f66541d) {
            this.f66539b = a((Context) activity).p();
            this.f66540c = a((Context) activity).t();
            this.f66541d = true;
        }
        if (this.f66539b == null) {
            c(activity);
        }
    }

    @VisibleForTesting
    public final void a(@NotNull We we2) {
        this.f66538a = we2;
    }

    @WorkerThread
    @Nullable
    public final synchronized ScreenInfo b(@NotNull Context context) {
        if (!this.f66541d) {
            this.f66539b = a(context).p();
            this.f66540c = a(context).t();
            this.f66541d = true;
        }
        c((Context) this.f66543f.get());
        if (this.f66539b == null) {
            if (!AndroidUtils.isApiAchieved(30)) {
                c(context);
            } else if (!this.f66540c) {
                c(context);
                this.f66540c = true;
                a(context).v();
            }
        }
        return this.f66539b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f66542e.getClass();
            ScreenInfo screenInfoA = C4685bj.a(context);
            if (screenInfoA == null || tn.p.f(screenInfoA, this.f66539b)) {
                return;
            }
            this.f66539b = screenInfoA;
            a(context).a(this.f66539b);
        }
    }
}
