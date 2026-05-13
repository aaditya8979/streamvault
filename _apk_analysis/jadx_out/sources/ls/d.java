package ls;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.fourthline.cling.model.UnsupportedDataException;

/* JADX INFO: compiled from: DatagramProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    DatagramPacket a(org.fourthline.cling.model.message.a aVar) throws UnsupportedDataException;

    lr.b b(InetAddress inetAddress, DatagramPacket datagramPacket) throws UnsupportedDataException;
}
