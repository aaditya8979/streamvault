package ur;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DLNADoc.java */
/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f85803c = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85805b;

    public h(String str, String str2) {
        this.f85804a = str;
        this.f85805b = str2;
    }

    public static h c(String str) throws InvalidValueException {
        Matcher matcher = f85803c.matcher(str);
        if (matcher.matches()) {
            return new h(matcher.group(1), matcher.group(2));
        }
        throw new InvalidValueException("Can't parse DLNADoc: " + str);
    }

    public String a() {
        return this.f85804a;
    }

    public String b() {
        return this.f85805b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f85804a.equals(hVar.f85804a) && this.f85805b.equals(hVar.f85805b);
    }

    public int hashCode() {
        return (this.f85804a.hashCode() * 31) + this.f85805b.hashCode();
    }

    public String toString() {
        return a() + "-" + b();
    }
}
