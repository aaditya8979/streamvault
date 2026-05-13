package com.android.cast.dlna.dmr;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import bo.d0;
import cn.f0;
import ds.l;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.IOException;
import java.util.UUID;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.fourthline.cling.model.ValidationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qr.g;
import qr.h;
import t0.f;
import tn.i;
import tn.p;
import ur.w;
import ur.z;

/* JADX INFO: compiled from: DLNARendererService.kt */
/* JADX INFO: loaded from: classes.dex */
public class DLNARendererService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f7007i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final p0.b f7008d = p0.c.a("RendererService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f7009e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f7010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0.c f7011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public qr.e f7012h;

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void startService(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            context.getApplicationContext().startService(new Intent(context, (Class<?>) DLNARendererService.class));
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public final class b extends AndroidUpnpServiceImpl.b implements s0.b {
        public b() {
            super();
        }

        @Override // s0.b
        @NotNull
        public DLNARendererService a() {
            return DLNARendererService.this;
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class c extends cr.d {
        @Override // br.a, br.c
        public int l() {
            return 5000;
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class d extends l<t0.b> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ DLNARendererService f7014h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qr.f<t0.b> fVar, DLNARendererService dLNARendererService, bs.a aVar) {
            super(fVar, aVar);
            this.f7014h = dLNARendererService;
        }

        @Override // ir.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public t0.b f() {
            f fVar = this.f7014h.f7010f;
            if (fVar == null) {
                p.C("avTransportControl");
                fVar = null;
            }
            return new t0.b(fVar);
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class e extends l<t0.e> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ DLNARendererService f7015h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qr.f<t0.e> fVar, DLNARendererService dLNARendererService, hs.i iVar) {
            super(fVar, iVar);
            this.f7015h = dLNARendererService;
        }

        @Override // ir.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public t0.e f() {
            t0.c cVar = this.f7015h.f7011g;
            if (cVar == null) {
                p.C("audioControl");
                cVar = null;
            }
            return new t0.e(cVar);
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    @NotNull
    public br.c a() {
        return new c();
    }

    public final void e(@Nullable s0.a aVar) {
        f fVar = this.f7010f;
        if (fVar == null) {
            p.C("avTransportControl");
            fVar = null;
        }
        t0.a aVar2 = fVar instanceof t0.a ? (t0.a) fVar : null;
        if (aVar2 != null) {
            aVar2.g(aVar);
        }
    }

    @NotNull
    public final qr.e f(@NotNull String str) throws ValidationException, IOException {
        z zVar;
        p.k(str, "baseUrl");
        try {
            byte[] bytes = ("DLNA_MediaPlayer-" + str + '-' + Build.MODEL + '-' + Build.MANUFACTURER).getBytes(bo.c.f5639b);
            p.j(bytes, "this as java.lang.String).getBytes(charset)");
            zVar = new z(UUID.nameUUIDFromBytes(bytes));
        } catch (Exception unused) {
            zVar = new z(UUID.randomUUID());
        }
        p0.b bVar = this.f7008d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("create local device: [MediaRenderer][");
        String strA = zVar.a();
        p.j(strA, "getIdentifierString(...)");
        sb2.append((String) f0.F0(d0.U0(strA, new String[]{"-"}, false, 0, 6, null)));
        sb2.append("](");
        sb2.append(str);
        sb2.append(')');
        p0.b.f(bVar, sb2.toString(), null, 2, null);
        qr.c cVar = new qr.c(zVar);
        w wVar = new w("MediaRenderer", 1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("DMR (");
        String str2 = Build.MODEL;
        sb3.append(str2);
        sb3.append(')');
        return new qr.e(cVar, wVar, new qr.b(sb3.toString(), new g(Build.MANUFACTURER), new h(str2, "MPI MediaPlayer", "v1", str)), new qr.d[0], g());
    }

    @NotNull
    public qr.f<?>[] g() {
        er.b bVar = new er.b();
        qr.f<?> fVarB = bVar.b(t0.b.class);
        p.i(fVarB, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AVTransportServiceImpl>");
        fVarB.v(new d(fVarB, this, new bs.a()));
        qr.f<?> fVarB2 = bVar.b(t0.e.class);
        p.i(fVarB2, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AudioRenderServiceImpl>");
        fVarB2.v(new e(fVarB2, this, new hs.i()));
        return new qr.f[]{fVarB, fVarB2};
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        p.k(intent, "intent");
        return this.f7009e;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        p0.b.f(this.f7008d, "DLNARendererService create.", null, 2, null);
        super.onCreate();
        Context applicationContext = getApplicationContext();
        p.j(applicationContext, "getApplicationContext(...)");
        this.f7010f = new t0.a(applicationContext);
        Context applicationContext2 = getApplicationContext();
        p.j(applicationContext2, "getApplicationContext(...)");
        this.f7011g = new t0.d(applicationContext2);
        try {
            p0.e eVar = p0.e.f76952a;
            Context applicationContext3 = getApplicationContext();
            p.j(applicationContext3, "getApplicationContext(...)");
            this.f7012h = f(p0.e.b(eVar, applicationContext3, 0, 2, null));
            this.f76823b.getRegistry().w(this.f7012h);
        } catch (Exception e10) {
            e10.printStackTrace();
            stopSelf();
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        p0.b.i(this.f7008d, "DLNARendererService destroy.", null, 2, null);
        qr.e eVar = this.f7012h;
        if (eVar != null) {
            this.f76823b.getRegistry().j(eVar);
        }
        f fVar = this.f7010f;
        if (fVar == null) {
            p.C("avTransportControl");
            fVar = null;
        }
        t0.a aVar = fVar instanceof t0.a ? (t0.a) fVar : null;
        if (aVar != null) {
            aVar.g(null);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return 1;
    }
}
