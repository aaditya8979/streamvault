package x6;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f86816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f86817b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f86816a = byteArrayOutputStream;
        this.f86817b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f86816a.reset();
        try {
            b(this.f86817b, eventMessage.f21886b);
            String str = eventMessage.f21887c;
            if (str == null) {
                str = "";
            }
            b(this.f86817b, str);
            this.f86817b.writeLong(eventMessage.f21888d);
            this.f86817b.writeLong(eventMessage.f21889e);
            this.f86817b.write(eventMessage.f21890f);
            this.f86817b.flush();
            return this.f86816a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
