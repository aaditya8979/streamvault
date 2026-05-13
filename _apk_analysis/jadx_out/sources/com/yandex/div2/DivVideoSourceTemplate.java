package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVideoSourceTemplate implements JSONSerializable, JsonTemplate<DivVideoSource> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f58190e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVideoSourceTemplate> f58191f = new sn.p<ParsingEnvironment, JSONObject, DivVideoSourceTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVideoSourceTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivVideoSourceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f58193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<ResolutionTemplate> f58194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f58195d;

    /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
    public static final class ResolutionTemplate implements JSONSerializable, JsonTemplate<DivVideoSource.Resolution> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f58196c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ResolutionTemplate> f58197d = new sn.p<ParsingEnvironment, JSONObject, ResolutionTemplate>() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoSourceTemplate.ResolutionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivVideoSourceTemplate.ResolutionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f58198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Long>> f58199b;

        /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public ResolutionTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<Long>> field2) {
            this.f58198a = field;
            this.f58199b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResolutionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ResolutionTemplate resolutionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : resolutionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().u9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivVideoSourceTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<ResolutionTemplate> field3, @NotNull Field<Expression<Uri>> field4) {
        this.f58192a = field;
        this.f58193b = field2;
        this.f58194c = field3;
        this.f58195d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVideoSourceTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivVideoSourceTemplate divVideoSourceTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<ResolutionTemplate>) companion.nullField(false), (Field<Expression<Uri>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVideoSourceTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
