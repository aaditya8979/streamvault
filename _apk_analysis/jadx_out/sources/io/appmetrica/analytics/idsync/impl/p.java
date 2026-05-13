package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import cn.f0;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f64921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f64922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f64923c = new SystemTimeProvider();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f64924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f64925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f64926f;

    public p(@NotNull ServiceContext serviceContext, @NotNull B b10) {
        this.f64921a = serviceContext;
        this.f64922b = b10;
        this.f64924d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f64925e = new s(serviceContext);
        this.f64926f = new i(serviceContext);
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        s sVar = pVar.f64925e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if ((r.f64929a[preconditions.getNetworkType().ordinal()] == 1 ? new C4638b(sVar.f64930a) : new C4637a()).a()) {
            q qVar = pVar.f64924d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), f0.D0(entry.getValue(), ", ", null, null, 0, null, null, 62, null));
            }
            Response responseExecute = new NetworkClient.Builder().withSslSocketFactory(qVar.f64927a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f64928b.a(new y(requestConfig.getType(), responseExecute.isCompleted(), responseExecute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(responseExecute.getCode())), responseExecute.getCode(), (responseExecute.getResponseData().length == 0) ^ true ? responseExecute.getResponseData() : responseExecute.getErrorData(), responseExecute.getHeaders()));
        }
    }

    public static final void a(y yVar, p pVar) {
        if (yVar.f64934b) {
            B b10 = pVar.f64922b;
            String str = yVar.f64933a;
            b10.f64871d.put(str, new z(str, pVar.f64923c.currentTimeMillis(), yVar.f64936d ? 2 : 4));
            b10.f64868a.putString(b10.f64870c, b10.f64869b.fromModel(f0.g1(b10.f64871d.values())));
            i iVar = pVar.f64926f;
            ModuleSelfReporter selfReporter = iVar.f64898a.getSelfReporter();
            iVar.f64899b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public final void a(@NotNull final y yVar) {
        this.f64921a.getExecutorProvider().getModuleExecutor().execute(new Runnable() { // from class: lh.b
            @Override // java.lang.Runnable
            public final void run() {
                p.a(yVar, this);
            }
        });
    }

    public final void a(@NotNull final RequestConfig requestConfig) {
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || !(!requestConfig.getValidResponseCodes().isEmpty())) {
            return;
        }
        z zVar = (z) this.f64922b.f64871d.get(requestConfig.getType());
        if (zVar != null) {
            long jCurrentTimeMillis = this.f64923c.currentTimeMillis();
            int iA = v.a(zVar.f64942c);
            if (jCurrentTimeMillis - zVar.f64941b < (iA != 1 ? iA != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse() : requestConfig.getResendIntervalForValidResponse())) {
                return;
            }
        }
        this.f64921a.getExecutorProvider().getSupportIOExecutor().execute(new Runnable() { // from class: lh.a
            @Override // java.lang.Runnable
            public final void run() {
                p.a(this.f73834b, requestConfig);
            }
        });
    }
}
