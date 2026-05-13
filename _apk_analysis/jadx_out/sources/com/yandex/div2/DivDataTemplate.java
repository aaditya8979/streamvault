package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivDataTemplate implements JSONSerializable, JsonTemplate<DivData> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f55101h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivTransitionSelector> f55102i = Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDataTemplate> f55103j = new sn.p<ParsingEnvironment, JSONObject, DivDataTemplate>() { // from class: com.yandex.div2.DivDataTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDataTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDataTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionTemplate>> f55104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f55105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<StateTemplate>> f55106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTimerTemplate>> f55107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivTransitionSelector>> f55108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<List<DivTriggerTemplate>> f55109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<List<DivVariableTemplate>> f55110g;

    /* JADX INFO: compiled from: DivDataTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate<DivData.State> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f55111c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, StateTemplate> f55112d = new sn.p<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDataTemplate.StateTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivDataTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivTemplate> f55113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Long> f55114b;

        /* JADX INFO: compiled from: DivDataTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public StateTemplate(@NotNull Field<DivTemplate> field, @NotNull Field<Long> field2) {
            this.f55113a = field;
            this.f55114b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable StateTemplate stateTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : stateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().H2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivDataTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivDataTemplate(@NotNull Field<List<DivFunctionTemplate>> field, @NotNull Field<String> field2, @NotNull Field<List<StateTemplate>> field3, @NotNull Field<List<DivTimerTemplate>> field4, @NotNull Field<Expression<DivTransitionSelector>> field5, @NotNull Field<List<DivTriggerTemplate>> field6, @NotNull Field<List<DivVariableTemplate>> field7) {
        this.f55104a = field;
        this.f55105b = field2;
        this.f55106c = field3;
        this.f55107d = field4;
        this.f55108e = field5;
        this.f55109f = field6;
        this.f55110g = field7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDataTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivDataTemplate divDataTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDataTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
