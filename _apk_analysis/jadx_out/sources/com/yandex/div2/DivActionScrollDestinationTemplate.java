package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivActionScrollDestinationTemplate implements JSONSerializable, JsonTemplate<DivActionScrollDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54364a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionScrollDestinationTemplate> f54365b = new sn.p<ParsingEnvironment, JSONObject, DivActionScrollDestinationTemplate>() { // from class: com.yandex.div2.DivActionScrollDestinationTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollDestinationTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollDestinationTemplate.a.b(DivActionScrollDestinationTemplate.f54364a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionScrollDestinationTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivActionScrollDestinationTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().E0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class b extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final EndDestinationTemplate f54366c;

        public b(@NotNull EndDestinationTemplate endDestinationTemplate) {
            super(null);
            this.f54366c = endDestinationTemplate;
        }

        @NotNull
        public final EndDestinationTemplate b() {
            return this.f54366c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class c extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IndexDestinationTemplate f54367c;

        public c(@NotNull IndexDestinationTemplate indexDestinationTemplate) {
            super(null);
            this.f54367c = indexDestinationTemplate;
        }

        @NotNull
        public final IndexDestinationTemplate b() {
            return this.f54367c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class d extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final OffsetDestinationTemplate f54368c;

        public d(@NotNull OffsetDestinationTemplate offsetDestinationTemplate) {
            super(null);
            this.f54368c = offsetDestinationTemplate;
        }

        @NotNull
        public final OffsetDestinationTemplate b() {
            return this.f54368c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class e extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StartDestinationTemplate f54369c;

        public e(@NotNull StartDestinationTemplate startDestinationTemplate) {
            super(null);
            this.f54369c = startDestinationTemplate;
        }

        @NotNull
        public final StartDestinationTemplate b() {
            return this.f54369c;
        }
    }

    public DivActionScrollDestinationTemplate() {
    }

    public /* synthetic */ DivActionScrollDestinationTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof d) {
            return TypedValues.CycleType.S_WAVE_OFFSET;
        }
        if (this instanceof c) {
            return "index";
        }
        if (this instanceof e) {
            return "start";
        }
        if (this instanceof b) {
            return "end";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
