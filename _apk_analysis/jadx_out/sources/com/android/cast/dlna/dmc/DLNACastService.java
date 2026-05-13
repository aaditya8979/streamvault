package com.android.cast.dlna.dmc;

import android.content.Intent;
import br.c;
import cr.d;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.jetbrains.annotations.NotNull;
import p0.b;
import tn.p;
import ur.s;

/* JADX INFO: compiled from: DLNACastService.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DLNACastService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f6998d = b.f76945b.a("CastService");

    /* JADX INFO: compiled from: DLNACastService.kt */
    public static final class a extends d {
        @Override // br.a, br.c
        public s[] q() {
            q0.a aVar = q0.a.f77565b;
            return new s[]{aVar.l(), aVar.n(), aVar.m(), aVar.k()};
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    @NotNull
    public c a() {
        return new a();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        b.f(this.f6998d, "DLNACastService onCreate", null, 2, null);
        super.onCreate();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        b.i(this.f6998d, "DLNACastService onDestroy", null, 2, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int i10, int i11) {
        p.k(intent, "intent");
        b.f(this.f6998d, "DLNACastService onStartCommand: " + i10 + ", " + i11 + ", " + intent, null, 2, null);
        return super.onStartCommand(intent, i10, i11);
    }
}
