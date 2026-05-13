package com.google.ads.mediation.vungle;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: VungleInitializer.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements InitializationListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f19914c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19915a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f19916b = new ArrayList<>();

    /* JADX INFO: compiled from: VungleInitializer.java */
    public interface a {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public c() {
        VungleAds.setIntegrationName(VungleWrapperFramework.admob, BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    @NonNull
    public static c a() {
        return f19914c;
    }

    public void b(@NonNull String str, @NonNull Context context, @NonNull a aVar) {
        if (d.f19918b.isInitialized()) {
            aVar.onInitializeSuccess();
        } else {
            if (this.f19915a.getAndSet(true)) {
                this.f19916b.add(aVar);
                return;
            }
            c(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            d.f19918b.a(context, str, this);
            this.f19916b.add(aVar);
        }
    }

    public void c(int i10) {
        if (i10 == 0) {
            VunglePrivacySettings.setCOPPAStatus(false);
        } else {
            if (i10 != 1) {
                return;
            }
            VunglePrivacySettings.setCOPPAStatus(true);
        }
    }

    @Override // com.vungle.ads.InitializationListener
    public void onError(@NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Iterator<a> it = this.f19916b.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adError);
        }
        this.f19916b.clear();
        this.f19915a.set(false);
    }

    @Override // com.vungle.ads.InitializationListener
    public void onSuccess() {
        Iterator<a> it = this.f19916b.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.f19916b.clear();
        this.f19915a.set(false);
    }
}
