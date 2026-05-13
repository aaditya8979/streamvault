package js;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: StreamClientImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class q implements ls.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f72625b = Logger.getLogger(ls.j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f72626a;

    public q(p pVar) throws InitializationException {
        this.f72626a = pVar;
        if (ir.f.f71774b || ir.f.f71773a) {
            throw new InitializationException("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
        }
        Logger logger = f72625b;
        logger.fine("Using persistent HTTP stream client connections: " + pVar.e());
        System.setProperty("http.keepAlive", Boolean.toString(pVar.e()));
        if (System.getProperty("hackStreamHandlerProperty") == null) {
            logger.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
            URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) Class.forName("js.f").newInstance());
            System.setProperty("hackStreamHandlerProperty", "alreadyWorkedAroundTheEvilJDK");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [js.q] */
    @Override // ls.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.fourthline.cling.model.message.c a(org.fourthline.cling.model.message.b r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.q.a(org.fourthline.cling.model.message.b):org.fourthline.cling.model.message.c");
    }

    public void b(HttpURLConnection httpURLConnection, ns.a aVar) {
        f72625b.fine("Writing headers on HttpURLConnection: " + aVar.size());
        for (Map.Entry<String, List<String>> entry : aVar.entrySet()) {
            for (String str : entry.getValue()) {
                String key = entry.getKey();
                f72625b.fine("Setting header '" + key + "': " + str);
                httpURLConnection.setRequestProperty(key, str);
            }
        }
    }

    public void c(HttpURLConnection httpURLConnection, org.fourthline.cling.model.message.b bVar) throws IOException {
        if (!bVar.n()) {
            httpURLConnection.setDoOutput(false);
            return;
        }
        httpURLConnection.setDoOutput(true);
        if (bVar.g().equals(UpnpMessage.BodyType.STRING)) {
            ps.c.i(httpURLConnection.getOutputStream(), bVar.d());
        } else if (bVar.g().equals(UpnpMessage.BodyType.BYTES)) {
            ps.c.h(httpURLConnection.getOutputStream(), bVar.f());
        }
        httpURLConnection.getOutputStream().flush();
    }

    public void d(HttpURLConnection httpURLConnection, org.fourthline.cling.model.message.b bVar) {
        httpURLConnection.setInstanceFollowRedirects(false);
        lr.c cVarJ = bVar.j();
        UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
        if (!cVarJ.p(type)) {
            httpURLConnection.setRequestProperty(type.getHttpName(), f().d(bVar.l(), bVar.m()));
        }
        b(httpURLConnection, bVar.j());
    }

    public org.fourthline.cling.model.message.c e(HttpURLConnection httpURLConnection, InputStream inputStream) throws Exception {
        byte[] bArrC = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = f72625b;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            logger.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        UpnpResponse upnpResponse = new UpnpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = f72625b;
        logger2.fine("Received response: " + upnpResponse);
        org.fourthline.cling.model.message.c cVar = new org.fourthline.cling.model.message.c(upnpResponse);
        cVar.t(new lr.c(httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bArrC = ps.c.c(inputStream);
            } finally {
                inputStream.close();
            }
        }
        if (inputStream != null) {
        }
        if (bArrC != null && bArrC.length > 0 && cVar.p()) {
            logger2.fine("Response contains textual entity body, converting then setting string on message");
            cVar.s(bArrC);
        } else if (bArrC == null || bArrC.length <= 0) {
            logger2.fine("Response did not contain entity body");
        } else {
            logger2.fine("Response contains binary entity body, setting bytes on message");
            cVar.r(UpnpMessage.BodyType.BYTES, bArrC);
        }
        logger2.fine("Response message complete: " + cVar);
        return cVar;
    }

    public p f() {
        return this.f72626a;
    }

    @Override // ls.j
    public void stop() {
    }
}
