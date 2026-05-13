package js;

import com.ironsource.Z7;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;

/* JADX INFO: compiled from: DatagramProcessorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class e implements ls.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f72596a = Logger.getLogger(ls.d.class.getName());

    /* JADX WARN: Type inference failed for: r1v0, types: [lr.d] */
    @Override // ls.d
    public DatagramPacket a(org.fourthline.cling.model.message.a aVar) throws UnsupportedDataException {
        StringBuilder sb2 = new StringBuilder();
        ?? K = aVar.k();
        if (K instanceof UpnpRequest) {
            sb2.append(((UpnpRequest) K).c());
            sb2.append(" * ");
            sb2.append("HTTP/1.");
            sb2.append(K.a());
            sb2.append("\r\n");
        } else {
            if (!(K instanceof UpnpResponse)) {
                throw new UnsupportedDataException("Message operation is not request or response, don't know how to process: " + aVar);
            }
            UpnpResponse upnpResponse = (UpnpResponse) K;
            sb2.append("HTTP/1.");
            sb2.append(K.a());
            sb2.append(Z7.f30794r);
            sb2.append(upnpResponse.d());
            sb2.append(Z7.f30794r);
            sb2.append(upnpResponse.e());
            sb2.append("\r\n");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) sb2);
        sb3.append(aVar.j().toString());
        sb3.append("\r\n");
        if (f72596a.isLoggable(Level.FINER)) {
            f72596a.finer("Writing message data for: " + aVar);
            f72596a.finer("---------------------------------------------------------------------------------");
            f72596a.finer(sb3.toString().substring(0, sb3.length() + (-2)));
            f72596a.finer("---------------------------------------------------------------------------------");
        }
        try {
            byte[] bytes = sb3.toString().getBytes(C.ASCII_NAME);
            f72596a.fine("Writing new datagram packet with " + bytes.length + " bytes for: " + aVar);
            return new DatagramPacket(bytes, bytes.length, aVar.u(), aVar.v());
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedDataException("Can't convert message content to US-ASCII: " + e10.getMessage(), e10, sb3);
        }
    }

    @Override // ls.d
    public lr.b b(InetAddress inetAddress, DatagramPacket datagramPacket) throws UnsupportedDataException {
        try {
            if (f72596a.isLoggable(Level.FINER)) {
                f72596a.finer("===================================== DATAGRAM BEGIN ============================================");
                f72596a.finer(new String(datagramPacket.getData(), "UTF-8"));
                f72596a.finer("-===================================== DATAGRAM END =============================================");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
            String[] strArrSplit = ns.a.j(byteArrayInputStream).split(Z7.f30794r);
            return strArrSplit[0].startsWith("HTTP/1.") ? d(inetAddress, datagramPacket, byteArrayInputStream, Integer.valueOf(strArrSplit[1]).intValue(), strArrSplit[2], strArrSplit[0]) : c(inetAddress, datagramPacket, byteArrayInputStream, strArrSplit[0], strArrSplit[2]);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Could not parse headers: " + e10, e10, datagramPacket.getData());
        }
    }

    public lr.b c(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, String str, String str2) throws Exception {
        lr.c cVar = new lr.c(byteArrayInputStream);
        UpnpRequest upnpRequest = new UpnpRequest(UpnpRequest.Method.getByHttpName(str));
        upnpRequest.b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        lr.b bVar = new lr.b(upnpRequest, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.t(cVar);
        return bVar;
    }

    public lr.b d(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, int i10, String str, String str2) throws Exception {
        lr.c cVar = new lr.c(byteArrayInputStream);
        UpnpResponse upnpResponse = new UpnpResponse(i10, str);
        upnpResponse.b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        lr.b bVar = new lr.b(upnpResponse, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.t(cVar);
        return bVar;
    }
}
