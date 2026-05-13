package p7;

import com.google.android.exoplayer2.ParserException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f77143a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(a0 a0Var) {
        String strP = a0Var.p();
        return strP != null && strP.startsWith("WEBVTT");
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) throws NumberFormatException {
        String[] strArrI0 = m0.I0(str, "\\.");
        long j10 = 0;
        for (String str2 : m0.H0(strArrI0[0], StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrI0.length == 2) {
            j11 += Long.parseLong(strArrI0[1]);
        }
        return j11 * 1000;
    }

    public static void d(a0 a0Var) throws ParserException {
        int iE = a0Var.e();
        if (a(a0Var)) {
            return;
        }
        a0Var.P(iE);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + a0Var.p(), null);
    }
}
