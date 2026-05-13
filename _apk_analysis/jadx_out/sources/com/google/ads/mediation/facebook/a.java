package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: FacebookInitializer.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f19811d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19812a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19813b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0280a> f19814c = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FacebookInitializer.java */
    public interface InterfaceC0280a {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public static a a() {
        if (f19811d == null) {
            f19811d = new a();
        }
        return f19811d;
    }

    public void b(Context context, ArrayList<String> arrayList, InterfaceC0280a interfaceC0280a) {
        if (this.f19812a) {
            this.f19814c.add(interfaceC0280a);
        } else {
            if (this.f19813b) {
                interfaceC0280a.onInitializeSuccess();
                return;
            }
            this.f19812a = true;
            a().f19814c.add(interfaceC0280a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.20.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f19812a = false;
        this.f19813b = initResult.isSuccess();
        for (InterfaceC0280a interfaceC0280a : this.f19814c) {
            if (initResult.isSuccess()) {
                interfaceC0280a.onInitializeSuccess();
            } else {
                interfaceC0280a.onInitializeError(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f19814c.clear();
    }
}
