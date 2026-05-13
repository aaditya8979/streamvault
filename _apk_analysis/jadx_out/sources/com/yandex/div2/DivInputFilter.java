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

/* JADX INFO: compiled from: DivInputFilter.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivInputFilter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56001b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputFilter> f56002c = new sn.p<ParsingEnvironment, JSONObject, DivInputFilter>() { // from class: com.yandex.div2.DivInputFilter$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilter.f56001b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56003a;

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputFilter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().m4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class b extends DivInputFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivInputFilterExpression f56004d;

        public b(@NotNull DivInputFilterExpression divInputFilterExpression) {
            super(null);
            this.f56004d = divInputFilterExpression;
        }

        @NotNull
        public final DivInputFilterExpression c() {
            return this.f56004d;
        }
    }

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class c extends DivInputFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivInputFilterRegex f56005d;

        public c(@NotNull DivInputFilterRegex divInputFilterRegex) {
            super(null);
            this.f56005d = divInputFilterRegex;
        }

        @NotNull
        public final DivInputFilterRegex c() {
            return this.f56005d;
        }
    }

    public DivInputFilter() {
    }

    public /* synthetic */ DivInputFilter(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivInputFilter divInputFilter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divInputFilter == null) {
            return false;
        }
        if (this instanceof c) {
            DivInputFilterRegex divInputFilterRegexC = ((c) this).c();
            Object objB = divInputFilter.b();
            return divInputFilterRegexC.a(objB instanceof DivInputFilterRegex ? (DivInputFilterRegex) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputFilterExpression divInputFilterExpressionC = ((b) this).c();
        Object objB2 = divInputFilter.b();
        return divInputFilterExpressionC.a(objB2 instanceof DivInputFilterExpression ? (DivInputFilterExpression) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56003a;
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
        this.f56003a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
