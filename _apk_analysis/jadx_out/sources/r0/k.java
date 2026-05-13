package r0;

import bo.d0;
import cn.f0;
import java.util.List;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.support.lastchange.LastChangeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CastSubscriptionCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends hr.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LastChangeParser f78536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final r f78537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final p0.b f78538i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@Nullable qr.l<?, ?> lVar, int i10, @NotNull LastChangeParser lastChangeParser, @NotNull r rVar) {
        super(lVar, i10);
        tn.p.k(lastChangeParser, "lastChangeParser");
        tn.p.k(rVar, "callback");
        this.f78536g = lastChangeParser;
        this.f78537h = rVar;
        this.f78538i = p0.b.f76945b.a("SubscriptionCallback");
    }

    public /* synthetic */ k(qr.l lVar, int i10, LastChangeParser lastChangeParser, r rVar, int i11, tn.i iVar) {
        this(lVar, (i11 & 2) != 0 ? 1800 : i10, lastChangeParser, rVar);
    }

    public static final void v(k kVar, kr.a aVar) {
        kVar.f78537h.d(aVar.I());
    }

    public static final void w(k kVar, kr.a aVar) {
        kVar.f78537h.b(aVar.I());
    }

    public static final void x(k kVar, kr.a aVar, ds.b bVar) {
        r rVar = kVar.f78537h;
        String strI = aVar.I();
        tn.p.h(bVar);
        rVar.c(strI, bVar);
    }

    public static final void y(k kVar, kr.a aVar) {
        kVar.f78537h.a(aVar.I());
    }

    @Override // hr.d
    public void b(@NotNull final kr.a<?> aVar, @Nullable CancelReason cancelReason, @Nullable UpnpResponse upnpResponse) {
        tn.p.k(aVar, "subscription");
        p0.b.i(this.f78538i, z(aVar) + " ended: " + cancelReason + ", " + upnpResponse, null, 2, null);
        s.a(new Runnable() { // from class: r0.h
            @Override // java.lang.Runnable
            public final void run() {
                k.v(this.f78530b, aVar);
            }
        });
    }

    @Override // hr.d
    public void f(@NotNull final kr.a<?> aVar) {
        tn.p.k(aVar, "subscription");
        p0.b.f(this.f78538i, z(aVar) + " established", null, 2, null);
        s.a(new Runnable() { // from class: r0.j
            @Override // java.lang.Runnable
            public final void run() {
                k.w(this.f78534b, aVar);
            }
        });
    }

    @Override // hr.d
    public void g(@NotNull final kr.a<?> aVar) {
        List<ds.j> listA;
        ds.j jVar;
        Object objB;
        tn.p.k(aVar, "subscription");
        tr.d dVar = (tr.d) aVar.F().get("LastChange");
        String string = (dVar == null || (objB = dVar.b()) == null) ? null : objB.toString();
        if (string == null || d0.u0(string)) {
            return;
        }
        p0.b.f(this.f78538i, z(aVar) + " eventReceived: " + aVar.F().keySet(), null, 2, null);
        try {
            ds.a aVarP = this.f78536g.p(string);
            List<ds.b> listB = (aVarP == null || (listA = aVarP.a()) == null || (jVar = (ds.j) f0.v0(listA)) == null) ? null : jVar.b();
            if (listB != null) {
                for (final ds.b bVar : listB) {
                    p0.b.f(this.f78538i, "    value: [" + bVar.getClass().getSimpleName() + "] " + bVar, null, 2, null);
                    s.a(new Runnable() { // from class: r0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.x(this.f78527b, aVar, bVar);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            p0.b.i(this.f78538i, z(aVar) + " currentValues: " + aVar.F(), null, 2, null);
            e10.printStackTrace();
        }
    }

    @Override // hr.d
    public void h(@NotNull kr.a<?> aVar, int i10) {
        tn.p.k(aVar, "subscription");
        p0.b.i(this.f78538i, z(aVar) + " eventsMissed: " + i10, null, 2, null);
    }

    @Override // hr.d
    public void j(@NotNull final kr.a<?> aVar, @Nullable UpnpResponse upnpResponse, @Nullable Exception exc, @Nullable String str) {
        tn.p.k(aVar, "subscription");
        p0.b.c(this.f78538i, z(aVar) + " failed:" + upnpResponse + ", " + exc + ", " + str, null, 2, null);
        s.a(new Runnable() { // from class: r0.i
            @Override // java.lang.Runnable
            public final void run() {
                k.y(this.f78532b, aVar);
            }
        });
    }

    public final String z(kr.a<?> aVar) {
        List listU0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(aVar.H().g().getType());
        sb2.append("](");
        String strI = aVar.I();
        sb2.append((strI == null || (listU0 = d0.U0(strI, new String[]{"-"}, false, 0, 6, null)) == null) ? null : (String) f0.F0(listU0));
        sb2.append(')');
        return sb2.toString();
    }
}
