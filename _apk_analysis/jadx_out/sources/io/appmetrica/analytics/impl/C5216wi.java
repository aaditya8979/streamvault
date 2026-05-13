package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5216wi extends C4972mn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC5191vi f67907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f67908e;

    public C5216wi(@NonNull Y4 y42, @NonNull Ll ll2, @NonNull ICommonExecutor iCommonExecutor) {
        super(y42, ll2);
        this.f67907d = new RunnableC5191vi(this);
        this.f67908e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C4972mn
    public final void a() {
        this.f67908e.remove(this.f67907d);
    }

    @Override // io.appmetrica.analytics.impl.C4972mn
    public final void f() {
        this.f67309b.a();
        C4941lh c4941lh = (C4941lh) ((Y4) this.f67308a).f66224k.a();
        if (c4941lh.f67222k.a(c4941lh.f67221j)) {
            String str = c4941lh.f67224m;
            if (TextUtils.isEmpty(str) || com.ironsource.Y1.f30690f.equals(str)) {
                return;
            }
            try {
                a(Wd.a((Y4) this.f67308a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C4972mn
    public final void g() {
        this.f67908e.executeDelayed(this.f67907d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f67310c.get()) {
            return;
        }
        this.f67908e.remove(this.f67907d);
        if (((C4941lh) ((Y4) this.f67308a).f66224k.a()).f67218g > 0) {
            this.f67908e.executeDelayed(this.f67907d, TimeUnit.SECONDS.toMillis(((C4941lh) ((Y4) this.f67308a).f66224k.a()).f67218g));
        }
    }
}
