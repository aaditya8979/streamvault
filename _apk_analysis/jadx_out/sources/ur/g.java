package ur;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DLNACaps.java */
/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f85802a;

    public g(String[] strArr) {
        this.f85802a = strArr;
    }

    public static g b(String str) throws InvalidValueException {
        if (str == null || str.length() == 0) {
            return new g(new String[0]);
        }
        String[] strArrSplit = str.split(StringUtils.COMMA);
        String[] strArr = new String[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArr[i10] = strArrSplit[i10].trim();
        }
        return new g(strArr);
    }

    public String[] a() {
        return this.f85802a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f85802a, ((g) obj).f85802a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f85802a);
    }

    public String toString() {
        return ir.f.g(a());
    }
}
