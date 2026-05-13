package xo;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.s0;
import yo.h1;
import yo.k1;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f87061a = s0.a("kotlinx.serialization.json.JsonUnquotedLiteral", to.a.J(tn.x.f85368a));

    @NotNull
    public static final JsonPrimitive a(@Nullable Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new v(bool, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive b(@Nullable Number number) {
        return number == null ? JsonNull.INSTANCE : new v(number, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive c(@Nullable String str) {
        return str == null ? JsonNull.INSTANCE : new v(str, true, null, 4, null);
    }

    public static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + tn.t.b(jsonElement.getClass()) + " is not a " + str);
    }

    @Nullable
    public static final Boolean e(@NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(jsonPrimitive, "<this>");
        return k1.d(jsonPrimitive.f());
    }

    @Nullable
    public static final String f(@NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.f();
    }

    public static final double g(@NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.f());
    }

    public static final float h(@NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.f());
    }

    @NotNull
    public static final JsonObject i(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonPrimitive j(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final SerialDescriptor k() {
        return f87061a;
    }

    public static final long l(@NotNull JsonPrimitive jsonPrimitive) {
        tn.p.k(jsonPrimitive, "<this>");
        return new h1(jsonPrimitive.f()).p();
    }
}
