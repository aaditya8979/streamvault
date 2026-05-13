package e8;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f60937c = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f60938b;

    public l(Boolean bool) {
        y(bool);
    }

    public l(Number number) {
        y(number);
    }

    public l(String str) {
        y(str);
    }

    public static boolean u(l lVar) {
        Object obj = lVar.f60938b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public static boolean w(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f60937c) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f60938b == null) {
            return lVar.f60938b == null;
        }
        if (u(this) && u(lVar)) {
            return r().longValue() == lVar.r().longValue();
        }
        Object obj2 = this.f60938b;
        if (!(obj2 instanceof Number) || !(lVar.f60938b instanceof Number)) {
            return obj2.equals(lVar.f60938b);
        }
        double dDoubleValue = r().doubleValue();
        double dDoubleValue2 = lVar.r().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f60938b == null) {
            return 31;
        }
        if (u(this)) {
            jDoubleToLongBits = r().longValue();
        } else {
            Object obj = this.f60938b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean m() {
        return t() ? n().booleanValue() : Boolean.parseBoolean(s());
    }

    public Boolean n() {
        return (Boolean) this.f60938b;
    }

    public double o() {
        return v() ? r().doubleValue() : Double.parseDouble(s());
    }

    public int p() {
        return v() ? r().intValue() : Integer.parseInt(s());
    }

    public long q() {
        return v() ? r().longValue() : Long.parseLong(s());
    }

    public Number r() {
        Object obj = this.f60938b;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    public String s() {
        return v() ? r().toString() : t() ? n().toString() : (String) this.f60938b;
    }

    public boolean t() {
        return this.f60938b instanceof Boolean;
    }

    public boolean v() {
        return this.f60938b instanceof Number;
    }

    public boolean x() {
        return this.f60938b instanceof String;
    }

    public void y(Object obj) {
        if (obj instanceof Character) {
            this.f60938b = String.valueOf(((Character) obj).charValue());
        } else {
            g8.a.a((obj instanceof Number) || w(obj));
            this.f60938b = obj;
        }
    }
}
