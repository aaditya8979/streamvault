package x4;

import com.google.android.exoplayer.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f86787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f86788b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f86787a = byteArrayOutputStream;
        this.f86788b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void c(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeByte(((int) (j10 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j10) & 255);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f86787a.reset();
        try {
            b(this.f86788b, eventMessage.f20231b);
            String str = eventMessage.f20232c;
            if (str == null) {
                str = "";
            }
            b(this.f86788b, str);
            c(this.f86788b, eventMessage.f20233d);
            c(this.f86788b, eventMessage.f20234e);
            this.f86788b.write(eventMessage.f20235f);
            this.f86788b.flush();
            return this.f86787a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
