package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4668b2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f66410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f66411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f66412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4642a2 f66414f;

    public C4668b2(@NotNull Context context) {
        this(context, AbstractC4694c2.a());
    }

    @VisibleForTesting
    public C4668b2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f66409a = context;
        this.f66410b = iAppSetIdRetriever;
        this.f66412d = new CountDownLatch(1);
        this.f66413e = 20L;
        this.f66414f = new C4642a2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @WorkerThread
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f66411c == null) {
            try {
                this.f66412d = new CountDownLatch(1);
                this.f66410b.retrieveAppSetId(this.f66409a, this.f66414f);
                this.f66412d.await(this.f66413e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f66411c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f66411c = appSetId;
        }
        return appSetId;
    }
}
