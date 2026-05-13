package ur;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: SoapActionType.java */
/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f85834e = Pattern.compile("urn:schemas-upnp-org:control-1-0#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f85835f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+)#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f85839d;

    public u(String str, String str2, Integer num, String str3) {
        this.f85836a = str;
        this.f85837b = str2;
        this.f85839d = num;
        this.f85838c = str3;
        if (str3 == null || ir.f.f(str3)) {
            return;
        }
        throw new IllegalArgumentException("Action name contains illegal characters: " + str3);
    }

    public u(s sVar, String str) {
        this(sVar.a(), sVar.getType(), Integer.valueOf(sVar.b()), str);
    }

    public static u f(String str) throws InvalidValueException {
        Matcher matcher = f85834e.matcher(str);
        try {
            if (matcher.matches()) {
                return new u("schemas-upnp-org", "control-1-0", null, matcher.group(1));
            }
            Matcher matcher2 = f85835f.matcher(str);
            if (matcher2.matches()) {
                return new u(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)), matcher2.group(4));
            }
            throw new InvalidValueException("Can't parse action type string (namespace/type/version#actionName): " + str);
        } catch (RuntimeException e10) {
            throw new InvalidValueException(String.format("Can't parse action type string (namespace/type/version#actionName) '%s': %s", str, e10.toString()));
        }
    }

    public String a() {
        return this.f85838c;
    }

    public String b() {
        return this.f85836a;
    }

    public s c() {
        if (this.f85839d == null) {
            return null;
        }
        return new s(this.f85836a, this.f85837b, this.f85839d.intValue());
    }

    public String d() {
        if (this.f85839d == null) {
            return "urn:" + b() + StringUtils.PROCESS_POSTFIX_DELIMITER + getType();
        }
        return "urn:" + b() + ":service:" + getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + e();
    }

    public Integer e() {
        return this.f85839d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f85838c.equals(uVar.f85838c) || !this.f85836a.equals(uVar.f85836a) || !this.f85837b.equals(uVar.f85837b)) {
            return false;
        }
        Integer num = this.f85839d;
        Integer num2 = uVar.f85839d;
        return num == null ? num2 == null : num.equals(num2);
    }

    public String getType() {
        return this.f85837b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f85836a.hashCode() * 31) + this.f85837b.hashCode()) * 31) + this.f85838c.hashCode()) * 31;
        Integer num = this.f85839d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return d() + "#" + a();
    }
}
