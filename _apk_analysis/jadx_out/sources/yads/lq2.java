package yads;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f92063a;

    public lq2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f92063a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws IOException, z02 {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!bo.a.c(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            tn.p.j(string, "toString(...)");
            return this.f92063a.format(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            tn.x xVar = tn.x.f85368a;
            tn.p.j(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f87661a;
            throw new z02("Native Ad json has not required attributes");
        }
    }
}
