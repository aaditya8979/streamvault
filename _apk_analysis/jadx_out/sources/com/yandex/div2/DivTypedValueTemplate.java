package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivTypedValueTemplate implements JSONSerializable, JsonTemplate<DivTypedValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f58089a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTypedValueTemplate> f58090b = new sn.p<ParsingEnvironment, JSONObject, DivTypedValueTemplate>() { // from class: com.yandex.div2.DivTypedValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTypedValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTypedValueTemplate.d.b(DivTypedValueTemplate.f58089a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class a extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayValueTemplate f58091c;

        public a(@NotNull ArrayValueTemplate arrayValueTemplate) {
            super(null);
            this.f58091c = arrayValueTemplate;
        }

        @NotNull
        public final ArrayValueTemplate b() {
            return this.f58091c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class b extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final BoolValueTemplate f58092c;

        public b(@NotNull BoolValueTemplate boolValueTemplate) {
            super(null);
            this.f58092c = boolValueTemplate;
        }

        @NotNull
        public final BoolValueTemplate b() {
            return this.f58092c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class c extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ColorValueTemplate f58093c;

        public c(@NotNull ColorValueTemplate colorValueTemplate) {
            super(null);
            this.f58093c = colorValueTemplate;
        }

        @NotNull
        public final ColorValueTemplate b() {
            return this.f58093c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTypedValueTemplate b(d dVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return dVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTypedValueTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class e extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DictValueTemplate f58094c;

        public e(@NotNull DictValueTemplate dictValueTemplate) {
            super(null);
            this.f58094c = dictValueTemplate;
        }

        @NotNull
        public final DictValueTemplate b() {
            return this.f58094c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class f extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IntegerValueTemplate f58095c;

        public f(@NotNull IntegerValueTemplate integerValueTemplate) {
            super(null);
            this.f58095c = integerValueTemplate;
        }

        @NotNull
        public final IntegerValueTemplate b() {
            return this.f58095c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class g extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final NumberValueTemplate f58096c;

        public g(@NotNull NumberValueTemplate numberValueTemplate) {
            super(null);
            this.f58096c = numberValueTemplate;
        }

        @NotNull
        public final NumberValueTemplate b() {
            return this.f58096c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class h extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StrValueTemplate f58097c;

        public h(@NotNull StrValueTemplate strValueTemplate) {
            super(null);
            this.f58097c = strValueTemplate;
        }

        @NotNull
        public final StrValueTemplate b() {
            return this.f58097c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class i extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final UrlValueTemplate f58098c;

        public i(@NotNull UrlValueTemplate urlValueTemplate) {
            super(null);
            this.f58098c = urlValueTemplate;
        }

        @NotNull
        public final UrlValueTemplate b() {
            return this.f58098c;
        }
    }

    public DivTypedValueTemplate() {
    }

    public /* synthetic */ DivTypedValueTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof h) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof f) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof g) {
            return "number";
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof i) {
            return "url";
        }
        if (this instanceof e) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
