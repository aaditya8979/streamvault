package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.bidtoken.providers.m;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettingsImpl;
import com.moloco.sdk.service_locator.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends j<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f47236a = a.f47237a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47237a = new a();

        public static final com.moloco.sdk.internal.ilrd.e b() {
            return b.C0586b.f47632a.g().c();
        }

        @NotNull
        public final m a() {
            x xVar = new x();
            com.moloco.sdk.service_locator.b bVar = com.moloco.sdk.service_locator.b.f47628a;
            w wVar = new w(new com.moloco.sdk.internal.services.bidtoken.v(new InternalMolocoPrivacySettingsImpl(bVar.a())));
            b.h hVar = b.h.f47664a;
            t tVar = new t(hVar.c());
            e eVar = new e(bVar.a());
            v vVar = new v(b.i.f47671a.b());
            b.e eVar2 = b.e.f47645a;
            return new n(cn.w.p(xVar, wVar, tVar, eVar, vVar, new i(eVar2.j()), new c(hVar.d()), new p(eVar2.l(), eVar2.m()), new g(eVar2.i()), new b(eVar2.g()), new r(new sn.a() { // from class: com.moloco.sdk.internal.services.bidtoken.providers.l
                @Override // sn.a
                public final Object invoke() {
                    return m.a.b();
                }
            }), new z(bVar.a(), null, null, 6, null)));
        }
    }
}
