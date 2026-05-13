package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivShapeTemplate implements JSONSerializable, JsonTemplate<DivShape> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f56942a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShapeTemplate> f56943b = new sn.p<ParsingEnvironment, JSONObject, DivShapeTemplate>() { // from class: com.yandex.div2.DivShapeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShapeTemplate.b.b(DivShapeTemplate.f56942a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class a extends DivShapeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivCircleShapeTemplate f56944c;

        public a(@NotNull DivCircleShapeTemplate divCircleShapeTemplate) {
            super(null);
            this.f56944c = divCircleShapeTemplate;
        }

        @NotNull
        public final DivCircleShapeTemplate b() {
            return this.f56944c;
        }
    }

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivShapeTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivShapeTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().W6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class c extends DivShapeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRoundedRectangleShapeTemplate f56945c;

        public c(@NotNull DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) {
            super(null);
            this.f56945c = divRoundedRectangleShapeTemplate;
        }

        @NotNull
        public final DivRoundedRectangleShapeTemplate b() {
            return this.f56945c;
        }
    }

    public DivShapeTemplate() {
    }

    public /* synthetic */ DivShapeTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "rounded_rectangle";
        }
        if (this instanceof a) {
            return "circle";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
