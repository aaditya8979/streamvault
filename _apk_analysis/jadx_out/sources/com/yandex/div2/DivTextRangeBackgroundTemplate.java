package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivTextRangeBackgroundTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f57769a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate> f57770b = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate>() { // from class: com.yandex.div2.DivTextRangeBackgroundTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBackgroundTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBackgroundTemplate.b.b(DivTextRangeBackgroundTemplate.f57769a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class a extends DivTextRangeBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivCloudBackgroundTemplate f57771c;

        public a(@NotNull DivCloudBackgroundTemplate divCloudBackgroundTemplate) {
            super(null);
            this.f57771c = divCloudBackgroundTemplate;
        }

        @NotNull
        public final DivCloudBackgroundTemplate b() {
            return this.f57771c;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextRangeBackgroundTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTextRangeBackgroundTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().t8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class c extends DivTextRangeBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSolidBackgroundTemplate f57772c;

        public c(@NotNull DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f57772c = divSolidBackgroundTemplate;
        }

        @NotNull
        public final DivSolidBackgroundTemplate b() {
            return this.f57772c;
        }
    }

    public DivTextRangeBackgroundTemplate() {
    }

    public /* synthetic */ DivTextRangeBackgroundTemplate(tn.i iVar) {
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
            return "solid";
        }
        if (this instanceof a) {
            return "cloud";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
