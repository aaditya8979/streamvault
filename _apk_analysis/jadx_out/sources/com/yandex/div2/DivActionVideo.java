package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionVideo.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionVideo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54557d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionVideo> f54558e = new sn.p<ParsingEnvironment, JSONObject, DivActionVideo>() { // from class: com.yandex.div2.DivActionVideo$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionVideo mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionVideo.f54557d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Action> f54559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54561c;

    /* JADX INFO: compiled from: DivActionVideo.kt */
    public enum Action {
        START("start"),
        PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Action, String> TO_STRING = new sn.l<Action, String>() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivActionVideo.Action action) {
                return DivActionVideo.Action.Converter.b(action);
            }
        };

        @NotNull
        public static final sn.l<String, Action> FROM_STRING = new sn.l<String, Action>() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivActionVideo.Action invoke(@NotNull String str) {
                return DivActionVideo.Action.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionVideo.kt */
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
                Action action2 = Action.PAUSE;
                if (tn.p.f(str, action2.value)) {
                    return action2;
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

    /* JADX INFO: compiled from: DivActionVideo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionVideo a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionVideo(@NotNull Expression<Action> expression, @NotNull Expression<String> expression2) {
        this.f54559a = expression;
        this.f54560b = expression2;
    }

    public final boolean a(@Nullable DivActionVideo divActionVideo, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionVideo != null && this.f54559a.evaluate(expressionResolver) == divActionVideo.f54559a.evaluate(expressionResolver2) && tn.p.f(this.f54560b.evaluate(expressionResolver), divActionVideo.f54560b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54561c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionVideo.class).hashCode() + this.f54559a.hashCode() + this.f54560b.hashCode();
        this.f54561c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
