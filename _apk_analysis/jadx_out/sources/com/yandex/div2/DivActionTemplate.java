package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTemplate implements JSONSerializable, JsonTemplate<DivAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f54465l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54466m = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionTemplate> f54467n = new sn.p<ParsingEnvironment, JSONObject, DivActionTemplate>() { // from class: com.yandex.div2.DivActionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f54468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f54471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<MenuItemTemplate>> f54472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f54473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f54474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<String> f54475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAction.Target>> f54476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTypedTemplate> f54477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f54478k;

    /* JADX INFO: compiled from: DivActionTemplate.kt */
    public static final class MenuItemTemplate implements JSONSerializable, JsonTemplate<DivAction.MenuItem> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f54479d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, MenuItemTemplate> f54480e = new sn.p<ParsingEnvironment, JSONObject, MenuItemTemplate>() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionTemplate.MenuItemTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionTemplate.MenuItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivActionTemplate> f54481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<List<DivActionTemplate>> f54482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f54483c;

        /* JADX INFO: compiled from: DivActionTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public MenuItemTemplate(@NotNull Field<DivActionTemplate> field, @NotNull Field<List<DivActionTemplate>> field2, @NotNull Field<Expression<String>> field3) {
            this.f54481a = field;
            this.f54482b = field2;
            this.f54483c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MenuItemTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable MenuItemTemplate menuItemTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : menuItemTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionTemplate(@NotNull Field<DivDownloadCallbacksTemplate> field, @NotNull Field<Expression<Boolean>> field2, @NotNull Field<Expression<String>> field3, @NotNull Field<Expression<Uri>> field4, @NotNull Field<List<MenuItemTemplate>> field5, @NotNull Field<JSONObject> field6, @NotNull Field<Expression<Uri>> field7, @NotNull Field<String> field8, @NotNull Field<Expression<DivAction.Target>> field9, @NotNull Field<DivActionTypedTemplate> field10, @NotNull Field<Expression<Uri>> field11) {
        this.f54468a = field;
        this.f54469b = field2;
        this.f54470c = field3;
        this.f54471d = field4;
        this.f54472e = field5;
        this.f54473f = field6;
        this.f54474g = field7;
        this.f54475h = field8;
        this.f54476i = field9;
        this.f54477j = field10;
        this.f54478k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionTemplate divActionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
