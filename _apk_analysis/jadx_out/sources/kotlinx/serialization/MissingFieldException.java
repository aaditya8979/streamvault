package kotlinx.serialization;

import cn.v;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MissingFieldException extends SerializationException {

    @NotNull
    private final List<String> missingFields;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String str) {
        this(v.e(str), "Field '" + str + "' is required, but it was missing", null);
        p.k(str, "missingField");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String str, @NotNull String str2) {
        this(v.e(str), "Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null);
        p.k(str, "missingField");
        p.k(str2, "serialName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(@NotNull List<String> list, @NotNull String str) {
        String str2;
        p.k(list, "missingFields");
        p.k(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> list, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        p.k(list, "missingFields");
        this.missingFields = list;
    }

    @NotNull
    public final List<String> getMissingFields() {
        return this.missingFields;
    }
}
