package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFixedLengthInputMaskTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f55316e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55317f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMaskTemplate> f55318g = new sn.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMaskTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedLengthInputMaskTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFixedLengthInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f55320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<PatternElementTemplate>> f55321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<String> f55322d;

    /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class PatternElementTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask.PatternElement> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f55323d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Expression<String> f55324e = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, PatternElementTemplate> f55325f = new sn.p<ParsingEnvironment, JSONObject, PatternElementTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFixedLengthInputMaskTemplate.PatternElementTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55328c;

        /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public PatternElementTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<Expression<String>> field3) {
            this.f55326a = field;
            this.f55327b = field2;
            this.f55328c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PatternElementTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable PatternElementTemplate patternElementTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : patternElementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().u3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFixedLengthInputMaskTemplate(@NotNull Field<Expression<Boolean>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<List<PatternElementTemplate>> field3, @NotNull Field<String> field4) {
        this.f55319a = field;
        this.f55320b = field2;
        this.f55321c = field3;
        this.f55322d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFixedLengthInputMaskTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Boolean>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<List<PatternElementTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFixedLengthInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFixedLengthInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
