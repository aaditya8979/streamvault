package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipMode.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivTooltipMode implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f58005b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTooltipMode> f58006c = new sn.p<ParsingEnvironment, JSONObject, DivTooltipMode>() { // from class: com.yandex.div2.DivTooltipMode$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipMode mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTooltipMode.f58005b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f58007a;

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTooltipMode a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().S8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class b extends DivTooltipMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivTooltipModeModal f58008d;

        public b(@NotNull DivTooltipModeModal divTooltipModeModal) {
            super(null);
            this.f58008d = divTooltipModeModal;
        }

        @NotNull
        public final DivTooltipModeModal c() {
            return this.f58008d;
        }
    }

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class c extends DivTooltipMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivTooltipModeNonModal f58009d;

        public c(@NotNull DivTooltipModeNonModal divTooltipModeNonModal) {
            super(null);
            this.f58009d = divTooltipModeNonModal;
        }

        @NotNull
        public final DivTooltipModeNonModal c() {
            return this.f58009d;
        }
    }

    public DivTooltipMode() {
    }

    public /* synthetic */ DivTooltipMode(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivTooltipMode divTooltipMode, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTooltipMode == null) {
            return false;
        }
        if (this instanceof c) {
            DivTooltipModeNonModal divTooltipModeNonModalC = ((c) this).c();
            Object objB = divTooltipMode.b();
            return divTooltipModeNonModalC.a(objB instanceof DivTooltipModeNonModal ? (DivTooltipModeNonModal) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTooltipModeModal divTooltipModeModalC = ((b) this).c();
        Object objB2 = divTooltipMode.b();
        return divTooltipModeModalC.a(objB2 instanceof DivTooltipModeModal ? (DivTooltipModeModal) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f58007a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f58007a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
