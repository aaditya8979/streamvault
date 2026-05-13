package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes10.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0151a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9572a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f9576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f9577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f9578g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9574c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f9575d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f9573b = c();

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppLovinCmpService.OnCompletedListener f9579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f9580b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        public class C0150a implements f {
            public C0150a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f9579a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f9579a = onCompletedListener;
            this.f9580b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f9579a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f9580b, new C0150a());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9583a;

        public b(Activity activity) {
            this.f9583a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f9573b.b(this.f9583a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9585a;

        public c(Activity activity) {
            this.f9585a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f9573b.a(this.f9585a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f9572a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f9572a.x().d());
    }

    private void a(Activity activity, e eVar) {
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        boolean z10 = false;
        synchronized (this.f9574c) {
            if (eVar != null) {
                this.f9577f = eVar;
            }
            d dVar = this.f9575d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f9575d = d.LOADING;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f9575d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f9576e);
                return;
            }
            c cVar = new c(activity);
            if (this.f9573b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f9577f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f9577f = null;
        this.f9576e = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f9573b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f9578g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f9578g = null;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f9572a);
        }
        if (!this.f9572a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f9573b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f9573b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0151a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0151a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f9574c) {
            if (this.f9577f == null) {
                this.f9575d = d.COMPLETED;
                this.f9576e = cmpErrorImpl;
            } else {
                this.f9575d = d.NONE;
                a(cmpErrorImpl);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0151a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f9574c) {
            if (this.f9577f == null) {
                this.f9575d = d.COMPLETED;
            } else {
                this.f9575d = d.NONE;
                a((AppLovinCmpError) null);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0151a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f9578g = fVar;
        if (this.f9573b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f9572a.O();
        if (o.a()) {
            this.f9572a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f9572a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }
}
