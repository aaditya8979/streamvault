package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f82403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<List<String>> f82405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f82406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f82407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f82408f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f82409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f82412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f82413e;

        private a(URL url, String str, int i10, String str2, int i11) {
            this.f82409a = url;
            this.f82410b = str;
            this.f82411c = i10;
            this.f82412d = str2;
            this.f82413e = i11;
        }

        public /* synthetic */ a(URL url, String str, int i10, String str2, int i11, byte b10) {
            this(url, str, i10, str2, i11);
        }
    }

    public d(@NonNull c cVar) throws IOException {
        this.f82406d = cVar;
        HttpURLConnection httpURLConnectionA = cVar.a();
        this.f82403a = httpURLConnectionA;
        this.f82404b = httpURLConnectionA.getResponseCode();
        this.f82407e = httpURLConnectionA.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.f82405c = hVar;
        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getContentEncoding());
        this.f82408f = zEqualsIgnoreCase;
        if (zEqualsIgnoreCase && cVar.f82397c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    @Nullable
    private String a(String str) {
        List<String> listA = this.f82405c.a(str);
        int size = listA != null ? listA.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = listA.get(0);
        }
        return str2;
    }

    public final InputStream a() throws IOException {
        InputStream inputStream = this.f82403a.getInputStream();
        return (this.f82408f && this.f82406d.f82397c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    public final a b() {
        int i10 = this.f82404b;
        if (i10 == 307 || i10 == 308) {
            String strA = a("Location");
            if (this.f82407e.equalsIgnoreCase("GET") || this.f82407e.equalsIgnoreCase("HEAD")) {
                return new a(null, strA, 0, "", this.f82404b, (byte) 0);
            }
            return new a(null, strA, 706, "redirect code(" + this.f82404b + ") is only available for GET or HEAD method, current request method is " + this.f82407e, this.f82404b, (byte) 0);
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                String strA2 = a("Location");
                if (TextUtils.isEmpty(strA2)) {
                    return new a(null, strA2, 707, "empty location.", this.f82404b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f82403a.getURL(), strA2);
                    String string = url.toString();
                    if (TextUtils.equals(string, this.f82403a.getURL().toString())) {
                        return new a(url, strA2, 705, "redirect to the same url, location is " + strA2 + ", redirectURL is " + string, this.f82404b, (byte) 0);
                    }
                    URL url2 = this.f82406d.f82396b;
                    if (url2 == null || !TextUtils.equals(string, url2.toString())) {
                        return new a(url, strA2, 0, "", this.f82404b, (byte) 0);
                    }
                    return new a(url, strA2, 704, "redirect to origin url, location is " + strA2 + ", redirectURL is " + string, this.f82404b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, strA2, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + strA2 + "\" is not a network url.", this.f82404b, (byte) 0);
                }
            default:
                return null;
        }
    }
}
