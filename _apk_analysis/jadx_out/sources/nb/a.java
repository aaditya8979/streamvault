package nb;

import as.c;
import jr.d;
import org.fourthline.cling.model.message.UpnpResponse;
import qr.l;

/* JADX INFO: compiled from: ClingPlayControl.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75740a = 3;

    /* JADX INFO: renamed from: nb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClingPlayControl.java */
    public class C0897a extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ob.a f75741e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0897a(l lVar, ob.a aVar) {
            super(lVar);
            this.f75741e = aVar;
        }

        @Override // hr.a
        public void c(d dVar, UpnpResponse upnpResponse, String str) {
            if (sb.c.a(this.f75741e)) {
                this.f75741e.b(new pb.d(dVar, upnpResponse, str));
            }
        }

        @Override // as.c, hr.a
        public void h(d dVar) {
            super.h(dVar);
            if (sb.c.a(this.f75741e)) {
                this.f75741e.a(new pb.d(dVar));
            }
        }
    }

    public void a(int i10) {
        if (this.f75740a != i10) {
            this.f75740a = i10;
        }
    }

    public void b(ob.a aVar) {
        l lVarA = sb.a.a(rb.a.f78871c);
        if (sb.c.b(lVarA)) {
            return;
        }
        hr.b bVarB = sb.a.b();
        if (sb.c.b(bVarB)) {
            return;
        }
        bVarB.e(new C0897a(lVarA, aVar));
    }
}
