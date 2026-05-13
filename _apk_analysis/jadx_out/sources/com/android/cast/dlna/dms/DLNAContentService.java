package com.android.cast.dlna.dms;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.nio.charset.Charset;
import java.util.UUID;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qr.e;
import qr.f;
import qr.g;
import qr.h;
import tn.i;
import tn.p;
import ur.s;
import ur.w;
import ur.z;

/* JADX INFO: compiled from: DLNAContentService.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DLNAContentService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f7020h = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final p0.b f7021d = p0.b.f76945b.a("LocalContentService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f7022e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public e f7023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0.a f7024g;

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void startService(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            context.getApplicationContext().startService(new Intent(context, (Class<?>) DLNAContentService.class));
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public final class b extends AndroidUpnpServiceImpl.b {
        public b() {
            super();
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class c extends cr.d {
        @Override // br.a, br.c
        public s[] q() {
            return null;
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class d extends ir.b<cs.a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ DLNAContentService f7026g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f<cs.a> fVar, DLNAContentService dLNAContentService) {
            super(fVar);
            this.f7026g = dLNAContentService;
        }

        @Override // ir.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public cs.a f() {
            u0.a aVar = this.f7026g.f7024g;
            if (aVar == null) {
                p.C("contentControl");
                aVar = null;
            }
            return new u0.c(aVar);
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    @NotNull
    public br.c a() {
        return new c();
    }

    @NotNull
    public e d(@NotNull String str) {
        z zVar;
        Charset charset;
        p.k(str, "baseUrl");
        String str2 = "DLNA_ContentService-" + str + '-' + Build.MODEL + '-' + Build.MANUFACTURER;
        try {
            charset = bo.c.f5639b;
        } catch (Exception unused) {
            zVar = new z(UUID.randomUUID());
        }
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        p.j(bytes, "(this as java.lang.String).getBytes(charset)");
        zVar = new z(UUID.nameUUIDFromBytes(bytes));
        p0.b.f(this.f7021d, "create local device: [MediaServer][" + zVar + "](" + str + ')', null, 2, null);
        qr.c cVar = new qr.c(zVar);
        w wVar = new w("MediaServer", 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DMS (");
        String str3 = Build.MODEL;
        sb2.append(str3);
        sb2.append(')');
        return new e(cVar, wVar, new qr.b(sb2.toString(), new g(Build.MANUFACTURER), new h(str3, "MSI MediaServer", "v1", str)), new qr.d[0], e());
    }

    @NotNull
    public f<?>[] e() {
        f<?> fVarB = new er.b().b(cs.a.class);
        p.i(fVarB, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<org.fourthline.cling.support.contentdirectory.AbstractContentDirectoryService>");
        fVarB.v(new d(fVarB, this));
        return new f[]{fVarB};
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.f7022e;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        p0.b.f(this.f7021d, "DLNAContentService create.", null, 2, null);
        super.onCreate();
        this.f7024g = new u0.b(this);
        try {
            this.f7023f = d(p0.e.b(p0.e.f76952a, this, 0, 2, null));
            this.f76823b.getRegistry().w(this.f7023f);
        } catch (Exception e10) {
            e10.printStackTrace();
            stopSelf();
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        p0.b.i(this.f7021d, "DLNAContentService destroy.", null, 2, null);
        e eVar = this.f7023f;
        if (eVar != null) {
            this.f76823b.getRegistry().j(eVar);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return 1;
    }
}
