package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5295zm implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f68083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4765em f68084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Kl f68085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f68086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigProvider f68087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f68088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f68089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Sl f68090h;

    public C5295zm(Bm bm2, Sl sl2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f68083a = bm2;
        this.f68090h = sl2;
        this.f68086d = requestDataHolder;
        this.f68088f = responseDataHolder;
        this.f68087e = configProvider;
        this.f68089g = fullUrlFormer;
        fullUrlFormer.setHosts(((C4714cm) configProvider.getConfig()).k());
    }

    public C5295zm(@NonNull Bm bm2, @NonNull FullUrlFormer<C4714cm> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C4714cm> configProvider) {
        this(bm2, new Sl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f68083a.f65057a.f65134f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f68089g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f68086d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f68088f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C4714cm) this.f68087e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bl) C5009oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f68086d.setHeader("Accept-Encoding", "encrypted");
        return this.f68083a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        if (z10) {
            return;
        }
        this.f68085c = Kl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C4765em c4765emHandle = this.f68090h.handle(this.f68088f);
        this.f68084b = c4765emHandle;
        return c4765emHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
        this.f68085c = Kl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f68085c = Kl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f68084b == null || this.f68088f.getResponseHeaders() == null) {
            return;
        }
        this.f68083a.a(this.f68084b, (C4714cm) this.f68087e.getConfig(), this.f68088f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f68085c == null) {
            this.f68085c = Kl.UNKNOWN;
        }
        this.f68083a.a(this.f68085c);
    }
}
