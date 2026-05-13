package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboard.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionCopyToClipboard implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54266c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboard> f54267d = new sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboard>() { // from class: com.yandex.div2.DivActionCopyToClipboard$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboard mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboard.f54266c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivActionCopyToClipboardContent f54268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54269b;

    /* JADX INFO: compiled from: DivActionCopyToClipboard.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionCopyToClipboard a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().f0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionCopyToClipboard(@NotNull DivActionCopyToClipboardContent divActionCopyToClipboardContent) {
        this.f54268a = divActionCopyToClipboardContent;
    }

    public final boolean a(@Nullable DivActionCopyToClipboard divActionCopyToClipboard, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboard == null) {
            return false;
        }
        return this.f54268a.a(divActionCopyToClipboard.f54268a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54269b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionCopyToClipboard.class).hashCode() + this.f54268a.hash();
        this.f54269b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
