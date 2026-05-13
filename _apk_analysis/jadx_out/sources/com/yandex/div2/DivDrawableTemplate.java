package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivDrawableTemplate implements JSONSerializable, JsonTemplate<DivDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55189a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDrawableTemplate> f55190b = new sn.p<ParsingEnvironment, JSONObject, DivDrawableTemplate>() { // from class: com.yandex.div2.DivDrawableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDrawableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDrawableTemplate.a.b(DivDrawableTemplate.f55189a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivDrawableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivDrawableTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivDrawableTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().W2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivDrawableTemplate.kt */
    public static final class b extends DivDrawableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivShapeDrawableTemplate f55191c;

        public b(@NotNull DivShapeDrawableTemplate divShapeDrawableTemplate) {
            super(null);
            this.f55191c = divShapeDrawableTemplate;
        }

        @NotNull
        public final DivShapeDrawableTemplate b() {
            return this.f55191c;
        }
    }

    public DivDrawableTemplate() {
    }

    public /* synthetic */ DivDrawableTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "shape_drawable";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
