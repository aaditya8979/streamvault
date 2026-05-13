package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DivRadialGradientRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRadius> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56617a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate> f56618b = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRadiusTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRadiusTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRadiusTemplate.a.b(DivRadialGradientRadiusTemplate.f56617a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivRadialGradientRadiusTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivRadialGradientRadiusTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().p6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class b extends DivRadialGradientRadiusTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedSizeTemplate f56619c;

        public b(@NotNull DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f56619c = divFixedSizeTemplate;
        }

        @NotNull
        public final DivFixedSizeTemplate b() {
            return this.f56619c;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class c extends DivRadialGradientRadiusTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientRelativeRadiusTemplate f56620c;

        public c(@NotNull DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) {
            super(null);
            this.f56620c = divRadialGradientRelativeRadiusTemplate;
        }

        @NotNull
        public final DivRadialGradientRelativeRadiusTemplate b() {
            return this.f56620c;
        }
    }

    public DivRadialGradientRadiusTemplate() {
    }

    public /* synthetic */ DivRadialGradientRadiusTemplate(tn.i iVar) {
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
            return "fixed";
        }
        if (this instanceof c) {
            return "relative";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
