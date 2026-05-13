package yo;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    @NotNull
    public static final JsonDecodingException a(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        tn.p.k(number, "value");
        tn.p.k(str, "key");
        tn.p.k(str2, "output");
        return e(-1, l(number, str, str2));
    }

    @NotNull
    public static final JsonEncodingException b(@NotNull Number number, @NotNull String str) {
        tn.p.k(number, "value");
        tn.p.k(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str, 0, 1, null)));
    }

    @NotNull
    public static final JsonEncodingException c(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        tn.p.k(number, "value");
        tn.p.k(str, "key");
        tn.p.k(str2, "output");
        return new JsonEncodingException(l(number, str, str2));
    }

    @NotNull
    public static final JsonEncodingException d(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + serialDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    public static final JsonDecodingException e(int i10, @NotNull String str) {
        tn.p.k(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    @NotNull
    public static final JsonDecodingException f(int i10, @NotNull String str, @NotNull CharSequence charSequence) {
        tn.p.k(str, "message");
        tn.p.k(charSequence, "input");
        return e(i10, str + "\nJSON input: " + ((Object) i(charSequence, i10)));
    }

    @NotNull
    public static final Void g(@NotNull a aVar, @NotNull String str) {
        tn.p.k(aVar, "<this>");
        tn.p.k(str, "entity");
        aVar.y("Trailing comma before the end of JSON " + str, aVar.f97896a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void h(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return g(aVar, str);
    }

    @NotNull
    public static final CharSequence i(@NotNull CharSequence charSequence, int i10) {
        tn.p.k(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(zn.n.e(i11, 0), zn.n.j(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return i(charSequence, i10);
    }

    @NotNull
    public static final Void k(@NotNull a aVar, @NotNull Number number) {
        tn.p.k(aVar, "<this>");
        tn.p.k(number, "result");
        a.z(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2, 0, 1, null));
    }
}
