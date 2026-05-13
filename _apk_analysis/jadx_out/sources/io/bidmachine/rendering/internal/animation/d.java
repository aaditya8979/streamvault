package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.util.Tag;
import java.util.Map;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f70108a = new d();

    private d() {
    }

    public static final a a(AdElementParams adElementParams, boolean z10) {
        p.k(adElementParams, "params");
        return f70108a.a(new Tag("AdElementAnimator (" + adElementParams.getName() + ')'), adElementParams.getAnimationParams(), new j(adElementParams, z10));
    }

    public static final a a(AdPhaseParams adPhaseParams) {
        p.k(adPhaseParams, "params");
        return f70108a.a(new Tag("AdPhaseAnimator"), adPhaseParams.getAnimationParams(), new k(adPhaseParams));
    }

    private final a a(Tag tag, Map map, f fVar) {
        return new a(tag, new h(map), fVar);
    }
}
