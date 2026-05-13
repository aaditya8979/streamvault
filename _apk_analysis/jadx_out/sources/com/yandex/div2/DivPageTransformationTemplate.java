package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPageTransformationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivPageTransformationTemplate implements JSONSerializable, JsonTemplate<DivPageTransformation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56376a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformationTemplate> f56377b = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformationTemplate>() { // from class: com.yandex.div2.DivPageTransformationTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageTransformationTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageTransformationTemplate.a.b(DivPageTransformationTemplate.f56376a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivPageTransformationTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivPageTransformationTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().r5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class b extends DivPageTransformationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPageTransformationOverlapTemplate f56378c;

        public b(@NotNull DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) {
            super(null);
            this.f56378c = divPageTransformationOverlapTemplate;
        }

        @NotNull
        public final DivPageTransformationOverlapTemplate b() {
            return this.f56378c;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class c extends DivPageTransformationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPageTransformationSlideTemplate f56379c;

        public c(@NotNull DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) {
            super(null);
            this.f56379c = divPageTransformationSlideTemplate;
        }

        @NotNull
        public final DivPageTransformationSlideTemplate b() {
            return this.f56379c;
        }
    }

    public DivPageTransformationTemplate() {
    }

    public /* synthetic */ DivPageTransformationTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "slide";
        }
        if (this instanceof b) {
            return "overlap";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
