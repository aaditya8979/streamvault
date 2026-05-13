package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.mediation.adapters.bytedance.BuildConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import w3.b;
import w3.d;

/* JADX INFO: compiled from: PangleInitializer.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f19884f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19885a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19886b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0282a> f19887c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f19888d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f19889e = new b();

    /* JADX INFO: renamed from: com.google.ads.mediation.pangle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleInitializer.java */
    public interface InterfaceC0282a {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    @NonNull
    public static a a() {
        if (f19884f == null) {
            f19884f = new a();
        }
        return f19884f;
    }

    public void b(@NonNull Context context, @NonNull String str, @NonNull InterfaceC0282a interfaceC0282a) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = w3.a.a(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
            interfaceC0282a.onInitializeError(adErrorA);
        } else if (this.f19885a) {
            this.f19887c.add(interfaceC0282a);
        } else {
            if (this.f19886b) {
                interfaceC0282a.onInitializeSuccess();
                return;
            }
            this.f19885a = true;
            this.f19887c.add(interfaceC0282a);
            this.f19888d.c(context, this.f19889e.a().appId(str).setAdxId("207").setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", BuildConfig.VERSION_NAME)).build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i10, @NonNull String str) {
        this.f19885a = false;
        this.f19886b = false;
        AdError adErrorC = w3.a.c(i10, str);
        Iterator<InterfaceC0282a> it = this.f19887c.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adErrorC);
        }
        this.f19887c.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.f19885a = false;
        this.f19886b = true;
        Iterator<InterfaceC0282a> it = this.f19887c.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.f19887c.clear();
    }
}
