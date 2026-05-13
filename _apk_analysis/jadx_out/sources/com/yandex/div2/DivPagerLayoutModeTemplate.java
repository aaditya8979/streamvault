package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivPagerLayoutModeTemplate implements JSONSerializable, JsonTemplate<DivPagerLayoutMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56446a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPagerLayoutModeTemplate> f56447b = new sn.p<ParsingEnvironment, JSONObject, DivPagerLayoutModeTemplate>() { // from class: com.yandex.div2.DivPagerLayoutModeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPagerLayoutModeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPagerLayoutModeTemplate.a.b(DivPagerLayoutModeTemplate.f56446a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivPagerLayoutModeTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivPagerLayoutModeTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().D5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class b extends DivPagerLayoutModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivNeighbourPageSizeTemplate f56448c;

        public b(@NotNull DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) {
            super(null);
            this.f56448c = divNeighbourPageSizeTemplate;
        }

        @NotNull
        public final DivNeighbourPageSizeTemplate b() {
            return this.f56448c;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class c extends DivPagerLayoutModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPageContentSizeTemplate f56449c;

        public c(@NotNull DivPageContentSizeTemplate divPageContentSizeTemplate) {
            super(null);
            this.f56449c = divPageContentSizeTemplate;
        }

        @NotNull
        public final DivPageContentSizeTemplate b() {
            return this.f56449c;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class d extends DivPagerLayoutModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPageSizeTemplate f56450c;

        public d(@NotNull DivPageSizeTemplate divPageSizeTemplate) {
            super(null);
            this.f56450c = divPageSizeTemplate;
        }

        @NotNull
        public final DivPageSizeTemplate b() {
            return this.f56450c;
        }
    }

    public DivPagerLayoutModeTemplate() {
    }

    public /* synthetic */ DivPagerLayoutModeTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof d) {
            return ((d) this).b();
        }
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
        if (this instanceof d) {
            return "percentage";
        }
        if (this instanceof b) {
            return "fixed";
        }
        if (this instanceof c) {
            return "wrap_content";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
