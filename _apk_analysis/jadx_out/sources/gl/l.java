package gl;

import cn.w0;
import com.ironsource.G5;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeaderValueWithParameters.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f62558a = w0.j('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', Character.valueOf(G5.T), '{', '}', ' ', '\t', '\n', '\r');

    public static final boolean b(String str) {
        if (str.length() < 2 || bo.f0.z1(str) != '\"' || bo.f0.B1(str) != '\"') {
            return false;
        }
        int i10 = 1;
        do {
            int iQ0 = bo.d0.q0(str, '\"', i10, false, 4, null);
            if (iQ0 == bo.d0.l0(str)) {
                break;
            }
            int i11 = 0;
            for (int i12 = iQ0 - 1; str.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = iQ0 + 1;
        } while (i10 < str.length());
        return true;
    }

    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f62558a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final String d(@NotNull String str) {
        tn.p.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(str, sb2);
        return sb2.toString();
    }

    public static final void e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                sb2.append(cCharAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append("\"");
    }
}
