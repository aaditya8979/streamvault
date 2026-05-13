package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivRadialGradientCenterTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56591a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate> f56592b = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate>() { // from class: com.yandex.div2.DivRadialGradientCenterTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientCenterTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientCenterTemplate.a.b(DivRadialGradientCenterTemplate.f56591a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivRadialGradientCenterTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivRadialGradientCenterTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().d6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class b extends DivRadialGradientCenterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientFixedCenterTemplate f56593c;

        public b(@NotNull DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) {
            super(null);
            this.f56593c = divRadialGradientFixedCenterTemplate;
        }

        @NotNull
        public final DivRadialGradientFixedCenterTemplate b() {
            return this.f56593c;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class c extends DivRadialGradientCenterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientRelativeCenterTemplate f56594c;

        public c(@NotNull DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) {
            super(null);
            this.f56594c = divRadialGradientRelativeCenterTemplate;
        }

        @NotNull
        public final DivRadialGradientRelativeCenterTemplate b() {
            return this.f56594c;
        }
    }

    public DivRadialGradientCenterTemplate() {
    }

    public /* synthetic */ DivRadialGradientCenterTemplate(tn.i iVar) {
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
        return BuiltInParserKt.getBuiltInParserComponent().d6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
