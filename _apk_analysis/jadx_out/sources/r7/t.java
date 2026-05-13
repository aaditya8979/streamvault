package r7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f78851a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f78852b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(@Nullable String str, @Nullable String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                s7.q.c("HttpUtil", "Unexpected Content-Length [" + str + C3978d4.j.f31385e);
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f78851a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) s7.a.e(matcher.group(2))) - Long.parseLong((String) s7.a.e(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            s7.q.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C3978d4.j.f31385e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            s7.q.c("HttpUtil", "Unexpected Content-Range [" + str2 + C3978d4.j.f31385e);
            return j10;
        }
    }

    public static long c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f78852b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) s7.a.e(matcher.group(1)));
        }
        return -1L;
    }
}
