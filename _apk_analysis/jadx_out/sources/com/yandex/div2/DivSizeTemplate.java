package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivSizeTemplate implements JSONSerializable, JsonTemplate<DivSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56952a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSizeTemplate> f56953b = new sn.p<ParsingEnvironment, JSONObject, DivSizeTemplate>() { // from class: com.yandex.div2.DivSizeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSizeTemplate.a.b(DivSizeTemplate.f56952a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivSizeTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivSizeTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().Z6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class b extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedSizeTemplate f56954c;

        public b(@NotNull DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f56954c = divFixedSizeTemplate;
        }

        @NotNull
        public final DivFixedSizeTemplate b() {
            return this.f56954c;
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class c extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivMatchParentSizeTemplate f56955c;

        public c(@NotNull DivMatchParentSizeTemplate divMatchParentSizeTemplate) {
            super(null);
            this.f56955c = divMatchParentSizeTemplate;
        }

        @NotNull
        public final DivMatchParentSizeTemplate b() {
            return this.f56955c;
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class d extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivWrapContentSizeTemplate f56956c;

        public d(@NotNull DivWrapContentSizeTemplate divWrapContentSizeTemplate) {
            super(null);
            this.f56956c = divWrapContentSizeTemplate;
        }

        @NotNull
        public final DivWrapContentSizeTemplate b() {
            return this.f56956c;
        }
    }

    public DivSizeTemplate() {
    }

    public /* synthetic */ DivSizeTemplate(tn.i iVar) {
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
        if (this instanceof d) {
            return ((d) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "fixed";
        }
        if (this instanceof c) {
            return "match_parent";
        }
        if (this instanceof d) {
            return "wrap_content";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
