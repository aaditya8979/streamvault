package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTrigger;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTrigger.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTrigger implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f58057e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Mode> f58058f = Expression.Companion.constant$default(Expression.Companion, Mode.ON_CONDITION, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTrigger> f58059g = new sn.p<ParsingEnvironment, JSONObject, DivTrigger>() { // from class: com.yandex.div2.DivTrigger$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTrigger mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTrigger.f58057e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DivAction> f58060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f58061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Mode> f58062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f58063d;

    /* JADX INFO: compiled from: DivTrigger.kt */
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Mode, String> TO_STRING = new sn.l<Mode, String>() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivTrigger.Mode mode) {
                return DivTrigger.Mode.Converter.b(mode);
            }
        };

        @NotNull
        public static final sn.l<String, Mode> FROM_STRING = new sn.l<String, Mode>() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivTrigger.Mode invoke(@NotNull String str) {
                return DivTrigger.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivTrigger.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Mode a(@NotNull String str) {
                Mode mode = Mode.ON_CONDITION;
                if (tn.p.f(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.ON_VARIABLE;
                if (tn.p.f(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Mode mode) {
                return mode.value;
            }
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivTrigger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTrigger a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivTrigger(@NotNull List<DivAction> list, @NotNull Expression<Boolean> expression, @NotNull Expression<Mode> expression2) {
        this.f58060a = list;
        this.f58061b = expression;
        this.f58062c = expression2;
    }

    public final boolean a(@Nullable DivTrigger divTrigger, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divTrigger == null) {
            return false;
        }
        List<DivAction> list = this.f58060a;
        List<DivAction> list2 = divTrigger.f58060a;
        if (list.size() != list2.size()) {
            z10 = false;
            break;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            if (!((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                z10 = false;
                break;
            }
            i10 = i11;
        }
        z10 = true;
        return z10 && this.f58061b.evaluate(expressionResolver).booleanValue() == divTrigger.f58061b.evaluate(expressionResolver2).booleanValue() && this.f58062c.evaluate(expressionResolver) == divTrigger.f58062c.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58063d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTrigger.class).hashCode();
        int iHash = 0;
        Iterator<T> it = this.f58060a.iterator();
        while (it.hasNext()) {
            iHash += ((DivAction) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f58061b.hashCode() + this.f58062c.hashCode();
        this.f58063d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
