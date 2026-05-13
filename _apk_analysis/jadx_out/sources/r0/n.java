package r0;

import com.ironsource.Y1;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f78540a = new n();

    public final String a(String str, String str2) {
        fs.b bVar = new fs.b(str2, Y1.f30690f, str2, null, new es.e[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<item id=\"" + str2 + "\" parentID=\"-1\" restricted=\"1\">");
        sb2.append("<dc:title>" + str2 + "</dc:title>");
        sb2.append("<upnp:class>" + bVar.a().a() + "</upnp:class>");
        sb2.append("<res protocolInfo=\"http-get:*:video/mp4:*;DLNA.ORG_OP=01;\">" + str + "</res>");
        sb2.append("</item>");
        String string = sb2.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String b(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "url");
        tn.p.k(str2, "title");
        String str3 = String.format("<?xml version=\"1.0\"?><DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\">%s</DIDL-Lite>", Arrays.copyOf(new Object[]{a(str, str2)}, 1));
        tn.p.j(str3, "java.lang.String.format(this, *args)");
        return str3;
    }
}
