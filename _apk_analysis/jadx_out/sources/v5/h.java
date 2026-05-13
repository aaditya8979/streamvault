package v5;

import a6.k0;
import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f85920a = Pattern.compile("^NOTE([ \t].*)?$");

    @Nullable
    public static Matcher a(t tVar) {
        String strL;
        while (true) {
            String strL2 = tVar.l();
            if (strL2 == null) {
                return null;
            }
            if (f85920a.matcher(strL2).matches()) {
                do {
                    strL = tVar.l();
                    if (strL != null) {
                    }
                } while (!strL.isEmpty());
            } else {
                Matcher matcher = f.f85905b.matcher(strL2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(t tVar) {
        String strL = tVar.l();
        return strL != null && strL.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] strArrE0 = k0.E0(str, "\\.");
        long j10 = 0;
        for (String str2 : k0.D0(strArrE0[0], StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrE0.length == 2) {
            j11 += Long.parseLong(strArrE0[1]);
        }
        return j11 * 1000;
    }

    public static void e(t tVar) throws ParserException {
        int iC = tVar.c();
        if (b(tVar)) {
            return;
        }
        tVar.L(iC);
        throw new ParserException("Expected WEBVTT. Got " + tVar.l());
    }
}
