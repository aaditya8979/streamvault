package z0;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GetRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f98130d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f98131e = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98134c;

    public d(String str) {
        k.c(str);
        long jA = a(str);
        this.f98133b = Math.max(0L, jA);
        this.f98134c = jA >= 0;
        this.f98132a = b(str);
    }

    public static d c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                return new d(sb2.toString());
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public final long a(String str) {
        Matcher matcher = f98130d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    public final String b(String str) {
        Matcher matcher = f98131e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f98133b + ", partial=" + this.f98134c + ", uri='" + this.f98132a + "'}";
    }
}
