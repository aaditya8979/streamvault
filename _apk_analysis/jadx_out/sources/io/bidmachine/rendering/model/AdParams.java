package io.bidmachine.rendering.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4089j8;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.model.VisibilityParams;
import io.bidmachine.util.UtilsKt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00011B]\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010#\u0012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)¢\u0006\u0004\b/\u00100J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lio/bidmachine/rendering/model/AdParams;", "", "", "key", "getCustomParam", "Lio/bidmachine/rendering/model/CacheType;", "a", "Lio/bidmachine/rendering/model/CacheType;", "getCacheType", "()Lio/bidmachine/rendering/model/CacheType;", "cacheType", "Ljava/util/Queue;", "Lio/bidmachine/rendering/model/AdPhaseParams;", "b", "Ljava/util/Queue;", "getAdPhaseParamsQueue", "()Ljava/util/Queue;", "adPhaseParamsQueue", "Lio/bidmachine/rendering/model/VisibilityParams;", "c", "Lio/bidmachine/rendering/model/VisibilityParams;", "getVisibilityParams", "()Lio/bidmachine/rendering/model/VisibilityParams;", C4089j8.f32062s, "d", "Lio/bidmachine/rendering/model/AdPhaseParams;", "getPlaceholderParams", "()Lio/bidmachine/rendering/model/AdPhaseParams;", "placeholderParams", "Lio/bidmachine/rendering/model/Orientation;", "e", "Lio/bidmachine/rendering/model/Orientation;", "getOrientation", "()Lio/bidmachine/rendering/model/Orientation;", "orientation", "Lio/bidmachine/rendering/model/Background;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/Background;", "getBackground", "()Lio/bidmachine/rendering/model/Background;", A2.f64965g, "", "g", "Ljava/util/Map;", "getCustomParams", "()Ljava/util/Map;", "customParams", "<init>", "(Lio/bidmachine/rendering/model/CacheType;Ljava/util/Queue;Lio/bidmachine/rendering/model/VisibilityParams;Lio/bidmachine/rendering/model/AdPhaseParams;Lio/bidmachine/rendering/model/Orientation;Lio/bidmachine/rendering/model/Background;Ljava/util/Map;)V", "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AdParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CacheType cacheType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Queue adPhaseParamsQueue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final VisibilityParams visibilityParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AdPhaseParams placeholderParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Background background;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map customParams;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0016\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003J\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u001b\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lio/bidmachine/rendering/model/AdParams$Builder;", "", "Ljava/util/Queue;", "Lio/bidmachine/rendering/model/AdPhaseParams;", "adPhaseParamsQueue", "setAdPhaseParamsQueue", "adPhaseParams", "addAdPhaseParams", "", "", "customParams", "setCustomParams", "Lio/bidmachine/rendering/model/CacheType;", "cacheType", "setCacheType", "placeholderParams", "setPlaceholderParams", "Lio/bidmachine/rendering/model/VisibilityParams;", C4089j8.f32062s, "setVisibilityParams", "Lio/bidmachine/rendering/model/Orientation;", "orientation", "setOrientation", "Lio/bidmachine/rendering/model/Background;", A2.f64965g, "setBackground", "Lio/bidmachine/rendering/model/AdParams;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "Ljava/util/Queue;", "", "b", "Ljava/util/Map;", "c", "Lio/bidmachine/rendering/model/CacheType;", "d", "Lio/bidmachine/rendering/model/AdPhaseParams;", "e", "Lio/bidmachine/rendering/model/VisibilityParams;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/Orientation;", "g", "Lio/bidmachine/rendering/model/Background;", "<init>", "()V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Queue adPhaseParamsQueue = new LinkedList();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map customParams = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private CacheType cacheType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private AdPhaseParams placeholderParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private VisibilityParams visibilityParams;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Orientation orientation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Background background;

        @NotNull
        public final Builder addAdPhaseParams(@NotNull AdPhaseParams adPhaseParams) {
            p.k(adPhaseParams, "adPhaseParams");
            this.adPhaseParamsQueue.add(adPhaseParams);
            return this;
        }

        @NotNull
        public final AdParams build() {
            Background background = this.background;
            CacheType cacheTypeB = this.cacheType;
            if (cacheTypeB == null) {
                cacheTypeB = i.f70453a.b();
            }
            CacheType cacheType = cacheTypeB;
            Queue queue = this.adPhaseParamsQueue;
            VisibilityParams visibilityParamsBuild = this.visibilityParams;
            if (visibilityParamsBuild == null) {
                visibilityParamsBuild = new VisibilityParams.Builder().build();
            }
            return new AdParams(cacheType, queue, visibilityParamsBuild, this.placeholderParams, this.orientation, background, this.customParams);
        }

        @NotNull
        public final Builder setAdPhaseParamsQueue(@Nullable Queue<AdPhaseParams> adPhaseParamsQueue) {
            UtilsKt.setSafely(this.adPhaseParamsQueue, adPhaseParamsQueue);
            return this;
        }

        @NotNull
        public final Builder setBackground(@Nullable Background background) {
            this.background = background;
            return this;
        }

        @NotNull
        public final Builder setCacheType(@NotNull CacheType cacheType) {
            p.k(cacheType, "cacheType");
            this.cacheType = cacheType;
            return this;
        }

        @NotNull
        public final Builder setCustomParams(@Nullable Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        @NotNull
        public final Builder setOrientation(@Nullable Orientation orientation) {
            this.orientation = orientation;
            return this;
        }

        @NotNull
        public final Builder setPlaceholderParams(@Nullable AdPhaseParams placeholderParams) {
            this.placeholderParams = placeholderParams;
            return this;
        }

        @NotNull
        public final Builder setVisibilityParams(@Nullable VisibilityParams visibilityParams) {
            this.visibilityParams = visibilityParams;
            return this;
        }
    }

    public AdParams(@NotNull CacheType cacheType, @NotNull Queue<AdPhaseParams> queue, @NotNull VisibilityParams visibilityParams, @Nullable AdPhaseParams adPhaseParams, @Nullable Orientation orientation, @Nullable Background background, @NotNull Map<String, String> map) {
        p.k(cacheType, "cacheType");
        p.k(queue, "adPhaseParamsQueue");
        p.k(visibilityParams, C4089j8.f32062s);
        p.k(map, "customParams");
        this.cacheType = cacheType;
        this.adPhaseParamsQueue = queue;
        this.visibilityParams = visibilityParams;
        this.placeholderParams = adPhaseParams;
        this.orientation = orientation;
        this.background = background;
        this.customParams = map;
    }

    public /* synthetic */ AdParams(CacheType cacheType, Queue queue, VisibilityParams visibilityParams, AdPhaseParams adPhaseParams, Orientation orientation, Background background, Map map, int i10, tn.i iVar) {
        this(cacheType, queue, visibilityParams, (i10 & 8) != 0 ? null : adPhaseParams, (i10 & 16) != 0 ? null : orientation, (i10 & 32) != 0 ? null : background, map);
    }

    @NotNull
    public final Queue<AdPhaseParams> getAdPhaseParamsQueue() {
        return this.adPhaseParamsQueue;
    }

    @Nullable
    public final Background getBackground() {
        return this.background;
    }

    @NotNull
    public final CacheType getCacheType() {
        return this.cacheType;
    }

    @Nullable
    public final String getCustomParam(@NotNull String key) {
        p.k(key, "key");
        return (String) this.customParams.get(key);
    }

    @NotNull
    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    @Nullable
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final AdPhaseParams getPlaceholderParams() {
        return this.placeholderParams;
    }

    @NotNull
    public final VisibilityParams getVisibilityParams() {
        return this.visibilityParams;
    }
}
