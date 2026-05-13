package r0;

import org.fourthline.cling.model.message.UpnpResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceExecutor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends hr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final hr.a f78502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull hr.a aVar, boolean z10) {
        super(aVar.d());
        tn.p.k(aVar, "actionCallback");
        this.f78502d = aVar;
        this.f78503e = z10;
    }

    @Override // hr.a
    public void c(@Nullable jr.d<? extends qr.l<?, ?>> dVar, @Nullable UpnpResponse upnpResponse, @Nullable String str) {
        org.fourthline.cling.model.meta.a<S> aVarA;
        if (this.f78503e) {
            p0.b bVar = q.f78541a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((dVar == null || (aVarA = dVar.a()) == 0) ? null : aVarA.d());
            sb2.append(" [failure] ");
            sb2.append(str);
            p0.b.i(bVar, sb2.toString(), null, 2, null);
        }
        this.f78502d.c(dVar, upnpResponse, str);
    }

    @Override // hr.a
    public void h(@Nullable jr.d<? extends qr.l<?, ?>> dVar) {
        Object objH;
        org.fourthline.cling.model.meta.a<S> aVarA;
        if (this.f78503e) {
            p0.b bVar = q.f78541a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((dVar == null || (aVarA = dVar.a()) == 0) ? null : aVarA.d());
            sb2.append(" [success] ");
            sb2.append((dVar == null || (objH = dVar.h()) == null) ? null : objH.toString());
            p0.b.f(bVar, sb2.toString(), null, 2, null);
        }
        this.f78502d.h(dVar);
    }
}
