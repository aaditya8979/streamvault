package com.yandex.div.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: StoredValue.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class StoredValue {

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class ArrayStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONArray value;

        public ArrayStoredValue(@NotNull String str, @NotNull JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.value = jSONArray;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) obj;
            return p.f(this.name, arrayStoredValue.name) && p.f(this.value, arrayStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONArray getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class BooleanStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final boolean value;

        public BooleanStoredValue(@NotNull String str, boolean z10) {
            super(null);
            this.name = str;
            this.value = z10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) obj;
            return p.f(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            boolean z10 = this.value;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        @NotNull
        public String toString() {
            return "BooleanStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class ColorStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final int value;

        private ColorStoredValue(String str, int i10) {
            super(null);
            this.name = str;
            this.value = i10;
        }

        public /* synthetic */ ColorStoredValue(String str, int i10, i iVar) {
            this(str, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) obj;
            return p.f(this.name, colorStoredValue.name) && Color.m7447equalsimpl0(this.value, colorStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4, reason: not valid java name */
        public final int m7395getValueWpymAT4() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Color.m7449hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m7451toStringimpl(this.value)) + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class DictStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONObject value;

        public DictStoredValue(@NotNull String str, @NotNull JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.value = jSONObject;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) obj;
            return p.f(this.name, dictStoredValue.name) && p.f(this.value, dictStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONObject getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class DoubleStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final double value;

        public DoubleStoredValue(@NotNull String str, double d10) {
            super(null);
            this.name = str;
            this.value = d10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) obj;
            return p.f(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Double.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "DoubleStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class IntegerStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final long value;

        public IntegerStoredValue(@NotNull String str, long j10) {
            super(null);
            this.name = str;
            this.value = j10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) obj;
            return p.f(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Long.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "IntegerStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class StringStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public StringStoredValue(@NotNull String str, @NotNull String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) obj;
            return p.f(this.name, stringStoredValue.name) && p.f(this.value, stringStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public enum Type {
        STRING(TypedValues.Custom.S_STRING),
        INTEGER(TypedValues.Custom.S_INT),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN),
        NUMBER("number"),
        COLOR("color"),
        URL("url"),
        ARRAY("array"),
        DICT("dict");


        @NotNull
        public static final Converter Converter = new Converter(null);

        @NotNull
        private final String value;

        /* JADX INFO: compiled from: StoredValue.kt */
        public static final class Converter {
            private Converter() {
            }

            public /* synthetic */ Converter(i iVar) {
                this();
            }

            @Nullable
            public final Type fromString(@NotNull String str) {
                Type type = Type.STRING;
                if (p.f(str, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (p.f(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (p.f(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (p.f(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (p.f(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (p.f(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (p.f(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (p.f(str, type8.value)) {
                    return type8;
                }
                return null;
            }

            @NotNull
            public final String toString(@NotNull Type type) {
                return type.value;
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: StoredValue.kt */
    public static final class UrlStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        private UrlStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public /* synthetic */ UrlStoredValue(String str, String str2, i iVar) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) obj;
            return p.f(this.name, urlStoredValue.name) && Url.m7458equalsimpl0(this.value, urlStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue-OXPJC6E, reason: not valid java name */
        public final String m7396getValueOXPJC6E() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Url.m7459hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m7460toStringimpl(this.value)) + ')';
        }
    }

    private StoredValue() {
    }

    public /* synthetic */ StoredValue(i iVar) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m7444boximpl(((ColorStoredValue) this).m7395getValueWpymAT4());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m7455boximpl(((UrlStoredValue) this).m7396getValueOXPJC6E());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
