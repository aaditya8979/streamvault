package ks;

import dq.f;
import hq.h;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import ls.j;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import pr.d;

/* JADX INFO: compiled from: StreamClientImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends ls.a<ks.b, C0868c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f73572d = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ks.b f73573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f73574c;

    /* JADX INFO: compiled from: StreamClientImpl.java */
    public class a extends ar.a {
        public a(ExecutorService executorService) {
            super(executorService);
        }

        @Override // ar.a, uq.a
        public void e0() throws Exception {
        }
    }

    /* JADX INFO: compiled from: StreamClientImpl.java */
    public class b implements Callable<org.fourthline.cling.model.message.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ org.fourthline.cling.model.message.b f73576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0868c f73577c;

        public b(org.fourthline.cling.model.message.b bVar, C0868c c0868c) {
            this.f73576b = bVar;
            this.f73577c = c0868c;
        }

        @Override // java.util.concurrent.Callable
        public org.fourthline.cling.model.message.c call() throws Exception {
            if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Sending HTTP request: " + this.f73576b);
            }
            c.this.f73574c.T0(this.f73577c);
            int iD0 = this.f73577c.d0();
            if (iD0 == 7) {
                try {
                    return this.f73577c.l0();
                } catch (Throwable th2) {
                    c.f73572d.log(Level.WARNING, "Error reading response: " + this.f73576b, os.a.a(th2));
                    return null;
                }
            }
            if (iD0 == 11 || iD0 == 9) {
                return null;
            }
            c.f73572d.warning("Unhandled HTTP exchange status: " + iD0);
            return null;
        }
    }

    /* JADX INFO: renamed from: ks.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StreamClientImpl.java */
    public static class C0868c extends f {
        public final ks.b E;
        public final org.eclipse.jetty.client.a F;
        public final org.fourthline.cling.model.message.b G;

        public C0868c(ks.b bVar, org.eclipse.jetty.client.a aVar, org.fourthline.cling.model.message.b bVar2) {
            super(true);
            this.E = bVar;
            this.F = aVar;
            this.G = bVar2;
            k0();
            j0();
            i0();
        }

        public void i0() {
            if (n0().n()) {
                if (n0().g() != UpnpMessage.BodyType.STRING) {
                    if (c.f73572d.isLoggable(Level.FINE)) {
                        c.f73572d.fine("Writing binary request body: " + n0());
                    }
                    if (n0().i() == null) {
                        throw new RuntimeException("Missing content type header in request message: " + this.G);
                    }
                    R(n0().i().b().toString());
                    h hVar = new h(n0().f());
                    T("Content-Length", String.valueOf(hVar.length()));
                    P(hVar);
                    return;
                }
                if (c.f73572d.isLoggable(Level.FINE)) {
                    c.f73572d.fine("Writing textual request body: " + n0());
                }
                os.c cVarB = n0().i() != null ? n0().i().b() : d.f77536d;
                String strH = n0().h() != null ? n0().h() : "UTF-8";
                R(cVarB.toString());
                try {
                    h hVar2 = new h(n0().d(), strH);
                    T("Content-Length", String.valueOf(hVar2.length()));
                    P(hVar2);
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("Unsupported character encoding: " + strH, e10);
                }
            }
        }

        public void j0() {
            lr.c cVarJ = n0().j();
            if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Writing headers on HttpContentExchange: " + cVarJ.size());
            }
            UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
            if (!cVarJ.p(type)) {
                T(type.getHttpName(), m0().d(n0().l(), n0().m()));
            }
            for (Map.Entry<String, List<String>> entry : cVarJ.entrySet()) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    if (c.f73572d.isLoggable(Level.FINE)) {
                        c.f73572d.fine("Setting header '" + key + "': " + str);
                    }
                    c(key, str);
                }
            }
        }

        public void k0() {
            UpnpRequest upnpRequestK = n0().k();
            if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Preparing HTTP request message with method '" + upnpRequestK.c() + "': " + n0());
            }
            b0(upnpRequestK.e().toString());
            O(upnpRequestK.c());
        }

        public org.fourthline.cling.model.message.c l0() {
            UpnpResponse upnpResponse = new UpnpResponse(f0(), UpnpResponse.Status.getByStatusCode(f0()).getStatusMsg());
            if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Received response: " + upnpResponse);
            }
            org.fourthline.cling.model.message.c cVar = new org.fourthline.cling.model.message.c(upnpResponse);
            lr.c cVar2 = new lr.c();
            org.eclipse.jetty.http.a aVarE0 = e0();
            for (String str : aVarE0.u()) {
                Iterator<String> it = aVarE0.A(str).iterator();
                while (it.hasNext()) {
                    cVar2.a(str, it.next());
                }
            }
            cVar.t(cVar2);
            byte[] bArrH0 = h0();
            if (bArrH0 != null && bArrH0.length > 0 && cVar.p()) {
                if (c.f73572d.isLoggable(Level.FINE)) {
                    c.f73572d.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    cVar.s(bArrH0);
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("Unsupported character encoding: " + e10, e10);
                }
            } else if (bArrH0 != null && bArrH0.length > 0) {
                if (c.f73572d.isLoggable(Level.FINE)) {
                    c.f73572d.fine("Response contains binary entity body, setting bytes on message");
                }
                cVar.r(UpnpMessage.BodyType.BYTES, bArrH0);
            } else if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Response did not contain entity body");
            }
            if (c.f73572d.isLoggable(Level.FINE)) {
                c.f73572d.fine("Response message complete: " + cVar);
            }
            return cVar;
        }

        public ks.b m0() {
            return this.E;
        }

        public org.fourthline.cling.model.message.b n0() {
            return this.G;
        }

        @Override // dq.i
        public void y(Throwable th2) {
            c.f73572d.log(Level.WARNING, "HTTP connection failed: " + this.G, os.a.a(th2));
        }

        @Override // dq.i
        public void z(Throwable th2) {
            c.f73572d.log(Level.WARNING, "HTTP request failed: " + this.G, os.a.a(th2));
        }
    }

    public c(ks.b bVar) throws InitializationException {
        this.f73573b = bVar;
        f73572d.info("Starting Jetty HttpClient...");
        org.eclipse.jetty.client.a aVar = new org.eclipse.jetty.client.a();
        this.f73574c = aVar;
        aVar.X0(new a(getConfiguration().c()));
        aVar.Y0((bVar.a() + 5) * 1000);
        aVar.V0((bVar.a() + 5) * 1000);
        aVar.W0(bVar.e());
        try {
            aVar.start();
        } catch (Exception e10) {
            throw new InitializationException("Could not start Jetty HTTP client: " + e10, e10);
        }
    }

    @Override // ls.a
    public boolean e(Throwable th2) {
        return false;
    }

    @Override // ls.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(C0868c c0868c) {
        c0868c.e();
    }

    @Override // ls.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Callable<org.fourthline.cling.model.message.c> c(org.fourthline.cling.model.message.b bVar, C0868c c0868c) {
        return new b(bVar, c0868c);
    }

    @Override // ls.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0868c d(org.fourthline.cling.model.message.b bVar) {
        return new C0868c(getConfiguration(), this.f73574c, bVar);
    }

    @Override // ls.j
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ks.b getConfiguration() {
        return this.f73573b;
    }

    @Override // ls.j
    public void stop() {
        try {
            this.f73574c.stop();
        } catch (Exception e10) {
            f73572d.info("Error stopping HTTP client: " + e10);
        }
    }
}
