package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f82395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public URL f82396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f82398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f82399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final URL f82400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f82401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpURLConnection f82402h;

    private c(@NonNull sg.bigo.ads.common.u.b.c cVar, @Nullable URL url, @Nullable URL url2, @NonNull b bVar, @Nullable g gVar) {
        this.f82397c = false;
        this.f82395a = cVar;
        this.f82396b = url;
        this.f82400f = url2;
        this.f82398d = bVar;
        this.f82399e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public c(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull b bVar, @Nullable g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f82399e == null || !this.f82395a.f82438o) {
            return new URL(uri.toString());
        }
        Uri.Builder builderBuildUpon = Uri.parse(uri.toString()).buildUpon();
        a(builderBuildUpon, "sdk_ver", this.f82399e.y());
        a(builderBuildUpon, "sdk_vc", "50602");
        a(builderBuildUpon, "country", this.f82399e.U());
        a(builderBuildUpon, MBridgeConstans.APP_KEY, this.f82399e.a());
        a(builderBuildUpon, "pkg_ver", this.f82399e.c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f82399e.d());
        a(builderBuildUpon, "pkg_vc", sb2.toString());
        a(builderBuildUpon, Q6.F, this.f82399e.i());
        a(builderBuildUpon, "os_ver", this.f82399e.j());
        a(builderBuildUpon, "os_lang", this.f82399e.k());
        a(builderBuildUpon, "vendor", this.f82399e.l());
        a(builderBuildUpon, "model", this.f82399e.m());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f82399e.p());
        a(builderBuildUpon, "dpi", sb3.toString());
        a(builderBuildUpon, "dpi_f", this.f82399e.q());
        a(builderBuildUpon, "resolution", this.f82399e.o());
        a(builderBuildUpon, "net", this.f82399e.r());
        a(builderBuildUpon, "tz", this.f82399e.s());
        if (this.f82395a.f()) {
            a(builderBuildUpon, "enc", "1");
        }
        return new URL(builderBuildUpon.build().toString());
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final HttpURLConnection a() throws IOException {
        BufferedOutputStream bufferedOutputStream;
        g gVar;
        URL urlA = this.f82400f;
        if (urlA == null) {
            this.f82395a.a("PreHost");
            T t10 = this.f82395a.f82434k;
            String strA = t10.a();
            String strF = t10.f();
            String strD = t10.d();
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strD) && !TextUtils.equals(strF, strD)) {
                this.f82395a.a("PreHost", strF);
            }
            if (t10.e()) {
                this.f82395a.a("Host", strD);
            }
            this.f82395a.h();
            urlA = a(Uri.parse(strA));
            this.f82396b = urlA;
        } else if (urlA != null && this.f82399e != null && this.f82395a.f82438o) {
            urlA = a(Uri.parse(urlA.toString()));
        }
        boolean zEqualsIgnoreCase = "HTTPS".equalsIgnoreCase(urlA.getProtocol());
        URLConnection uRLConnectionOpenConnection = urlA.openConnection();
        this.f82402h = zEqualsIgnoreCase ? (HttpsURLConnection) uRLConnectionOpenConnection : (HttpURLConnection) uRLConnectionOpenConnection;
        this.f82402h.setInstanceFollowRedirects(false);
        this.f82402h.setDoInput(true);
        this.f82402h.setUseCaches(false);
        this.f82402h.setConnectTimeout((int) this.f82395a.f82436m);
        this.f82402h.setReadTimeout((int) this.f82395a.f82436m);
        this.f82402h.setRequestMethod(this.f82395a.a());
        Map<String, Set<String>> map = this.f82395a.f82437n;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList("Keep-Alive")));
        }
        Set<String> set = map.get(Command.HTTP_HEADER_RANGE);
        Set<String> set2 = map.get("Accept-Encoding");
        if (k.a(set) && k.a(set2)) {
            this.f82397c = true;
            map.put("Accept-Encoding", new HashSet(Collections.singletonList("gzip")));
        }
        if (!map.containsKey("Host")) {
            String str = null;
            try {
                b bVar = this.f82398d;
                String host = this.f82402h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f82394a.get(host);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("Host", new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f82402h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] bArrC = this.f82395a.c();
        if (bArrC != null && bArrC.length > 0) {
            f fVarB = this.f82395a.b();
            if (fVarB != null) {
                this.f82402h.setRequestProperty("Content-Type", fVarB.toString());
            }
            this.f82402h.setDoOutput(true);
            if (!(this.f82395a instanceof sg.bigo.ads.common.u.b.b) || (gVar = this.f82399e) == null || !gVar.ax() || sg.bigo.ads.common.x.a.F()) {
                this.f82402h.setRequestProperty("Content-Length", Long.toString(this.f82395a.e()));
                bufferedOutputStream = new BufferedOutputStream(this.f82402h.getOutputStream());
                bufferedOutputStream.write(bArrC);
            } else {
                this.f82402h.setRequestProperty("Content-Encoding", "gzip");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrC);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                this.f82402h.setRequestProperty("Content-Length", String.valueOf(length));
                ((sg.bigo.ads.common.u.b.b) this.f82395a).f82431i = length;
                bufferedOutputStream = new BufferedOutputStream(this.f82402h.getOutputStream());
                bufferedOutputStream.write(byteArray);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f82402h;
    }

    @NonNull
    public final c a(@NonNull URL url) {
        c cVar = new c(this.f82395a, this.f82396b, url, this.f82398d, this.f82399e);
        cVar.f82401g = this.f82401g + 1;
        return cVar;
    }

    public final boolean b() {
        return this.f82400f != null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f82400f != null) {
            sb2.append("originUrl=");
            sb2.append(this.f82395a.g());
            sb2.append(", redirectURL=");
            sb2.append(this.f82400f);
            sb2.append(", redirectCount=");
            sb2.append(this.f82401g);
        } else {
            sb2.append("requestUrl=");
            sb2.append(this.f82395a.g());
        }
        return sb2.toString();
    }
}
