package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.C4888jg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4888jg implements Pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f67034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f67035b;

    public C4888jg(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.f67034a = iCommonExecutor;
        this.f67035b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC5139tg interfaceC5139tg, Throwable th2) {
        interfaceC5139tg.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NotNull InterfaceC5139tg interfaceC5139tg) throws Throwable {
        this.f67035b.startConnection(new C4862ig(this, interfaceC5139tg));
    }

    public final void a(final InterfaceC5139tg interfaceC5139tg, final Throwable th2) {
        this.f67034a.execute(new Runnable() { // from class: mh.j0
            @Override // java.lang.Runnable
            public final void run() {
                C4888jg.b(interfaceC5139tg, th2);
            }
        });
    }
}
