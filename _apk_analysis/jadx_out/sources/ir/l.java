package ir;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: VariableValue.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f71790c = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Datatype f71791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f71792b;

    public l(Datatype datatype, Object obj) throws InvalidValueException {
        this.f71791a = datatype;
        this.f71792b = obj instanceof String ? datatype.c((String) obj) : obj;
        if (f.f71773a) {
            return;
        }
        if (a().isValid(b())) {
            c(toString());
            return;
        }
        throw new InvalidValueException("Invalid value for " + a() + ": " + b());
    }

    public Datatype a() {
        return this.f71791a;
    }

    public Object b() {
        return this.f71792b;
    }

    public void c(String str) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 13 && ((iCodePointAt < 32 || iCodePointAt > 55295) && ((iCodePointAt < 57344 || iCodePointAt > 65533) && (iCodePointAt < 65536 || iCodePointAt > 1114111)))) {
                f71790c.warning("Found invalid XML char code: " + iCodePointAt);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public String toString() {
        return a().e(b());
    }
}
