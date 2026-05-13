package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: BannerDelivery.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38521c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f38522a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38523b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerDelivery.java */
    public class RunnableC0461a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f38524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f38526c;

        public RunnableC0461a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f38524a = bVar;
            this.f38525b = str;
            this.f38526c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f38524a;
            if (bVar != null) {
                bVar.a(this.f38525b, this.f38526c, a.this.f38523b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f38528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.error.b f38529b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f38528a = bVar;
            this.f38529b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38528a != null) {
                this.f38529b.a(a.this.f38523b);
                this.f38528a.a(this.f38529b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f38531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38533c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f38531a = bVar;
            this.f38532b = str;
            this.f38533c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f38531a;
            if (bVar != null) {
                bVar.a(this.f38532b, this.f38533c, a.this.f38523b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f38535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.error.b f38536b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f38535a = bVar;
            this.f38536b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38535a != null) {
                this.f38536b.a(a.this.f38523b);
                this.f38535a.b(this.f38536b);
            }
        }
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f38521c, "postCampaignSuccess unitId=" + str);
        this.f38522a.post(new RunnableC0461a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f38522a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f38521c, "postResourceSuccess unitId=" + str);
        this.f38522a.post(new c(bVar, str, i10));
    }

    public void a(boolean z10) {
        this.f38523b = z10;
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f38521c, "postResourceFail unitId=" + bVar2);
        this.f38522a.post(new d(bVar, bVar2));
    }
}
