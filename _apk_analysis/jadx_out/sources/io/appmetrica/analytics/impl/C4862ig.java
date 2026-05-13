package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.C4862ig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4862ig implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4888jg f66987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5139tg f66988b;

    public C4862ig(C4888jg c4888jg, InterfaceC5139tg interfaceC5139tg) {
        this.f66987a = c4888jg;
        this.f66988b = interfaceC5139tg;
    }

    public static final void a(C4888jg c4888jg, InterfaceC5139tg interfaceC5139tg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c4888jg.f67035b.getInstallReferrer();
                interfaceC5139tg.a(new C5015og(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC4990ng.f67365c));
                installReferrerClient = c4888jg.f67035b;
            } catch (Throwable th2) {
                try {
                    interfaceC5139tg.a(th2);
                    installReferrerClient = c4888jg.f67035b;
                } catch (Throwable th3) {
                    try {
                        c4888jg.f67035b.endConnection();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (i10 == 0) {
            final C4888jg c4888jg = this.f66987a;
            ICommonExecutor iCommonExecutor = c4888jg.f67034a;
            final InterfaceC5139tg interfaceC5139tg = this.f66988b;
            iCommonExecutor.execute(new Runnable() { // from class: mh.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C4862ig.a(c4888jg, interfaceC5139tg);
                }
            });
            return;
        }
        this.f66987a.a(this.f66988b, new IllegalStateException("Referrer check failed with error " + i10));
    }
}
