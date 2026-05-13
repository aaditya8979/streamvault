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

/* JADX INFO: compiled from: DivFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DivFilter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f55280b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFilter> f55281c = new sn.p<ParsingEnvironment, JSONObject, DivFilter>() { // from class: com.yandex.div2.DivFilter$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilter.f55280b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f55282a;

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class a extends DivFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivBlur f55283d;

        public a(@NotNull DivBlur divBlur) {
            super(null);
            this.f55283d = divBlur;
        }

        @NotNull
        public final DivBlur c() {
            return this.f55283d;
        }
    }

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFilter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class c extends DivFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivFilterRtlMirror f55284d;

        public c(@NotNull DivFilterRtlMirror divFilterRtlMirror) {
            super(null);
            this.f55284d = divFilterRtlMirror;
        }

        @NotNull
        public final DivFilterRtlMirror c() {
            return this.f55284d;
        }
    }

    public DivFilter() {
    }

    public /* synthetic */ DivFilter(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivFilter divFilter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divFilter == null) {
            return false;
        }
        if (this instanceof a) {
            DivBlur divBlurC = ((a) this).c();
            Object objB = divFilter.b();
            return divBlurC.a(objB instanceof DivBlur ? (DivBlur) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivFilterRtlMirror divFilterRtlMirrorC = ((c) this).c();
        Object objB2 = divFilter.b();
        return divFilterRtlMirrorC.a(objB2 instanceof DivFilterRtlMirror ? (DivFilterRtlMirror) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f55282a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f55282a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
