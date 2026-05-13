package cr;

import android.os.Build;
import com.ironsource.C3978d4;
import gr.f;
import ir.g;
import ir.i;
import java.util.concurrent.ExecutorService;
import js.m;
import js.n;
import ls.h;
import ls.j;
import ls.l;
import org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl;

/* JADX INFO: compiled from: AndroidUpnpServiceConfiguration.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends br.a {

    /* JADX INFO: compiled from: AndroidUpnpServiceConfiguration.java */
    public class a extends ks.b {
        public a(ExecutorService executorService) {
            super(executorService);
        }

        @Override // ls.b
        public String d(int i10, int i11) {
            i iVar = new i(i10, i11);
            iVar.i(C3978d4.f31183d);
            iVar.j(Build.VERSION.RELEASE);
            return iVar.toString();
        }
    }

    public d() {
        this(0);
    }

    public d(int i10) {
        super(i10, false);
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
    }

    @Override // br.a
    public gr.a B() {
        return new gr.b();
    }

    @Override // br.a
    public ls.e C() {
        return new m();
    }

    @Override // br.a
    public g D() {
        return new g("/upnp");
    }

    @Override // br.a
    public ls.g E(int i10) {
        return new cr.a(i10);
    }

    @Override // br.a
    public h F() {
        return new n();
    }

    @Override // br.a
    public gr.c G() {
        return new f();
    }

    @Override // br.a, br.c
    public int a() {
        return 3000;
    }

    @Override // br.a, br.c
    public j c() {
        return new ks.c(new a(i()));
    }

    @Override // br.a, br.c
    public l o(ls.g gVar) {
        return new AsyncServletStreamServerImpl(new js.a(ks.a.f73569c, gVar.e()));
    }
}
