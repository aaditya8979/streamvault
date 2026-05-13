package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivTypedValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f58078b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTypedValue> f58079c = new sn.p<ParsingEnvironment, JSONObject, DivTypedValue>() { // from class: com.yandex.div2.DivTypedValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTypedValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTypedValue.f58078b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f58080a;

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class a extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayValue f58081d;

        public a(@NotNull ArrayValue arrayValue) {
            super(null);
            this.f58081d = arrayValue;
        }

        @NotNull
        public final ArrayValue c() {
            return this.f58081d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class b extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BoolValue f58082d;

        public b(@NotNull BoolValue boolValue) {
            super(null);
            this.f58082d = boolValue;
        }

        @NotNull
        public final BoolValue c() {
            return this.f58082d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class c extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ColorValue f58083d;

        public c(@NotNull ColorValue colorValue) {
            super(null);
            this.f58083d = colorValue;
        }

        @NotNull
        public final ColorValue c() {
            return this.f58083d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTypedValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class e extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DictValue f58084d;

        public e(@NotNull DictValue dictValue) {
            super(null);
            this.f58084d = dictValue;
        }

        @NotNull
        public final DictValue c() {
            return this.f58084d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class f extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final IntegerValue f58085d;

        public f(@NotNull IntegerValue integerValue) {
            super(null);
            this.f58085d = integerValue;
        }

        @NotNull
        public final IntegerValue c() {
            return this.f58085d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class g extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final NumberValue f58086d;

        public g(@NotNull NumberValue numberValue) {
            super(null);
            this.f58086d = numberValue;
        }

        @NotNull
        public final NumberValue c() {
            return this.f58086d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class h extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StrValue f58087d;

        public h(@NotNull StrValue strValue) {
            super(null);
            this.f58087d = strValue;
        }

        @NotNull
        public final StrValue c() {
            return this.f58087d;
        }
    }

    /* JADX INFO: compiled from: DivTypedValue.kt */
    public static final class i extends DivTypedValue {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final UrlValue f58088d;

        public i(@NotNull UrlValue urlValue) {
            super(null);
            this.f58088d = urlValue;
        }

        @NotNull
        public final UrlValue c() {
            return this.f58088d;
        }
    }

    public DivTypedValue() {
    }

    public /* synthetic */ DivTypedValue(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivTypedValue divTypedValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTypedValue == null) {
            return false;
        }
        if (this instanceof h) {
            StrValue strValueC = ((h) this).c();
            Object objB = divTypedValue.b();
            return strValueC.a(objB instanceof StrValue ? (StrValue) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            IntegerValue integerValueC = ((f) this).c();
            Object objB2 = divTypedValue.b();
            return integerValueC.a(objB2 instanceof IntegerValue ? (IntegerValue) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            NumberValue numberValueC = ((g) this).c();
            Object objB3 = divTypedValue.b();
            return numberValueC.a(objB3 instanceof NumberValue ? (NumberValue) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            ColorValue colorValueC = ((c) this).c();
            Object objB4 = divTypedValue.b();
            return colorValueC.a(objB4 instanceof ColorValue ? (ColorValue) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            BoolValue boolValueC = ((b) this).c();
            Object objB5 = divTypedValue.b();
            return boolValueC.a(objB5 instanceof BoolValue ? (BoolValue) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            UrlValue urlValueC = ((i) this).c();
            Object objB6 = divTypedValue.b();
            return urlValueC.a(objB6 instanceof UrlValue ? (UrlValue) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DictValue dictValueC = ((e) this).c();
            Object objB7 = divTypedValue.b();
            return dictValueC.a(objB7 instanceof DictValue ? (DictValue) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayValue arrayValueC = ((a) this).c();
        Object objB8 = divTypedValue.b();
        return arrayValueC.a(objB8 instanceof ArrayValue ? (ArrayValue) objB8 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f58080a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((a) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f58080a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
