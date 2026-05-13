package eq;

import androidx.core.app.NotificationCompat;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import dq.i;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Map;
import sq.p;

/* JADX INFO: compiled from: DigestAuthentication.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f61307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f61308b;

    public c(d dVar, Map map) {
        this.f61307a = dVar;
        this.f61308b = map;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Integer.toHexString((bArr[i10] & 240) >>> 4));
            sb2.append(Integer.toHexString(bArr[i10] & 15));
        }
        return sb2.toString();
    }

    @Override // eq.a
    public void a(i iVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Digest");
        sb2.append(Z7.f30794r);
        sb2.append("username");
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(this.f61307a.a());
        sb2.append('\"');
        sb2.append(", ");
        sb2.append("realm");
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(String.valueOf(this.f61308b.get("realm")));
        sb2.append('\"');
        sb2.append(", ");
        sb2.append("nonce");
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(String.valueOf(this.f61308b.get("nonce")));
        sb2.append('\"');
        sb2.append(", ");
        sb2.append(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(iVar.u());
        sb2.append('\"');
        sb2.append(", ");
        sb2.append("algorithm");
        sb2.append(G5.T);
        sb2.append(String.valueOf(this.f61308b.get("algorithm")));
        String strC = c(iVar, this.f61307a, this.f61308b);
        sb2.append(", ");
        sb2.append("response");
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(d(strC, iVar, this.f61307a, this.f61308b));
        sb2.append('\"');
        sb2.append(", ");
        sb2.append("qop");
        sb2.append(G5.T);
        sb2.append(String.valueOf(this.f61308b.get("qop")));
        sb2.append(", ");
        sb2.append(ResourceManager.KEY_MD5CHECK);
        sb2.append(G5.T);
        sb2.append("00000001");
        sb2.append(", ");
        sb2.append("cnonce");
        sb2.append(G5.T);
        sb2.append('\"');
        sb2.append(strC);
        sb2.append('\"');
        iVar.T("Authorization", new String(sb2.toString().getBytes("ISO-8859-1")));
    }

    public String c(i iVar, d dVar, Map map) {
        try {
            return b(MessageDigest.getInstance(SameMD5.TAG).digest(String.valueOf(System.currentTimeMillis()).getBytes("ISO-8859-1")));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public String d(String str, i iVar, d dVar, Map map) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(dVar.a().getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(String.valueOf(map.get("realm")).getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(dVar.getCredentials().getBytes("ISO-8859-1"));
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            messageDigest.update(iVar.l().getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(iVar.u().getBytes("ISO-8859-1"));
            byte[] bArrDigest2 = messageDigest.digest();
            messageDigest.update(p.j(bArrDigest, 16).getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(String.valueOf(map.get("nonce")).getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update("00000001".getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(str.getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(String.valueOf(map.get("qop")).getBytes("ISO-8859-1"));
            messageDigest.update((byte) 58);
            messageDigest.update(p.j(bArrDigest2, 16).getBytes("ISO-8859-1"));
            return b(messageDigest.digest());
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
