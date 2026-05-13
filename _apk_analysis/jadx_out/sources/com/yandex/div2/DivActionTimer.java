package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionTimer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTimer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionTimer implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54484d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionTimer> f54485e = new sn.p<ParsingEnvironment, JSONObject, DivActionTimer>() { // from class: com.yandex.div2.DivActionTimer$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTimer mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTimer.f54484d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Action> f54486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54488c;

    /* JADX INFO: compiled from: DivActionTimer.kt */
    public enum Action {
        START("start"),
        STOP("stop"),
        PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
        RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
        CANCEL("cancel"),
        RESET("reset");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Action, String> TO_STRING = new sn.l<Action, String>() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivActionTimer.Action action) {
                return DivActionTimer.Action.Converter.b(action);
            }
        };

        @NotNull
        public static final sn.l<String, Action> FROM_STRING = new sn.l<String, Action>() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivActionTimer.Action invoke(@NotNull String str) {
                return DivActionTimer.Action.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionTimer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Action a(@NotNull String str) {
                Action action = Action.START;
                if (tn.p.f(str, action.value)) {
                    return action;
                }
                Action action2 = Action.STOP;
                if (tn.p.f(str, action2.value)) {
                    return action2;
                }
                Action action3 = Action.PAUSE;
                if (tn.p.f(str, action3.value)) {
                    return action3;
                }
                Action action4 = Action.RESUME;
                if (tn.p.f(str, action4.value)) {
                    return action4;
                }
                Action action5 = Action.CANCEL;
                if (tn.p.f(str, action5.value)) {
                    return action5;
                }
                Action action6 = Action.RESET;
                if (tn.p.f(str, action6.value)) {
                    return action6;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Action action) {
                return action.value;
            }
        }

        Action(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivActionTimer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionTimer a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionTimer(@NotNull Expression<Action> expression, @NotNull Expression<String> expression2) {
        this.f54486a = expression;
        this.f54487b = expression2;
    }

    public final boolean a(@Nullable DivActionTimer divActionTimer, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionTimer != null && this.f54486a.evaluate(expressionResolver) == divActionTimer.f54486a.evaluate(expressionResolver2) && tn.p.f(this.f54487b.evaluate(expressionResolver), divActionTimer.f54487b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54488c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionTimer.class).hashCode() + this.f54486a.hashCode() + this.f54487b.hashCode();
        this.f54488c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
