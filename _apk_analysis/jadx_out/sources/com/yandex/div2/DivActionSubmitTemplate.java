package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionSubmitTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54449e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSubmitTemplate> f54450f = new sn.p<ParsingEnvironment, JSONObject, DivActionSubmitTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSubmitTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSubmitTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<RequestTemplate> f54454d;

    /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
    public static final class RequestTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit.Request> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f54455d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Expression<DivActionSubmit.Request.Method> f54456e = Expression.Companion.constant$default(Expression.Companion, DivActionSubmit.Request.Method.POST, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, RequestTemplate> f54457f = new sn.p<ParsingEnvironment, JSONObject, RequestTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionSubmitTemplate.RequestTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionSubmitTemplate.RequestTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<List<HeaderTemplate>> f54458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<DivActionSubmit.Request.Method>> f54459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Uri>> f54460c;

        /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
        public static final class HeaderTemplate implements JSONSerializable, JsonTemplate<DivActionSubmit.Request.Header> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public static final a f54461c = new a(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public static final sn.p<ParsingEnvironment, JSONObject, HeaderTemplate> f54462d = new sn.p<ParsingEnvironment, JSONObject, HeaderTemplate>() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$HeaderTemplate$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivActionSubmitTemplate.RequestTemplate.HeaderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivActionSubmitTemplate.RequestTemplate.HeaderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Field<Expression<String>> f54463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Field<Expression<String>> f54464b;

            /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }
            }

            public HeaderTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<String>> field2) {
                this.f54463a = field;
                this.f54464b = field2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public HeaderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable HeaderTemplate headerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
                Field.Companion companion = Field.Companion;
                this(companion.nullField(false), companion.nullField(false));
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }

            public /* synthetic */ HeaderTemplate(ParsingEnvironment parsingEnvironment, HeaderTemplate headerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
                this(parsingEnvironment, (i10 & 2) != 0 ? null : headerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
            }

            @Override // com.yandex.div.json.JSONSerializable
            @NotNull
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().Z0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public RequestTemplate(@NotNull Field<List<HeaderTemplate>> field, @NotNull Field<Expression<DivActionSubmit.Request.Method>> field2, @NotNull Field<Expression<Uri>> field3) {
            this.f54458a = field;
            this.f54459b = field2;
            this.f54460c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RequestTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable RequestTemplate requestTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ RequestTemplate(ParsingEnvironment parsingEnvironment, RequestTemplate requestTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : requestTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().c1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionSubmitTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<List<DivActionTemplate>> field2, @NotNull Field<List<DivActionTemplate>> field3, @NotNull Field<RequestTemplate> field4) {
        this.f54451a = field;
        this.f54452b = field2;
        this.f54453c = field3;
        this.f54454d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionSubmitTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionSubmitTemplate divActionSubmitTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<String>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<RequestTemplate>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionSubmitTemplate(ParsingEnvironment parsingEnvironment, DivActionSubmitTemplate divActionSubmitTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionSubmitTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
