package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivPivotTemplate implements JSONSerializable, JsonTemplate<DivPivot> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56557a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPivotTemplate> f56558b = new sn.p<ParsingEnvironment, JSONObject, DivPivotTemplate>() { // from class: com.yandex.div2.DivPivotTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotTemplate.a.b(DivPivotTemplate.f56557a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivPivotTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivPivotTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().U5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class b extends DivPivotTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPivotFixedTemplate f56559c;

        public b(@NotNull DivPivotFixedTemplate divPivotFixedTemplate) {
            super(null);
            this.f56559c = divPivotFixedTemplate;
        }

        @NotNull
        public final DivPivotFixedTemplate b() {
            return this.f56559c;
        }
    }

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class c extends DivPivotTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPivotPercentageTemplate f56560c;

        public c(@NotNull DivPivotPercentageTemplate divPivotPercentageTemplate) {
            super(null);
            this.f56560c = divPivotPercentageTemplate;
        }

        @NotNull
        public final DivPivotPercentageTemplate b() {
            return this.f56560c;
        }
    }

    public DivPivotTemplate() {
    }

    public /* synthetic */ DivPivotTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "pivot-fixed";
        }
        if (this instanceof c) {
            return "pivot-percentage";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
