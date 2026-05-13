package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivVariableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVariableTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivVariableTemplate implements JSONSerializable, JsonTemplate<DivVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f58111a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVariableTemplate> f58112b = new sn.p<ParsingEnvironment, JSONObject, DivVariableTemplate>() { // from class: com.yandex.div2.DivVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivVariableTemplate.d.b(DivVariableTemplate.f58111a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class a extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayVariableTemplate f58113c;

        public a(@NotNull ArrayVariableTemplate arrayVariableTemplate) {
            super(null);
            this.f58113c = arrayVariableTemplate;
        }

        @NotNull
        public final ArrayVariableTemplate b() {
            return this.f58113c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class b extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final BoolVariableTemplate f58114c;

        public b(@NotNull BoolVariableTemplate boolVariableTemplate) {
            super(null);
            this.f58114c = boolVariableTemplate;
        }

        @NotNull
        public final BoolVariableTemplate b() {
            return this.f58114c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class c extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ColorVariableTemplate f58115c;

        public c(@NotNull ColorVariableTemplate colorVariableTemplate) {
            super(null);
            this.f58115c = colorVariableTemplate;
        }

        @NotNull
        public final ColorVariableTemplate b() {
            return this.f58115c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivVariableTemplate b(d dVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return dVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivVariableTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().l9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class e extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DictVariableTemplate f58116c;

        public e(@NotNull DictVariableTemplate dictVariableTemplate) {
            super(null);
            this.f58116c = dictVariableTemplate;
        }

        @NotNull
        public final DictVariableTemplate b() {
            return this.f58116c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class f extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IntegerVariableTemplate f58117c;

        public f(@NotNull IntegerVariableTemplate integerVariableTemplate) {
            super(null);
            this.f58117c = integerVariableTemplate;
        }

        @NotNull
        public final IntegerVariableTemplate b() {
            return this.f58117c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class g extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final NumberVariableTemplate f58118c;

        public g(@NotNull NumberVariableTemplate numberVariableTemplate) {
            super(null);
            this.f58118c = numberVariableTemplate;
        }

        @NotNull
        public final NumberVariableTemplate b() {
            return this.f58118c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class h extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final PropertyVariableTemplate f58119c;

        public h(@NotNull PropertyVariableTemplate propertyVariableTemplate) {
            super(null);
            this.f58119c = propertyVariableTemplate;
        }

        @NotNull
        public final PropertyVariableTemplate b() {
            return this.f58119c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class i extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StrVariableTemplate f58120c;

        public i(@NotNull StrVariableTemplate strVariableTemplate) {
            super(null);
            this.f58120c = strVariableTemplate;
        }

        @NotNull
        public final StrVariableTemplate b() {
            return this.f58120c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class j extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final UrlVariableTemplate f58121c;

        public j(@NotNull UrlVariableTemplate urlVariableTemplate) {
            super(null);
            this.f58121c = urlVariableTemplate;
        }

        @NotNull
        public final UrlVariableTemplate b() {
            return this.f58121c;
        }
    }

    public DivVariableTemplate() {
    }

    public /* synthetic */ DivVariableTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof i) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof g) {
            return "number";
        }
        if (this instanceof f) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof j) {
            return "url";
        }
        if (this instanceof e) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        if (this instanceof h) {
            return "property";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
