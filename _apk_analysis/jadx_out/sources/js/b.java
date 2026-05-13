package js;

import com.ironsource.Z7;
import java.io.IOException;
import java.net.URI;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import zm.t;

/* JADX INFO: compiled from: AsyncServletUpnpStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends ls.m implements zm.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f72584h = Logger.getLogger(ls.m.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zm.a f72585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final an.a f72586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public org.fourthline.cling.model.message.c f72587g;

    public b(vr.a aVar, zm.a aVar2, an.a aVar3) {
        super(aVar);
        this.f72585e = aVar2;
        this.f72586f = aVar3;
        aVar2.b(this);
    }

    public void J() {
        try {
            this.f72585e.complete();
        } catch (IllegalStateException e10) {
            f72584h.info("Error calling servlet container's AsyncContext#complete() method: " + e10);
        }
    }

    public abstract lr.a K();

    public an.a L() {
        return this.f72586f;
    }

    public an.c M() {
        t response = this.f72585e.getResponse();
        if (response != null) {
            return (an.c) response;
        }
        throw new IllegalStateException("Couldn't get response from asynchronous context, already timed out");
    }

    public org.fourthline.cling.model.message.b N() throws IOException {
        String method = L().getMethod();
        String strV = L().v();
        Logger logger = f72584h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Processing HTTP request: " + method + Z7.f30794r + strV);
        }
        try {
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.getByHttpName(method), URI.create(strV));
            if (((UpnpRequest) bVar.k()).d().equals(UpnpRequest.Method.UNKNOWN)) {
                throw new RuntimeException("Method not supported: " + method);
            }
            bVar.w(K());
            lr.c cVar = new lr.c();
            Enumeration<String> enumerationK = L().k();
            while (enumerationK.hasMoreElements()) {
                String strNextElement = enumerationK.nextElement();
                Enumeration<String> enumerationO = L().o(strNextElement);
                while (enumerationO.hasMoreElements()) {
                    cVar.a(strNextElement, enumerationO.nextElement());
                }
            }
            bVar.t(cVar);
            zm.m mVarB = null;
            try {
                mVarB = L().b();
                byte[] bArrC = ps.c.c(mVarB);
                Logger logger2 = f72584h;
                Level level = Level.FINER;
                if (logger2.isLoggable(level)) {
                    logger2.finer("Reading request body bytes: " + bArrC.length);
                }
                if (bArrC.length > 0 && bVar.p()) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request contains textual entity body, converting then setting string on message");
                    }
                    bVar.s(bArrC);
                } else if (bArrC.length > 0) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request contains binary entity body, setting bytes on message");
                    }
                    bVar.r(UpnpMessage.BodyType.BYTES, bArrC);
                } else if (logger2.isLoggable(level)) {
                    logger2.finer("Request did not contain entity body");
                }
                return bVar;
            } finally {
                if (mVarB != null) {
                    mVarB.close();
                }
            }
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("Invalid request URI: " + strV, e10);
        }
    }

    public void O(org.fourthline.cling.model.message.c cVar) throws IOException {
        Logger logger = f72584h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Sending HTTP response status: " + cVar.k().d());
        }
        M().k(cVar.k().d());
        for (Map.Entry<String, List<String>> entry : cVar.j().entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                M().a(entry.getKey(), it.next());
            }
        }
        M().d("Date", System.currentTimeMillis());
        byte[] bArrF = cVar.n() ? cVar.f() : null;
        int length = bArrF != null ? bArrF.length : -1;
        if (length > 0) {
            M().p(length);
            f72584h.finer("Response message has body, writing bytes to stream...");
            ps.c.h(M().e(), bArrF);
        }
    }

    @Override // zm.c
    public void f(zm.b bVar) throws IOException {
    }

    @Override // zm.c
    public void i(zm.b bVar) throws IOException {
        Logger logger = f72584h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Completed asynchronous processing of HTTP request: " + bVar.a());
        }
        I(this.f72587g);
    }

    @Override // zm.c
    public void p(zm.b bVar) throws IOException {
        Logger logger = f72584h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request timed out: " + bVar.a());
        }
        H(new Exception("Asynchronous request timed out"));
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            org.fourthline.cling.model.message.b bVarN = N();
            Logger logger = f72584h;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Processing new request message: " + bVarN);
            }
            org.fourthline.cling.model.message.c cVarG = G(bVarN);
            this.f72587g = cVarG;
            if (cVarG != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Preparing HTTP response message: " + this.f72587g);
                }
                O(this.f72587g);
            } else {
                if (logger.isLoggable(level)) {
                    logger.finer("Sending HTTP response status: 404");
                }
                M().k(404);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // zm.c
    public void y(zm.b bVar) throws IOException {
        Logger logger = f72584h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request error: " + bVar.c());
        }
        H(bVar.c());
    }
}
